/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Operaciones;
import java.util.*;

/**
 *
 * @author HP
 */
public class Operaciones {
Scanner leer=new Scanner (System.in);
    
    
    public int  ncontrol()
    {
       int [] array= new int [14];
       
       array [0]= 18680165;
       array [1]= 18680172;
       array [2]= 19680193;
       array [3]= 18680177;
       array [4]= 18680189;
       array [5]= 19680224;
       array [6]= 19680231;
       array [7]= 19680236;
       array [8]= 19680255;
       array [9]= 17680227;
       array [10]=17680236;
       array [11]= 18680754;
       array [12]= 19680262;
       array [13]= 17680246;
       array [14]= 19680902;
       
        
        
        return 0;
    }
    
     public String  nombre()
    {
       String [] nom= new String [14];
       
       nom [0]="MARTINEZ RAYO IRIS MADAI";
       nom  [1]= "MELENDEZ MENDOZA VICENTE ANGUEL ";
       nom  [2]= "MELGOZA VAZQUEZ LILIA SUTSUY";
       nom [3]= "MORALES RUIZ JOSELINE AREL";
       nom  [4]= "PERALTA ROBLES KARINA ESTEFANI";
       nom  [5]= "PEÑALOZ ARROYO ISRAEL JUDa";
       nom  [6]= "RAMIREZ ALVARADO JOSE ARMANDO";
       nom  [7]= "RIQUELME ABARCA ESMERALDA AMERICA";
       nom  [8]= "SANCHEZ CORTEZ FRANCISCO AGUSTIN";
       nom  [9]= "SANTAMARIA VERA IRIS ITZEL";
       nom  [10]= "SOTO CARRION LUIS ENRIQUE";
       nom  [11]= "TAPIA SNCHEZ MARCO ANTONIO";
       nom [12]= "TATACOYA JULIAN";
      nom  [13]= "VILLANUEVA AHUMADA KATE";
       nom  [14]= "VILLANUEVA FLORES ERICK JARED";
    return null; 
      
    }
     
     public int promediog(int[]cali)
     {
         int auxiliar=0;
         for(int i=0;i<cali.length;i++){
             auxiliar=auxiliar+cali[i];
         }
         auxiliar=auxiliar/cali.length;
         return auxiliar;
         
         
     }
     
     public void primeros(String[] nombre, int[]array,int []cali){
         int auxiliar=0;
         for(int i=0;i<5;i++){
      System.out.println("[" +(i+1)+"]numControl:"+array[i]);
      System.out.println("alumno:"+nombre[i]+ "\ncalificacion:" +cali[i]);  
         }
         auxiliar=auxiliar/5;
         System.out.println("La calificacion de los 5 primeros alumnos--> "+auxiliar);
     }
     
     public void ultimos (String[] nombre, int[]array,int[] cali){
        int auxiliar=0;
         for(int i=cali.length-1;i>10;i--){
        
              System.out.println("[" +(i+1)+"]numControl:"+array[i]);
      System.out.println("alumno:"+nombre[i]+ "\ncalificacion:" +cali[i]);  
      
      auxiliar=auxiliar+cali[i];
      
         }
         auxiliar=auxiliar/5;
         System.out.println("La calificacion de los ultimos--> "+auxiliar);
           
     }
     }
     

