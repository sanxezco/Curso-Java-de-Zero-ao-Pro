package oo.heranca.desafio;

public class Carro {

    public final int VELOCIDADE_MAXIMA;
    protected int velocidadeActual;
    private int delta = 5;

    protected Carro(int velocidadeMaxima)
    {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar() 
    {
        if(velocidadeActual + getDelta() > VELOCIDADE_MAXIMA)
        {
            velocidadeActual = VELOCIDADE_MAXIMA;
        }
        else
        {
            velocidadeActual += getDelta();
        }
    }

    public void frear() 
    {
        if (velocidadeActual >= delta) {
            velocidadeActual -= delta;
        } else {
            velocidadeActual = 0;
        }
    }

    public String toString()
    {
        return "Velocidade atual: " + velocidadeActual + " km/h";
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    

}
