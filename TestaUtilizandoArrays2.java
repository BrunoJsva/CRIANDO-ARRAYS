import java.util.ArrayList;
import java.util.Iterator;

public class TestaUtilizandoArrays2 {

  public static void main(String[] args) {
    //Cria uma lista do tipo String.
    ArrayList<String> nomes = new ArrayList<>();
    //Adiciona uma String no ArrayList.
    nomes.add("Java");
    nomes.add("Ruby");
    nomes.add("Php");

    //Consegue percorre o Array de qualquer tipo.
    Iterator<String> it = nomes.iterator();

    //O ideal e usar o while
    //hasNext ferifica se existe um próximo elemento e retorna.
    //Retorna true
    while (it.hasNext()) {
      //O next() devolve o elemento atual.
      String atual = it.next();
      System.out.println(atual);
      //it.remove();
    }
    //Percorre a lista.
    for (String nome : nomes) {
      System.out.println(nome);
    }

    // Cliente bruno = new Cliente();
    // bruno.nome = "Bruno";

    // ArrayList<Cliente> clientes = new ArrayList<>();

    // System.out.println(bruno.nome);
    // System.out.println(clientes.get(0).nome);

    // bruno.nome = "BrunoSilva";

    // System.out.println(bruno.nome);
    // System.out.println(clientes.get(0).nome);

    ArrayList<String> aw = new ArrayList<String>();
    ArrayList<String> b = new ArrayList<String>();
    ArrayList<String> c = new ArrayList<String>();
    b.add("a");
    c.add("c");
    b.add("b");
    c.add("d");
    aw.addAll(b);
    aw.addAll(c);
    System.out.println(aw.get(0));
    System.out.println(aw.get(3));

    ArrayList<String> a = new ArrayList<String>();
    a.add(0, "a");
    a.add(1, "b");
    for (Iterator<String> i = a.iterator(); i.hasNext(); i.next()) {
      String element = i.next();
      System.out.println(element);
    }

    ArrayList<String> ss = new ArrayList<String>();
        ss.add("a");
        ss.add("b");
        ss.add("c");
        ss.add("d");

        for(String s:ss){
            if(s.equals("c")) s = "b";
            else if(s.equals("b")) s= "c";
        }
        for(String s:ss) System.out.println(s);
    
  }
}
