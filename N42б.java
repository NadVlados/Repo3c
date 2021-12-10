import java.util.Scanner;

public class N42б {
    public static void main(String[] args) {
        System.out.println(Func());
    }
    public static double Func() {
        Scanner in = new Scanner(System.in);
        double X = in.nextDouble();
        double Y = in.nextDouble();
        double f = Math.pow(X,2) * Math.pow(Y,2) + Math.pow(X,3) * Math.pow(Y,3) + Math.pow(X,4) * Math.pow(Y,4);
        return f;
    }
}
