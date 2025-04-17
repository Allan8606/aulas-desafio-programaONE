package desafio.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto por todos");
        } else {
            System.out.println(audio.getTitulo() + " é uma boa opção");
        }
    }

}
