import java.util.Calendar;

public class Persona {

    private int documento;
    private String nombre;
    private String apellido;
    private int nacimiento;

    private String email;

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Persona(int documento, String nombre, String apellido, int nacimiento) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
    }

    public String nombreCompleto() {
        return nombre + " " + apellido;
    }

    public int edad() {
        int añoActual = Calendar.getInstance().get(Calendar.YEAR);
        return añoActual - nacimiento;
    }
    public String toString() {
        String correo;
        if (email == null || email.isBlank())
            correo = "no tiene correo electrónico";
        else
            correo = "su correo es " + email;
        return "La persona con documento " + documento + " se llama " + nombreCompleto() + " nació en " + nacimiento +  " entonces tiene " + edad() + " años y " + correo;
    }

}
