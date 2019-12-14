import java.nio.charset.Charset;

public class Shorty extends LivingBeing implements Movable, Runnable{
    protected int degreeOfDirt;
    protected int degreeOfWet;

    public Shorty(String name, Place place){
        super(name, place);
        place.countShorties++;
        place.shorties[place.countShorties] = this;
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
        }
        if (count == shorties.length) {
            System.out.println("Я убедился, что все коротышки слезли с полок");
        } else {
            System.out.println("Не все коротышки слезли с полок");
        }
    }

    public void getDown(Things object) throws InterruptedException {
        System.out.println(getName() + " слез с " + object.getName());
        setAction(Action.STANDING);
        Thread.sleep(500);
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
        System.out.println("Состояние у " + getName() + "изменилось с " + this.action.getTitle()+ " на " + action.getTitle());
        super.action = action;
    }

    protected void see(Things[] things, Hole hole){
        int count = 0;
        if ((things[1].place == null) && (things[2] != null)) {
            System.out.println(getName() + " увидел, что полки начали опускаться в " + hole.getName());
        } else {
            for (Things thing : things) {
                if (thing.place == null) {
                    count++;
                }
            }
            if (count == things.length) {
                hole.close_open = false;
                System.out.println(getName() + " увидел, что все полки исчезли в " + hole.getName());
            }
        }
    }

    public void runAway(int x, int y){
        //передвижение на вектор
    }

    public void getToWater(int value){
        //изменение значения переменной degreeOfWet в соответсветствии с продолжительностью нахождения по струей воды
    }

    public void runAround() throws InterruptedException {
        //передвижение на рандомный вектор
        Thread.sleep(500);
    }

    public void changePlace(Place p){
        super.place = p;
    }

    public void close(){
    }

    public void comeAcross(Shorty shorty){
    }

    public void escape(){
        changePlace(null);
    }

}
