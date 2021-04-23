/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvores.avl;

/**
 *
 * @author Guilherme Flores Borges e William Caetano
 */
public class Nodo {
    
    private Nodo esq, dir;
    private Dado dado;
    private int altura = 1;    

    public Nodo(Dado dado) {
        this.dado = dado;
    }

    public Nodo getEsq() {
        return esq;
    }

    public void setEsq(Nodo esq) {
        this.esq = esq;
    }

    public Nodo getDir() {
        return dir;
    }

    public void setDir(Nodo dir) {
        this.dir = dir;
    }

    public Dado getDado() {
        return dado;
    }

    public void setDado(Dado dado) {
        this.dado = dado;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    
}
