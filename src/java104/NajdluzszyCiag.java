package java104;
import java.util.Scanner;

public class NajdluzszyCiag {
    public static void main(String[] args) {

        System.out.println("Podaj rozmiar tablicy");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] t = new int[n];

        for (int i = 0; i <t.length; i++){
            System.out.println("Podaj element " + i);
            int x = scanner.nextInt();
            t[i]= x;
        }

        for (int i = 0; i <t.length; i++){
            System.out.println(t[i]);
        }

        int wartoscNajdluzszegoCiagu=t[0];
        int najdluzszyCiag=1;
        int poprzedniElement=t[0];
        int jakDlugiCiag= 1;

        for (int i = 1; i <t.length; i++){
            if (poprzedniElement == t[i]){
                jakDlugiCiag++;
                if (jakDlugiCiag > najdluzszyCiag){
                    najdluzszyCiag = jakDlugiCiag;
                    wartoscNajdluzszegoCiagu = t[i];
                }
            }else{
                jakDlugiCiag = 1 ;
                poprzedniElement = t[i];

            }

        }
        System.out.println("Wartość najdłuższego Ciągu: " + wartoscNajdluzszegoCiagu );
        System.out.println("Długość: " + najdluzszyCiag );

    }
}
