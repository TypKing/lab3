public class Hole extends Things{

    Hole(String name, Place place, RoomsParts location){
        super(name, place, location);
        super.name = name;
        super.place = place;
        super.location = location;
    }

    public String getName(){
        return name;
    }

    public String getRoomPlace(){
        return location.getTitle();
    }

    public void close(){

    }
}
