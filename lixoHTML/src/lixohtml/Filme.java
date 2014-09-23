/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lixohtml;

public class Filme {
    private String nome;
    private int qtLetras;
    private String responsavelPelaPublicacao;
    private String nomeOriginal;
    private String critica;
    private FichaTecnica fichaTecnica;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtLetras() {
        return qtLetras;
    }

    public void setQtLetras(int qtLetras) {
        this.qtLetras = qtLetras;
    }

    public String getResponsavelPelaPublicacao() {
        return responsavelPelaPublicacao;
    }

    public void setResponsavelPelaPublicacao(String responsavelPelaPublicacao) {
        this.responsavelPelaPublicacao = responsavelPelaPublicacao;
    }

    public String getNomeOriginal() {
        return nomeOriginal;
    }

    public void setNomeOriginal(String nomeOriginal) {
        this.nomeOriginal = nomeOriginal;
    }

    public String getCritica() {
        return critica;
    }

    public void setCritica(String critica) {
        this.critica = critica;
    }

    public FichaTecnica getFichaTecnica() {
        return fichaTecnica;
    }

    public void setFichaTecnica(FichaTecnica fichaTecnica) {
        this.fichaTecnica = fichaTecnica;
    }
    
     
    
    
}
