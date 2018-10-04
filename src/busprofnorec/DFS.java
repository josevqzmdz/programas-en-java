/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busprofnorec;

import java.util.Stack;

/**
 *
 * @author jose miguel
 */
public class DFS {
    /*
    DFS es Depth-Dirst Search en ingles
    este objeto se encarga de la busqueda a profundidad
    */
    
    int posicion;
    DFS(int posicion){
        this.posicion = posicion;
    }
    
    int sinRecursion(Stack<Nodo> pila) {
        
        /*
        este metodo pregunta, por medio de la pila, si es el nodo que se busca.
        si lo es, regresa su posicion en la memoria
        
        si no, regresa -1
        
        Debido a que buscar linealmente el nodo, siguiendo la progresion lineal
        de la pila en lugar de recorrer las aristas de un arbol normal,
        se puede decir que la eficiencia de este algoritmo es de O(N), donde N
        es la posicion que se quiere encontrar en la pila
        
        */
        try{
            for(int x = 0; x <= pila.size(); x++){
                if(pila.elementAt(x).posicion == posicion){
                    System.out.println("el nodo "+posicion+" se encuentra en la posicion: "+pila.get(x));
                    return pila.get(x).hashCode();
                    }
                }           
            }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("el nodo no se encuentra en la lista");
        }
        return -1;   
    }
}
