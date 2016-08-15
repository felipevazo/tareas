

package programa01;
import java.util.Scanner;
/**
 *
 * @author Rodrigo
 */
public class Programa01 {
static Scanner entrada=new Scanner(System.in);
static int N,mrepr,hapr,k,mapr;

   
    public static void main(String[] args) {
        N=tamaño();
       String Matriz[][]=new String [N][2];
       encuestado(Matriz);
       resumen(Matriz);
       /* Me vi obligado a hacerlo de esta forma.
       Debido a que no pude hacer funcionar una matriz que fuera aumentando en tamaño conforme el encuestador añadiera mas gente conforme encuestaba.
       */
    }
    public static int tamaño()
    {
       int n=1;
       do
       {
           System.out.println("Ingrese el tope de encuestados, tomando por ejemplo que si ud ingresa 10, el tope de encuestados será 20, 10 mujeres y 10 hombres. Considere esto como un tope, no una cantidad obligada para finalizar la encuesta.");
       n=entrada.nextInt();
       if(n<1)
       {
           System.out.println("La cantidad de encuestados no puede ser negativa o 0, por favor intente nuevamente.");
       }
       }
       while(n<2);
       
        return n;
    }
    public static void rellenar(String matriz[][],int n)
    {
        int i,j;
        i=0;
        while(i<n)
        {
            j=0;
            while(j<2)
            {
                matriz[i][j]="x";
                j=j+1;
            }
            i=i+1;
        }
        
    }
    public static void encuestado(String matriz[][])
    {   String repeat;
        boolean conf=true;
        k=0;
        int macho=0;
        int hembra=0;
        String resp;
        mrepr=0;
        hapr=0;
        mapr=0;
        do
        {
                
        String sexo="a";
        do
        {
            System.out.println("Ingrese m para masculino, f para femenino");
            sexo=entrada.next();
            if (!sexo.equals("f")&&!sexo.equals("m"))
            {
                System.out.println("Dato invalido, por favor intente nuevamente");
            }
        }
        
       while(!sexo.equals("f")&&!sexo.equals("m"));
         
        resp="a";
        if (sexo.equals("m"))
        {
            if(macho<N)
            {
            do
            {
                System.out.println("Ingrese la respuesta del encuestado, siendo s si aprueba la gestión del gobierno, n si no lo hace, o x si se abstiene o no contesta.");
                resp=entrada.next();
                if(!resp.equals("s")&&!resp.equals("n")&&!resp.equals("x"))
                {
                    System.out.println("Dato ingresado no valido, por favor intente nuevamente.");
                    
                }
            } 
            while(!resp.equals("s")&&!resp.equals("n")&&!resp.equals("x"));
           matriz[macho][1]=resp;
           if (resp.equals("s"))
           {
               hapr=hapr+1;
           }
           macho=macho+1;
           k=k+1;
            }
            else
            {
                System.out.println("El tope de encuestados de este genero esta completo, consulte a mujeres o finalize la encuesta.");
            }
        }
        else
        {
            if(hembra<N)
            {
                do
                {
                    System.out.println("Ingrese la respuesta de la encuestada, siendo s si aprueba la gestión del gobierno, n si no lo hace, o x si se abstiene o no contesta.");
                    resp=entrada.next();
                    if(!resp.equals("s")&&!resp.equals("n")&&!resp.equals("x"))
                    {
                        System.out.println("Dato ingresado no valido, por favor intente nuevamente.");
                    }
                }
                while(!resp.equals("s")&&!resp.equals("n")&&!resp.equals("x"));
                matriz[hembra][0]=resp;
                if (resp.equals("n"))
                    {
                        mrepr=mrepr+1;
                    }
                else
                    {
                        if (resp.equals("s"))
                        {
                            mapr=mapr+1;
                        }

                    }
            
                hembra=hembra+1;
                k=k+1;
            }
            else
            {
                System.out.println("El tope de encuestados de este genero esta completo, consulte a hombres o finalize la encuesta.");
            
            }
        }
        
        
        repeat="q";
        
        do
        {
            if(k<2*N)
            {
             
                System.out.println("¿Desea encuestar a otra persona? ingrese si o no según corresponda.");
                repeat=entrada.next();
                if(!repeat.equals("no")&&!repeat.equals("si"))
                {
                    System.out.println("Entrada invalida, intente nuevamente.");
                }
            }
            else
            {
                repeat="no";
            }
        }
        while (!repeat.equals("no")&&!repeat.equals("si"));
        if (repeat.equals("no"))
        {
            conf=false;
        }
        
        }
        
        while (conf==true&&k<2*N);
        
    
    
       
    }

    public static void resumen(String matriz[][])    
    {
        System.out.println(hapr+" hombres aprueban la gestión del gobierno.");
        System.out.println(mrepr+" mujeres reprueban al gestión del gobierno.");
        System.out.println("El porcentaje de encuestados que aprueban la gestión del gobierno asciende a un "+((mapr+hapr)*100)/k+"%.");
        System.out.println(k+" personas participaron de la encuesta.");
    }
    
}
