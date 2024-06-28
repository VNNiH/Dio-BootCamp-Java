package collections.list.listaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa (String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa (String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        if (!tarefaList.isEmpty()){
            for (Tarefa t : tarefaList){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefasParaRemover.add(t);
                }
            }
            tarefaList.removeAll(tarefasParaRemover);
        }else{
            System.out.println("Lista vazia");
        }

    }

    public void obterDescricoesTarefas(){
        if(!tarefaList.isEmpty()){
            System.out.println(tarefaList);
        }else{
            System.out.println("Lista vazia");
        }
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();

        listaTarefa.adicionarTarefa("Lavar carro");
        listaTarefa.adicionarTarefa("Lavar carro");
        listaTarefa.adicionarTarefa("Lavar moto");

        listaTarefa.obterDescricoesTarefas();

        listaTarefa.removerTarefa("Lavar carro");

        listaTarefa.obterDescricoesTarefas();
    }
}
