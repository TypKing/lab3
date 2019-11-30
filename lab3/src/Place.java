public class Place {
    private String nameOfPlace;
    Place(String n) {
        nameOfPlace = n;
    }

    public String getPlace(){
        return nameOfPlace;
    }

    @Override
    public String toString() {
        return getPlace();
    }
}
