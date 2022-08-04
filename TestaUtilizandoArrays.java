import java.util.ArrayList;

public class TestaUtilizandoArrays {

  public static void main(String[] args) {
    //Cria uma lista do tipo String.
    ArrayList<String> nomes = new ArrayList<>();
    //Adiciona uma String no ArrayList.
    nomes.add("Java");
    nomes.add("Ruby");

    ArrayList<String> paises = new ArrayList<>();
    paises.add("Brasil");
    paises.add("Canada");

    ArrayList<String> todos = new ArrayList<>();

    todos.addAll(paises);
    todos.addAll(nomes);

    System.out.println(todos);

    //contains e uma metodo pra ferificar se existe determinado dado na lista
    //Retorna true para sim e false para não.
    System.out.println(nomes.contains("Python"));
    //Remove um objeto da lista.
    //Se ouver objetos duplicados ele so removera 1.
    boolean removido = nomes.remove("Java");
    System.out.println(removido);

    nomes.add("JavaScript");
    nomes.add("Python");
    nomes.add("Java");

    System.out.println(nomes.size());

    //Para transformar um ArrayList em um Array pode se usar o método toArray.
    //O ArrayList e convertido em Object Array.
    //Pega isso
    nomes.toArray();
    //Faz isso
    //Object objetos[] = nomes.toArray();

    //Para transforma um ArrayObject em Array de String pode ser feito assim.
    //Tambem e possivel colocar o tamanho do array igual ao que ja existia.
    String nomesArray[] = nomes.toArray(new String[nomes.size()]);

    //Cria um array com o tamanho certo automaticamente.
    String nomesArray2[] = nomes.toArray(new String[0]);
    
    System.out.println(todos.size());
    System.out.println(nomes.get(0));

    //Adiciona o elemento em uma posição especifica.
    //Se houver algum elemento na posição, é deslocada para próxima posição.
    nomes.add((0), "php");

    System.out.println(nomes.get(0));
    //Remove algo da posição especifica
    //A posição e preenchida pelo elemento que viria na posição a frente.
    nomes.remove(0);

    System.out.println(nomes.get(0));

    //set Troca o valor do elemento por outro.
    //Diferente do add que adicionar mais não exclui.
    //set
    nomes.set(0, "CSS");
    System.out.println(nomes.get(0));

    //Retorna a posição do elemento na Lista, casa precise usar o SET e não saiba a posição do elemento
    System.out.println(nomes.indexOf("Java"));

    //Retorna a ultima posição encontrada do elemento passado.
    //A lista e escaneada de traz para frente.
    System.out.println(nomes.lastIndexOf("Java"));

    //Quando o elemento pesquisado não existe, o indexOf retorna -1.
    System.out.println(nomes.indexOf("C##"));


  }
}
