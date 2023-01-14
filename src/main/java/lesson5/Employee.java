package lesson5;

public class Employee {
    private String fullName;
    private String position;
    private String eMail;
    private String phone;
    private int salary;
    private byte age;

    public Employee(String fullName, String position, String eMail, String phone, int salary, byte age){
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static String getInfo(Employee employee){
        return "Full name: " + employee.fullName +
                "\n  --> Postition: " + employee.position +
                "\n  --> eMail: " + employee.eMail +
                "\n  --> Phone: " + employee.phone +
                "\n  --> Salary: " + employee.salary +
                "\n  --> Age: " + employee.age;
    }
}
