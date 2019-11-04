package basic;

import java.io.IOException;

public class ProcessAndInputStream {
    public static void main(String[] args) {
        try {
            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec("cmd");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
