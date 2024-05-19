package Ordenacao;

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
}


