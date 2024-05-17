package PesquisaList;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> listaNumeros;

    public SomaNumeros(){
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.listaNumeros.add(numero);
    }

    public int calcularSoma(){
        int total = 0;
        if(!listaNumeros.isEmpty()){
            for(int i : listaNumeros){
                total += i;
            }
        }
        return total;
    }

    public int encontrarMaiorNumero(){
        int maior = listaNumeros.getFirst();
        if(!listaNumeros.isEmpty()){
            for(int i : listaNumeros){
                if(maior < i){
                    maior = i;
                }
            }
        }
        return maior;
    }

    public int encontrarMenorNumero(){
        int menor = listaNumeros.getFirst();
        if(!listaNumeros.isEmpty()){
            for(int i : listaNumeros){
                if(menor > i){
                    menor = i;
                }
            }
        }
        return menor;
    }



    public List<Integer> exibirNumeros(){
            return listaNumeros;
    }

    public static void main(String[] args) {
        SomaNumeros caderno = new SomaNumeros();
        caderno.adicionarNumero(7);
        caderno.adicionarNumero(3);
        caderno.adicionarNumero(1);
        caderno.adicionarNumero(9);
        caderno.adicionarNumero(5);
        System.out.println(caderno.calcularSoma());
        System.out.println(caderno.encontrarMaiorNumero());
        System.out.println(caderno.encontrarMenorNumero());
        System.out.println(caderno.exibirNumeros());

    }
}
