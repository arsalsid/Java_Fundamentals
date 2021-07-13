package Encapsulation;

public class Sphere {

    private double diameter;

    public Sphere (double diameter) {
        this.diameter = diameter;

    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double calculateVolumeOfSphere () {

        double radius = diameter / 2;
        double volumeOfSphere = (4 / 3) * (3.14 * radius * radius * radius);

        return  volumeOfSphere;
    }

    public double calculateSurfaceArea () {
        double radius = diameter / 2;
        double surfaceArea = 4 * (3.14 * radius *radius);

        return surfaceArea;
    }

    @Override
    public String toString () {
        String data ="Sphere [diameter=" + diameter + ", calculateVolumeOfSphere () = " + calculateVolumeOfSphere()
                + ", calculateSurfaceArea () = " + calculateSurfaceArea() + "]";

        return data;
    }

}
