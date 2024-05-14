package myInterview;

import java.util.ArrayList;
import java.util.List;

public class AddingEmployee {
    public List<Employee> adding(){
        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(2,"Pragya",24,"Female","Product Development",2010,60000.5));
        empList.add(new Employee(3,"Somya",23,"Female","IT",2008,10500.0));
        empList.add(new Employee(1,"Richa",25,"Female","IT",2022,80000.0));
        empList.add(new Employee(4,"Neeraj",20,"Male","Sales and marketing",2023,12300.0));
        empList.add(new Employee(5,"Riya",19,"Female","Product Development",2021,12000.0));
        empList.add(new Employee(6,"Saurabh",30,"Male","Sales and marketing",2019,8000.5));
        empList.add(new Employee(7,"Sumit",39,"Male","Sales and marketing",2018,8000.5));
        return empList;
    }

}
