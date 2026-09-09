package Circle;
import java.util.Scanner;

public class Circle_info {
	
	double radius;
    String colour;

    void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        radius = sc.nextDouble();

        System.out.print("Enter colour: ");
        colour = sc.next();

        sc.close();
    }

    void calcArea() {
        double area = Math.PI * radius * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Colour: " + colour);
        System.out.println("Area of circle: " + area);
    }

	public static void main(String[] args) {
		Circle_info c = new Circle_info();

        c.getInput();
        c.calcArea();	

	}

}
