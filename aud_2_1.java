

import java.util.Scanner;

public class aud_2_1 {
    public static void main(String[] args) {
        System.out.println("напиши свою прізвище потім натисни 'Enter':");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Привіт, " + s);
    }
}