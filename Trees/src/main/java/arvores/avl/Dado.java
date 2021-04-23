/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvores.avl;

/**
 *
 * @author guilherme.borges
 */
public class Dado <E>{
    private int index;
    private E valor;

    public Dado(int index, E valor) {
        this.index = index;
        this.valor = valor;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public E getValor() {
        return valor;
    }

    public void setValor(E valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Dado{" + "index=" + index + ", valor=" + valor + '}';
    }
    
    
}
