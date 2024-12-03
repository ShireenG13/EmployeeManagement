import java.util.Objects;
import java.util.Scanner;

public class Employee {
    private String firstName;
    private String lastName;
    private String title;
    private double payRate;

    //constructors
    public Employee(String firstName, String lastName, String title, double payRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.payRate = payRate;
    }

    public Employee(){
    }

    //calculate salary default method
    public double calculateSalary(){
        return 0.0;
    }

    //display method
    public void display(){
        System.out.println("Employee: "+ this.firstName + " " + this.lastName + " " + "Title: " + this.title);
    }

    //Getters and Setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    // implementation of inputEmployee Method

    public void inputEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee type(salaried/hourly/commissioned):");
        String type = scanner.nextLine();

        if (type.equalsIgnoreCase("salaried")) {
            getEmployeeData(scanner);
            System.out.println("Enter annual salary:");
            this.payRate = scanner.nextDouble();
            //Create salaryEmp object with the input data
            SalaryEmp salaryEmp = new SalaryEmp(this.firstName, this.lastName, this.title, this.payRate);
            salaryEmp.calculateSalary();
            System.out.println();
            salaryEmp.display();
        } else if (type.equalsIgnoreCase("hourly")) {
            getEmployeeData(scanner);
            System.out.println("Enter hourly rate: ");
            this.payRate = scanner.nextDouble();
            System.out.println("Enter hours worked: ");
            int hoursWorked = scanner.nextInt();
            //Create an hourlyEmp object with the input data
            HourlyEmp hourlyEmp = new HourlyEmp(this.firstName, this.lastName, this.title, this.payRate, hoursWorked);
            hourlyEmp.calculateSalary();
            System.out.println();
            hourlyEmp.display();
        } else if (type.equalsIgnoreCase("commissioned")) {
            getEmployeeData(scanner);
            System.out.println("Enter hourly rate: ");
            this.payRate = scanner.nextDouble();
            System.out.println("Enter hours worked: ");
            int hoursWorked = scanner.nextInt();
            System.out.println("Enter Sales Amount: ");
            double sales = scanner.nextDouble();
            CommEmp commEmp = new CommEmp(this.firstName, this.lastName, this.title, this.payRate, hoursWorked, sales);
            commEmp.calculateSalary();
            System.out.println();
            commEmp.display();

        } else {
            System.out.println("Invalid Employee Type");
        }
    }
    private void getEmployeeData(Scanner scanner){
        System.out.println("Enter the employee first name: ");
        this.firstName = scanner.nextLine();
        System.out.println("Enter the employee last name: ");
        this.lastName = scanner.nextLine();
        System.out.println("Enter the employee title: ");
        this.title = scanner.nextLine();

    }




    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", payRate=" + payRate +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(payRate, employee.payRate) == 0 && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(title, employee.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, title, payRate);
    }
}

