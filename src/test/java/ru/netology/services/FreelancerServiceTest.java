package ru.netology.services;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FreelancerServiceTest {
    @Test
    public void testCalculateVacationMonthsExample1() {
        FreelancerService freelancerService = new FreelancerService();

        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expected = 3;
        assertEquals(expected, freelancerService.calcVacMonths(income, expenses, threshold));
    }

    @Test
    public void testCalculateVacationMonthsExample2() {
        FreelancerService freelancerService = new FreelancerService();

        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expected = 2;
        assertEquals(expected, freelancerService.calcVacMonths(income, expenses, threshold));
    }
}