package Métodos;

public class SmarTV {
    boolean on = false;
    int canal = 1;
    int volume = 25;
    public void ligar(){
        on = true;
    }
    public void desligar(){
        on = false;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void mudarCanalUp(){
        canal++;
    }
    public void mudarCanalDown(){
        canal--;
    }
}
