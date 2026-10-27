package ejercicio7_CuadroDeHonor;


/**
 * Problema: Cuadro de honor
 * Autor: Lluvia Villanueva Lazo
 * Grupo: GTID244
 * Fecha: 26-10-2026
 * Descripción: Implementación de métodos para insertar alumnos y ordenarlos descendentemente.
 */


//cree una clase ListaAlumnos
public class ListaAlumnos {
    public Nodo cabeza;

//implementacion de inserción y ordenamiento
    public void agregar(String nombre, double calificacion) {
        Nodo nuevo = new Nodo(nombre, calificacion);
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
                if (actual.siguiente.calificacion > actual.calificacion || 
                   (actual.siguiente.calificacion == actual.calificacion && actual.siguiente.nombre.compareTo(actual.nombre) < 0)) {

                    double tempCal = actual.calificacion;
                    actual.calificacion = actual.siguiente.calificacion;
                    actual.siguiente.calificacion = tempCal;

                    String tempNom = actual.nombre;
                    actual.nombre = actual.siguiente.nombre;
                    actual.siguiente.nombre = tempNom;
                    cambiado = true;
                }
                actual = actual.siguiente;
            }
        } while (cambiado);
    }
}