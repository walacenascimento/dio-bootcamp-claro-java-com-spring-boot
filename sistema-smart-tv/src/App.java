public class App {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);

        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo Volume: " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Novo Canal: " + smartTv.canal);

        smartTv.desligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);
        
    }
}
