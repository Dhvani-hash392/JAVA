publec class Employee 
{
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) 
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() 
    {
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary : " + salary);
    }
}

class Manager extends Employee 
{
    double bonus;

    Manager(int id, String name, double salary, double bonus) 
    {
        super(id, name, salary);
        this.bonus = bonus;
    }
    @Override
    void displayDetails() 
    {
        System.out.println("Manager ID : " + id);
        System.out.println("Manager Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("Bonus : " + bonus);
        System.out.println("Total Salary : " + (salary + bonus));
    }
}

public class EmployeeManagement 
{
    public static void main(String[] args) 
    {

        Employee e1 = new Employee(101, "Rahul", 30000);

        Manager m1 = new Manager(201, "Priya", 50000, 10000);

        System.out.println("Employee Details");
        e1.displayDetails();

        System.out.println("\nManager Details");
        m1.displayDetails();
    }
}
