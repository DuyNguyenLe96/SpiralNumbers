package LinhTinh;

import java.util.*;

public class exexe {
    int[][] spiralNumbers(int n) {
        int[][] result = new int[n][n];
        int left = 0, top = 0;
        int right = n - 1, down = n - 1;
        String direct = "East";
        int num = 1;
        while (left <= right && top <= down) {
            if (direct == "East") {
                for (int i = left; i <= right; i++) {
                    result[top][i] = num++;
                }
                top++;
                direct = "South";
            } else if (direct == "South") {
                for (int i = top; i <= down; i++) {
                    result[i][right] = num++;
                }
                right--;
                direct = "West";
            } else if (direct == "West") {
                for (int i = right; i >= left; i--) {
                    result[down][i] = num++;
                }
                down--;
                direct = "North";
            } else {
                for (int i = down; i >= top; i--) {
                    result[i][left] = num++;
                }
                left++;
                direct = "East";
            }
        }
        return result;

    }


    public static void main(String[] args) {
        exexe exexe = new exexe();
        int[][] n = {{1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}};
        int[][] result=exexe.spiralNumbers(3);
        for (int[] ints : result) {
            System.out.print(Arrays.toString(ints));

        }



    }
}