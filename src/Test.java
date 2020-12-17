import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Circle[] circles= new Circle[3];
        circles[0]=new Circle(6);
        circles[1]=new Circle(2);
        circles[2]=new Circle(3);
        Arrays.sort(circles);
        for (Circle circle: circles
             ) {
            System.out.println(circle);

        }

    }
}
