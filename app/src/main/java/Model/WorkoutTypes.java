package Model;

public enum WorkoutTypes {
    RUNNING, SWIMMING, CYCLING, COREONLY;

    @Override
    public String toString() {
        switch (this) {
            case RUNNING:
                return "Running";
            case SWIMMING:
                return "Swimming";
            case CYCLING:
                return "Cycling";
            case COREONLY:
                return "Core Only";
            default:
                throw new IllegalArgumentException();
        }
    }
}


