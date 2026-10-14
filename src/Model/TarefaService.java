package Model;

import java.util.ArrayList;
import java.util.List;

public class TarefaService {

    private int id=1;
    private final PessoaService service;
    private List<Tarefa> banco = new ArrayList<>();

    public TarefaService(PessoaService service) {
        this.service = service;
    }

    //cadastrar
    public void cadastrarTarefa (String nome,String descricao, int responsavel){
        Tarefa tarefa = new Tarefa(id++, nome, descricao, service.buscarPessoaId(responsavel));
        banco.add(tarefa);
    }

    //ler
    public List<Tarefa> listarTarefa (){
        return banco;
    }

    //deletar
    public void deletarTarefa (int id){
        for (Tarefa t : banco){
            if (t.getId() == id){
                banco.remove(t);
                IO.println("Tarefa removida com sucesso");
                break;
            }
        }
    }

    //atualizar
    public void atualizarTarefa (int id, String nome, String descricao, int responsavel){
        Pessoa responsavelId = service.buscarPessoaId(id);

        for (Tarefa t : banco){
            if (t.getId() == id){
                t.setNome(nome);
                t.setDescricao(descricao);
                t.setResponsavel(responsavelId);
                IO.println("Tarefa atualizada com sucesso" + "\n" + t);
                break;
            }
        }
    }
}
