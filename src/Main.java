import java.util.ArrayList;
import java.util.HashSet;
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

        //przygotuj listę z 10 liczbami wylosowanym z zakresu od 30 do 60 bez powtorzen
        HashSet<Integer> zbiorWylosowanych = new HashSet<>();
        while(zbiorWylosowanych.size()<10){
            zbiorWylosowanych.add((int)(Math.random()*30+31));
        }
        System.out.println(zbiorWylosowanych);
        //tablica 10 liczb wypełniona pierwiastkami
        double pierwiastki [] = new double[10];
        for(int i=0;i<10;i++){
            pierwiastki[i] = Math.pow(i,0.5);
        }
        System.out.println(pierwiastki);
        for(double wartosc : pierwiastki){
            System.out.print(wartosc+", ");
        }

    }
}