import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create employees and sales reps
        Employee employee = new Employee("Rubashree", "Ashokkumar", 1, 22, 2500, 13, 50000, 3, "Shree_Ruba", "shree1234");
        SalesRep salesRep = new SalesRep("Vishnu", "Prakash", 2, 29, 3000, 15, 80000, 9, "Vishnu_Murali", "prakash1234", 100000);

        // Create sales manager
        SalesManager salesManager = new SalesManager("Randy", "Orton", 3, 35, 1500, 10, 90000, 10, "Viper", "viper1234");

        // Add sales rep to sales manager's team
        salesManager.addSalesRep(salesRep);

        // Test login functionality
        System.out.println("Employee login: " + employee.login("Shree_Ruba", "shree1234"));
        System.out.println("Employee Bonus: $" + employee.calculateBonus());
        System.out.println("Time To Retirement :" + employee.timeToRetirement());
        System.out.println("Vacation time Left :" + employee.vacationTimeLeft() +"\n");


        System.out.println("SalesRep login: " + salesRep.login("Vishnu_Murali", "prakash1234"));
        System.out.println("SalesRep Bonus: $" + salesRep.calculateBonus());
        System.out.println("Time To Retirement :" + salesRep.timeToRetirement());
        System.out.println("Commision :" + salesRep.calculateCommission());
        System.out.println("Vacation time Left :" + salesRep.vacationTimeLeft() +"\n");

        System.out.println("SalesManager login: " + salesManager.login("Viper", "viper1234"));
        System.out.println("SalesManager Bonus: $" + salesManager.calculateBonus());
        System.out.println("Time To Retirement :" + salesManager.timeToRetirement());
        System.out.println("Commision :" + salesManager.calculateCommission());
        System.out.println("Vacation time Left :" +salesManager.vacationTimeLeft() +"\n");


    }
}