
import java.util.ArrayList;

class Department{
    private String name;
    private ArrayList<Professor>professors;
    private ArrayList<Student>students;
    public Department(String name){
        this.name = name;
        professors = new ArrayList<>();
        students = new ArrayList<>();

    }
    public String getName(){
        return name;
    }
    public void addProfessor(Professor professor){
        professors.add(professor);
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public ArrayList<Professor>getProfessors(){
        return professors;
    }
    public ArrayList<Student>getStudents(){
        return students;
    }
}