public class MusicPlayer {
  private String nowPlaying;
  private String[] musics;
  private String selectedMusic;

  public MusicPlayer(String nowPlaying, String[] musics, String selectedMusic) {
    this.nowPlaying = nowPlaying;
    this.musics = musics;
    this.selectedMusic = selectedMusic;
  }

  public String getNowPlaying() {
    return nowPlaying;
  }

  public void setNowPlaying(String nowPlaying) {
    this.nowPlaying = nowPlaying;
  }

  public String getSelectedMusic() {
    return selectedMusic;
  }

  public void setSelectedMusic(String selectedMusic) {
    this.selectedMusic = selectedMusic;
  }

  public void showMusics(String musics) {
    System.out.println("Aqui estão as musicas: " + musics);
  }

  public void play(String selectedMusic) {
    System.out.println("Tocando: " + selectedMusic);
  }

  public void stop() {
    System.out.println("Parando de tocar.");
  }

  public String selectMusic(String musicaSelecionada) {
    System.out.println("Selecionando a musica: " + musicaSelecionada);
    setSelectedMusic(musicaSelecionada);
    return musicaSelecionada;
  }
}
