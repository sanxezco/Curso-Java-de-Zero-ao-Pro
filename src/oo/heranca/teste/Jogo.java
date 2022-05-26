package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo 
{
    public static void main(String[] args) 
    {   
        Monstro monstro = new Monstro();          
        monstro.x = 10;
        monstro.y = 10;
         
        Heroi heroi = new Heroi(10,11);          
    

        System.out.println("Vida J1: " + monstro.vida);
        System.out.println("Vida heroi: " + heroi.vida);

        monstro.atacar(heroi);
        System.out.println("Vida Heroi: " + heroi.vida);
        heroi.atacar(monstro);
        System.out.println("Vida Monstro: " + monstro.vida);

    }    
}
