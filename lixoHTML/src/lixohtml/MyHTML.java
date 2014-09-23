/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lixohtml;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Duuh
 */
public class MyHTML {

    /**
     *
     * @param br - do tupo BufferedReader onde contem o HTML a ser trabalhado
     * @param tagInicial - tag que sera utilizada para idetificar quando começar
     * a extrair os dados do html
     * @param tagFinal - tag que sera utilizada para idetificar quando parar de
     * extrair os dados do html
     */
    private String html;
    private int qtdeRegistrosEcontrados;

    public String getHtml() {
        return this.html;
    }

    public int getQtdeRegistrosEcontrados() {
        return this.qtdeRegistrosEcontrados;
    }

    /* Limpa o HTML para retornar somente o necessário */
    public MyHTML(BufferedReader br, String tagInicial, String tagFinal) throws IOException {

        boolean encontrou = false;
        String line;

        this.html = "";
        //BufferedWriter out = new BufferedWriter(new FileWriter("HTMLcompleto.TXT"));

        while ((line = br.readLine()) != null) {

            //out.write(line);

            // Começo da tag dos itens
            if (line.indexOf(tagInicial) > 0) {

                encontrou = true;
                this.qtdeRegistrosEcontrados++;


            }

            // Itens das capas
            if (encontrou) {
                this.html += line + "\n";
            }

            if (line.indexOf(tagFinal) > 0) {

                encontrou = false;

            }

        }

        //out.close();

    }

    /* Extrai os dados de uma string, a partir de duas tags informando o número de ocorrencia*/
    public String ExtrairDados(String conteudo, String tagInicial, String tagFinal, int nrOcorrencia ) {
        
        conteudo += tagInicial;
        
        String[] teste = conteudo.split( tagInicial );
        
        return teste[nrOcorrencia].substring( 0 , teste[nrOcorrencia].indexOf( tagFinal ) );
        
    }
    
    /* Retorna a quantidade de ocorrencias de uma tag( string )*/
    public int ContarOcorrenciaTag( String conteudo, String tag ){
        
        return conteudo.split(tag).length -1;
    }
}
