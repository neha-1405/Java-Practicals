import java.util.Scanner;

public class Member {
    String name;
    int age;
    long contact;
    String address;
    double salary;

    public void printSal() {
        System.out.println("The salary is " + salary);
    }
}

class Employee extends Member {
    String specialization;

    public void printEmpDetails() {
        System.out.println("Employee Details: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + contact);
        System.out.println("Address: " + address);
        System.out.println("Specialization: " + specialization);
        printSal();
    }
}

class Manager extends Member {
    String department;

    public void printManagerDetails() {
        System.out.println("Manager Details: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + contact);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        printSal();
    }
}

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();
        System.out.println("Enter The Employee Details: ");

        System.out.print("Name: ");
        emp.name = sc.nextLine();

        System.out.print("Age: ");
        emp.age = sc.nextInt();

        System.out.print("Phone Number: ");
        emp.contact = sc.nextLong();
        sc.nextLine();  // Consume the newline character

        System.out.print("Address: ");
        emp.address = sc.nextLine();

        System.out.print("Salary: ");
        emp.salary = sc.nextDouble();
        sc.nextLine();  // Consume the newline character

        System.out.print("Specialization: ");
        emp.specialization = sc.nextLine();

        Manager mgr = new Manager();

        System.out.println("Enter The Manager Details: ");

        System.out.print("Name: ");
        mgr.name = sc.nextLine();

        System.out.print("Age: ");
        mgr.age = sc.nextInt();


        System.out.print("Phone Number: ");
        mgr.contact = sc.nextLong();
        sc.nextLine();  // Consume the newline character

        System.out.print("Address: ");
        mgr.address = sc.nextLine();

        System.out.print("Department: ");
        mgr.department = sc.nextLine();

        System.out.print("Salary: ");
        mgr.salary = sc.nextDouble();

        emp.printEmpDetails();
        mgr.printManagerDetails();

        System.out.println("23DIT047");
        sc.close();
    }
}
