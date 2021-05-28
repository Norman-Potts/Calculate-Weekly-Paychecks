/**  Calculate-Weekly-Paychecks
 *  Norman Potts ID 000344657
 *  This java project was created by I, Norman Potts. ID 000344657.
 *  February 25, 2015
 *
 * The purpose of this project.
 * Use a class called employee that will calculate weekly paychecks. Follow the 
 * UML given on Elearn. A static field called empCount keeps track of the number
 * of instances employees and can be retrieved using the static method getCount.
 * The constructor initializes the employee's name and number ( A random number
 * in the range of 1000 to 9999 ). The method setEmployeePay() is overloaded to 
 * accommodate three different payment methods based on empType. Here are the 
 * payment types...
 *        type 1 - Salary employees have a yearly salary, payed on a weekly 
 *                basis
 *        type 2 - Hourly employees are payed an hourly rate for the numbers of 
 *                hours worked (overtime is time and half for hours over 40).
 *        type 3 - Base plus Piece employees. They are payed a base amount plus 
 *                24.00 for every piece completed.
 * The method calculatePay() will determine employee's weekly pay based on there
 * payment type.
 * The method getName() and getNumber() returns the employee's name and number
 * respectively.
 * All input and output should be displayed in the main class only
 *
 * The main program tests employee class by instantiating four different 
 * employees:
 *   Test a salary employee.
 *   Test a two hourly employee, one who has worked over time and one who hasn't
 *   Test a pieces employee.
 *    Hard coded data for the program is...
 *     -Employee 1:(22.50,35.0)  Hourly employee over time
 *     -Employee 2:(45350.00)  Hourly employee over time
 *     -Employee 3:(500.00,25)
 *     -Employee 4:(14.75, 48.0) 
 */
package CalculateWeeklyPaychecks;

import java.util.Scanner;

/** Class CalculateWeeklyPaychecks
 *
 * @author Norman
 */
public class CalculateWeeklyPaychecks 
{

    public static void main(String[] args) 
    {
                                    
        Scanner input = new Scanner( System.in);// scans for new input data                     
        System.out.printf("You will have to now enter in names of \n for different employees.\n\n");
        
        // Hourly employee no over time.
        System.out.print("Please enter employee name: \n");
        String name = input.next();
        employee E1object = new employee(name);       
        E1object.setEmpolyeePay(22.50, 35.0);// Sends pay data to setemployee pay
        
     
        //  Salary employee
        System.out.print("Please enter employee name: \n");
        name = input.next();
        employee E2object = new employee(name);
        E2object.setEmpolyeePay(45350.0);// Sends pay data to setemployee pay          
        
        // Pieces employee
        System.out.print("Please enter employee name: \n");
        name = input.next();
        employee E3object = new employee(name);      
        E3object.setEmpolyeePay(500, 25);// Sends pay data to setemployee pay
      
        // Hourly employee no over time
        System.out.print("Please enter employee name: \n");
        name = input.next();
        employee E4object = new employee(name);
        E4object.setEmpolyeePay(14.75, 48.0);// Sends pay data to setemployee pay
       
/// Print out each employee info.       
System.out.printf("Empolyee Number:"+E1object.getNumber()+"  Name:"+ E1object.getName()+"  Employee pay:"+ E1object.calculatePay()+" \n");
System.out.printf("Empolyee Number:"+E2object.getNumber()+"  Name:"+ E2object.getName()+"  Employee pay:"+E2object.calculatePay()+" \n"); 
System.out.printf("Empolyee Number:"+E3object.getNumber()+"  Name:"+ E3object.getName()+"  Employee pay:"+E3object.calculatePay()+" \n");  
System.out.printf("Empolyee Number:"+E4object.getNumber()+"  Name:"+ E4object.getName()+"  Employee pay:"+E4object.calculatePay()+" \n");         
    
    }/// End of method main.         
} /// End of Class CalculateWeeklyPaychecks
    

