/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lixohtml;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Duuh
 */
public class LixoHTML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        URL url;
        InputStream is = null;
        BufferedReader br;
        String html;

        try {

            url = new URL("http://www.cineclick.com.br/busca/resultado/criticas?q=tartarugas");
            is = url.openStream();  // throws an IOException

        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }

        br = new BufferedReader(new InputStreamReader(is));
        // Extrai do HTML somente o que for necessário
        MyHTML myHTML = new MyHTML(br, "<div class=\"capaCriticasItem\">", "class=\"sidebar\">");
        String[] line = myHTML.getHtml().split("<div class=\"capaCriticasItem\">");

        // Aqui - remover
//        BufferedWriter out = new BufferedWriter(new FileWriter("HTMLcompleto.TXT"));
//        out.close();

        for (int i = 1; i <= myHTML.getQtdeRegistrosEcontrados(); i++) {

            int qtestrela = myHTML.ContarOcorrenciaTag(line[i], " ativa\"");
            String teste = myHTML.ExtrairDados( line[i], "\"/criticas/", "\">", 1 );
            System.out.println( myHTML.ExtrairDados( line[i], "class=\"capaCriticasTitulo\">", "</a>", 1 ) + " " + qtestrela );
            System.out.println( teste );
            
        }
    }    
}
