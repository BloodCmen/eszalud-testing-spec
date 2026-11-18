package pe.saludpublica.model;


public class Doctor {

    private String documento;
    private String nombres;
    private String apellidos;
    private String colegiatura;
    private String specialtyId;

    public Doctor(String documento, String nombres, String apellidos,
                  String colegiatura, String specialtyId) {
        if (documento == null) {
            throw new IllegalArgumentException("El documento es obligatorio");
        }
        if (nombres == null) {
            throw new IllegalArgumentException("Los nombres son obligatorios");
        }
        if (apellidos == null) {
            throw new IllegalArgumentException("Los apellidos son obligatorios");
        }
        if (colegiatura == null) {
            throw new IllegalArgumentException("La colegiatura es obligatoria");
        }
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.colegiatura = colegiatura;
        this.specialtyId = specialtyId;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getColegiatura() {
        return colegiatura;
    }

    public String getSpecialtyId() {
        return specialtyId;
    }
}

