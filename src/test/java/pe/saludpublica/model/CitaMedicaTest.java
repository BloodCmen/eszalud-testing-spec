package pe.saludpublica.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class CitaMedicaTest {

    @Test
    @DisplayName("CIT-001 | Crear cita médica con datos válidos")
    void debeCrearCitaMedicaConDatosValidos() {

        CitaMedica cita = new CitaMedica(
                "6af71e0b501cca046a166049",
                "6af7271e501cca046a16604f",
                "6af71da3501cca046a166045",
                "2026-11-23 16:30",
                "Dolor abdominal",
                "PROGRAMADA"
        );

        assertEquals("6af71e0b501cca046a166049", cita.getPatientId());
        assertEquals("6af7271e501cca046a16604f", cita.getDoctorId());
        assertEquals("6af71da3501cca046a166045", cita.getSpecialtyId());
        assertEquals("2026-11-23 16:30", cita.getFechaHora());
        assertEquals("Dolor abdominal", cita.getMotivo());
        assertEquals("PROGRAMADA", cita.getEstado());
    }
}