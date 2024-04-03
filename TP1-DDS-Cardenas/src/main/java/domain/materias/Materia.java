package domain.materias;

import domain.personas.Alumno;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    public String nombre;
    public Integer codigo;
    private List<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<Materia>();
    }

    public String getNombre() {
        return nombre;
    }


    public Integer getCodigo() {
        return codigo;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public Boolean cumpleCorrelativas(Alumno unAlumno){
        return this.correlativas.stream().allMatch(correlativa->unAlumno.materiasAprobadas.contains(correlativa));
    }
}
