/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busprofnorec;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author jose miguel
 */
public class Pila {
    
    /*
    Esta clase se encarga de crear el objeto Stack de los apuntadores de todos
    los nodos en la memoria. 
    */
    
    boolean existe = false;
    Pila(boolean existe){
        //constructor del objeto
        this.existe = existe;
        //se crea la bandera de que si existe para evitar crear mas pilas :^)
        
    }
    Stack<Nodo> crear(){
    //este metodo crea la pila en la memoria y la retorna ya creada
        try{
            Scanner leer = new Scanner(System.in);
            int profundidad, grado;
            System.out.print("profundidad: ");
            profundidad = leer.nextInt();
            System.out.print("numero de nodos descendientes: ");
            grado = leer.nextInt();
        
            long inicio = System.nanoTime();
            Stack<Nodo> pila = new Stack<Nodo>();
        
            for(int X=0; X < profundidad*grado; X++){
                Nodo nodo = new Nodo(X, grado);
                System.out.print("se añadio el nodo: "+nodo.posicion);
                pila.push(nodo);
                System.out.println(" a la pila posicion: "+pila.set(X, nodo));
            }
            long Final = System.nanoTime();
            long total = Final - inicio;
            double seg = total*0.000000001;
            System.out.println("la pila se tardo: "+seg+" segundos en crearse");
            return pila;
        }catch(Exception e){
            System.out.println("favor de utilizar numeros");
            return crear();
        }
    }
}
