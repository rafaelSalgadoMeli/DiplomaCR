package dto;

import java.util.List;

public class AlumnoDTO {
    private String nombre;
    private List<MateriaDTO> materia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<MateriaDTO> getMateria() {
        return materia;
    }

    public void setMateria(List<MateriaDTO> materia) {
        this.materia = materia;
    }
}
