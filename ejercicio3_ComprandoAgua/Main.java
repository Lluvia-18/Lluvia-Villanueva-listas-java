package ejercicio3_ComprandoAgua;


/**
 * Problema: Comprando agua
 * Autor: Lluvia Villanueva Lazo
 * Grupo: GTID244
 * Fecha: 26-10-2026
 * Descripción: Clase principal con lectura optimizada BufferedReader para procesar los precios.
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


//estructura base
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linea = br.readLine();
        if (linea == null || linea.trim().isEmpty()) return;

        int n = Integer.parseInt(linea.trim());
        ListaPrecios lista = new ListaPrecios();
        
        StringTokenizer st = null;
        for (int i = 0; i < n; i++) {
            while (st == null || !st.hasMoreTokens()) {
                String l = br.readLine();
                if (l == null) break;
                st = new StringTokenizer(l);
            }
            if (st != null && st.hasMoreTokens()) {
                int precio = Integer.parseInt(st.nextToken());
                lista.agregar(precio);
            }
        }
        
        System.out.println(lista.obtenerMinimo());
    }
}