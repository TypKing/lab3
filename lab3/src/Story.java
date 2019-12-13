import java.nio.charset.StandardCharsets;

public class Story {

    public static void main(String[] args) {
        Place room = new Place("Помещение");
        Place corridor = new Place("Коридор");
        Shorty dontknow = new Shorty("Незнайка", corridor);
        Shorty Drigle = new Shorty("Дригль", corridor);
        Things[] shelf = new Things[10];
        Shorty[] shorty = new Shorty[10];
        for (int i = 0; i<10; i++) {
            shorty[i] = new Shorty("Коротышка " + (i + 1), room);
            shelf[i] = new Things("Полка № " + (i+1), room);
            shorty[i].getDown(shelf[i]);
        }
        Things door = new Things("Дверь", corridor, RoomsParts.WALL);
        Button button1 = new Button("Кнопка №1", corridor, Color.BLUE);
        dontknow.pressButton(button1);
        Hole squareHole = new Hole("Четырехугольные отверстия", room, RoomsParts.FLOOR);
        Time.increaseTime();
        PrisonBoss prisonBoss = new PrisonBoss();
        prisonBoss.checkMoney();
    }
}
