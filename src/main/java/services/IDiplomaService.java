package services;

import dto.DiplomaDTO;
import dto.StudentDTO;

public interface IDiplomaService {
    DiplomaDTO getDiploma(StudentDTO student);
}
