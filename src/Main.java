import Controller.PessoaController;
import Controller.TarefaController;
import Model.PessoaService;
import Model.Tarefa;
import Model.TarefaService;

void main() {

    //padrão MVC
    PessoaService service = new PessoaService();
    PessoaController controller = new PessoaController(service);

    IO.println("--Cadastrando pessoas--");
    controller.cadastrar();
    IO.println(controller.mostrar());
    IO.println("--------------------------");

    IO.println("--Atualizando pessoa--");
    controller.atualizar(1, "isabella chaves");
    IO.println(controller.mostrar());
    IO.println("--------------------------");

    IO.println("--Deletar pessoas--");
    controller.deletar(1);
    IO.println(controller.mostrar());
    IO.println("--------------------------");

    TarefaService service1 = new TarefaService(service);
    TarefaController controller1 = new TarefaController(service1);

    IO.println("--Cadastro de tarefas--");
    controller1.cadastrar();
    IO.println(controller1.mostrar());
    IO.println("--------------------------");

    IO.println("--Atualização de tarefas--");
    controller1.atualizar(1, "Procurar", "Procurar blabla", 3);
    IO.println(controller1.mostrar());
    IO.println("--------------------------");


    IO.println("--Deletar tarefas--");
    controller1.deletar(2);
    IO.println(controller1.mostrar());

}
