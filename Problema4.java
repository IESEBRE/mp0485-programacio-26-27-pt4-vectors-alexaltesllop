import java.util.Scanner;

public class Problema4{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       int n;

        do {
            n = Integer.parseInt(IO.readln());
            if (n > 0) break;
        } while (true);

        String[] paraules = new String[n];
        for (int i = 0; i < n; i++) {
            paraules[i] = IO.readln();
        }

        boolean[][] coincidencies = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                coincidencies[i][j] = paraules[i].contains(paraules[j]);
            }
        }

        for (int i = 0; i < n; i++) {
            IO.println(Arrays.toString(coincidencies[i]));
        }


        sc.close();
    }

}
