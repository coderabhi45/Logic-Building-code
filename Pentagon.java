
public class Pentagon {

    public static double calculateArea(double side) {

        double area = (1.0 / 4.0) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * side * side;
        return area;
    }

    public static void main(String[] args) {
        double side = 6;
        double area = calculateArea(side);
        System.out.println("Area of the pentagon: " + area);
    }
}
