import java.util.*;

public class Main {


    static int factoriel = 1;

    static void getFactoriel(int facnumber) {
        if (facnumber < 0) {
            System.out.println("Hatalı Giriş Yaptınız!!");
        }
        if (facnumber > 0) {
            factoriel = factoriel * facnumber;
            getFactoriel(facnumber - 1);
        }
    }

    static int fib1 = 0, fib2 = 1, fibcount, fib3 = 0;

    static void getFibonacci(int count) {
        if (count > 0) {
            fib3 = fib1 + fib2;
            System.out.print(" " + fib3);
            fib1 = fib2;
            fib2 = fib3;
            getFibonacci(count - 1);
        }
    }


    public static void main(String[] args) {

        System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz.\n1 - Faktöriyel Hesabı\n2 - Palindrom Sayi Bulma\n3 - Fibonacci Sayıları");
        Scanner scan = new Scanner(System.in);
        int sonuc = scan.nextInt();

        switch (sonuc) {

            case 1:
                System.out.print("Faktöriyel Hesabı Yapılacak Sayıyı Giriniz = ");
                int facnumber = scan.nextInt();

                getFactoriel(facnumber);
                System.out.println(facnumber + " sayısının faktöriyeli = " + factoriel);
                break;
            case 2:
                System.out.print("Palindrom Kontrol Edilecek Sayıyı Giriniz = ");
                int palindrom = scan.nextInt();
                int firstValue = palindrom;
                int length = String.valueOf(palindrom).length();
                int remainder, lastValue = 0;
                for (int i = 1; i <= length; i++) {
                    remainder = palindrom % 10;
                    lastValue = lastValue * 10 + remainder;
                    palindrom = palindrom / 10;
                }
                if (lastValue == firstValue) {
                    System.out.println(lastValue + " Palindrom Sayıdır.");
                } else {
                    System.out.println(lastValue + " Palindrom Sayı Değildir.");
                }

                break;
            case 3:

                System.out.print("Fibonacci Eleman Sayısını Giriniz = ");
                fibcount = scan.nextInt();
                System.out.print(fib1 + " " + fib2);
                getFibonacci(fibcount - 2);
                break;
            default:
                System.out.println("Hatalı Seçim Yaptınız Lütfen Daha Sonra Tekrar Deneyiniz.");
                break;
        }


    }
}
