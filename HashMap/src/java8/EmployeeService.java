package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeService {
    public static void main(String[] args) {

        EmployeeService es = new EmployeeService();
        List<Employee> employeeList = new ArrayList<Employee>();

        List<String> cities1 = new ArrayList<>();
        cities1.add("Pune");
        cities1.add("Banaglore");
        cities1.add("Gurgaon");

        List<String> cities2 = new ArrayList<>();
        cities2.add("Delhi");
        cities2.add("Banaglore");
        cities2.add("Gurgaon");

        List<String> cities3 = new ArrayList<>();
        cities3.add("Pune");
        cities3.add("Gurgaon");
        List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8,9);
//        Map<Boolean, List<Integer>> collect = li.stream().collect(Collectors.partitioningBy(i -> i.dist));
//        List<Integer> even = collect.get(true);
//        System.out.println(even);

        // employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0,cities1 ));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0,cities2));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0,cities1));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0,cities2));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0,cities3));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0,cities1));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0,cities2));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0,cities1));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0,cities3));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5,cities1));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0,cities2));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0,cities1));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0,cities3));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5,cities1));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0,cities2));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0,cities3));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0,cities1));

       Employee e = employeeList.stream().collect(Collectors.minBy(Comparator.comparingInt(Employee::getYearOfJoining))).get();
       System.out.println(e.name);
        String name = employeeList.stream().collect(Collectors.minBy(Comparator.comparingInt(Employee::getYearOfJoining))).map(Employee::getName).get();
        System.out.println("name by my method: "+name);

        Double secondSalary = employeeList.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondSalary);

        List<List<String>> cities = employeeList.stream().map(emp->emp.getCities()).toList();
        System.out.println(cities);

        Set<String> citie = employeeList.stream().flatMap(emp->emp.getCities().stream()).collect(Collectors.toSet());
        System.out.println(citie);

        //male nd female
        Map<String, Long> longMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(longMap);

        //name all departments in organization
        List<String> list = employeeList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
        System.out.println(list);

        //average age of male and female employees
        Map<String, Double> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
        System.out.println(map);
        //employeeList.stream().collect(C)
        //highest paid employee
        String nm = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary)).map(Employee::getName).get();
        System.out.println(nm);
        //lowest paid employee
        String minName=employeeList.stream().min(Comparator.comparingDouble(Employee::getSalary)).map(Employee::getName).get();
        System.out.println(minName);

        //who join first
        String s = employeeList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining)).map(Employee::getName).get();
        System.out.println("Join first: "+s);

        //Get the names of all employees who have joined after 2015?
        List<String> stringList = employeeList.stream().filter(emp -> emp.getYearOfJoining() > 2015).map(Employee::getName).collect(Collectors.toList());
        System.out.println(stringList);

        //Count the number of employees in each department?
        Map<String, Long> longMap1 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(longMap1);

        Employee employee = employeeList.stream().filter(i -> i.getDepartment() == "Product Development" && i.getGender() == "Male").collect(Collectors.minBy(Comparator.comparingInt(Employee::getAge))).get();
        System.out.println(employee);

        // es.learn(employeeList);
       // es.getHighestPaidEmployee(employeeList.get(1));
    }

    public void learn(List<Employee> list){
      /*  List<Integer> ids = new ArrayList<>();
       /* for(Employee e : list){
            ids.add(e.getId());
        }
        System.out.println(ids);*/

        List<Integer> ids = list.stream().map(emp->emp.getId()).toList();
        System.out.println(ids);
        //map vs flatmap
        List<List<String>> cities = list.stream().map(emp->emp.getCities()).toList();
        System.out.println(cities);

        Set<String> cities1 = list.stream().flatMap(emp->emp.getCities().stream()).collect(Collectors.toSet());
        System.out.println(cities1);
    }
    //How many male and female employees are there in the organization?
    public Map<String,Long> getCountByGender(Employee e){
        return Stream.of(e).collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
    }
    //Print the name of all departments in the organization?
    public void getDepartmentName(Employee e){
        Stream.of(e).map(Employee::getName).distinct().forEach(System.out::println);
    }
   // What is the average age of male and female employees?
   public Map<String,Double> getAverageAgeOfGender(Employee e){
       return Stream.of(e).collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
   }
   // Get the details of highest paid employee in the organization?
   public void getHighestPaidEmployee(List<Employee> list){
//       Employee emp = Stream.of(e).collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))).get();
//       //Get the names of all employees who have joined after 2015?
//       Stream.of(e).filter(empl->empl.getYearOfJoining()>2015).map(Employee::getName).forEach(System.out::println);
//       //Count the number of employees in each department?
//       Map<String,Long> map = Stream.of(e).collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//       // What is the average salary of each department?
//       Map<String,Double> map1 = Stream.of(e).collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
//       //Get the details of youngest male employee in the product development department?
//       Stream.of(e).filter(i->i.getDepartment()=="Product Development").collect(Collectors.minBy(Comparator.comparingInt(Employee::getAge))).get();
//       // Who has the most working experience in the organization?
//       Stream.of(e).collect(Collectors.minBy(Comparator.comparingInt(Employee::getYearOfJoining)));
       Employee employee = list.stream().sorted(Comparator.comparingInt(Employee::getId)).findFirst().get();
       System.out.println(employee);
   }


}
