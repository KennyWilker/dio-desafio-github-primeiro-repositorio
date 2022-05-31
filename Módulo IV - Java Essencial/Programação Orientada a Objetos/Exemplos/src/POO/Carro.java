package POO;

public class Carro extends Veiculo{
    String cor;
    String modelo;
    int capacidadeTamque;

    public Carro(){}

    public Carro(String cor, String modelo, int capacidadeTamque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTamque = capacidadeTamque;
    }

    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setCapacidadeTamque(int capacidadeTamque){
        this.capacidadeTamque = capacidadeTamque;
    }

    int getCapacidadeTamque(){
        return capacidadeTamque;
    }

    double totalValorTanque(double valorCombustivel){
        return capacidadeTamque * valorCombustivel;
    }
}