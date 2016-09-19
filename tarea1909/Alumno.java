import java.util.*;
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    // instance variables - replace the example below with your own
    private String rut;
    private String nombre;
    private String numeroMatricula;
    private String apellido;

    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(String rut,String nombre,String numeroMatricula,String apellido)
    {
        if(rut.length()==10 )
        {
        this.rut=rut.toLowerCase();
        }
        else
        {
            System.out.println("Rut invalido ");
        }
        this.nombre=nombre.toLowerCase();
        if(rut.substring(0,8).equals(numeroMatricula.substring(0,8)))
        {
            this.numeroMatricula=numeroMatricula.toLowerCase();
        }
        else
        {
            System.out.println("numero no coincide con rut!");
            System.out.println(numeroMatricula.substring(0,8));
            System.out.println(rut.substring(0,8));
        }
        this.apellido=apellido.toLowerCase();
    }
    public Alumno()
    {
        rut="12312462-4";
        numeroMatricula="12312462415";
        nombre="hermenegildo";
        apellido="de las piedras";
    }

    public String getApellido()
    {return apellido;}
    public void setApellido(String nombre)
    {this.apellido=apellido;}
    
    public String getNombre()
    {return nombre;}
    public void setNombre(String nombre)
    {this.nombre=nombre;}
    
    public String getRut()
    {return rut;}
    public void setRut(String nombre)
    {this.rut=rut;}
    
    public String getNumeroMatricula()
    {return numeroMatricula;}
    public void setNuumeroMatricula(String nombre)
    {this.numeroMatricula=numeroMatricula;}
    public String toString()
    {
        String mensaje="Alumno llamado "+nombre+" "+apellido+", con rut "+rut+" y numero de matricula "+numeroMatricula+".";
        return mensaje;
    }
}
