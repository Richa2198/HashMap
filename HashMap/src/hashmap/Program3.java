package hashmap;

import java.util.HashMap;


public class Program3 {

    public static void main(String...a){

        HashMap<Employee, String> hm=new HashMap<Employee, String>();
        hm.put(new Employee("a"), "emp1");
        hm.put(new Employee("b"), "emp2");
        hm.put(new Employee("a"), "emp1 OVERRIDDEN");

        System.out.println("HashMap's data> "+hm);
        System.out.println("HashMap's size> "+hm.size());
        System.out.println(hm.get(new Employee("a")));

    }
}
