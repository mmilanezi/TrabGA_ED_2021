/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvores.avl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Guilherme Flores Borges e William Caetano
 */
public class Pessoa {
    
    private int ID, CPF, RG;
    private String nome;    
    private LocalDate dataNasc;
    private String cidade;

    public Pessoa(String[] dadosPessoa) {
        this.CPF = Integer.parseInt(dadosPessoa[0]);
        this.RG = Integer.parseInt(dadosPessoa[1]);
        this.nome = dadosPessoa[2];
        this.dataNasc = LocalDate.parse(dadosPessoa[3], DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.cidade = dadosPessoa[4];
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "ID=" + ID + ", CPF=" + CPF + ", RG=" + RG + ", nome=" + nome
                + ", dataNasc=" + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dataNasc) + ", cidade=" + cidade + '}';
    }
    
    
            
}

