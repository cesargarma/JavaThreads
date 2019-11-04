package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProcessAndInputStream {
    public static void main(String[] args) {
        try {
            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec("cmd /C dir");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while (bufferedReader.readLine() != null){
                System.out.println(bufferedReader.readLine());
            }
        } catch (IOException e) {
            System.out.println("Error en el exec.");
            e.printStackTrace();
        }
    }
}
