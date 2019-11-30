public class Shorty extends LivingBeing {
    private Action action;
    public Shorty(String name){
        super(name);
    }

    protected void makeSure(boolean t){
        if (t) {
            System.out.println("Я убедился");
        }
    }

    protected void getDown(Things object) {
        System.out.println(name + " слез с " + object.getName());
    }

    public void pressButton(Button button){
        if (!button.singlePress) {
            System.out.println(name + " нажал на " + button.getColor() + " кнопка " + button.getName());
            button.setSinglePress(true);
        }
        else System.out.println(button.getName() + " уже была нажата");
    }

    public void setAction(){

    }

    protected void see(){
    }

    protected void escape(){
    }

    protected void runInAllDirection(){
    }
}
