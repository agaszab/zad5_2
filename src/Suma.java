import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int [] tab=new int[5];

        for (int i = 0; i < tab.length; i++) {
            System.out.println("Podaj liczbę "+i+":");
            tab[i]=scan.nextInt();
        }

        System.out.println("Twoje liczby to:");
        for (int  liczba: tab) {
            System.out.print(liczba+" ");
        }

        int suma= tab[0]+tab[2]+tab[4];
        System.out.println(3);
        System.out.println(tab[0]+" + "+tab[2]+" + "+tab[4]+" = "+suma);

    }

}
