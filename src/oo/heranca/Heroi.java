package oo.heranca;

public class Heroi extends Jogador
{
    public Heroi(int x, int y)
    {
        super(x, y);
    }
    
    public boolean atacar(Jogador oponente)
    {
        boolean ataque = super.atacar(oponente);
        return ataque;
    }
}
