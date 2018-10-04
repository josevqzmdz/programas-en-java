/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busprofnorec;

/**
 *
 * @author jose miguel
 */
public class Nodo {
    int posicion, grado;
    Nodo(int posicion, int grado, boolean raiz){
        //este es el nodo raiz SI raiz es true
    }
    
    Nodo(int posicion, int grado){
        //este es un nodo descendiente
        boolean[] arreglo = new boolean[grado-1];
        //grado es el numero de nodos a los que este nodo hereda
        //es FALSE por default
        //cuando posicion = profundidad*grado
        this.posicion = posicion;
        this.grado = grado;
    }
    
}
