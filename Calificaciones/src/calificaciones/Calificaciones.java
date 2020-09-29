/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificaciones;
import Operaciones.Operaciones;
import java.util.*;
/**
 *
 * @author HP
 */
public class Calificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        // TODO code application logic here
        
        
        System.out.println("-+-+-+-+-+SISTEMA DE CALIFICACIONES -+-+-+-+-+");
        int [] cali=new  int [14];
       
        //for(int i=0;i<cali.length;i++){
            
          //  System.out.println(cali[i]);
      //  }
              Operaciones instancia=new Operaciones();
               instancia.ncontrol();
               Operaciones instanci=new Operaciones();
               instancia.nombre();
        
        for(int i=0;i<cali.length;i++){
        
            
           System.out.println("{" + (i+1)+ "}control:"+instancia.ncontrol (array[i] )+ "alumno:"+ instancia.nombre(nom[i])+"cali" );
           cali[i]=leer.nextInt();
     
               
       }
        
        int c;
          do{
        int opc;
        
        System.out.println("---MENU-------");
        System.out.println("1.- promedio de la clase  ");
        System.out.println("2.- promedio de los 5 primeros ");
        System.out.println("3.- promedio de los 5 ultimos  ");
        System.out.println("4.- SALIR ");
        System.out.println("Elige una opcion---->  ");
        opc=leer.nextInt();
        
    
        switch(opc)
        {
         
        
            case 1:
            {
              Operaciones instanc=new Operaciones();
               instanc.promediog(cali);
                System.out.println("la calificacion grupal es--> "+instanc.promediog(cali));
               
               
            break;
            
            }
            
            case 2:
            {
                Operaciones instan=new Operaciones();
                instan.primeros (String[] nombre,int[]array,int []cali);
                break;
                
            }
            
            case 3:
            {
                Operaciones insta=new Operaciones();
                insta.ultimos(String[] nombre, int[]array,int []cali);
                break;
                
            }
            
            
            
            
            case 4:
            {
                System.out.println("bay nene");
                break;
                
            }
        
            
            
            default:
            {
                System.out.println("Lo siento opcion invalida :c ");
                break; 
            }
        
        }
         
        System.out.println("Quieres hacer otra cosa \n1)si \n2)no");
            c=leer.nextInt();
               
     
     
    }
           while(c==1);
          }
   

        
        
        
        
            
            }
    
     
            
        
        
    
    

