public class Employee {

        // initiate each variable
        private String name;
        private PositionTitle position; //for enum, call file name
        private boolean salary;
        private double payRate;
        private int shift;

        // create local variables from data in main class
        Employee(String name, PositionTitle position, boolean salary, double payRate, int shift){
            this.name = name;
            this.position = position;
            this.salary = salary;
            this.payRate = payRate;
            this.shift = shift;
        }
    // initiate all getters and setters so each method can pass values
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PositionTitle getPosition() {
        return position;
    }

    public void setPosition(PositionTitle position) {
        this.position = position;
    }

    public boolean isSalary() {
        return salary;
    }

    public void setSalary(boolean salary) {
        this.salary = salary;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    // pulls hours in from main class in the calculate method as hoursIn
    void calculate(double hoursIn) {
        double amountEarned;

        // begin conditional testing of salary and shift worked to establish pay rate
        // if salary, test the folowing conditions for shift wage increase
        if (salary == true) {
            if (shift == 1) {
                amountEarned = payRate * hoursIn;
                System.out.println("Amount Earned: $" + amountEarned);
            }
            if (shift == 2) {
                amountEarned = ((payRate * hoursIn) * .05) + (payRate * hoursIn);
                System.out.println("Amount Earned: $" + amountEarned);
            }
            if (shift == 3) {
                amountEarned = ((payRate * hoursIn) * .1) + (payRate * hoursIn);
                System.out.println("Amount Earned: $" + amountEarned);
            }
        }

        // if not salary, test the following conditions for shift wage increase
        // test the condition of hoursIn over 40 to determine if overtime wages apply
        if (salary == false) {
            if (hoursIn < 40) {
                if (shift == 1) {
                    amountEarned = payRate * hoursIn;
                    System.out.println("Amount Earned: $" + amountEarned);
                }
                if (shift == 2) {
                    amountEarned = ((payRate * hoursIn) * .05) + (payRate * hoursIn);
                    System.out.println("Amount Earned: $" + amountEarned);
                }
                if (shift == 3) {
                    amountEarned = ((payRate * hoursIn) * .1) + (payRate * hoursIn);
                    System.out.println("Amount Earned: $" + amountEarned);
                }
            }
            if (hoursIn > 40) {
                if (shift == 1) {
                    double overtimeHours = hoursIn - 40;
                    amountEarned = (payRate * 40) + (overtimeHours * (payRate * 1.5));
                    System.out.println("Amount Earned: $" + amountEarned);
                }
                if (shift == 2) {
                    double overtimeHours = hoursIn - 40;
                    amountEarned = ((payRate * 40) + (overtimeHours * (payRate * 1.5))) + (((payRate * 40) + (overtimeHours * (payRate * 1.5))) * .05);
                    System.out.println("Amount Earned: $" + amountEarned);
                }
                if (shift == 3) {
                    double overtimeHours = hoursIn - 40;
                    amountEarned = ((payRate * 40) + (overtimeHours * (payRate * 1.5))) + (((payRate * 40) + (overtimeHours * (payRate * 1.5))) * .1);
                    System.out.println("Amount Earned: $" + amountEarned);
                }
            }
        }
    }

    // display/print line information about employee
    void display(){
            System.out.println("Name: " + name);
            System.out.println(position + " is salary: " + salary);
            System.out.println("Shift Worked: " + shift);
            System.out.println("Hourly Wage: $" + payRate);
        }
    }
