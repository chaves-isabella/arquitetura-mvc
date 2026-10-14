package Model;

import java.util.ArrayList;
import java.util.List;

public class PessoaService {

    List<Pessoa> banco = new ArrayList<>();
    private static int id = 1;

    //cadastrar
    public void cadastrarPessoa (String nome, String email){
        Pessoa pessoa = new Pessoa(id++, nome, email);
        banco.add(pessoa);
    }

    //ler
    public List<Pessoa> listarPessoa (){
        return banco;
    }

    //deletar
    public void deletarPessoa (int id){
        for (Pessoa p : banco){
            if (p.getId() == id){
                banco.remove(p);
                IO.println("Pessoa removida com sucesso");
                break;
            }
        }
    }

    //buscar por id
    public Pessoa buscarPessoaId (int id){
        for (Pessoa p : banco){
            if (p.getId() == id){
              return p;
            }
        }return null;
    }

    //atualizar
    public void atualizarPessoa (int id, String nome){
        for (Pessoa p : banco){
            if (p.getId() == id){
                p.setNome(nome);
                IO.println("Pessoa atualizada com sucesso" + "\n" + p);
                break;
            }
        }
    }
}
