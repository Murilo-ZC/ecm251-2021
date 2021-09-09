package br.maua.maps;

import br.maua.models.Item;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTestDrive {
    public static void main(String[] args) {
        Map<String, Item> itemMap = new TreeMap<>();

        //Adiciona itens no mapa
        itemMap.put("Item1", new Item("Maca",1));
        itemMap.put("Item2", new Item("Pera",2));
        itemMap.put("Item3", new Item("Maca",1));
        itemMap.put("Item1", new Item("Banana",3));

        //Passa por todos os elementos
        itemMap.forEach((chave, valor) -> System.out.println("Chave:"+chave+"\tValor:"+valor));

        //Imprime todos os elementos do map
        System.out.println(itemMap);

        //Outra forma de recuperar os itens do Mapa
        Item item = itemMap.get("Item1");
        System.out.println(item);
        item = itemMap.get("Goku");
        System.out.println(item);
        item = itemMap.getOrDefault("Vegeta", new Item("Ola", 100));
        System.out.println(item);
        item = itemMap.getOrDefault("Item2", new Item("Ola", 100));
        System.out.println(item);
        System.out.println(itemMap);
    }
}
