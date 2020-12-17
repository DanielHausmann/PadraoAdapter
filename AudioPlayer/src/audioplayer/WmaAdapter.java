package audioplayer;

public class WmaAdapter implements FormatoAudio {

    WmaPlay wmaPlay;

    public WmaAdapter(WmaPlay wmaPlay) {
        this.wmaPlay = wmaPlay;
    }

    public void abrir(String nomeArquivo) {
        wmaPlay.setFile(nomeArquivo);
        wmaPlay.open();
    }

    public void reproduzir() {
        wmaPlay.play();
    }

    public void parar() {
        wmaPlay.stop();

    }

}
