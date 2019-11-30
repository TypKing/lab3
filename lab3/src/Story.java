public class Story {

    public static void main(String[] args) {
        Place room = new Place("Помещение");
        Place corridor = new Place("Корридор");
        Shorty dontknow = new Shorty("Незнайка");
        Shorty Drigle = new Shorty("Дригль");
        Things[] shelf = new Things[10];
        Shorty[] shorty = new Shorty[10];
        for (int i = 0; i<10; i++) {
            shorty[i] = new Shorty("Коротышка №" + (i + 1));
            shelf[i] = new Things("Полка №" + Integer.toString(i+1), room);
            shorty[i].getDown(shelf[i]);
        }
        Things door = new Things("Дверь", corridor, RoomsParts.WALL);
        Button button1 = new Button("Кнопка №1", corridor, Color.BLUE);
        dontknow.pressButton(button1);
    }
}
