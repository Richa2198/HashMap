package Demo;

import java.util.List;

class Employee {
    int id;

    String name;

    int age;

    String gender;

    String department;

    static int yearOfJoining;

    double salary;

    List<String> cities;


    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary, List<String> cities) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.cities = cities;
    }

    public List<String> getCities() {
        return cities;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", salary=" + salary +
                ", cities=" + cities +
                '}';
    }
}
