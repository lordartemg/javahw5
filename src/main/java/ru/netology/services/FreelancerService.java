package ru.netology.services;

public class FreelancerService {
    public int calcVacMonths(int income, int expenses, int threshold) {
        int vacMonths = 0;
        int savings = 0;

        for (int month = 1; month <= 12; month++) {
            if (savings >= threshold) {
                vacMonths++;
                savings -= expenses;
                savings -= expenses * 3;
            } else {
                savings += income;
                savings -= expenses;
            }
        }

        return vacMonths;
    }
}

