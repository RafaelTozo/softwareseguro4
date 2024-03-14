import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Musica m1 = new Musica("song1", 110);
        Musica m2 = new Musica("song2", 120);
        Musica m3 = new Musica("song3", 130);
        Musica m4 = new Musica("song4", 140);
        Musica m5 = new Musica("song5", 150);

        ArrayList<Musica> musicas = new ArrayList<>();
        musicas.add(m1);
        musicas.add(m2);
        musicas.add(m3);
        musicas.add(m4);
        musicas.add(m5);

        Album a1 = new Album("albumname", 2024, musicas);
    }
}