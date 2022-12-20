package ru.sstu.cocktail.ex_1_2_.Company_1_2_4;

import java.util.ArrayList;
import java.util.List;

public class Department {
    protected Employee boss;
    protected List<Employee> employees = new ArrayList<>();
    public String name;

    public Department(String name) {
        this.name = name;
    }

    public void setBoss(Employee newBoss) {
        if (newBoss == null) {
            this.boss = null;
        }
        if (boss != null) {

//            removeEmployee(boss);
        }
        this.boss = newBoss;
    }

    public void removeEmployee(Employee emp) {
//        System.out.println(employees.size());
        employees.remove(emp);
//        System.out.println(employees.size());

    }

    protected void addEmp(Employee emp) {
        employees.add(emp);

    }

    public String getEmployees() {
        String res = "{";
        if (employees.size() != 0)
            for (Employee emp : employees) {
                res += "\n  " + emp.name;
            }
        res += "\n" + "}";
        return res;
    }

    public Employee getBoss() {
        return boss;
    }

    @Override
    public String toString() {
        return name + " " + getEmployees() + "\n";
    }

}