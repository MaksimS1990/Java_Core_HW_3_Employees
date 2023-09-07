package ru.geekbrains.HW2;

import java.util.ArrayList;
import java.util.List;

public class Worker extends Employee {

    private Worker(String name, String surName, int age, double salary) {
        super(name, surName, age, salary);
    }

    public static Employee getInstance() {
        return new Worker(
                surNames[random.nextInt(surNames.length)],
                names[random.nextInt(names.length)],
                random.nextInt(20, 50),
                random.nextInt(30000, 300000));
    }

    protected static List<Employee> getEmployees(int count) {
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < count; i++)
            employees.add(getInstance());
        return employees;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s (Возраст: %d); Рабочий; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)",
                surName, name, age, salary);
    }
}
