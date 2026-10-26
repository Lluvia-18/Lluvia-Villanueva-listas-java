package ejercicio1_FormadosEnLaCafeteria;

/**
 * Problema: Formados en la cafetería
 * Autor: Lluvia Villanueva Lazo
 * Grupo: GTID244
 * Fecha: 26-10-2026
 * Descripción: Implementación propia de una lista doblemente enlazada para manejar colas.
 */


//Implemente el constructor y metodo encolar

public class ListaDoble {
    private Nodo cabeza;
    private Nodo cola;

    public ListaDoble() {
        this.cabeza = null;
        this.cola = null;
    }

    public void encolar(String nombre) {
        Nodo nuevo = new Nodo(nombre);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }


//Agruegue metodos desencolar y estavacia
    public String desencolar() {
        if (cabeza == null) return null;
        String nombre = cabeza.nombre;
        cabeza = cabeza.siguiente;
        if (cabeza != null) {
            cabeza.anterior = null;
        } else {
            cola = null;
        }
        return nombre;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }
}