// create enum values for Position
public enum PositionTitle {
    ADMINISTRATION("Administration"), PRODUCTION("Production"), SALES("Sales"), MAINTENANCE("Maintenance"), TECHNICAL("Technical"), SECRETARIAL("Secretarial");

    private String name;

    PositionTitle(String name){
        this.name = name;
    }
    // create the override to display the pretty value of each enum
    @Override
    public String toString() {
        return name;
    }
}
