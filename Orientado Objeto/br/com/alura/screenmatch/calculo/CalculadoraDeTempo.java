package br.com.alura.screenmatch.calculo;


import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }


   /* Jeito menos eficente
   public void inclui(Filme f){
        tempoTotal += f.getDuracaoEmMinutos();

    }
    public void inclui(Serie s){
        tempoTotal += s.getDuracaoEmMinutos();

    }*/

    //Jeito mais eficente
    public void inclui(Titulo t){
        tempoTotal += t.getDuracaoEmMinutos();

    }


}
