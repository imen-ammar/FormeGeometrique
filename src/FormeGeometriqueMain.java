public class FormeGeometriqueMain {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(20,2.5);
        double surfaceRectangle = rectangle1.clalculerSurface();
        System.out.println("La surface du rectangle est :"+surfaceRectangle);

        Triangle triangle1 = new Triangle(5.3,6.9);
        double surfaceTriangle = triangle1.clalculerSurface();
        System.out.println("La surface du triangle est :"+surfaceTriangle);

    }
}
