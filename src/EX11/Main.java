package EX11;
//6. Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume()
// and calculateSurfaceArea(). Create subclasses Sphere and Cube that extend the Shape3D class and
// implement the respective methods to calculate the volume and surface area of each shape.

public class Main {
    public static void main(String[] args) {
        Cube cube = new Cube(3);
        Sphere sphere = new Sphere(4);

        System.out.println("--- CUBE PROPERTIES ---");
        System.out.printf("Volume: %.2f%n", cube.calculateVolume());
        System.out.printf("Surface Area: %.2f%n", cube.calculateSurfaceArea());

        System.out.println("\n--- SPHERE PROPERTIES ---");
        System.out.printf("Volume: %.2f%n", sphere.calculateVolume());
        System.out.printf("Surface Area: %.2f%n", sphere.calculateSurfaceArea());

    }
}
