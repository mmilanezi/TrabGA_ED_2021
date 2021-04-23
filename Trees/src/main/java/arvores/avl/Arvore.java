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
public class Arvore <E> {
    
    private Nodo raiz;
    private final String tipo;
    private int tamanho;

    public Arvore(String tipo) {
        this.tipo = tipo;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    public void exibir( Nodo nodo ) {
        if( nodo != null ) {
            exibir( nodo.getEsq() );
            System.out.print( "| " + nodo.getDado() + " |" );
            exibir( nodo.getDir() );
        }
    }
    
    public int pesquisar( Nodo nodo, E dado ) {
        if( nodo == null ) return -1;
        
        return 1;
    }
    
    //insere um cpf na arvore
    public Nodo inserirCPF( Nodo nodo, int index, int valor) {
        if( nodo == null ) {
            return new Nodo( new Dado( index, valor ) );
        }
        
        if( valor < (int) nodo.getDado().getValor() ) {
            nodo.setEsq( inserirCPF(nodo.getEsq(), index, valor) );
        } else {
            nodo.setDir( inserirCPF(nodo.getDir(), index, valor) );
        }
        
        nodo.setAltura( Math.max( calcAltura( nodo.getEsq() ), calcAltura( nodo.getDir() ) ) + 1 );
        
        int fb = calcFB(nodo);
        
        return nodo;
    }
    
    //retorna o valor da altura da nodo
    private int calcAltura( Nodo nodo ) {
        if( nodo == null ) return 0;
        return nodo.getAltura();
    }
    
    //retorna o fator de balanceamento do nodo
    private int calcFB( Nodo nodo ) {
        if( nodo == null ) return 0;
        return calcAltura( nodo.getEsq() ) - calcAltura( nodo.getDir() );
    }
}
