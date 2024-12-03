

public class HourlyEmp extends Employee {
    private int hoursWorked;


    //Constructors
    public HourlyEmp() {}

    public HourlyEmp(String firstName, String lastName, String title, double payRate, int hoursWorked) {
        super(firstName, lastName, title, payRate);
        this.hoursWorked = hoursWorked;
    }
    //Getters and Setters
    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary() {
        return this.hoursWorked * super.getPayRate();
    }

    @Override
    public void display(){
        System.out.println("Houry Salary Rate : $" + super.getPayRate());
        System.out.println("Weekly Pay: $ " + calculateSalary());
    }

}

