public class Circle implements Comparable<Circle>{
    private double radius;
    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public Circle (double radius) {
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public int compareTo(Circle o) {
        if (this.getRadius() > o.getRadius()) return 1;
        else if (this.getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
