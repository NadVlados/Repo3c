//import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class aud_2_2 {

    public static void main(String[] args) {
        int[][] matrix = {
                {2, 1, 2},
                {6, 5, 9},
                {7, 8, 4}
        };

        for (int[] row: matrix){
            for (int el: row){
                System.out.print(el + " ");
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("input \n'rl' to right or left, \n'ud' to up or down\nrotation: ");
        String mode = sc.nextLine();
        System.out.println("input " +
                "\npositive k, if want to rotate right/down, \n" +
                "or negative k, if you want rotate left/up: ");
        int k = sc.nextInt();
        if (mode.equals("rl")){
            for (int i = 0; i < matrix[0].length; i++){
                rotate_vector_els(matrix[i], k);
            }
        }
        else if (mode.equals("ud")){
            rotate_vector_els(matrix, k);
        }
        for (int[] row: matrix){
            for (int el: row){
                System.out.print(el + " ");
            }
            System.out.println();
        }


    }

    public static void rotate_vector_els(int [] vector, int rotate_coef){
        int[] buff_vector = new int[vector.length];
        int new_idx;
        for (int i = 0; i < vector.length; i++){
            new_idx = Math.floorMod(i + rotate_coef, vector.length);
            buff_vector[new_idx] = vector[i];
        }
        for (int i = 0;i < vector.length; i++){
            vector[i] = buff_vector[i];
        }
    }

    public static void rotate_vector_els(int[][] vector, int rotate_coef){

        int[][] buff_vector = new int[vector.length][vector[0].length];
        int new_idx;
        for (int i = 0; i < vector.length; i++){
            new_idx = Math.floorMod(i + rotate_coef, vector.length);
            buff_vector[new_idx] = vector[i];
        }
        for (int i = 0;i < vector.length; i++){
            vector[i] = buff_vector[i];
        }
    }

}
