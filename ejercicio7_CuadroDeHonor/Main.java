package ejercicio7_CuadroDeHonor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/**
 * Problema: Cuadro de honor
 * Autor: Lluvia Villanueva Lazo
 * Grupo: GTID244
 * Fecha: 26-10-2026
 * Descripción: Clase principal con lectura optimizada y generación del cuadro de honor.
 */

//cree la estructura base de Main.java

public class Main {

    static class Alumno {
        String nombre;
        double calificacion;

        public Alumno(String nombre, double calificacion) {
            this.nombre = nombre;
            this.calificacion = calificacion;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linea = br.readLine();
        if (linea == null || linea.trim().isEmpty()) return;

        int n = Integer.parseInt(linea.trim());
        ArrayList<Alumno> lista = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // Leer la línea del nombre completo (puede tener espacios como "Pepito Perez")
            String nombre = br.readLine();
            if (nombre == null) continue;
            nombre = nombre.trim();

            // Leer la línea de la calificación
            String califStr = br.readLine();
            if (califStr == null) continue;
            double calificacion = Double.parseDouble(califStr.trim());

            // Filtrar solo los que están en el cuadro de honor (>= 9.5)
            if (calificacion >= 9.5) {
                lista.add(new Alumno(nombre, calificacion));
            }
        }

        // Ordenar alfabéticamente por nombre
        Collections.sort(lista, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno a1, Alumno a2) {
                return a1.nombre.compareTo(a2.nombre);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (Alumno a : lista) {
            sb.append(a.nombre).append("\n");
        }
        System.out.print(sb.toString());
    }
}