public abstract class LivingBeing {
    protected Action action = Action.DEFAULT;
    public String name;
    protected Place place;

    LivingBeing() {}

    LivingBeing(Place place) {
        this.place = place;
    }

    LivingBeing(String name, Place place) {
        this.name = name;
        this.place = place;
    }

    LivingBeing(String name, Place place, Action action) {
        this.name = name;
        this.place = place;
        this.action = action;
    }

    public String getName(){
        return this.name;
    }
}
