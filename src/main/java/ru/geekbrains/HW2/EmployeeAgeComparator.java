package ru.geekbrains.HW2;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return Integer.compare(emp1.getAge(), emp2.getAge());
    }
}
