package ejercicio1_FormadosEnLaCafeteria;

/**
 * Problema: Formados en la cafetería
 * Autor: Lluvia Villanueva
 * Grupo: GTID244
 * Fecha: 2026-10-26
 * Descripción: Clase que representa un nodo para la lista doblemente enlazada.
 */

//estructura base del nodo
public class Nodo {
    String nombre;
    Nodo siguiente;
    Nodo anterior;

//agregue constructor
    public Nodo(String nombre) {
        this.nombre = nombre;
        this.siguiente = null;
        this.anterior = null;
    }
}