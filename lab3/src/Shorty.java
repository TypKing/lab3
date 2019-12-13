import java.nio.charset.Charset;

public class Shorty extends LivingBeing implements Movable, Runnable{
    protected int degreeOfDirt;
    protected int degreeOfWet;

    public Shorty(String name, Place place){
        super(name, place);
    }

//    public Shorty(String name, Place place, Action action){
//        super(name, place, action);
//    }

    public void setPlace(Place place){
        super.place = place;
    }

    public void makeSure(Shorty[] shorties){
        int count = 0;
        for (Shorty shorty : shorties) {
            if (shorty.action == Action.STANDING) {
                count++;
            }
            if (count == shorties.length) {
                System.out.println("Я убедился, что все коротышки слезли с полок");
            } else {
                System.out.println("Не все коротышки слезли с полок");
            }
        }
    }

    public void getDown(Things object) {
        System.out.println(getName() + " слез с " + object.getName());
        setAction(Action.STANDING);
    }

    public void pressButton(Button button) {
        if (!button.singlePress) {
            System.out.println(name + " нажал на " + button.getColor()+ " " + button.getName());
            button.setSinglePress(true);
        }
        else System.out.println(button.getName() + " уже была нажата");
    }

    public void setAction(Action action) {
        super.action = action;
    }

    public void changeAction(Action action) {
        super.action = action;
        System.out.println("Состояние изменилось с " + " на ");
    }

    protected void see(){
    }

    public void runAwayFrom(int x, int y){
    }

    public void getToWater(){
        //изменение значения переменной degreeOfWet в соответсветствии с продолжительностью нахождения по струей воды
        setAction(Action.LYING);
    }

    public void runAround(){
        //передвижение на рандомный вектор
    }

    public void changePlace(Place p){
        super.place = p;
    }

    public void close(){
    }

    public void comeAcross(Shorty shorty){
    }

    public void escape(Place p){
    }

}
