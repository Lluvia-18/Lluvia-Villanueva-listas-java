package ejercicio5_Supermercado;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;



/**
 * Problema: Supermercado
 * Autor: Lluvia Villanueva Lazo
 * Grupo: GTID244
 * Fecha: 26-10-2026
 * Descripción: Clase principal con lectura optimizada y generación del ticket ordenado.
 */


//cree la estructura basica del main.java
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linea = br.readLine();
        if (linea == null || linea.trim().isEmpty()) return;

        int n = Integer.parseInt(linea.trim());
        ListaProductos lista = new ListaProductos();
        double total = 0;

        for (int i = 0; i < n; i++) {
            linea = br.readLine();
            if (linea == null) continue;
            StringTokenizer st = new StringTokenizer(linea);
            if (!st.hasMoreTokens()) continue;
            String nombre = st.nextToken();
            double precio = Double.parseDouble(st.nextToken());
            lista.agregar(nombre, precio);
            total += precio;
        }

        lista.ordenarDescendente();

        StringBuilder sb = new StringBuilder();
        Nodo actual = lista.cabeza;
        int index = 1;
        while (actual != null) {
            sb.append(index).append(" | ").append(actual.nombre).append(" | ").append(actual.precio).append("\n");
            index++;
            actual = actual.siguiente;
        }
        sb.append(total);
        System.out.print(sb.toString());
    }
}