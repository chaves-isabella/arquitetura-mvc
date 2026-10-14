package Controller;

import Model.Pessoa;
import Model.TarefaService;

import java.util.List;

public class TarefaController {

    private final TarefaService tarefaService;


    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    public void cadastrar (){
        tarefaService.cadastrarTarefa("Pesquisar", "Pesquisar sobre POO", 4);
        tarefaService.cadastrarTarefa("Apresentar", "Apresentar sobre POO", 2);
        tarefaService.cadastrarTarefa("Revisar", "Revisar apresentação", 3);
    }

    public List<?> mostrar (){
        return tarefaService.listarTarefa();
    }

    public void deletar (int id){
        tarefaService.deletarTarefa(id);
    }

    public void atualizar (int id, String nome, String descricao, int responsavel){
        tarefaService.atualizarTarefa(id, nome, descricao, responsavel);
    }
}

