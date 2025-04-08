public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2012;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if(anoDeLancamento > 2020){
            System.out.println("Laçamento que estão curtindo");
        }else{
            System.out.println("O filme não é lançamento");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("Seu plano é plus, e por isso você pode assistir esse filme");

        }else{
            System.out.println("Adquira um plano plus");
        }



    }
}
