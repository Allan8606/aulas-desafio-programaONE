package desafio.minhasmusicas.modelos;

public class Audio {
    //Atributos
    private String titulo;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;


    //Métodos
    public void cute(){
        this.curtidas++;
    }
    public void reproduz(){
        this.totalDeReproducoes++;
    }





    //Get e Set
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public int getClassificacao() {
        return classificacao;
    }



}
