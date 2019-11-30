public enum RoomsParts {
    WALL("Стена"),
    FLOOR("Пол"),
    CEILING("Потолок");
    private String title;
    RoomsParts(String title) {
        this.title = title;
    }
    private String getTitle() {
        return title;
    }


    @Override
    public String toString() {
        return getTitle();
    }
}
