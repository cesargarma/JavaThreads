package basic;

import java.io.IOException;

public class SimpleProcess {
    public static void main(String[] args) {
        try {
            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec("notepad");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
