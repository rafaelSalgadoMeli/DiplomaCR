package services;

import dto.CourseDTO;
import dto.DiplomaDTO;
import dto.StudentDTO;

import java.util.List;

public class DiplomaService implements  IDiplomaService{

    //retreive student DTO and return a DiplomaDTO with values (name, average and message for the diploma)
    @Override
    public DiplomaDTO getDiploma(StudentDTO student) {
        DiplomaDTO ret = new DiplomaDTO();
        ret.setName(student.getName());
        ret.setAverage(calculateAverage( student.getCourse()));
        ret.setMessage( generateMsg(student.getCourse()));
        return ret;
    }

    //calculate the average of a set of courses
    private double calculateAverage(List<CourseDTO> courses){
        double sum = 0;
        for (CourseDTO m: courses)
            sum += m.getResult();

        return sum/courses.size();
    }

    //generate a message according a avg of student
    private String generateMsg(List<CourseDTO> materias){
        double avg = calculateAverage(materias);
        if(avg > 9.0) return "FELICITACIONES, su promedio fue de " + avg;
        else return "Su promedio es normalito fue de " + avg;
    }




}
