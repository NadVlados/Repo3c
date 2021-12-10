import java.util.Scanner;

public class N24 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a temperature in C: ");
        double c = in.nextDouble();
        double f = 9 * c / 5 + 32;
        System.out.println(f);
        System.out.print("F = " + Math.round(f));

        in.close();

    }
}
