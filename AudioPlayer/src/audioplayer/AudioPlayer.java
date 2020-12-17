package audioplayer;

public class AudioPlayer {

    public static void main(String[] args) {

        Mp3 mp3 = new Mp3();
        Wav wav = new Wav();
        Wma wma = new Wma(0);

        FormatoAudio wmaAdaptador = new WmaAdapter(wma);

        mp3.abrir("Arquivo de audio 1");
        mp3.reproduzir();
        mp3.parar();
        System.out.println("");
        wav.abrir("Arquivo de audio 2");
        wav.reproduzir();
        wav.parar();
        System.out.println("");
        wma.open();
        wma.play();
        wma.stop();
        System.out.println("");
        wmaAdaptador.abrir("Arquivo de audio 3");
        wmaAdaptador.reproduzir();
        wmaAdaptador.parar();

    }

}
