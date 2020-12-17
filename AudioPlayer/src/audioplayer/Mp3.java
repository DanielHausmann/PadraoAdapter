package audioplayer;

public class Mp3 implements FormatoAudio{
    
    String nomeArquivo;
    
    public void abrir(String audio){
        System.out.println("Abrindo o arquivo "+audio+".mp3");
        this.nomeArquivo = audio;
    }
    
    public void reproduzir(){
        System.out.println("Reproduzindo o arquivo "+nomeArquivo+".mp3 deste o inicio");
        
    }
    
    public void parar(){
        System.out.println("Fechando o arquivo "+nomeArquivo+".mp3");
    }
}
