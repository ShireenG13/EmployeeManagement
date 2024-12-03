public class CommEmp extends Employee{
    private int hoursWorked;
    private static final double COMMISSION_RATE = 0.01;
    private double sales;

    //constructors
    public CommEmp(){}
    public CommEmp(String firstName, String lastName, String title, double payRate, int hoursWorked, double sales){
        super(firstName, lastName, title, payRate);
        this.hoursWorked = hoursWorked;
        this.sales = sales;
    }
    //getters and setters


    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }
    //calculate commission
    private double calculateCommission(double sales) {
        if (this.sales >= 1000) {
            return this.sales * COMMISSION_RATE;
        }
        return 0;
    }
    // calculateSalary
    @Override
    public double calculateSalary(){
        double commission = calculateCommission(this.sales);
        return (super.getPayRate() * this.hoursWorked) + commission;
    }



    @Override
    public void display(){
        super.display();
        System.out.println("Commission: " + calculateCommission(sales));
        System.out.println("Weekly Pay: " + calculateSalary());

    }
}

