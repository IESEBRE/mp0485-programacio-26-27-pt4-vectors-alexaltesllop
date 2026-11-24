import java.util.Scanner;

public class Problema2{
    
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

        char caracter = IO.readln().charAt(0);
        int[] comptador = new int[n];

        for (int i = 0; i < n; i++) {
            int vegades = 0;
            for (int j = 0; j < paraules[i].length(); j++) {
                if (paraules[i].charAt(j) == caracter) {
                    vegades++;
                }
            }
            comptador[i] = vegades;
        }

        IO.print(Arrays.toString(comptador));


        sc.close();
    }

}
