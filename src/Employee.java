public class Employee {
    private static int counterID = 1;
    private final String name;
    private int departament;
    private int salary;
    private final int id;
    public Employee(String name, int departament, int salary) {
        this.name = name;
        this.departament = departament;
        this.salary = salary;
        this.id = counterID++;
    }

    public String getName() {
        return name;
    }

    public int getDepartament() {
        return departament;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departament=" + departament +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
