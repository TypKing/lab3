public class Water implements Movable {
    Force force = Force.MEDIUM;
    Place place = null;

    public void setForce(Force f){
        force = f;
    }

    public void changePlace(Place p){
        if (place != p) {
            System.out.println("Из " + place.getPlace() + " брызнули " + force.getTitle() + " струи воды" + p.getPlace());
            place = p;
        }
    }

    public void runFollow(Shorty shorty){
        //смена действия на Action.Lying
    }

    @Override
    public String toString() {
        return "поток воды";
    }
}
