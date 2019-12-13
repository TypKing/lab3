public class Button extends Things{
    protected boolean singlePress;
    private Color color;
    private RoomsParts location = RoomsParts.WALL;

    Button(String name, Place place, Color color) {
        super(name, place);
        super.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor(){
        return color.getTitle();
    }

    public void setSinglePress(boolean b){
        this.singlePress = b;
    }
}
