package hashmap;

class Employee {

    private String name;

    public Employee(String name) { // constructor
        this.name = name;
    }

    @Override
    public int hashCode(){
        return 1;
    }



    @Override
    public String toString() {
        return "Employee[ name=" + name + "] ";
    }

}
