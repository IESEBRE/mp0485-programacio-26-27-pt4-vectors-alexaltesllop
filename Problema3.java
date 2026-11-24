import java.util.Scanner;

public class Problema3{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         int n;

            do {
                n = Integer.parseInt(IO.readln());
                if (n >= 0) break;
            } while (true);

            String[] paraules = new String[n];
            for (int i = 0; i < n; i++) {
                paraules[i] = IO.readln();
            }

            boolean[] iguals = new boolean[n];
            for (int i = 0; i < n; i++) {
                String primeraLletra = String.valueOf(paraules[i].charAt(0));
                iguals[i] = paraules[i].startsWith(primeraLletra) && paraules[i].endsWith(primeraLletra);
            }

            IO.print(Arrays.toString(iguals));


        sc.close();
    }

}
