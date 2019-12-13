import java.nio.charset.StandardCharsets;

public class Story {

    public static void main(String[] args) {
        Place room = new Place("Помещение");
        Place corridor = new Place("Коридор");
        Shorty dontknow = new Shorty("Neznaika", corridor);
        Shorty drigle = new Shorty("Drigle", corridor);
        Things[] shelf = new Things[10];
        Shorty[] shorty = new Shorty[10];
        for (int i = 0; i<10; i++) {
            shorty[i] = new Shorty("Korotishka " + (i + 1), room);
            shelf[i] = new Things("Polka " + (i + 1), room);
            shorty[i].getDown(shelf[i]);
        }
        Things door = new Things("Door", corridor, RoomsParts.WALL);
        Button button1 = new Button("button 1", corridor, Color.BLUE);
        dontknow.pressButton(button1);
        Hole squareHole = new Hole("Четырехугольные отверстия", room, RoomsParts.FLOOR);
        Time.increaseTime();
        PrisonBoss prisonBoss = new PrisonBoss();
        prisonBoss.checkMoney();
    }
}
