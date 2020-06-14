package lr4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList pointList = new ArrayList();
        int n;
        System.out.print("Enter the number: ");
        n = console.nextInt();
        System.out.println();

        for(int i = 0; i < n; i++) {
            System.out.print("x = ");
            double x = console.nextDouble();
            System.out.print("y = ");
            double y = console.nextDouble();
            System.out.println();
            pointList.add(new Point(x,y));
        }

        OutPut(pointList);
    }
    private static void OutPut (ArrayList list) {
        Collections.sort(list, new PComparator());
        for(Object obj : list) {
            System.out.println(obj.toString());
        }
    }
}
