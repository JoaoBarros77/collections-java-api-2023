package List.OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras(){
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemRemover = new ArrayList<>();
        for(Item i : carrinho){
            if (i.getNome().equalsIgnoreCase(nome)){
                itemRemover.add(i);
            }
        }
        carrinho.removeAll(itemRemover);
    }

    public double calcularValorTotal(){
        double totalPreco = 0;
        for(Item i : carrinho){
            totalPreco += i.getPreco() * i.getQuantidade();
        }
        return totalPreco;
    }

    public void exibirItens(){
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Agua", 2, 2);
        carrinhoDeCompras.adicionarItem("Agua", 2, 1);
        System.out.println(carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.exibirItens();
    }
}
