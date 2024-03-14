import java.util.ArrayList;

public class Album {
    private String nome;
    private int anoLancamento;
    private ArrayList<Musica> musicas;

    public Album (String nome, int anoLancamento, ArrayList<Musica> musicas){
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.musicas = musicas;
    }
}