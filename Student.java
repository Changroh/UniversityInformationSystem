public class Student{
    private String name;
    private Professor professor;
    public Student(String name){
        this.name = name;
    }
    public void assignProfessor(Professor professor){
        this.professor = professor;
    }
    public String getName(){
        return name;
    }
    public Professor getProfessor(){
        return professor;
    }
    
}