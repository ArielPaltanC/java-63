
package ec.edu.ups.est.proyectouno;

public class Estudiante {
    // Definimos los atributos de la clase 
    private String nombre;
    private int edad;
    private int identificacionMagica;
    
    //Creamos constructores los cuales nos ayudaran a recibir los valores que colocaremos
    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, int identificacionMagica) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacionMagica = identificacionMagica;
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
    
    //Creamos el metodo toString para luego imprimir mas facilmente los objetos 
    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", edad=" + edad + ", identificacionMagica=" + identificacionMagica + '}';
    }
    
    
    
    
    
    
}
