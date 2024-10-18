import tools.calc; //or tools.* for all files
import java.util.Scanner;
public class implemenation_of_packag {
    public static void main(String[] args) {
        int x;
        int y;

        Scanner sc = new Scanner(System.in);
        x= sc.nextInt();
        y = sc.nextInt();

        calc calc = new calc();
        System.out.println(calc.add(x,y) + "addition");
        System.out.println(calc.sub(x,y) + "subtracton");

    }
}
