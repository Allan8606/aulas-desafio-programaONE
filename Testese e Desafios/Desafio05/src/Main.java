public class Main {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        conversor.setReal(10.0);


        System.out.println(conversor.converterDolarParaReal(6));
    }
}
