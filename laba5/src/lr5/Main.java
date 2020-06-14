package lr5;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Cardinality: ");
        int N = scanner.nextInt();
        ListElement first=null;
        System.out.print("Enter the element: ");
        for (int i=0; i<N; i++) {
            int variable = scanner.nextInt();
            first=ListUtils.insert(first,variable);
        }
        System.out.println();
        ListElement p=ListUtils.filter(first);
        System.out.println("Remainder from 3 = 0 ");
        print(p);
        p=null;
        try{
            int result = ListUtils.reduce(ListUtils.map(ListUtils.filter(first)));
            System.out.println("Sum of cubes = " + result);
        }catch (NullPointerException ex){
            System.out.println("No elements");
        }
    }
    static void print(ListElement p){
        while (p!=null){
            System.out.println(p.getValue());
            p=p.getNext();
        }
    }
}
