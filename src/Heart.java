public class Heart {
    // PROPERTIES
    private String color;
    //Add remaining heart properties here...
    private int Size;
    private String Sayings;
    private int Calories;
    private double Cost;
    private int stock;

    // CONSTRUCTORS
    public Heart() {
        this.Size = 3;
        this.Sayings = "Be My Friend (or else)";
    } // This is the default contructor
    //Add overloaded Constructor here...


    // ACCESSORS
    public String getColor() {
        return this.color;
    }
    //Add remaining Accessor methods here...


    // MUTATORS
    public void setColor(String color) {
        this.color = color;
    }
    //Add remaining Mutator methods here...


    // METHODS
    public String report() {
        return this.color + "\n"; // Add other properties here as you add them to the class
    }
    //Write other methods here (if needed)...
}
