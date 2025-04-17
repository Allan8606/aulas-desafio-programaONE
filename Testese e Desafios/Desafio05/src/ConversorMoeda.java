public class ConversorMoeda implements ConversaoFinanceira {

    private double real;


    //Get e Set






    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }


    @Override
    public double converterDolarParaReal(double valorDolar) {
        return real * valorDolar;
    }
}
