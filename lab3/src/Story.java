import java.util.Random;
import java.util.Timer;

public class Story {

    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer();
        Time time = new Time();
        Water stream = new Water();

        Place room = new Place("Room");
        Place corridor = new Place("Corridor");

        Shorty dontknow = new Shorty("Neznaika", corridor);
        Shorty drigle = new Shorty("Drigle", corridor);
        Shorty[] shorty = new Shorty[10];

        Things[] shelf = new Things[10];
        Things door = new Things("Door", corridor, RoomsParts.WALL);
        door.setClose_open(true);
        Button button1 = new Button("button 1", corridor, Color.BLUE);
        Button button2 = new Button("button 2", corridor, Color.ORANGE);
        Hole squareHole = new Hole("Square Holes", room, RoomsParts.FLOOR);
        Hole circleHole = new Hole("Circle Holes", room, RoomsParts.WALL);

        timer.schedule(time, 0, 500);
        for (int i = 0; i<10; i++) {
            shorty[i] = new Shorty("Korotishka " + (i + 1), room);
            shelf[i] = new Things("Polka " + (i + 1), room);
            shorty[i].getDown(shelf[i]);
        }
        dontknow.makeSure(shorty);
        dontknow.pressButton(button1);
        squareHole.open();
        shelf[0].vanish(squareHole);
        dontknow.see(shelf, squareHole);
        room.returnThingsName();
        for (int i = 1; i<10; i++) {
            shelf[i].vanish(squareHole);
        }
        room.returnThingsName();
        room.returnShortiesName();
        drigle.see(shelf, squareHole);
        drigle.lock(door);
        drigle.pressButton(button2);
        circleHole.open();
        stream.setLocation(circleHole);
        stream.setForce(Force.STRONG);
        stream.changePlace(room);
        Random random = new Random();
        int k = random.nextInt(13)+7;
        for (int i = 0; i<k; i++) {
            int j = random.nextInt(9)+1;
            stream.runFollow(shorty[j], 100*(random.nextInt(2)+4));
        }
        PrisonBoss.setWish(false);
        PrisonBoss.rename(room, "Moiku");
        PrisonBoss.wasteMoney(3000000, "postroika specialnoy umivalni");
//        Time.increaseTime();
//        PrisonBoss.checkMoney();
        System.out.println(Time.getMinutes());
        System.exit(0);
    }
}
