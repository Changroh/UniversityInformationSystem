
import java.util.ArrayList;

public class University{
    private String name;
    private ArrayList<Department>departments;
    public University(){
        departments = new ArrayList<>();
    }
    public void addDepartment(Department department){
        departments.add(department);
    }
    public Department getDepartmentByName(String name){
        for(Department dept: departments){
            if (dept.getName().equalsIgnoreCase(name)){
                return dept;
            }
        }
        return null;
    }
    public void listDepartmentDetails(){
        for(Department dept: departments){
            System.out.println("Department: "+ dept.getName());
            System.out.println("Professors:");
            for(Professor prof : dept.getProfessors()){
                System.out.println("-" + prof.getName());
            }
            System.out.println("Students:");
            for(Student stud : dept.getStudents()){
                System.out.println("-"+stud.getName() + "(Professor: "+(stud.getProfessor()!= null? stud.getProfessor().getName() : "None")+")");
            }

        }
    }

}