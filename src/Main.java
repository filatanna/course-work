public class Main {
    private static final Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {
        EMPLOYEES[0] = new Employee("Кузнецова Наталья Валентиновна", 1, 53690);
        EMPLOYEES[1] = new Employee("Богданов Петр Васильевич", 2, 66530);
        EMPLOYEES[2] = new Employee("Лисицына Вероника Андреевна", 3, 74870);
        EMPLOYEES[3] = new Employee("Ворошилов Сергей Николаевич", 4, 66723);
        EMPLOYEES[4] = new Employee("Скровцова Елизавета Петровна", 5, 83500);
        EMPLOYEES[5] = new Employee("Дяченко Денис Николаевич", 1, 47800);
        EMPLOYEES[6] = new Employee("Гончарова Екатерина Алексеевна", 2, 68930);
        EMPLOYEES[7] = new Employee("Старостин Глеб Сергеевич", 3, 89600);
        EMPLOYEES[8] = new Employee("Островский Никита Филиппович", 4, 77300);
        EMPLOYEES[9] = new Employee("Максимова Лилия Александровна", 5, 62000);

        printFullInfo();
        System.out.println("Сумма зарплаты = " + summaSalary());
        System.out.println("Минимальная зарплата у сотрудника " + minSalary());
        System.out.println("Максимальная зарплата у сотрудника " + maxSalary());
        System.out.println("Средняя зарплата = " + averageSalary());
        printName();
    }

    private static void printFullInfo() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }

    private static int summaSalary() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static Employee minSalary() {
        int min = Integer.MAX_VALUE;
        Employee employee = null;
        for (Employee employee1 : EMPLOYEES) {
            if (employee1.getSalary() < min) {
                min = employee1.getSalary();
                employee = employee1;
            }
        }
        return employee;
    }

    private static Employee maxSalary() {
        int max = 0;
        Employee employee = null;
        for (Employee employee1 : EMPLOYEES) {
            if (employee1.getSalary() > max) {
                max = employee1.getSalary();
                employee = employee1;
            }
        }
        return employee;
    }
    private static double averageSalary(){
        double average = summaSalary()/ (double)EMPLOYEES.length;
        return average;
    }
    private static void printName(){
        for (Employee employee: EMPLOYEES){
            System.out.println(employee.getName());
        }
    }

}