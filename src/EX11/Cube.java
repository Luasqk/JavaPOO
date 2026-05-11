package EX11;

public class Cube extends Shape3D {
    private double length;

    public Cube(double length) {
        this.length = length;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(length, 3);
    }
    @Override
    public double calculateSurfaceArea() {
        return 6 * (length * length);
    }
}
