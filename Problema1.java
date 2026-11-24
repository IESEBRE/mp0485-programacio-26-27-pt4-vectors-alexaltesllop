import java.util.Scanner;

public class Problema1{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            int n;

        do {
            n = Integer.parseInt(IO.readln());
            if (n > 0) break;
        } while (true);

        String[][] matriu = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriu[i][j] = IO.readln();
            }
        }

        int[][] posicions = new int[n][2];
        for (int i = 0; i < n; i++) {
            int colMin = 0;
            for (int j = 1; j < n; j++) {
                if (matriu[i][j].compareTo(matriu[i][colMin]) <= 0) {
                    colMin = j;
                }
            }
            posicions[i][0] = i;
            posicions[i][1] = colMin;
        }

        for (int i = 0; i < n; i++) {
            IO.println(Arrays.toString(posicions[i]));
        }


        sc.close();
    }

}
