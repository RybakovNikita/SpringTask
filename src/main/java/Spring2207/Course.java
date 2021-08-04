package Spring2207;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    private String nameCourse;
    private List<Student> students;

}