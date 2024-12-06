import java.util.Scanner;

public class Main{
    private static University university = new University();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to the University Information System");
            System.out.println("1. Add Department");
            System.out.println("2. Add Professor");
            System.out.println("3. Add Student");
            System.out.println("4. List Department Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addDepartment();
                    break;
                case 2:
                    addProfessor();
                    break;
                case 3:
                    addStudent();
                    break;
                case 4:
                    listDepartmentDetails();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addDepartment() {
        System.out.print("Enter department name: ");
        String name = scanner.nextLine();
        Department department = new Department(name);
        university.addDepartment(department);
        System.out.println("Department added successfully!");
    }

    private static void addProfessor() {
        System.out.print("Enter department name: ");
        String deptName = scanner.nextLine();
        Department department = university.getDepartmentByName(deptName);
        if (department != null) {
            System.out.print("Enter professor name: ");
            String profName = scanner.nextLine();
            Professor professor = new Professor(profName);
            department.addProfessor(professor);
            System.out.println("Professor added successfully!");
        } else {
            System.out.println("Department not found.");
        }
    }

    private static void addStudent() {
        System.out.print("Enter department name: ");
        String deptName = scanner.nextLine();
        Department department = university.getDepartmentByName(deptName);
        if (department != null) {
            System.out.print("Enter student name: ");
            String studName = scanner.nextLine();
            Student student = new Student(studName);
            System.out.print("Enter professor name for student (optional): ");
            String profName = scanner.nextLine();
            if (!profName.isEmpty()) {
                for (Professor prof : department.getProfessors()) {
                    if (prof.getName().equalsIgnoreCase(profName)) {
                        student.assignProfessor(prof);
                        break;
                    }
                }
            }
            department.addStudent(student);
            System.out.println("Student added successfully!");
        } else {
            System.out.println("Department not found.");
        }
    }

    private static void listDepartmentDetails() {
        university.listDepartmentDetails();
    }
}
