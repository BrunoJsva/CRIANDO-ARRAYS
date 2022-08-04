public class TestaArray2 {

  public static void main(String[] args) {
    //Não e possivel fazer casting em primitivos.
    // int valores[] = new int[10];
    // long numeros[] = (long[])valores;


    //Nesse caso especifico e possível pois String e uma Object.
    String nomes[] = new String[10];
    Object objetos[] = new Object[10];
    objetos = nomes;

    //Para cada posição em objetos imprima o valor.
    for (Object o : objetos){
        System.out.println(o);
    }

    //Array do tipo cliente com 10 espaços
    Cliente clientes[] = new Cliente[10];

    //Enquando i for menos do que a lista adicionar um novo cliente chamado Bruno.
    for (int i = 0; i < clientes.length; i++) {
      clientes[i] = new Cliente();
      clientes[i].nome = "Bruno";
    }

    //Para cada novo Cliente na tabela clientes, imprima o nome.
    for (Cliente novoCliente : clientes) {
      System.out.println(novoCliente.nome);
    }

  //Colocando um valor da classe extends 'ClienteEspecial' dentro do Objeto Cliente.  
  Cliente clientes2[] = new Cliente[5];
  clientes2[0] = new Cliente();
  clientes2[1] = new ClienteSpecial();

  Cliente pessoa = new Cliente();
  pessoa.nome = "Marli";

  clientes2 [0] = pessoa;

  System.out.println(pessoa.nome);
  System.out.println(clientes2[0].nome);
    //Atribuindo um novo valor a posição existente. ou Cliente no caso.
  pessoa.nome = "Marli Amorim";

  System.out.println(pessoa.nome);
  System.out.println(clientes2[0].nome);

  }
}

class Cliente {

  String nome;
}
//Classe estendida de Cliente.
class ClienteSpecial extends Cliente{}
