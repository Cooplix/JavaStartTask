package Magazyn;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main {
    private static final int WRITE = 1;
    private static final int READ = 2;
    private static final int EXIT = 3;
    private FileUtils fileUtils = new FileUtils("data.csv");


    public static void main(String[] args) throws IOException {
        Main start = new Main();
        start.menu();
    }

    void menu() throws IOException {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int controller;
            writeMenu();

            controller = sc.nextInt();

            if(controller == 1)
                write();

            else if(controller == 2)
                read();

            else if(controller == 3)
                break;

            else
                System.out.println("Nieznane polecenie\n");
        }
    }

    private static void writeMenu() {
        System.out.println("Menu:\n" +
                "1 - Dodaj nowy towar\n" +
                "2 - Pokaz stan magazynu\n" +
                "3 - Wyjscie\n" +
                "Podaj polecenie");
    }


    private  void printStats(Map<String, Integer> map) {
        map.forEach((k, v) -> {
            System.out.printf("%-30s (%d) %s\n", k, v, getStars(v));
        });
    }
    private void read() throws FileNotFoundException {
        Map<String, Integer> products = fileUtils.readProducts();
        printStats(products);
    }

    private  void write() {
        Scanner sc = new Scanner(System.in);
        String name;
        int quantity;

        System.out.println("Podaj nazwe towaru: ");
        name = sc.nextLine();
        System.out.println("Podaj ilosz towaru: ");
        quantity = sc.nextInt();
        fileUtils.writeToFile(fileUtils.getFileName(), name, quantity);
    }

    private  String getStars(int number) {
        int round = (number + 5) / 10;
        return String.join("", Collections.nCopies(round, "*"));
    }

}
