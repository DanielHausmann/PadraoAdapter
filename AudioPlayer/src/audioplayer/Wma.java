package audioplayer;

public class Wma implements WmaPlay {

    String file;

    int location;

    public Wma(int minutoReproducao) {
        setLocation(minutoReproducao);
    }

    public void setFile(String file) {
        this.file = file;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public void open() {
        if (file == null) {
            System.out.println("Erro ao abrir arquivo");
        } else {
            System.out.println("Abrindo o arquivo " + file + ".wma");
        }
    }

    public void play() {
        if (file == null) {
            System.out.println("Erro ao reproduzir arquivo");
        } else {

            if (location == 0) {
                System.out.println("Reproduzindo o arquivo " + file + ".wma deste o inicio");
            } else {
                System.out.println("Reproduzindo o arquivo " + file + ".wma a partir do minuto " + location);
            }
        }
    }

    public void stop() {
        if(file==null){
            System.out.println("Erro ao fechar arquivo");
        }else{
            System.out.println("Fechando o arquivo " + file + ".wma");
        }
        
        
    }

}
