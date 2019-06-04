
package testing;

import java.util.Scanner;
/**
Testing cloning to github
*/
public class Testing {

    public static void main(String[] args) {
        Aritmatika run = new Aritmatika();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka\t: ");
        int a = input.nextInt();
        run.penjumlahan(a);
        run.perkalian(a);
    }
    
}
