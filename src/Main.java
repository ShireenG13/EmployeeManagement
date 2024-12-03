public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();

        /**        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
         // to see how IntelliJ IDEA suggests fixing it.


         Employee emp2 = new Employee("John","Tommy","ASE",14.00);
         Employee emp3 = new Employee("John","Tommy","ASE",14.00);


         double weeklySalEmp1 = emp1.calculateWeeklySalary();
         System.out.println("Emp1 weekly salary: " + weeklySalEmp1);
         System.out.println("Emp2 weekly salary: " + emp2.calculateWeeklySalary());
         System.out.println("Emp3 weekly salary: " + emp3.calculateWeeklySalary());

         System.out.println("Check toString emp1: " + emp1);
         System.out.println("Check toString emp2: " + emp2);
         System.out.println("Check toString emp3: " + emp3);

         System.out.println("Check not equal emp1 and emp2 : " + emp1.equals(emp2));
         System.out.println("Check equal emp2 and emp3 : " + emp2.equals(emp3));
         System.out.println("Check emp2 objects hashcode: " + emp2.hashCode());
         System.out.println("Check emp3 objects hashcode: " + emp3.hashCode());
         System.out.println("Check emp1 objects hashcode: " + emp1.hashCode());
         **/

        employee1.inputEmployee();
    }
}