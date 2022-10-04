package assessment.assignment;

import java.util.*;


public class Employee {
    /*
    Write a Java Program to Create an Employee Class.
a. Take input form the user about the number of Employee Records to be created
and Accept the Employee Details from the user - Name, Department, Salary. (5 Marks)
b. The Employee Id should be auto incremented for every record. (3 Marks)
c. The Company name for all the Employees should be “TECHNOGISE”. (2 Marks)
d. Take an input from the user asking the Department Name for which the user wants to see the employee records
   and Print all the employee Records of the Department entered by the User in below Format - (7 marks)
ID Name Department Salary Company
—------------------------------------------------------------------------------------------------------------
 2 Rohit HR 125000 TECHNOGISE
33 Mayank HR 300000 TECHNOGISE
e. If there are no records with the Departname name entered by the user then Print “No Records found for Department {dept_name}.” (3 Marks)
Employee Properties - i. empId
ii. empName iv. empDept v. empSalary vi. company
     */
    /***
     * Takes input from user and returns employee record.
     */
    static String company="TECHNOGISE";
    public static  TreeMap<Integer, LinkedList<Object>> inputFromUser() {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter how many employee records you want to be created");
        int noOfEmployeeRecords=sc.nextInt();

        TreeMap<Integer ,LinkedList<Object>> employeeRecords=new TreeMap<Integer,LinkedList<Object>>();
        for(int id=1;id<=noOfEmployeeRecords;id++) {
            LinkedList<Object> employeeDetails=new LinkedList<Object>();
            System.out.println("Enter  employee email id "+id);
            employeeDetails.add(id);

            System.out.println("Enter Name of employee ");
            String name=sc.next();
            employeeDetails.add(name);

            System.out.println("Enter department of employee");
            String dep=sc.next().toUpperCase();

            employeeDetails.add(dep);

            System.out.println("Enter salary of employee");
            float salary=sc.nextFloat();
            employeeDetails.add(salary);
            employeeDetails.add(company);

            employeeRecords.put(id,employeeDetails);
        }
        return(employeeRecords);
    }
    /***
     * Takes input from user and returns employee record by department.
     */
    public static String employeeDetailsByDeptName() {
        Scanner ip=new Scanner(System.in);

        System.out.println("Enter department name you want details of");
        String deptName=ip.next().toUpperCase();
        return(deptName);
    }
    /***
     * Prints employee record by department.
     */
    public static void toPrintEmpDetailsByDept(String departmentName,TreeMap<Integer, LinkedList<Object>> empRecords) {

        String str=String.format("Here are the details of employee in department %s as you wanted ", departmentName);
        System.out.println(str);
        System.out.println("ID   Name  Department  Salary  Company");
        System.out.println("-----------------------------------------------------------");

        for(Map.Entry<Integer, LinkedList<Object>> me: empRecords.entrySet()) {
            if (me.getValue().contains(departmentName)) {
                Iterator itr=me.getValue().iterator();
                while(itr.hasNext()) {
                    System.out.print(itr.next()+"\t");
                }
                System.out.println();
            }
        }
        LinkedList <Object> noRecord=new LinkedList<Object>();
        for(Map.Entry<Integer, LinkedList<Object>> me: empRecords.entrySet()) {
            Object [] arr =  me.getValue().toArray();
            noRecord.add(arr[2]);
        }
        if(!noRecord.contains(departmentName)) {
            String print=String.format("No Records found for Department {dep_%s}",departmentName);
            System.out.println(print);
        }
    }
    public static void main(String[] args) {
        TreeMap<Integer, LinkedList<Object>>treemap=inputFromUser();

        String departmentName=employeeDetailsByDeptName();

        toPrintEmpDetailsByDept(departmentName,treemap);
    }
}
