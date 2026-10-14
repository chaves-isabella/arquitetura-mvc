package Controller;

import Model.PessoaService;

import java.util.List;

public class PessoaController {

    private final PessoaService pessoaService;


    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    public void cadastrar () {
        pessoaService.cadastrarPessoa("isabella", "isa@gmail.com");
        pessoaService.cadastrarPessoa("fiama", "fiama@gmail.com");
        pessoaService.cadastrarPessoa("mathias", "mathias@gmail.com");
        pessoaService.cadastrarPessoa("luiz", "luiz@gmail.com");
    }

    public List<?> mostrar (){
        return pessoaService.listarPessoa();
    }

    public void deletar (int id){
        pessoaService.deletarPessoa(id);
    }

    public void atualizar (int id, String nome){
        pessoaService.atualizarPessoa(id, nome);
    }
}
