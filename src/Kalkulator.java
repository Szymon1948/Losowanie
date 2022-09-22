import java.util.ArrayList;

public class Kalkulator {
    private int liczba;

    public Kalkulator(int liczba) {
        this.liczba = liczba;
    }
    public  boolean sprawdzCzyPierwsza(){
        int liczba = this.liczba;
        boolean czyPierwsza = true;
        //dzieli się przez 1 i samą siebie
        //nie będzie liczbą pierwszą jeżeli się podzieli przez cokolwiek pomiędzy
        for(int i=2 ; i<liczba;i++){
            //mało optymalne
            if(liczba % i == 0)
                return false;
        }
        return czyPierwsza;
    }
    public ArrayList<Integer> obliczCzynniki(){
        int liczba = this.liczba;
        ArrayList<Integer> czynniki = new ArrayList<>();
        int czynnik = 2;
        while(liczba>1)
        {
            if(liczba%czynnik == 0){
                czynniki.add(czynnik);
                liczba = liczba / czynnik;
            }
            else{
                czynnik++;
            }
        }
        return czynniki;
    }
}
