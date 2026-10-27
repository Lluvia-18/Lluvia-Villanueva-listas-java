package ejercicio7_CuadroDeHonor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;



/**
 * Problema: Cuadro de honor
 * Autor: Lluvia Villanueva Lazo
 * Grupo: GTID244
 * Fecha: 26-10-2026
 * Descripción: Clase principal con lectura optimizada y generación del cuadro de honor.
 */

//cree la estructura base de Main.java
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linea = br.readLine();
        if (linea == null || linea.trim().isEmpty()) return;

        int n = Integer.parseInt(linea.trim());
        ListaAlumnos lista = new ListaAlumnos();

        for (int i = 0; i < n; i++) {
            linea = br.readLine();
            if (linea == null) continue;
            StringTokenizer st = new StringTokenizer(linea);
            if (!st.hasMoreTokens()) continue;
            String nombre = st.nextToken();
            double calificacion = Double.parseDouble(st.nextToken());
            lista.agregar(nombre, calificacion);
        }

        lista.ordenarDescendente();

        StringBuilder sb = new StringBuilder();
        Nodo actual = lista.cabeza;
        while (actual != null) {
            sb.append(actual.nombre).append(" ").append(actual.calificacion).append("\n");
            actual = actual.siguiente;
        }
        System.out.print(sb.toString());
    }
}