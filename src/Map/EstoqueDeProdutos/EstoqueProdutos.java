package Map.EstoqueDeProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produtos> estoqueMap;

    public EstoqueProdutos(){
        this.estoqueMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueMap.put(cod, new Produtos(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoqueMap);
    }

    public double calcularValorTotalEstoque(){
        double estoqueTotal = 0d;
        if(!estoqueMap.isEmpty()){
            for(Produtos p : estoqueMap.values()){
                estoqueTotal += p.getPreco() * p.getQuantidade();
            }
        } else {
            System.out.println("Estoque vazio");
        }
        return estoqueTotal;
    }

    public Produtos obterProdutoMaisCaro(){
        Produtos produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueMap.isEmpty()){
            for(Produtos p : estoqueMap.values()){
                if(p.getPreco() > maiorPreco){
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        } else {
            System.out.println("Estoque vazio");
        }
        return produtoMaisCaro;
    }

    public Produtos obterProdutoMaisBarato(){
        Produtos produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoqueMap.isEmpty()){
            for(Produtos p : estoqueMap.values()){
                if(p.getPreco() < menorPreco){
                    menorPreco = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        } else {
            System.out.println("Estoque vazio");
        }
        return produtoMaisBarato;
    }

    public Produtos obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produtos produtoMaiorQuantidadeValorTotal = null;
        double maiorQuantidadeValorTotal = Double.MIN_VALUE;{
            if(!estoqueMap.isEmpty()){
                for(Produtos p : estoqueMap.values()){
                    if((p.getPreco() * p.getQuantidade()) > maiorQuantidadeValorTotal){
                        maiorQuantidadeValorTotal = p.getQuantidade() * p.getPreco();
                        produtoMaiorQuantidadeValorTotal = p;
                    }
                }
            } else {
                System.out.println("Estoque vazio");
            }
        }
        return produtoMaiorQuantidadeValorTotal;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Exibe o estoque vazio
        estoque.exibirProdutos();

        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

        // Exibe os produtos no estoque
        estoque.exibirProdutos();

        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

        // Obtém e exibe o produto mais caro
        Produtos produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        // Obtém e exibe o produto mais barato
        Produtos produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);

        // Obtém e exibe o produto com a maior quantidade em valor no estoque
        Produtos produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
    }
}

