public class Place {
    protected int countThings = 0;
    protected int countShorties = 0;
    protected String nameOfPlace;
    protected Things[] things = new Things[20];
    protected Shorty[] shorties = new Shorty[20];

    Place(String n) {
        nameOfPlace = n;
    }

    @Override
    public String toString() {
        return nameOfPlace;
    }

    public void addThings(Things thing){
        if (!thing.place.toString().equals(toString())) {
            countThings++;
            thing.setPlace(this);
            for (int i = 0; i<things.length; i++){
                if (things[i] == null) {
                    things[i] = thing;
                    break;
                }
            }
        }
    }

    public void removeThings(Things thing){
        if (thing.place.toString().equals(toString())) {
            countThings--;
            thing.place = null;
            for (int i = 0; i<things.length; i++){
                if (things[i] == thing) {
                    things[i] = things[i+1];
                    things[things.length-1] = null;
                }
            }
            if (countThings == 0) {
                System.out.println(toString() + " освобождено");
            }
        } else {
            System.out.println("В " + toString() + " нет " + thing.toString());
        }
    }

    public void addShorty(Shorty shorty){
        if (!shorty.place.toString().equals(toString())) {
            countShorties++;
            shorty.setPlace(this);
            for (int i = 0; i<shorties.length; i++){
                if (shorties[i] == null) {
                    shorties[i] = shorty;
                    break;
                }
            }
        }
    }

    public void removeShorty(Shorty shorty){
        if (shorty.place.toString().equals(toString())) {
            shorty.place = null;
            for (int i = 0; i<shorties.length; i++){
                if (shorties[i] == shorty) {
                    shorties[i] = shorties[i+1];
                    shorties[shorties.length-1] = null;
                }
            }
            if (countShorties == 0) {
                System.out.println(toString() + " освобождено");
            }
        } else {
            System.out.println("В " + toString() + " нет " + shorty.getName());
        }
    }

    public void returnThingsName(){
        System.out.println("В " + toString() + "находятся следующие вещи: ");
        for (Things thing : things) {
            System.out.println(thing.toString());
        }
    }

    public void returnShortiesName(){
        System.out.println("В " + toString() + "находятся следующие коротышки: ");
        for (Shorty shorty : shorties) {
            System.out.println(shorty.toString());
        }
    }
}
