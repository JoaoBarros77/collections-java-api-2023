package PesquisaList.CatalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro i : livroList){
                if(i.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(i);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro i : livroList){
                if(i.getAnoPublicacao() >= anoInicial && i.getAnoPublicacao() <= anoFinal){
                    livrosAnos.add(i);
                }
            }
        }
        return livrosAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro i : livroList){
                if(i.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = i;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
}
