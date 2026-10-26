import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//Lectura inicial con BufferedReader
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linea = br.readLine();
        if (linea == null) return;
        int n = Integer.parseInt(linea.trim());
    }
}