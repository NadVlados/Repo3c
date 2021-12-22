import java.util.Scanner;

public class aud__2_1 {
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
        System.out.println("chose 'c' for column; 'r' for row:");
        char manage_char = sc.nextLine().charAt(0);
        System.out.println("input k index of column/row:");
        int k = sc.nextInt();
        int[] curr_vector, curr_vector_idx;
        int[][] res_matrix = new int[matrix.length][matrix[0].length];
        if (manage_char == 'c') {
            curr_vector = new int[matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                curr_vector[i] = matrix[i][k];
            }
            curr_vector_idx = my_sort(curr_vector);
            int res_i = 0;
            for (int i : curr_vector_idx) {
                for (int j = 0; j < res_matrix[0].length; j++){
                    res_matrix[res_i][j] = matrix[i][j];
                }
                res_i++;
            }

        } else {
            curr_vector = new int[matrix[0].length];
            for (int i = 0; i < matrix[0].length; i++) {
                curr_vector[i] = matrix[k][i];
            }
            curr_vector_idx = my_sort(curr_vector);
            int res_j = 0;
            for (int j : curr_vector_idx) {
                for (int i = 0; i < res_matrix.length; i++){
                    res_matrix[i][res_j] = matrix[i][j];
                }
                res_j++;
            }
        }

        System.out.println();
        for (int[] row: res_matrix){
            for (int el: row){
                System.out.print(el + " ");
            }
            System.out.println();
        }


    }

    public static int[] my_sort(int[] mass) {
//        modified bubble sort
        int n = mass.length;
        int[] indexes = new int[n];
        for (int i = 0; i < n; i++) {
            indexes[i] = i;
        }
        int buff;
        boolean is_sorted = true;
        for (int fixed_number = 0; fixed_number < n; fixed_number++) {
            for (int i = 0; i < (n - fixed_number - 1); i++) {
                if (mass[i] > mass[i + 1]) {
                    buff = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = buff;
                    indexes[i] = i + 1;
                    indexes[i + 1] = i;
                    is_sorted = false;
                }
            }
            if (is_sorted) {
                break;
            }

        }
        return indexes;
    }
}
