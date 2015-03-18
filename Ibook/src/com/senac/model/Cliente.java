package com.senac.model;

public class Cliente {

    private int codCli;
    private String nome;
    private String sobrenome;
    private String endereco;
    private int complEndereco;

    /**
     * @return the codCli
     */
    public int getCodCli() {
        return codCli;
    }

    /**
     * @param codCli the codCli to set
     */
    public void setCodCli(int codCli) {
        this.codCli = codCli;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param Nome the nome to set
     */
    public void setNome(String Nome) {
        this.nome = Nome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param Sobrenome the sobrenome to set
     */
    public void setSobrenome(String Sobrenome) {
        this.sobrenome = Sobrenome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param Endereco the endereco to set
     */
    public void setEndereco(String Endereco) {
        this.endereco = Endereco;
    }

    /**
     * @return the complendereco
     */
    public int getComplEndereco() {
        return complEndereco;
    }

    /**
     * @param complEndereco the complendereco to set
     */
    public void setComplEndereco(int complEndereco) {
        this.complEndereco = complEndereco;
    }
    
}