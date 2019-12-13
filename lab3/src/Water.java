public class Water implements Movable {
    Force force = Force.MEDIUM;
    Place place = null;

    public void setForce(Force f){
        force = f;
    }

    public void changePlace(Place p){
        if (place != p) {
            System.out.println("Из " + place.toString() + " брызнули " + force.getTitle() + " струи воды" + p.toString());
            place = p;
        }
    }

    public void runFollow(Shorty shorty){
        shorty.changeAction(Action.LYING);     //на определенное время
        shorty.getToWater();
    }

    @Override
    public String toString() {
        return "поток воды";
    }
}
