package ejercicio3_ComprandoAgua;


/**
 * Problema: Comprando agua
 * Autor: Lluvia Villanueva Lazo
 * Grupo: GTID244
 * Fecha: 26-10-2026
 * Descripción: Clase Nodo para almacenar los precios de las botellas mediante enlaces.
 */

public class Nodo {
    int precio;
    Nodo siguiente;

    public Nodo(int precio) {
        this.precio = precio;
        this.siguiente = null;
    }
}