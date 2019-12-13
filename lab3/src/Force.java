public enum Force {
    STRONG ("Мощный"),
    MEDIUM ("Средний"),
    WEAK("Слабый");
    protected String title;
    Force(String title) {
        this.title = title;
    }

    protected String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return getTitle();
    }
}
