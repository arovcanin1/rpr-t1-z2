package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    static int sumaCifara (int broj) {

        int suma = 0;
        while (broj != 0)
        {
            suma = suma + broj%10;
            broj = broj/10;
        }

        return suma;
    }
    public static void main(String[] args) {
	// write your code here
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite n: ");
        int n = ulaz.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i%sumaCifara(i) == 0) System.out.println(i);
        }
    }
}
