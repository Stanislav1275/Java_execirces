package ru.sstu.cocktail.ex_1_2_.Company_1_2_4;

public class Employee {
    protected Department department;
    public String name;

    public Employee(String name, Department department, boolean isDirector) {
        this.name = name;
        setDepartment(department);
    }

    public Employee(String name, Department department) {
        this(name, department, false);
    }

    public void setDepartment(Department department) {
        if (this.department != null) {

            this.department.removeEmployee(this);

        }
        department.addEmp(this);
        this.department = department;

    }

    @Override
    public String toString() {
        if (department != null) {
            if (this == department.boss) {
                return String.format("Сотрудник - %s, начальник отдела %s", name, department.name);

            } else {
                return String.format("Сотрудник - %s , работает в %s\n", name, department);

            }
        }
        return String.format("Сотрудник - %s,отдел отсутствует", name);
    }
}