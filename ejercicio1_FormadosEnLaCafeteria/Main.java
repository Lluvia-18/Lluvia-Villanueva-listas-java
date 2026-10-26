package ejercicio1_FormadosEnLaCafeteria;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


/**
 * Problema: Formados en la cafetería
 * Autor: Lluvia Villanueva Lazo
 * Grupo: GTID244
 * Fecha: 26-10-2026
 * Descripción: Clase principal que procesa la entrada estándar y gestiona las prioridades.
 */

//Lectura inicial con BufferedReader
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linea = br.readLine();
        if (linea == null) return;

        int n = Integer.parseInt(linea.trim());


        ListaDoble colaAlumnos = new ListaDoble();
        ListaDoble colaTrabajadores = new ListaDoble();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            linea = br.readLine();
            if (linea == null) continue;
            StringTokenizer st = new StringTokenizer(linea);
            if (!st.hasMoreTokens()) continue;

            String comando = st.nextToken();

            if (comando.equals("LLEGA")) {
                String tipo = st.nextToken();
                String nombre = st.nextToken();
                if (tipo.equals("ALUMNO")) {
                    colaAlumnos.encolar(nombre);
                } else if (tipo.equals("TRABAJADOR")) {
                    colaTrabajadores.encolar(nombre);
                }
            } else if (comando.equals("ATIENDE")) {
                if (!colaTrabajadores.estaVacia()) {
                    sb.append(colaTrabajadores.desencolar()).append("\n");
                } else if (!colaAlumnos.estaVacia()) {
                    sb.append(colaAlumnos.desencolar()).append("\n");
                }
            }
        }
        System.out.print(sb);
    }
}