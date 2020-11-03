/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import BancoDados.BancoDados;

/**
 *
 * @author Cimol
 */
public class TesteConexao {
    public static void main(String[] args){
        BancoDados bd = new BancoDados();
        if(bd.getStatusConexao()){
            System.out.print("Conectado com sucesso");
        }
        else{
            System.out.print("Erro ao conectar "+bd.getMensagemErro());
        }
    }
}
