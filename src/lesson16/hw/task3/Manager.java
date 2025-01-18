package lesson16.hw.task3;

import java.util.Comparator;
import java.util.Objects;

public class Manager extends Employee implements Comparable<Manager> {
    private String department;

    public Manager(String name, String position, int salary, String department) {
        super(name, position, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Objects.equals(department, manager.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), department);
    }

    @Override
    public String toString() {
        return "имя - " + getName() + ", должность - " + getPosition() + ", з/п - " + getSalary() + ", отдел - " +
                getDepartment();
    }

    @Override
    public int compareTo(Manager o) {
        return this.getName().compareTo(o.getName());
    }
}

class salaryComparator implements Comparator<Manager> {
    @Override
    public int compare(Manager o1, Manager o2) {
        int salaryComparison = o2.getSalary() - o1.getSalary();

        if (salaryComparison == 0) {
            return o2.getName().compareTo(o1.getName());
        }
        return Integer.compare(o2.getSalary(), o1.getSalary());
    }
}
