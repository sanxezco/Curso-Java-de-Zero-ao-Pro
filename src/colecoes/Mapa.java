package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa 
{
    public static void main(String[] args) 
    {
        // crear un mapa
        Map<Integer, String> usuarios = new HashMap<>();
        // adicionar
        usuarios.put(1, "Roberto");
        usuarios.put(20, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        // tamnho del mapa
        System.out.println("Tamnho del mapa: " + usuarios.size());

        //verificar si el mapa esta vacio
        System.out.println("Mapa vacio: " + usuarios.isEmpty());

        // mostrar las llaves del mapa
        System.out.println("Llaves del mapa: " + usuarios.keySet());

        // mostrar los valores del mapa
        System.out.println("Valores del mapa: " + usuarios.values());

        // mostrar los pares del mapa
        System.out.println("Pares del mapa: " + usuarios.entrySet());

        // mostar el mapa
        System.out.println("Mapa: " + usuarios);

        // contiene una llave
        System.out.println("Contiene la llave 20? --> " + usuarios.containsKey(20));

        // contiene un valor
        System.out.println("Contiene el valor Ricardo? --> " + usuarios.containsValue("Ricardo"));

        // obtener elemento por la llave
        System.out.println("Elemento con la llave 20: " + usuarios.get(20));

        for (Integer llave : usuarios.keySet()) 
        {
            System.out.println("Llave: " + llave + " - Valor: " + usuarios.get(llave));
        }

        for (Map.Entry<Integer, String> par : usuarios.entrySet()) 
        {
            System.out.println("Llave: " + par.getKey() + " - Valor: " + par.getValue());
        }

    }   
}
