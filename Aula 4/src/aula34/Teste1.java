/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula34;

/**
 *
 * @author Cimol
 */
public class Teste1 {
    public static void main(String[] args){
        Lista li = new Lista(2);
        System.out.println(li.adiciona("A"));
        System.out.println(li.adiciona("B"));
        System.out.println(li.adiciona("C"));
        System.out.println(li.adiciona("D"));
        System.out.println(li.adiciona("E"));
        //System.out.println(li.obterElemento(1));
        //System.out.println(li.obterElemento(5));
        //System.out.println(li.buscaElemento("B"));
        //System.out.println(li.buscaElemento("G"));
        //System.out.println(li.adiciona(1, "G"));
        System.out.println(li.remove(0));
        System.out.println(li);
    }
}
