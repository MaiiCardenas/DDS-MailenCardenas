package domain;

import org.junit.jupiter.api.Test;

public class materiaTest {
    @Test
    public void crearMaterias(){

        Materia analisis1 = new Materia("Analisis 1");
        analisis1.codigo = 13;
        analisis1.correlativas = null;

        Materia algebra = new Materia("Algebra");
        algebra.codigo = 12;
        algebra.correlativas = null;

        Materia algoritmos = new Materia("Algoritmos");
        algoritmos.codigo = 11;
        algoritmos.correlativas = null;

        Materia arquitectura = new Materia("Arquitectura");
        arquitectura.codigo = 14;
        arquitectura.correlativas = null;

        Materia discreta = new Materia("Discreta");
        discreta.codigo = 15;
        discreta.correlativas = null;

        Materia analisis2 = new Materia("Analisis 2");
        analisis2.codigo = 24;
        analisis2.correlativas.add(algebra);
        analisis2.correlativas.add(analisis1);

        Materia paradigmas = new Materia("Paradigmas");
        analisis2.codigo = 23;
        analisis2.correlativas.add(algoritmos);
        analisis2.correlativas.add(discreta);

        Materia probabilidad = new Materia("Probabilidad");
        analisis2.codigo = 23;
        analisis2.correlativas.add(analisis1);
        analisis2.correlativas.add(algebra);

    }
}
