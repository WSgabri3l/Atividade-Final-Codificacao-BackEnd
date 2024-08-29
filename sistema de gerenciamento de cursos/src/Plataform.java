import java.util.ArrayList;
import java.util.List;

public class Plataform {

    List<Courses> courses; 

    public Plataform(){

        this.courses = new ArrayList<Courses>();

    }

    public void addCourse(Courses course){

        courses.add(course);

    }

    public void addStudent(String courseName, String nameStudent){

        for (Courses course : courses) {

            if (course.name.equals(courseName)) {
                
                course.alunos.add(nameStudent);

            }
            
        }

    }

    public void listStudents(String courseName){

        for (Courses course : courses) {

            if (course.name.equals(courseName)) {
                

                for (int i = 0; i < course.alunos.size(); i++) {


                    System.out.println(course.alunos.get(i));

                    
                }
               
            }
            
        }
    }   

    public void listCourses(){
        
        for (int i = 0; i < courses.size(); i++) {

            System.out.println(courses.get(i).name);
            
        }
    }
}
