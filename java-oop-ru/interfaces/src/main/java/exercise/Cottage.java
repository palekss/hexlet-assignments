package exercise;

// BEGIN
public class Cottage implements Home {
    private double area;
    private int floorCount;

    public Cottage(double area, int flourCount) {
        this.area = area;
        this.floorCount = flourCount;
    }

    public double getArea() {
        return this.area;
    }

    @Override
    public String toString() {
        return floorCount +  " этажный коттедж площадью " + this.area + " метров";
    }

    public int compareTo(Home another) {
        int result;
        if (this.area > another.getArea()) {
            result = 1;
        } else if (this.area == another.getArea()) {
            result = 0;
        } else  {
            result = - 1;
        }
        return result;
    }
}
// END
