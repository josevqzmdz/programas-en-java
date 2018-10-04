/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busprofnorec;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author jose miguel
 */
public class BusprofNorec {
        static boolean detener = false;
        static boolean existe = false;
    public static void main(String[] args) {

        //bandera para indicar si la pila ya se creo
        do{
            if(existe==false){
                menu(false);
            }
            
            else{
                menu(true);
                detener = true;
            }
        }while(detener==true);
    }
    
    public static void menu(boolean existe){
            if(existe == false){
                //mientras que detener no se vuelva falso el programa seguira
                Pila pila = new Pila(true);
                //se ejecuta la creacion de la pila
                menu(true, pila.crear());
            }
    }
    
    public static void menu(boolean existe, Stack<Nodo> pila){
        try{
            Scanner leer = new Scanner(System.in);
            int posicion;
            System.out.println("buscar posicion de nodo: ");
            posicion = leer.nextInt();
            DFS busqueda = new DFS(posicion);
        
            long inicio = System.nanoTime();
            busqueda.sinRecursion(pila);
            long Final = System.nanoTime();
        
            long total = Final - inicio;
            double seg = total*0.000000001;
            System.out.println("el algoritmo se tardo: "+total+" nanosegundos o "+seg+" segundos en completar");
            System.out.println("volver a buscar? 1) si 2) no");
            int buscar = leer.nextInt();
                switch(buscar){
                    case 1:
                        menu(true, pila);
                        break;
                    case 2:
                        detener = false;
                        break;
                        
                    default:
                        System.out.println("mala eleccion chabo :v");
                        menu(true, pila);
                        break;
                }
        }catch(InputMismatchException e){
            System.out.println("favor de utilizar solo numeros");
            menu(true, pila);
        }
    }
    
}
