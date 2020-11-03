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
public class Teste2 {
    public static void main(String[] args){
       Lista<Pessoa> listaPessoa = new Lista<>(10);
       listaPessoa.adiciona(new Pessoa("Mateus","mateuschavesmarques@gmail.com"));
       listaPessoa.adiciona(new Pessoa("Kelvin","kelvin@gmail.com"));
       listaPessoa.adiciona(new Pessoa("Ramiro","ramiro@gmail.com"));
       System.out.println(listaPessoa);
    }
}
