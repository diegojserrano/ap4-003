// Qué tiene CADA persona???

public class Persona {

    // Atributos
    private int documento;
    private String nombre;
    private String apellido;


    // Mensajes para consultar los datos
    // Para programar mensajes se crean los bloques llamados METODOS
    // Los métodos se escriben:
    // modificador-de-acceso tipo identificador (parametros) { codigo }

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

    // El método constructor no tiene tipo de retorno y su nombre coincide
    // con el de la clase
    public Persona(int documento, String nombre, String apellido) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
