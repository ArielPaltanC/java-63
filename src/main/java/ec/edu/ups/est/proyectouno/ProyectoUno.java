
package ec.edu.ups.est.proyectouno;

import java.util.Scanner;

public class ProyectoUno {
        
    public static void main(String[] args) {
        //Creamos la variable escanner como una variable de calse
        //Instaciamos como un objeto e iniciamos como imput
        Scanner sc = new Scanner(System.in);
        
        /*Colocamos el tipo de dato que vamos a recibir y a continuacion 
        el nombre del objeto:
        String nombre = sc.next(); -> como string
        int edad = sc.nextInt() -> como int
        int indentificacionMagica = nextInt() -> como int
        */       
        System.out.println("ingresa el numero de estudiantes: ");
        int numeroEstudiantes = sc.nextInt();
        
        /* Creamos un arreglo de objetos de la calse Estudiante y especificamos 
        el tamaño del mismo con la variable "nuemroEstudiantes"
        */
        Estudiante[] estudiante = new Estudiante[numeroEstudiantes];
        
        /* Utilizamos un bucle for para iterar a travez del arreglo estudiante
        solicitamos la informacion de cada estudiante, utilizamos el Scanner para 
        leer lo que escribe el usuario. Luego se crea una instancia en la clase 
        Estudiante y con los sett para asignar los valores recopilados en cada instancia 
        de estudiante en el arreglo. Este bucle se repite para cada elemento del arreglo        
        */
        for (int i=0; i < estudiante.length; i++){
            System.out.println("ingrese el nombre del estudiante: ");
            System.out.println("ingrese la edad del estudiante: ");
            System.out.println("ingrese la indentificaion magica del estudiante: ");
            String scannerNombre = sc.next();
            int scannerEdad = sc.nextInt();
            int scannerIdentificacionmagica = sc.nextInt();
            estudiante[i] = new Estudiante();
            estudiante[i].setNombre(scannerNombre);
            estudiante[i].setEdad(scannerEdad);
            estudiante[i].setIdentificacionMagica(scannerIdentificacionmagica);
        }
        /* Se imprime usando la informacion de cada de estudiante que hayamos 
        ingresado mediante el metodo toString.
        */
        System.out.println(estudiante[0]);
        System.out.println(estudiante[1]);
        System.out.println(estudiante[2]);
        
        /* Para ingresar los datos del resto de las clases Profesor y 
        Asignatura se realiza el mismo procedimiento que en el aterior 
        con la diferencia de que en en Profesor se agregan los atributos 
        conocimientos y especialidad magica y el asigantura se ingresan
        los atributos nombre y codigo especial       
        */
        //Profesor
        System.out.println("ingresa el numero de profesores: ");
        int numeroProfesores = sc.nextInt();
        
        Profesor[] profesor = new Profesor[numeroProfesores];
        for (int i=0; i < profesor.length; i++){
            System.out.println("ingrese el nombre del profesor: ");
            System.out.println("ingrese la edad del profesor: ");
            System.out.println("ingrese la indentificaion magica del profesor: ");
            System.out.println("ingrese los conocimientos del profesor: ");
            System.out.println("ingrese la especialidad magica del profesor: ");
            
            String scannerNombre = sc.next();
            int scannerEdad = sc.nextInt();
            int scannerIdentificacionMagica = sc.nextInt();
            String scannerConocimientos = sc.next();
            String scannerEspecialidadMagica = sc.next();
            
            profesor[i] = new Profesor();
            profesor[i].setNombre(scannerNombre);
            profesor[i].setEdad(scannerEdad);
            profesor[i].setIdentificacionMagica(scannerIdentificacionMagica);
            profesor[i].setConocimientos(scannerConocimientos);
            profesor[i].setEspecialidadMagica(scannerEspecialidadMagica);
                                 
        }
        System.out.println(profesor[0]);
        System.out.println(profesor[1]);
        
        //Asignatura
        System.out.println("ingresa el numero de asignaturas: ");
        int numeroAsignaturas = sc.nextInt();
        
        Asignatura[] asignatura = new Asignatura[numeroAsignaturas];
        for (int i=0; i < profesor.length; i++){
            System.out.println("ingrese el nombre de la asignatura: ");
            System.out.println("ingrese el codigo especial: ");
            
            String scannerNombre = sc.next();
            int scannerCodigoEspecial = sc.nextInt();
            
            asignatura[i] = new Asignatura();
            asignatura[i].setNombre(scannerNombre);
            asignatura[i].setCodigoEspecial(scannerCodigoEspecial);
                       
        }
        System.out.println(asignatura[0]);
        System.out.println(asignatura[1]);
    }
}
