package Calculadoras;
public class CalculadoraSalaRetangular implements CalculoGeometrico{
    private double largura;
    private double comprimento;
    public double calcularArea(){
        return largura*comprimento;
    }
    public double calculaPerimetro(){
        return largura*2 + comprimento*2;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
}
