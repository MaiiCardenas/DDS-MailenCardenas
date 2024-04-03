package domain;

import org.junit.jupiter.api.Test;

public class inscripcionTest {
    @Test
   public void inscripcionValida(){

        Materia analisis2 = new Materia("Analisis 2");
        analisis2.codigo = 24;
        analisis2.correlativas.add(algebra);
        analisis2.correlativas.add(analisis1);

        Materia paradigmas = new Materia("Paradigmas");
        analisis2.codigo = 23;
        analisis2.correlativas.add(algoritmos);
        analisis2.correlativas.add(discreta);


        Inscripcion inscripcion1 = new Inscripcion();
        inscripcion1.numeroInscripcion = 01;

    }
}
