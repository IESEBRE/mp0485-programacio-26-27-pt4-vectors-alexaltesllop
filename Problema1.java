import java.util.Scanner;

public class Problema1{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n;

        do {
            n = Integer.parseInt(IO.readln());
            if (n > 0) break;
        } while (true);

        String[] paraules = new String[n];
        for (int i = 0; i < n; i++) {
            paraules[i] = IO.readln(); // Llegim directament amb IO.readln()
        }

        int[] lletres = new int[n];
        for (int i = 0; i < n; i++) {
            lletres[i] = paraules[i].length();
        }

        IO.print(Arrays.toString(paraules)+ " -> " +Arrays.toString(lletres));


        sc.close();
    }

}
