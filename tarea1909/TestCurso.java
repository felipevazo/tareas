
import java.util.*;
/**
 * Write a description of class TestCurso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestCurso
{
    static Scanner entrada=new Scanner(System.in);
    // instance variables - replace the example below with your own
    private Curso curso1;
    /**
     * Constructor for objects of class TestCurso
     */
    public TestCurso()
    {
       curso1=new Curso();
    }
    public void menu()
    {int selec=-3;
        while(selec<1||selec>5)
        {
            System.out.println("Ingrese un numero dependiendo lo que desea hacer");
            System.out.println("1 para ingresar un alumno nuevo al curso");
            System.out.println("2 para ingresar un alumno generico de prueba al curso");
            System.out.println("3 para mostrar por pantalla la lista de estudiantes del curso");
            System.out.println("4 para buscar si existe un alumno según su rut");
            System.out.println("5 para eliminar un alumno segun su numero de matricula");
            selec=entrada.nextInt();
            if(selec<1||selec>5)
            {
                System.out.println("Ingrese una opcion dentro de las validas");
            }
        }
        selector(selec);
    }
    private void selector(int selec)
    {
        switch(selec)
        {
            case 1:
            ingresarAlumno();
            break;
            case 2:
            ingresarGenerico();
            break;
            case 3:
            mostrarLista();
            break;
            case 4:
            buscarAlumnoRut();
            break;
            default:
            eliminarAlumno();
            break;
            
        
        
    }

    } 
    private void ingresarGenerico()
    { curso1.addAlumnoPrueba();
        System.out.println("Generico añadido");
    }
    private void ingresarAlumno()
    {
        System.out.println("Ingrese el nombre");
        String nombre=entrada.next();
        System.out.println("Ingrese apellido");
        String apellido=entrada.next();
        System.out.println("Ingrese rut(sin puntos, con guion)");
        String rut=entrada.next();
        System.out.println("Ingrese numero de matricula");
        String numeroMatricula=entrada.next();
        curso1.addAlumno(nombre,apellido,rut,numeroMatricula);
        System.out.println("Alumno añadido");
    }
    private void mostrarLista()
    {curso1.mostrarLista();}
    private void buscarAlumnoRut()
    {
        System.out.println("Ingrese rut a buscar");
        String rut=entrada.next();
        if(curso1.alumnoExiste(rut))
        {
            System.out.println("Alumno existe");
            
        }
        else
        {
            
        System.out.println("Alumno no encontrado");
        }
        
    }
    private void eliminarAlumno()
    {
        System.out.println("Ingrese numero de matricula");
        String numero=entrada.next();
        curso1.removeAlumno(numero);
    }
}
