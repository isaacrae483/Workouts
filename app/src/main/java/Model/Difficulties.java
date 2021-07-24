package Model;

public enum Difficulties {
    EASY, MEDIUM, HARD, SPARTAN;

    @Override
    public String toString() {
        switch (this) {
            case EASY:
                return "Easy";
            case MEDIUM:
                return "Medium";
            case HARD:
                return "Hard";
            case SPARTAN:
                return "Spartan";
            default:
                throw new IllegalArgumentException();
        }
    }
}
