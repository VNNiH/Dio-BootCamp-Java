package collections.list.catalagoLivros;

import collections.list.listaDeTarefas.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    //methods
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        Livro livro = new Livro(titulo,autor,anoPublicacao);
        listaLivros.add(livro);
    }

    public void obterLivros(){
        System.out.println(listaLivros);
    }


    public List<Livro> pesquisarAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!listaLivros.isEmpty()){
            for(Livro l :listaLivros){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosIntervalos = new ArrayList<>();

        if (!listaLivros.isEmpty()){
            for(Livro l : listaLivros){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosIntervalos.add(l);
                }
            }
        }
        return livrosIntervalos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!listaLivros.isEmpty()){
            for (Livro l : listaLivros){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2024);
        System.out.println(catalogoLivros.pesquisarAutor("Autor 2"));
        catalogoLivros.pesquisarPorIntervaloAnos(2020,2024);
    }
}
