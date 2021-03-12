package com.example.diploma;

import dto.AlumnoDTO;
import dto.DiplomaDTO;

import dto.MateriaDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiplomaController {


    @PostMapping("/diploma")
    @ResponseBody
    public DiplomaDTO getDiploma(@RequestBody AlumnoDTO alumno){
        DiplomaDTO diplo = new DiplomaDTO();
        diplo.setNombre(alumno.getNombre());
        diplo.setPromedio(calculoPromedio( alumno.getMateria()));
        diplo.setMensaje( generateMsg(alumno.getMateria()));

        return diplo;
    }

    private double calculoPromedio(List<MateriaDTO> materias){
        double sum = 0;
        for (MateriaDTO m: materias)
            sum += m.getNota();

        return sum/materias.size();
    }

    private String generateMsg(List<MateriaDTO> materias){
        double promedio = calculoPromedio(materias);
        if(promedio > 9.0) return "FELICITACIONES, su promedio fue de " + promedio;
        else return "Su promedio es normalito fue de " + promedio;
    }

}
