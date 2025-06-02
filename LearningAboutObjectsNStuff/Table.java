package LearningAboutObjectsNStuff;

// Because it's IKEA, we be using the metric system. Thank you Sweden.

public class Table {
    // Attributes - Variables
    double height;
    double width;
    double length;
    double price;
    double topThickness;
    double weight;
    double weightCapacity;
    int legs;
    String material;
    String color;
    boolean mobile;
    boolean foldable;

    // Default Constructor - Special Method
    // Name of method = name of class
    public Table() {
        height = 200;
        width = 400;
        length = 500;
        price = 42;
        topThickness = 50;
        weight = 50;
        weightCapacity = 50000000;
        legs = 5;
        material = "chrome";
        color = "navy-yellow";
        mobile = true;
        foldable = false;

        public double getHeight(){
            return height;
        }
        public double getWidth(){
            return width;
        }
        public double getLength(){
            return length;
        }
        public double getPrice(){
            return price;
        }
        public double getTopThickness(){
            return topThickness;
        }
    }

}
