public class Hole extends Things{
    boolean close_open = false;

    Hole(String name, Place place, RoomsParts location){
        super(name, place, location);
        super.name = name;
        super.place = place;
        super.location = location;
        close_open = true;
    }

    public String getName(){
        return name;
    }

    public String getRoomPlace(){
        return location.getTitle();
    }

    public void close(){
        close_open = false;
        System.out.println(getName() + " закрылись");
    }

    public void open(){
        close_open = true;
        System.out.println(getName() + " открылись");
    }
}
