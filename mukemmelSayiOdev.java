import java.util.Scanner;

public class mukemmelSayiOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam = 0;

        System.out.println("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        for (int i = 1; i < sayi; i++) {

            if (sayi % i == 0) {
                toplam += i;
            }

        }
        if (sayi == toplam) {
            System.out.println(sayi + "\nMükemmel bir sayıdır.");
        } else {
            System.out.println(sayi + "\nMükemmel bir sayı değildir.");
        }

    }
}
