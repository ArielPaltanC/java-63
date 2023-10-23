
package ec.edu.ups.est.proyectouno;

public class Asignatura {
    // Definimos los atributos de la clase
    private String nombre;
    private int codigoEspecial;
    
    //Creamos constructores los cuales nos ayudaran a recibir los valores que colocaremos
    public Asignatura() {
    }

    public Asignatura(String nombre, int codigoEspecial) {
        this.nombre = nombre;
        this.codigoEspecial = codigoEspecial;
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

    public int getCodigoEspecial() {
        return codigoEspecial;
    }

    public void setCodigoEspecial(int codigoEspecial) {
        this.codigoEspecial = codigoEspecial;
    }
    
    //Creamos el metodo toString para luego imprimir mas facilmente los objetos
    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", codigoEspecial=" + codigoEspecial + '}';
    }
    
    
    
    
    
    
}
