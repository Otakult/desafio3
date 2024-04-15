package Tabu;
public class TabuadaMultiplicacao {
    private int numero;
    private int maximo=10;
    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }
    public void mostrarTabuada(){
        System.out.println("Tabuada de "+numero);
        for(int i =1; i<=maximo; i++){
            System.out.println(i+" x "+ numero + " = " + i *numero+"\n");
        }
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
