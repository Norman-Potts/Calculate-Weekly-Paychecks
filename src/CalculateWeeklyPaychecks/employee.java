/*
 * Author: Norman Potts ID 000344657
 * This java project was created by I, Norman Potts. ID 000344657.
 * March 6th 2015
 */
package CalculateWeeklyPaychecks;


/** Class employee
 * 
 *   This class employee will calculate an employee's pay. The pay method is 
 *   determined by one of three overloaded methods called setEmpolyeePay. They 
 *   differ by the kind of parameters they accept. Each different setEmpolyeePay
 *   sets the empType to one of three. The three types of employee payment are
 *   Salary (empType 1), base plus pieces (empType 3), and rate times hours 
 *   (empType 2).  Once the empType is determined the pay is calculated in 
 *   method calculatePay based on the empType. There are three accessor methods
 *   which are provide the count, the name and the number of this employee.
 *
 * @author Norman
 */
public class employee
{
    
    // private variable used privately in this class
    private String empName;
    private static int empCount; // Static count means there is one variable to keep count with.
    private int empNumber = 0;
    private double empSalary;
    private double empRate;
    private double empHours;
    private double empBase;
    private int empPieces;
    private int empType=0;

    
    

    /** Constructor employee
     * 
     * @param name 
     */
    public employee(String name){
        empName = name;// connects empName to variable name
        empCount ++;
        empNumber = (int) Math.floor(Math.random()*(9999 - 1000)+1000);// generates random number between 1000 and 9999
        System.out.printf("Employee count is %3d \n", empCount );
    }/// End of constructor employee
       
    
    /// Accessor Methods...
    public String getName(){  return empName; }
          
    public static int getCount(){ return empCount; }
       
    public int getNumber(){ return empNumber; }
    /// End of Accessor Methods...             
    
    

    
    /** Method setEmployeePay
     *  Rate per hour overtime counter employee
     *  This method is overloaded three times based on it's parameters.
     * 
     * @param rate
     * @param hours 
     */
    public void setEmpolyeePay(double rate, double hours){
        empRate = rate;
        empHours= hours;        
        empType=2;        
    }/// End of Method setEmployeePay

    
    
    
    /** Method setEmployeePay
     *  Payment type; base+pieces employee.
     * This method is overloaded three times based on it's parameters.
     * @param base
     * @param pieces 
     */
    public void setEmpolyeePay(double base, int pieces){
        empBase= base;
        empPieces= pieces;
        empType=3;      
    }/// End of method setEmployeePay
      

    
    
    /** Method setEmployeePay
     *  Payment type; Payed by Salary 
     *  This method is overloaded three times based on it's parameters.
     * @param salary 
     */
    public void setEmpolyeePay( double salary){
        empSalary= salary;
        empType=1;        
    }/// End of method setEmployeePay      
    
    
      
      
    /** Method calculatePay
     *      Calculates the pay based on the global variable empType.
     *  
     * @return Pay
     */
    public double calculatePay()
    {
        switch (empType) 
        {
            case 1:  /// Salary type.
            {
                double Pay = empSalary/52;
                Pay=(double)Math.round(Pay*100)/100;  // This rounds Pay variable to two decimal places. 
                return Pay;
            }
            case 2:  /// Hours type.
            {
                if (empHours>40)
                {
                    double overtimehours= empHours-40;
                    double  Pay =(40*empRate)+(overtimehours*empRate)+overtimehours*(empRate/2);
                    Pay=(double)Math.round(Pay*100)/100; // This rounds Pay variable to two decimal places.
                    return Pay;
                }
                else
                {
                    double Pay=empHours*empRate;
                    Pay=(double)Math.round(Pay*100)/100; // This rounds Pay variable to two decimal places.
                    return Pay;
                }
            }
            case 3:  /// Base plus Pieces type.
            {
                double Pay= empBase+empPieces*24;
                Pay=(double)Math.round(Pay*100)/100; // This rounds Pay variable to two decimal places.
                return Pay;
            }
            default:
                return 0;                
        }
    }/// End of method calculatePay.
    
}/// End of class Employee.
       
       

           


              
      
      
