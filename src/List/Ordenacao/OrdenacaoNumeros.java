package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    List<Integer> ordemNum;

    public OrdenacaoNumeros(){
        this.ordemNum = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        ordemNum.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> ordemCrescente = new ArrayList<>(ordemNum);
        if(!ordemCrescente.isEmpty()){
            Collections.sort(ordemCrescente);
        } else {
            throw new RuntimeException("A lista está vazia");
        }
        return ordemCrescente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> ordemDescendente = new ArrayList<>(ordemNum);
        if(!ordemDescendente.isEmpty()){
            ordemDescendente.sort(Collections.reverseOrder());
            return ordemDescendente;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public List<Integer> exibirNumeros(){
        return ordemNum;
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());

        // Exibindo a lista
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());

        // Exibindo a lista
        numeros.exibirNumeros();
    }
}


