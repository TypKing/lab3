public abstract class LivingBeing {
    protected String name;
    protected Place place;

    LivingBeing() {}

    LivingBeing(Place place) {
        this.place = place;
    }

    LivingBeing(String name, Place place) {
        this.name = name;
        this.place = place;
    }


    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return name;
    }


    @Override
    public boolean equals(Object obj) {
        return name == obj.toString();
    }
}
