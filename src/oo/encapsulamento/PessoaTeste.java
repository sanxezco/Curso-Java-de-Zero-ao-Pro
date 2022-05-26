package oo.encapsulamento;

public class PessoaTeste 
{
    public static void main(String[] args) 
    {
        Pessoa p1 = new Pessoa("Rances", "Sanchez",30);
        p1.setIdade(29);

        System.out.println(p1.getIdade());
        System.out.println(p1);
        System.out.println(p1.getNomeCompeto());
        
    }
    
}
