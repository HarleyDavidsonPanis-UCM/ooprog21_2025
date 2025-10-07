public class Employee {
     int employeeNumber;
     double payRate;
     double hoursWorked;

     final int MAX_EMPLOYEE_NUMBER = 9999;
     final double MAX_RATE = 60.0;
     final double OT_MULTIPLIER = 1.5;

    public Employee(int employeeNumber, double payRate, double hoursWorked) {
        this.employeeNumber = employeeNumber;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeNumber(){
        return employeeNumber;
    }
    public double getPayRate(){
        return payRate;
    }
    public double getHoursWorked(){
        return  hoursWorked;
    }

    public double getRegularPay(){
        if (hoursWorked > 40) 
            return 40 * payRate;
        else
        return hoursWorked * payRate;
    }

    public double getOvertimePay(){
        if (hoursWorked > 40)
        return  (hoursWorked - 40) * payRate * OT_MULTIPLIER;
        else
        return  0.0;
    }
}