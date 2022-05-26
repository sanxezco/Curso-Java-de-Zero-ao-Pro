package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado 
{
    public static void main(String[] args) 
    {
        HashSet conjunto = new HashSet();
        // adicionar un double
        conjunto.add(1.2);
        //adicionar un boolean
        conjunto.add(true);
        //adicionar un String
        conjunto.add("Test");
        //adicionar un int
        conjunto.add(1);
        //adicionar un char x
        conjunto.add('x');

        //tamanho do conjunto
        System.out.println("Tamanho do conjunto: " + conjunto.size());

        // es sensible a mayusculas y minusculas
        // adicionar un String test
        conjunto.add("test");
        System.out.println("Tamanho do conjunto: " + conjunto.size());

        // remover algun elemento especifico. Devuelve true si se elimino el elemento
        boolean elimino = conjunto.remove("test");
        System.out.println("Tamanho do conjunto: " + conjunto.size());
        System.out.println("Se elimino el elemento? : " + elimino);

        // saber si existe un elemento especifico
        boolean existe = conjunto.contains("test");
        System.out.println("Existe el elemento? : " + existe);

        // nuevo set nums
        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        System.out.println("Nuevo set nums: " + nums);

        // nuevo set a partir de fusionar dos sets, nums y conjunto
        //conjunto.addAll(nums);
        //System.out.println("Nuevo set a partir de fusionar dos sets, nums y conjunto: " + conjunto);

        // hacer interseccion de dos sets
        conjunto.retainAll(nums);
        System.out.println("Hacer interseccion de dos sets: " + conjunto);

        // limpiar un set
        conjunto.clear();
        System.out.println("Set limpio: " + conjunto);
        
    }
    
}
