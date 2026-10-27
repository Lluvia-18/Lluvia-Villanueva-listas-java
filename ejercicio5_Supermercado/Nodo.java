package ejercicio5_Supermercado;


/**
 * Problema: Supermercado
 * Autor: Lluvia Villanueva Lazo
 * Grupo: GTID244
 * Fecha: 26-10-2026
 * Descripción: Clase Nodo completa con atributos de nombre, precio y enlace.
 */

//cree la estructura base de Nodo.java
public class Nodo {
    String nombre;
    double precio;
    Nodo siguiente;

    public Nodo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.siguiente = null;
    }
}