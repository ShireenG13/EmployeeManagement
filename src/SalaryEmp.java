public class SalaryEmp extends Employee{
    //constructors
    public SalaryEmp(){}

    public SalaryEmp(String firstName, String lastName, String title, double payRate){
        super(firstName, lastName, title, payRate);
    }

    //no getters and setters
    @Override
    public double calculateSalary(){
        return getPayRate()/24;
    }

    public void display(){
        super.display();
        System.out.println("Annual Salary: $" + super.getPayRate());
        System.out.println("Bi-Monthly Salary $: " + calculateSalary());
    }

}

