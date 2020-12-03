package domain;
public class ConsultaDTO {
    private int codigoConsulta;
    private String nombre;
    private String email;
    private String asunto;
    private String sugerencia;
    public ConsultaDTO(){}

    public ConsultaDTO(int codigoConsulta, String nombre, String email, String asunto, String sugerencia) {
        this.codigoConsulta = codigoConsulta;
        this.nombre = nombre;
        this.email = email;
        this.asunto = asunto;
        this.sugerencia = sugerencia;
    }

    public ConsultaDTO(String nombre, String email, String asunto, String sugerencia) {
        this.nombre = nombre;
        this.email = email;
        this.asunto = asunto;
        this.sugerencia = sugerencia;
    }

    public ConsultaDTO(int codigoConsulta) {
        this.codigoConsulta = codigoConsulta;
    }

    public int getCodigoConsulta() {
        return this.codigoConsulta;
    }

    public void setCodigoConsulta(int codigoConsulta) {
        this.codigoConsulta = codigoConsulta;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAsunto() {
        return this.asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getSugerencia() {
        return this.sugerencia;
    }

    public void setSugerencia(String sugerencia) {
        this.sugerencia = sugerencia;
    }
    
}
