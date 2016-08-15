/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programa02.java;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Rodrigo
 */
public class Programa02Java {
    
static Scanner entrada=new Scanner(System.in);
static int Matriz[][]=new int[3][3];    
static int i,j,k,l,m;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      boolean conf=true;
      rellenar(Matriz);
      Mostrar(Matriz);
      comprobar(Matriz);
      
      /*
      Actualmente hay posibilidades de que no repita numeros, pero no son completas, sigo probando opciones.
        // TODO code application logic here
              */
    }
     public static void rellenar(int matriz[][])
    {
    int sumamatriz;    
    Random azar=new Random();
    boolean cuarentaicinco=false;
    while (cuarentaicinco==false)
    {  
    sumamatriz=0;
    i=0;     
    while (i<3)
    {j=0;
    while(j<3){
     matriz[i][j]=azar.nextInt(10); 
     if (matriz[i][j]==0){
         matriz[i][j]=azar.nextInt(10);
     }
     j=j+1;
    }
        i=i+1;
    }
    
    
        
    i=0;
    while(i<3){
        j=0;
        while(j<3)
        {    k=0;
            while (k<3){
                l=0;
                while(l<3){
                    if(i==k &j==l){
                        
                    }
                    else{
                        while (matriz[i][j]==matriz[k][l]){
                            matriz[i][j]=azar.nextInt(10);
                            if(matriz[i][j]==0)
                            {matriz[i][j]=azar.nextInt(10);
                                
                            }
                        }
                        
                    }
                    l=l+1;
                }
                k=k+1;
            }
            j=j+1;
        }
        
    i=i+1;
    }
    i=0;
    while (i<3)
    {
        j=0;
        while(j<3)
        {sumamatriz=sumamatriz+matriz[i][j];
                j=j+1;
            
        }
        i=i+1;
    }
    if (sumamatriz==45)
    {
        cuarentaicinco=true;
    }
    
    
    }
    
    }
    
     public static void Mostrar(int matriz[][]){
       i=0;
        while(i<3){
            j=0;
            while(j<3){
                System.out.print(matriz[i][j]+" ");
                j=j+1;
            }
                   System.out.println("");
                   i=i+1;
        }
    }
     public static void comprobar(int matriz[][])
     {
         boolean filas=false;
         boolean columnas=false;
         boolean diagonales=false;
        k=0;
        i=0;
        while(i<3)
        {
            if ((matriz[i][0]+matriz[i][1]+matriz[i][2])==15)
            {
                k=k+1;
            
            }
            i=i+1;  
            
            
        }
        if (k==3)
        { filas=true;
            
        }
        k=0;
        i=0;
        while(i<3)
        {
            if (matriz[0][i]+matriz[1][i]+matriz[2][i]==15)
            {
                k=k+1;
            }
            i=i+1;
        }
        if (k==3)
        {
            columnas=true;
        }
        if(matriz[0][0]+matriz[1][1]+matriz[2][2]==15&&matriz[0][2]+matriz[1][1]+matriz[2][0]==15)
        {
            diagonales=true;
        }
           
        if (diagonales=true&&filas==true&&columnas==true)
        {
            System.out.println("La matriz en cuestión si es un cuadrado magico.");
        }
        else
        {
            System.out.println("La matriz en cuestión no es un cuadrado magico.");
        }
    }
    
}
