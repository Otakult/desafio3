import Tabu.TabuadaMultiplicacao;
import java.util.Scanner;
import Conversor.ConversorTemperaturaPadrao;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ConversorTemperaturaPadrao converte = new ConversorTemperaturaPadrao();
        System.out.println("Digite a temperaura em celsius para convereter em fahreint:");
        System.out.println(converte.celsiusParaFahrenheit(ler.nextInt()));


    }
}