/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvores.avl;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guilherme Flores Borges e William Caetano
 */
public class Start {
    
    public static void main( String[] args ) {
        
        int index = 0;
        List<Pessoa> pessoas = new ArrayList();
        Arvore cpfs, nomes, datas;
        cpfs = new Arvore("cpf");
        nomes = new Arvore("nome");
        datas = new Arvore("data");        
        
        try (BufferedReader leitor = new BufferedReader( new InputStreamReader( new FileInputStream("arquivo.csv")))) {
            String linha;
            String[] dadosPessoa;
            Pessoa pessoa;
            
            while( ( linha = leitor.readLine() ) != null ) {
                dadosPessoa = linha.split(";");
                pessoa = new Pessoa(dadosPessoa);
                pessoas.add(pessoa);
                cpfs.setRaiz( cpfs.inserirCPF( cpfs.getRaiz(), index, pessoa.getCPF() ) );
                index++;
            }
            
        } catch (IOException ex) {
            System.out.println("Ocorreu uma falha na leitura do arquivo!");
        }
        
        cpfs.exibir( cpfs.getRaiz() );
        
        System.out.println("");
        
        System.out.println(pessoas.get(4));
    }    
}
