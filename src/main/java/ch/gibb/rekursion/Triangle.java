package ch.gibb.rekursion;

public class Triangle {
    private int width;

    public Triangle(int aWidth) {
        width = aWidth;
    }


    public int getArea() {
        if (width == 1) {
            return 1;
        } else {
            Triangle smallerTriangle = new Triangle(width-1);
            smallerTriangle.getArea();
            int smallerArea = smallerTriangle.getArea();
            return smallerArea + width;
        }

    }
}

