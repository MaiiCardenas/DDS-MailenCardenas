package domain.personas;

import domain.inscripciones.Inscripcion;
import domain.materias.Materia;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private Integer legajo;
    public List<Materia> materiasAprobadas;
    private Inscripcion inscripcion;

    public Alumno(Integer legajo) {
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<Materia>();
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public Inscripcion getInscripcion() {
        return inscripcion;
    }

    public void setInscripcion(Inscripcion inscripcion) {
        this.inscripcion = inscripcion;
    }

    public Boolean aprobo(String unaMateria) {
        return this.materiasAprobadas.stream().map(materia -> materia.nombre).toList().contains(unaMateria);
    }
    public void inscribirseA(List<Materia> materias){
        Inscripcion unaInscripcion = new Inscripcion();
        unaInscripcion.setMateriasSolicitadas(materias);
    }

}
