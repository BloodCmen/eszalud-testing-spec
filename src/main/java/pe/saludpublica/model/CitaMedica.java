package pe.saludpublica.model;

public class CitaMedica {

    private String patientId;
    private String doctorId;
    private String specialtyId;
    private String fechaHora;
    private String motivo;
    private String estado;

    public CitaMedica(String patientId, String doctorId, String specialtyId,
                      String fechaHora, String motivo, String estado) {

        if (patientId == null) {
            throw new IllegalArgumentException("El identificador del paciente es obligatorio");
        }
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.specialtyId = specialtyId;
        this.fechaHora = fechaHora;
        this.motivo = motivo;
        this.estado = estado;

    }

    public String getPatientId() {
        return patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public String getSpecialtyId() {
        return specialtyId;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getEstado() {
        return estado;
    }
}