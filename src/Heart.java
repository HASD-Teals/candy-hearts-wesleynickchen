public class Heart {
    // PROPERTIES
    private String color;
    //Add remaining heart properties here...
    private int Size;
    private String Sayings;
    private int Calories;
    private double Cost;
    private boolean available;
    private int stock;

    // CONSTRUCTORS
    public Heart() {
        this.color = "blue";
        this.Size = 3;
        this.Sayings = "Be My Friend (or else)";
        this.Calories = 5;
        this.Cost = .05;
        this.available = true;
        this.stock = 30;
    } 
    // This is the default contructor
    //Add overloaded Constructor here...
    public Heart(String color, int Size, String Sayings, int Calories, double Cost, boolean available, int stock) {
        this.color = color;
        this.Size = Size;
        this.Sayings = Sayings;
        this.Calories = Calories;
        this.Cost = Cost;
        this.available = available;
        this.stock = stock;
    } 

    // ACCESSORS
    
    public String getColor() {
        return this.color;
    }
    public String getSaying() {
        return this.Sayings;
    }
    public int getSize() {
        return this.Size;
    }
    public int getCalories() {
        return this.Calories;
    }
    public double getCost() {
        return this.Cost;
    }
    public boolean getAvailability() {
        return this.available;
    }
    public int getStock() {
        return this.stock;
    }
    public void getReport(){
        report();
    }
    //Add remaining Accessor methods here...


    // MUTATORS
    public void setColor(String color) {
        this.color = color;
    }
    public void setSize(int Size) {
        this.Size = Size;
    }
    public void setSaying(String Sayings) {
        this.Sayings = Sayings;
    }
    public void setCalories(int Calories) {
        this.Calories = Calories;
    }
    public void setCost(double Cost) {
        this.Cost = Cost;
    }
    public void setAvailability(boolean available) {
        this.available = available;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    //Add remaining Mutator methods here...


    // METHODS
    
    public void adjPrice(int percent){
        this.Cost = Cost * (1/percent);
    }
    public void inStock(int stockSet){
        this.stock = stockSet;
        if(stockSet > 0){
            this.available = true;
        }
    }
    
    private String report() {
        return this.color + "\n" +
        this.color + "\n" +
        this.Size + "\n" +
        this.Sayings + "\n" +
        this.Calories + "\n" +
        this.Cost + "\n" +
        this.available + "\n" +
        this.stock; // Add other properties here as you add them to the class
    }
    //Write other methods here (if needed)...
}
