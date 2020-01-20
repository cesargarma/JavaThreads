package URL.E3;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Main {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            URL url = new URL("http://180.180.1.17/PSP/3/aplicacion.php");
            URLConnection urlConnection = url.openConnection();
            urlConnection.setDoOutput(true);

            OutputStream outputStream = urlConnection.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream);

            System.out.print("Dime un numero: ");
            int number = Integer.parseInt(teclado.nextLine());

            printWriter.write("number=" + number);
            printWriter.flush();

            InputStream inputStream = urlConnection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String txt;

            while((txt = bufferedReader.readLine()) != null) {

                try{
                    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                    InputSource is = new InputSource(new StringReader(txt));
                    Document doc = dBuilder.parse(is);

                    doc.getDocumentElement().normalize();

                    NodeList nodeList = doc.getElementsByTagName("return");

                    Node node = nodeList.item(0);

                    String resp = node.getTextContent();

                    if(resp.equals("true")) System.out.println("El numero es par.");
                    else System.out.println("El numero es impar.");

                } catch (ParserConfigurationException e) {
                    e.printStackTrace();
                } catch (SAXException e) {
                    e.printStackTrace();
                }
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
