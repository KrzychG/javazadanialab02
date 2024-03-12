import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*int[] array = losowaliczba(10, 1, 50);
        //ZADANIE 1
        System.out.println("stworzona tablica:");
        wyswietl(array);

        int sumafor = sumafor(array);
        double sredniafor = sredniafor(array);
        int sumaforeach = sumaforeach(array);
        double sredniaforeach = sredniaforeach(array);

        System.out.println("suma z forem " + sumafor);
        System.out.println("srednia z forem " + sredniafor);
        System.out.println("suma z for each " + sumaforeach);
        System.out.println("srednai z for each " + sredniaforeach);
        //zadanie 2
        int[] parzysta = {2, 4, 6, 8, 10};
        int[] nieparzysta = {1, 3, 5, 7, 9,};
        System.out.println("co drugi element z parzystej tablicy");
        codrugi(parzysta);
        System.out.println("\nco drugi element z nieparzystej tablicy");
        codrugi(nieparzysta);
        //zadanie3
        String[] slowa = {"program", "rower", "cegla", "kawa"};
        System.out.println("tablica przed zmiana liter na duze");
        tablica(slowa);
        System.out.println("\npo zmianie liter na duze");
        duzelitery(slowa);
        //ZADANIE 4
        String[] slowa = new String[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < slowa.length; i++) {
            System.out.print("podaj slowo " + (i + 1) + ": ");
            slowa[i] = scanner.nextLine();
        }


        System.out.println("\nodrocone slowa od ostatniego do pierwszzego");
        for (int i = slowa.length - 1; i >= 0; i--) {
            System.out.print(odwroc(slowa[i]) + " ");
        }
        //ZADANIE5
        int[] liczby = new int[8];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < liczby.length; i++) {
            System.out.print("podaj liczbe " + (i + 1) + ": ");
            liczby[i] = scanner.nextInt();
        }
        sortowanie(liczby);
        System.out.println("\nposortowane liczby:");
        for (int liczba : liczby) {
            System.out.print(liczba + " ");
        }
        //ZADANIE 6
        int[] liczby = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < liczby.length; i++) {
            System.out.print("Podaj liczbę " + (i + 1) + ": ");
            liczby[i] = scanner.nextInt();
        }

        System.out.println("\nsilnia zapisanych liczb");
        for (int liczba : liczby) {
            System.out.println("silnia liczby " + liczba + ": " + silnia(liczba));
        }
        //ZADANIE 7
        String[] tablica1 = {"laptop", "lato", "rower", "cegla", "kod"};
        String[] tablica2 = {"laptop", "lato", "rower", "cegla", "kod"};
        boolean czytesame = czytesame(tablica1, tablica2);

        if (czytesame) {
            System.out.println("tablice sa takie same");
        } else {
            System.out.println("tablice sa rozne");
        }
    }*/
    //ZADANIE 1
    public static int[] losowaliczba(int rozmiar, int min, int max) {
        int[] array = new int[rozmiar];
        Random random = new Random();
        for (int i = 0; i < rozmiar; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

    public static void wyswietl(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static int sumafor(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double sredniafor(int[] array) {
        int sum = sumafor(array);
        return (double) sum / array.length;
    }

    public static int sumaforeach(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public static double sredniaforeach(int[] array) {
        int sum = sumaforeach(array);
        return (double) sum / array.length;
    }
    //ZADANIE 2
    public static void codrugi(int[] array) {
        for (int i = 1; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
    }
    //ZADANIE 3
    public static void tablica(String[] tablica) {
        for (String slowo : tablica) {
            System.out.print(slowo + " ");
        }
    }

    public static void duzelitery(String[] tablica) {
        for (String slowo : tablica) {
            System.out.print(slowo.toUpperCase() + " ");
        }
    }
    //ZADANIE 4
    public static String odwroc(String slowo) {
        StringBuilder odwroconeslowo = new StringBuilder();
        for (int i = slowo.length() - 1; i >= 0; i--) {
            odwroconeslowo.append(slowo.charAt(i));
        }
        return odwroconeslowo.toString();
    }
    //ZADANIE 5
    public static void sortowanie(int[] tablica) {
        for (int i = 1; i < tablica.length; i++) {
            int biezacyelement = tablica[i];
            int j = i - 1;
            while (j >= 0 && tablica[j] > biezacyelement) {
                tablica[j + 1] = tablica[j];
                j--;
            }
            tablica[j + 1] = biezacyelement;
        }
    }
    //ZADANIE 6
    public static int silnia(int n) {
        if (n < 0) {
            System.out.println("nie ma silni z liczb ujemnych");
        } else if (n == 0 || n == 1) {
            System.out.println("silnia z 0 i 1 wynosi 1");
        } else {
            int silnia = 1;
            for (int i = 2; i <= n; i++) {
                silnia *= i;
            }
            return silnia;
        }
        return 0;
    }
    //ZADANIE 7
    public static boolean czytesame(String[] tablica1, String[] tablica2) {
        if (tablica1.length != tablica2.length) {
            return false;
        }

        for (int i = 0; i < tablica1.length; i++) {
            if (!tablica1[i].equals(tablica2[i])) {
                return false;
            }
        }

        return true;
    }
}
