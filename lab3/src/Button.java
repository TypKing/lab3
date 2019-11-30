public class Button {
    private String name;
    public boolean singlePress;
    private Color color;
    private RoomsParts location = RoomsParts.WALL;

    Button(String name, Place place, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor(){
        return color.toString();
    }

    public void setSinglePress(boolean b){
        this.singlePress = b;
    }
}
