package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Lucas");
        nomes.add("Sosa");
        nomes2.add("DevDojo");
        nomes2.add("Academy");
        //nomes.remove("Lucas");

        nomes.addAll(nomes2);

        for (String nome:nomes){
            System.out.println(nome);
        }
        nomes.add("Machado");
        System.out.println("---------------");

        int size = nomes.size();
        for (int i = 0; i < size; i++){
            System.out.println(nomes.get(i));
        }

        System.out.println("------------------");

        List<Integer> numers = new ArrayList<>();
        numers.add(1);
    }
}
