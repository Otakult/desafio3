package Conversor ;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    public double celsiusParaFahrenheit(double celcius){
        return celcius*1.8+32;
    }
    public double fahrenheitParaCelscius(double fahrenheint) {
        return (fahrenheint-32)*5/9;
    }
}
