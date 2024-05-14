package myInterview;
import java.security.cert.LDAPCertStoreParameters;
import java.util.*;
import java.util.stream.Collectors;
/*
* Get the names of all employees who have joined after 2015?
* Count the number of employees in each department?
* What is the average salary of each department?
* Get the details of youngest male employee in the salaes and marketing department?
* Who has the most working experience in the organization?
* Get the details of highest paid employee in the organization?
* What is the average age of male and female employees?
* Print the name of all departments in the organization?
* How many male and female employees are there in the organization?
* lowest paid employee
* give second highest salary
* average salary of male employees
* */

public class EmployeeService {
    public static void main(String[] args) {
      EmployeeService es = new EmployeeService();
      AddingEmployee a=new AddingEmployee();
      List<Employee> empList = a.adding();
        List<String> EmpName = empList.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName).collect(Collectors.toList());
        System.out.println("Join after 2015 : "+EmpName);
        Map<String, Long> employeeNumber = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println("Number of Employee in each department: "+ employeeNumber);
        Map<String, Double> avgSalary = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("Average Salary in each dept: "+avgSalary);
        Employee employee = empList.stream().filter(e -> e.getGender() == "Male" && e.getDepartment() == "Sales and marketing").collect(Collectors.minBy(Comparator.comparingInt(Employee::getAge))).get();
        //empList.stream().filter(e->e.getGender()=="Male" && e.getDepartment()=="SAles").collect(Collectors.minBy(Comparator.comparingInt(Employee::getAge))).get();
        System.out.println("youngest male employee in Sales and marketing: "+employee);
        Employee oldEmpl = empList.stream().collect(Collectors.minBy(Comparator.comparingInt(Employee::getYearOfJoining))).get();
        System.out.println("Who is most experienced: "+oldEmpl);
        Employee highestPaid = empList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))).get();
        System.out.println("Highest paid employee: "+highestPaid);
        Map<String, Double> map = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println("Average age: "+map);
        List<String> deptname = empList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
        System.out.println("NAme of all departments: "+deptname);
        Map<String, Long> longMap = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println("Number of male nd female: "+longMap);
        Employee lowestPaid = empList.stream().collect(Collectors.minBy(Comparator.comparingDouble(Employee::getSalary))).get();
        System.out.println("Lowest paid employee: "+lowestPaid);
        Double sal = empList.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("second highest salary : "+sal);
      Double avgSal = empList.stream().filter(e -> e.getGender() == "Male").collect(Collectors.averagingDouble(Employee::getSalary));
      System.out.println("Average salary of male employees: "+avgSal);
    }

}

