package pe.saludpublica.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class EspecialidadTest {

    @Test
    @DisplayName("ESP-001 | Crear especialidad con datos válidos")
    void debeCrearEspecialidadConDatosValidos() {

        Especialidad especialidad = new Especialidad(
                "Medicina general",
                "Atención primaria"
        );

        assertEquals("Medicina general", especialidad.getNombre());
        assertEquals("Atención primaria", especialidad.getDescripcion());
    }
}