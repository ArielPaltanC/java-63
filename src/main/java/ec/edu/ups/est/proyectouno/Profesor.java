
package ec.edu.ups.est.proyectouno;

public class Profesor {
    // Definimos los atributos de la clase
    private String nombre;
    private int edad;
    private int identificacionMagica;
    private String conocimientos;
    private String especialidadMagica;   
    //Creamos constructores los cuales nos ayudaran a recibir los valores que colocaremos
    public Profesor() {
    }
    public Profesor(String nombre, int edad, int identificacionMagica, String conocimientos, String especialidadMagica) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacionMagica = identificacionMagica;
        this.conocimientos = conocimientos;
        this.especialidadMagica = especialidadMagica;
    }
    
    /*Se crean getters y setters para asignar los valores de los distintos 
      atributos de los objetos que vamos a tener
    */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdentificacionMagica() {
        return identificacionMagica;
    }

    public void setIdentificacionMagica(int identificacionMagica) {
        this.identificacionMagica = identificacionMagica;
    }

    public String getConocimientos() {
        return conocimientos;
    }

    public void setConocimientos(String conocimientos) {
        this.conocimientos = conocimientos;
    }

    public String getEspecialidadMagica() {
        return especialidadMagica;
    }

    public void setEspecialidadMagica(String especialidadMagica) {
        this.especialidadMagica = especialidadMagica;
    }
    
    //Creamos el metodo toString para luego imprimir mas facilmente los objetos
    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + ", edad=" + edad + ", identificacionMagica=" + identificacionMagica + ", conocimientos=" + conocimientos + ", especialidadMagica=" + especialidadMagica + '}';
    }   
    
}
