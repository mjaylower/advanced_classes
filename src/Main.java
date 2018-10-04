
public class Main {

    public static void main(String[] args) {
        //employee data to be calculated
        Employee emp1 = new Employee("Jane Doe", PositionTitle.ADMINISTRATION, true, 27.00, 1);
        Employee emp2 = new Employee("John Smith", PositionTitle.MAINTENANCE, false, 21.00, 3);
        Employee emp3 = new Employee("Larry Jackson", PositionTitle.PRODUCTION, false, 22.00, 2);
        Employee emp4 = new Employee("Mark Henderson", PositionTitle.TECHNICAL, false, 27.50, 3);
        Employee emp5 = new Employee("Lisa Bush", PositionTitle.SALES, true, 15.50, 1);

        // calls the display and calculate method to generate payments and display on console
        emp1.display();
        emp1.calculate(45);
        System.out.println("\n");
        emp2.display();
        emp2.calculate(50);
        System.out.println("\n");
        emp3.display();
        emp3.calculate(35);
        System.out.println("\n");
        emp4.display();
        emp4.calculate(60);
        System.out.println("\n");
        emp5.display();
        emp5.calculate(40);
    }
}
