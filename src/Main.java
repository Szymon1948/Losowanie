import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //wczytaj liczbę i rpzłóż ją na czynniki pierwsze
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczbaWczytana = klawiatura.nextInt();
        Kalkulator obliczenia = new Kalkulator(liczbaWczytana);
        ArrayList<Integer> wyniki = obliczenia.obliczCzynniki();
        System.out.println(wyniki);

        ArrayList<Integer> wylosowaneLiczby = new ArrayList<>();
        for(int i = 0; i < 10 ; i++){
            int licz= (int)(Math.random()*100+1);
            wylosowaneLiczby.add(licz);
        }
        System.out.println(wylosowaneLiczby);
        for (Integer element:wylosowaneLiczby) {
            System.out.println(element);
            Kalkulator oblicz = new Kalkulator(element);
            System.out.println(oblicz.obliczCzynniki());
        }
        for (Integer element : wylosowaneLiczby) {
            Kalkulator oblicz = new Kalkulator(element);
            if(oblicz.sprawdzCzyPierwsza()){
                System.out.println(element+ " jest liczba pierwszą");

            }
            else{
                System.out.println(element+ " nie jest liczbą pierwszą");
            }
        }
        //tablica z liczbami pierwszymi które wylosowały sie w tablicy wylosowane
        ArrayList<Integer> liczbyPierwsze = new ArrayList<>();
        for (Integer element:wylosowaneLiczby) {
            Kalkulator oblicz = new Kalkulator(element);
            if(oblicz.sprawdzCzyPierwsza())
                liczbyPierwsze.add(element);
        }
        System.out.println(liczbyPierwsze);
    }
}