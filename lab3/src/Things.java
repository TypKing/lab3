public class Things {
    protected RoomsParts location;
    protected Place place;
    protected String name;

    Things(String name, Place place){
        this.name = name;
        this.place = place;
        place.countThings++;
        place.things[place.countThings] = this;
    }

    Things(String name, Place place, RoomsParts location){
        this.name = name;
        this.place = place;
        this.location = location;
        place.countThings++;
        place.things[place.countThings] = this;
    }

    public String getName(){
        return name;
    }

    public void vanish(Hole hole){
        if (hole.close_open) {
            place = null;
            System.out.println(getName() + " исчезли в " + hole.getName() + ", которые находятся в " + hole.getRoomPlace());
        }
    }

    public void setPlace(Place place){
        this.place = place;
    }
}
