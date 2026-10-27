package ejercicio7_CuadroDeHonor;


/**
 * Problema: Cuadro de honor
 * Autor: Lluvia Villanueva Lazo
 * Grupo: GTID244
 * Fecha: 26-10-2026
 * Descripción: Clase Nodo completa con atributos de alumno y enlace.
 */


//cree la estructura base de Nodo.java
public class Nodo {
    String nombre;
    double calificacion;
    Nodo siguiente;

//agregue constructor completo
    public Nodo(String nombre, double calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
        this.siguiente = null;
    }
}