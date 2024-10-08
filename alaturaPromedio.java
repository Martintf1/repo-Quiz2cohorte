/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package promrdionumeros;

import java.util.Scanner;

/**
 *
 * @author marti
 */
public class alaturaPromedio {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        float [] altura = new float[5];
        int promedioAbajo=0;
        int promedioArriba=0;
        double PromedioAltura = 0;
        
        for (int i = 0; i<altura.length;i++)
        {
            System.out.println("Digite "+(i+1)+" altura : ");
            altura[i]= sc.nextFloat();
            PromedioAltura+=altura[i];
            
            
        }
        
        PromedioAltura/=5;
        for(int i =0;i<altura.length;i++)
        {
            if (altura[i]>PromedioAltura)
            {
                promedioArriba+=1;
            }
            else 
            {
                promedioAbajo+=1;
            }
        }
        System.out.println("Promedio de altura = "+PromedioAltura);
        System.out.println("hay "+promedioArriba+" personas ariba del promedio");
        System.out.println("hay "+promedioAbajo+" personas abajo del promedio");
    }
    
}

