import java.util.*;
/**
 * Write a description of class Curso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Curso
{
    // instance variables - replace the example below with your own
    private ArrayList<Alumno>listaAlumnos;

    /**
     * Constructor for objects of class Curso
     */
    public Curso()
    {listaAlumnos=new ArrayList<Alumno>();
        
    }
    public void addAlumno(String nombre, String apellido, String rut, String numeroMatricula)
    {
        Alumno alumnoNuevo=new Alumno(rut,nombre,numeroMatricula,apellido);
        listaAlumnos.add(alumnoNuevo);
    }
    public void addAlumnoPrueba()
    {
        Alumno alumnoNuevo=new Alumno();
        listaAlumnos.add(alumnoNuevo);
    }
    public void mostrarLista()
    {
        for(int i=0;i<listaAlumnos.size();i++)
        {
            System.out.println(listaAlumnos.get(i).toString());
        }
        
    }
    public boolean alumnoExiste(String rut)
    {
       if(rut.length()==10)
       {
            for(int i=0;i<listaAlumnos.size();i++)
           {
           if (listaAlumnos.get(i).getRut().equals(rut))
           {
               return true;
            }
            else
            {
             return false;   
            }
            
          
           }
    
        }
        
        else
        {System.out.println("numero invalidO");
            
        }
       
        
        return false;
    }
    public void removeAlumno(String numeroMatricula)
    {
        boolean conf = true;
       for(int i=0;i<listaAlumnos.size();i++)
       {
           if (listaAlumnos.get(i).getNumeroMatricula().equals(numeroMatricula))
           {
               conf=false;
               System.out.println("Alumno borrado");
               listaAlumnos.remove(i);
            }
          
        }
         if(conf)
           {
               System.out.println("Alumno no encontrado, ojo con la lista");
            }
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
  
}
