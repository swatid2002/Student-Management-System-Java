import java.util.*;

class Student {
    int id;
    String name;
    String course;

    Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    void display() {
        System.out.println("ID : " + id + " |Name : " + name + " |Course : " + course);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList();
        while (true) {
            System.out.println("\n--- All Student System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Course: ");
                String course = sc.nextLine();
                list.add(new Student(id, name, course));
                System.out.println("Student added successfully");
            } else if (choice == 2) {
                if (list.isEmpty()) {
                    System.out.println("The list is currently empty");
                } else {
                    System.out.println("\n--- Registered Students ---");
                    for (Student s : list) {
                        s.display();
                    }
                }
            } else if (choice == 3) {
                System.out.println("System closing");
                break;
            } else {
                System.out.println("Invalid input.Try again");
            }
        }
        sc.close();
    }
}
