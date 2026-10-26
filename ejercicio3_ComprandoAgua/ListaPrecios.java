package ejercicio3_ComprandoAgua;


/**
 * Problema: Comprando agua
 * Autor: Lluvia Villanueva Lazo
 * Grupo: GTID244
 * Fecha: 26-10-2026
 * Descripción: Definición inicial de la estructura de lista enlazada para precios.
 */

//Cree la clase ListaPrecios con los punteros principales
public class ListaPrecios {
    private Nodo cabeza;
    private Nodo fin;


//implemente métodos de inserción y búsqueda de mínimo en ListaPrecios
    public void agregar(int precio) {
        Nodo nuevo = new Nodo(precio);
        if (cabeza == null) {
            cabeza = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    public int obtenerMinimo() {
        if (cabeza == null) return 0;
        int min = cabeza.precio;
        Nodo actual = cabeza.siguiente;
        while (actual != null) {
            if (actual.precio < min) {
                min = actual.precio;
            }
            actual = actual.siguiente;
        }
        return min;
    }
}