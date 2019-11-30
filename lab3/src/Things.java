public class Things {
    private String nameOFThing;

    Things(String name, Place place){
        this.nameOFThing = name;
    }

    Things(String name, Place place, RoomsParts location){
        this.nameOFThing = name;
    }

    public String getName(){
        return nameOFThing;
    }
}
