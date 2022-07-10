import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //Patika.dev egitim kampi proje odevidir.
        //if else dongu kullanilmadan yapilmasi istenmektedir.

        double boy, kilo;


        Scanner inp = new Scanner(System.in);

        System.out.println("Lutfen boyunuzu metre cinsinden giriniz = ");

        boy = inp.nextDouble();

        Scanner inp1 = new Scanner(System.in);

        System.out.println("Lutfen kilonuzu giriniz = ");

        Scanner inp2 = new Scanner(System.in);

        kilo = inp2.nextDouble();

        double bmi = kilo/boy*boy;

        System.out.println("Vucut kitle indeksiniz/ bmi = " + bmi);






    }
}
