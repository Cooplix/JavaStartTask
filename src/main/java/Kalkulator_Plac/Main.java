package Kalkulator_Plac;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Employee janKowalski = new Employee("Jan", "Kowalski", 3000);
        System.out.println(janKowalski.getFirstName() + " " + janKowalski.getLastName() + " " + "wyplata netto: " + PaymentCalculator.nettoYearPayment(janKowalski));

        System.out.println(janKowalski.getFirstName() + " " + janKowalski.getLastName() + " " + "wyplata brutto: " + PaymentCalculator.bruttoYearPayment(janKowalski));

        Employee janinaKowalska = new Employee("Janina", "Kowalska", 3500);
        System.out.println(janinaKowalska.getFirstName() + " " + janinaKowalska.getLastName() + " " + "wyplata netto: " + PaymentCalculator.nettoYearPayment(janinaKowalska));

        System.out.println(janinaKowalska.getFirstName() + " " + janinaKowalska.getLastName() + " " + "wyplata brutto: " + PaymentCalculator.bruttoYearPayment(janinaKowalska));
        

    }
}
