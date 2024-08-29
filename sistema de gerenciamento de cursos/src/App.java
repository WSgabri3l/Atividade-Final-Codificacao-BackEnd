public class App {
    public static void main(String[] args) throws Exception {
        Courses courses = new Courses("sistema", "delicinha");
        Courses course2 = new Courses("adedonha", "delicinha");


        Plataform plataform = new Plataform();

        plataform.addCourse(course2);
        plataform.addCourse(courses);


        plataform.addStudent("sistema", "gabriel");
        plataform.addStudent("sistema", "dalton");

        plataform.listStudents("sistema");

        plataform.listCourses();
    }
}
