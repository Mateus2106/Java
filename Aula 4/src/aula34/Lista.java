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
public class Lista<T> {
    private T[] elementos;
    private int tamanho;
    
    public Lista(int nElementos){
        elementos = (T[]) new Object[nElementos];
        tamanho = 0;
    }
    
    public Lista(){
        elementos = (T[]) new Object[10];
        tamanho = 0;
    }

    public boolean adiciona(T elemento){
        aumentaCapacidade();
        boolean retorno = false;
        if(tamanho < elementos.length){
            elementos[tamanho++] = elemento;
            retorno = true;
        }
        return retorno;
    }
    
    public boolean adiciona(int posicao, T elemento){
        aumentaCapacidade();
        if(!(posicao>=0 && posicao<this.tamanho)){
            throw new IllegalArgumentException("Posição no array não existe!");
        }
        for(int i=this.tamanho-1; i>=posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }
    
    public boolean remove(int posicao){
        if(!(posicao>=0 && posicao<this.tamanho)){
            throw new IllegalArgumentException("Posição no array não existe!");
        }
        for(int i=posicao+1; i<=tamanho-1; i++){
            this.elementos[i-1] = this.elementos[i];
        }
        this.tamanho--;
        return true;
    }
    
    public T obterElemento(int posicao){
        if(!(posicao>=0 && posicao<tamanho)){
            throw new IllegalArgumentException("Posicão inválida!");
        } else{
            return elementos[posicao];
        }
    }
    
    public int buscaElemento(T elemento){
        for(int i=0; i<this.tamanho; i++){
            if(elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }
    
    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            T[] novoVetor = (T[]) new Object[elementos.length*2];
            for(int i=0; i<tamanho; i++){
                novoVetor[i] = elementos[i];
            }
            elementos = novoVetor;
        }
    }
    
    @Override
    public String toString(){
        String retorno;
        retorno = "[";
        for(int i=0;tamanho-1 > i;i++){
            retorno+=elementos[i]+", ";
        }
        retorno+=elementos[tamanho-1]+"]";
        return retorno;
    }
}
