package com.generation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Ciclos
        //la sintaxis para ciclos es igual que la de JavaScript
        /*for(inicio indice; condición de aumento; incremento){
            código a repetir
            }
         */
        /*Scanner sc= new Scanner(System.in);
        System.out.println("Ingresa un número:");
        int num1=sc.nextInt();
        sc.close();
        for (int i=1;i<=10; i++){
            System.out.println(num1+" x "+i+" = "+num1*i);
        }*/
        //Ejercicio1 Ciclo for

        /*long prevnum=0;
        long signum=1;
        Long nuevo;
        Scanner sc=new Scanner(System.in);
        System.out.println("¿Cuántas iteraciones quieres hacer?:");
        int dato=sc.nextInt();
        sc.close();
        System.out.println(prevnum);
        System.out.println(signum);
        for (int i=1; i<=dato-1; i++){
            nuevo=prevnum+signum;
            System.out.println(nuevo);
            prevnum=signum;
            signum=nuevo;
        }*/


        /*Ciclo while Sintaxis
        while(condicion){
            accion a ejecutarse
        }*/

        //Ejercicio2
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Adivina el numero secreto:");
        int entrada=sc.nextInt();
        int numSecreto=21;
        int intentos=1;

        while(entrada!=numSecreto){
            System.out.println("Adivina el numero secreto:");
            entrada=sc.nextInt();
            intentos++;
        }

        sc.close();
        System.out.println("Felicidades encontraste el número secreto. \ny solo te tomo: "+intentos+" intentos");*/


        //ciclo do-while

        /*do{
            acción a ejecutarse
        } while(condición);*/

        /*Scanner sc=new Scanner(System.in);
        int num=21;
        Integer dato;
        int intentos=0;

        do{
            System.out.println("Ingrese el numero secreto");
            dato=sc.nextInt();
            intentos++;
        }while(num!=dato);
        sc.close();
        System.out.println("Felicidades encontraste el número secreto. \ny solo te tomo: "+intentos+" intentos");*/


        //Ejercicio3
        //pedir un número al usuario y calcular el factorial

        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero para calcular el factorial:");
        int numero=sc.nextInt();
        int res=numero;
        sc.close();

        if (numero!=0) {
            while (numero > 1) {
                res *= (numero - 1);
                numero--;
            }
            System.out.println(res);
        }else{
            System.out.println(1);
        }



    }
}
