package java210423;

class Person {
    String name = "no name";

    public Person(String nm) {
        name = nm;
    }

    public Person() {
    }
}
class Employee extends Person{
    String empID = "0000";

    public Employee(String id) {
        super();
        empID = id;
    }
}
class Test{
    public static void main(String[] args) {
        Employee e = new Employee("123");
        System.out.println(e.empID);
    }
}
