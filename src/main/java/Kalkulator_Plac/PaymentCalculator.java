package Kalkulator_Plac;

public class PaymentCalculator {
    private static double ZUS = 1000;

    public static double nettoYearPayment(Employee employee) {
        return 12 * employee.getSalary();
    }

    public static double bruttoYearPayment(Employee employee) {
        double tax = employee.getSalary() * 0.2;
        return 12 * (employee.getSalary() + tax + ZUS);
    }
}
