package generics;

public class Par<C,V> 
{
    private C chave;
    private V valor;

    public Par(C chave, V valor) 
    {
        this.chave = chave;
        this.valor = valor;
    }

    public C getChave() 
    {
        return chave;
    }
    
    public void setChave(C chave) 
    {
        this.chave = chave;
    }
    
    public V getValor() 
    {
        return valor;
    }
    
    public void setValor(V valor) 
    {
        this.valor = valor;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Par other = (Par) obj;
        if (chave == null) {
            if (other.chave != null)
                return false;
        } else if (!chave.equals(other.chave))
            return false;
        return true;
    }

    //Comparar por chaves con metodo equals




    
    
}
