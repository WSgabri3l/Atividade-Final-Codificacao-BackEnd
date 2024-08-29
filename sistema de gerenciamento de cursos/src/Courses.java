import java.util.ArrayList;
import java.util.List;

public class Courses {
    String name;
    String description;
    List<String> alunos;

    public Courses(String name, String description){
        this.name = name;
        this.description = description;
        this.alunos = new ArrayList<>();
    }
}
