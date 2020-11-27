package Kalkulator_Plac;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class PaymentCalculatorTest {
    private Employee employee = new Employee("Jan", "Kowalski", 3000);

    @Test
    public void slaryNetto() {
        double answ = PaymentCalculator.nettoYearPayment(employee);
        double need = 36000.0;

        Assert.assertEquals(need , answ, 0.01);
    }

    @Test
    public void slaryBrutto() {
        double answ = PaymentCalculator.bruttoYearPayment(employee);
        double need = 55200.0;

        Assert.assertEquals(need, answ, 0.01);
    }

}
