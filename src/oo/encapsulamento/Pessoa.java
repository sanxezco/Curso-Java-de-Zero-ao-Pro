package oo.encapsulamento;


public class Pessoa 
{ 
    private int idade;
    private String nome;
    private String sobrenome;    

    public Pessoa(String nome, String sobrenome,int idade)
    {
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
        
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    
    public String getSobrenome() 
    {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) 
    {
        this.sobrenome = sobrenome;
    }

    public int getIdade() 
    {
        return idade;
    }

    public void setIdade(int novaIdade)
    {
        if (novaIdade > 0 && novaIdade < 120)
        {
            // validacion de la edad, si no es validad la edad pasada por parametro, entonces la edad sera la asignada en el constructor
            this.idade = novaIdade;            
        }
    }

    public String getNomeCompeto()
    {
        return getNome() + " " + getSobrenome();
    }

    @Override
    public String toString() {
        return "Pessoa [idade=" + idade + ", nome=" + nome + "]";
    }
    
    
    
}
