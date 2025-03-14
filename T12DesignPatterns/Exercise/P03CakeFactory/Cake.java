package T12DesignPatterns.Exercise.P03CakeFactory;

public abstract class Cake implements CakeInterface {
    public double diameter;
    public double price;
    public int pieces;
    public Cake(double diameter, double price, int pieces) {
        this.diameter = diameter;
        this.price = price;
        this.pieces = pieces;
    }
}