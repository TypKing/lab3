public enum Action {
    DEFAULT ("бездействует"),
    STANDING ("стоит"),
    RUNNING ("бежит"),
    SITTING ("сидит"),
    LYING("лежит");
    private String title;
    Action(String title) {
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
