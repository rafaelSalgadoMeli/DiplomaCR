package dto;

import java.util.List;



public class StudentDTO {
    private String name;
    private List<CourseDTO> course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CourseDTO> getCourse() {
        return course;
    }

    public void setCourse(List<CourseDTO> course) {
        this.course = course;
    }
}
