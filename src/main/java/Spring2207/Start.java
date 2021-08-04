package Spring2207;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig2.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
       System.out.println(student.getCourse().getNameCourse());
       student.getCourse().getStudents().forEach(System.out::println);
    }
}
