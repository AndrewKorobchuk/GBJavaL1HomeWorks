package lesson5;

/**
 * 1. Create a class "Employee" with fields: full name, position, email, phone, salary, age.
 * 2. The class constructor must fill in these fields when creating the object.
 * 3. Inside the "Employee" class, write a method that displays information about the object to the console.
 * 4. Create an array of 5 employees.
 * 5. Using the loop, display information only about employees over 40 years old.
 */

public class MainApp {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, (byte)30);
        employees[1] = new Employee("Petrov Petr", "Designer", "ppetrov@mailbox.com", "833312312", 32000, (byte) 43);
        employees[2] = new Employee("Sidorov Ivan", "Developer", "isidorov@mailbox.com", "892312312", 45000, (byte) 35);
        employees[3] = new Employee("Ivanova Anna", "Developer", "aivanova@mailbox.com", "892312312", 50000, (byte) 45);
        employees[4] = new Employee("Petrova Elena", "Developer", "epetrova@mailbox.com", "892312312", 470000, (byte) 70);

        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getAge()>=40){
                System.out.println(Employee.getInfo(employees[i]));
            }
        }
    }
}

