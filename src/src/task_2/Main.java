package task_2;


import java.util.Scanner;

public class Main {
    public static String zwrocNazwe(kierWiatru kw) {
        switch (kw) {
            case N:
                return "North";
            case E:
                return "East";
            case S:
                return "South";
            case W:
                return "West";
            default:
                return "nie poprawna nazwa";
        }
    }

    public static void wyswietlKierWiatru(kierWiatru kw) {
        System.out.println(switch (kw) {
            case N -> "Polnoc";
            case E -> "Wschod";
            case S -> "Poludnie";
            case W -> "Zachod";
        });
    }

    public static void wyswietlKierunekwiatru() {
        for (kierWiatru k : kierWiatru.values())
            wyswietlKierWiatru(k);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kierunek wiatru: ");
        String nazwa = scanner.nextLine();
        kierWiatru kierunek = kierWiatru.valueOf(nazwa.toUpperCase());
        System.out.println("Podales: " + kierunek);

        System.out.println("Po angielsku: " + zwrocNazwe(kierunek));
        System.out.print("Po polsku: " );
        wyswietlKierWiatru(kierunek);

        System.out.println("Wszystkie kierunki po polsku:");
        wyswietlKierunekwiatru();


    }
}
