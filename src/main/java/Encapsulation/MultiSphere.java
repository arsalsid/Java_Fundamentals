package oop;

public class MultiSphere {
    public static void main(String[] args) {

        Sphere sphere1 = new Sphere(10.5);
        System.out.println(sphere1.calculateSurfaceArea());
        System.out.println(sphere1.calculateVolumeOfSphere());

        Sphere sphere2 = new Sphere( 33.33);
        System.out.println(sphere2);
        sphere2.setDiameter(11.11);
        System.out.println(sphere2);

    }
}
