public class TestaArray {

  public static void main(String[] args) {

//     Os quatro pontos importantes sobre arrays são:

// Declarar
// Inicializar
// Acessar
// Percorrer

    //Pegando o valor da posição do array, lembrando que o valor sempre começa em 0.
    int idades[] = new int[]{0,1,2,3,4};
    System.out.println(idades[2]);

    //Atribuindo um valor para uma determinada posição do array.
    idades[4] = 10;
    System.out.println(idades[4]);

    //Ao tentar acessar a posição que não exite o código e compilado mais não executado.
    //System.out.println(idades[10]);

    //Como saber o tamanho do array selecionado.
    System.out.println(idades.length);

    //Percorrer o array de forma tradicional.
    //Para escolher uma posição ou inserir uma determinado valor.
    for(int i = 0; i < idades.length; i++){
        System.out.println(idades[i]);
    }

    //A partir do Java 5 pode ser feito o processo de percorrer o Array de uma outra forma.
    //FOR IT
    //Cada valor do array e setado na variável declarada, no exemplo representada por idade.
    //Indicado apenas para leitura, e caso precise percorrer todos os valores de array.
    //Não e possível para em um determinado valor como na forma tradicional. 
    for(int idade : idades){
        System.out.println(idade);
    }

    //Todos os formatos são válidos para arrays
    // int [] idade;
    // double pesos[];
    // long []numeros;
    // long[]tamanhos;

    //O array e um objeto, então deve ser iniciado com new.
    //Dento do colchetes entra o tamanho da lista;
    //São gerados 10 espaços
    //int idades[] = new int[10];

    //Dentro do array passado o número 0 representa a posição escolhida.
    //System.out.println(idades[0]);

    //Caso você ja saiba quais valores iram entrar na lista
    //O Array pode ser implementado da seguinte forma.
    //Passa-se os valores dendo de chaves logo do lado dos colchetes do array.
    //int definidos[] = new int[] { 0, 10, 5, 16 };
    //System.out.println(definidos[0]);

    //Cliente[] cliente = new Cliente[] { new Cliente(), null, new Cliente() };

    //Também pode ser feito dessa forma.
    //O valor pode ser usado dentro das chaves na mesma linha da declaração da Array.
    // int[] idades = {2,8,6,3};
    //     System.out.println(idades[0]);

    //Para usar na outra linha deve-se ser feita a declaração do array antes.
    //int idades[] = new int[] { 0, 10, 5, 16 };
    //System.out.println(idades[0]);



  }
}
