package ejercicio5_Supermercado;


/**
 * Problema: Supermercado
 * Autor: Lluvia Villanueva Lazo
 * Grupo: GTID244
 * Fecha: 26-10-2026
 * Descripción: Implementación de métodos para agregar productos y ordenarlos        descendentemente.
 */

//Cree la clase ListaProductos con referencia de cabeza
public class ListaProductos {
    Nodo cabeza;
//Implementar interseccion
    public void agregar(String nombre, double precio) {
        Nodo nuevo = new Nodo(nombre, precio);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void ordenarDescendente() {
        if (cabeza == null) return;
        boolean cambiado;
        do {
            cambiado = false;
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                if (actual.siguiente.precio > actual.precio) {
                    double tempPrecio = actual.precio;
                    actual.precio = actual.siguiente.precio;
                    actual.siguiente.precio = tempPrecio;

                    String tempNombre = actual.nombre;
                    actual.nombre = actual.siguiente.nombre;
                    actual.siguiente.nombre = tempNombre;
                    cambiado = true;
                }
                actual = actual.siguiente;
            }
        } while (cambiado);
    }
}