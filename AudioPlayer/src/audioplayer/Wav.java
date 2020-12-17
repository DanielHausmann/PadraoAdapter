package audioplayer;

public class Wav implements FormatoAudio{
      
    String nomeArquivo;
    
    public void abrir(String audio){
        System.out.println("Abrindo o arquivo "+audio+".wav");
        this.nomeArquivo = audio;
    }
    
    public void reproduzir(){
        System.out.println("Reproduzindo o arquivo "+nomeArquivo+".wav deste o inicio");
        
    }
    
    public void parar(){
        System.out.println("Fechando o arquivo "+nomeArquivo+".wav");
    }
}
