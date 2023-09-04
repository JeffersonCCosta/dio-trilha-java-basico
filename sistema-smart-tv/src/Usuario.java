import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();
        System.out.println("Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("\n");

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.mudarDeCanal(8);
        System.out.println("Novo Status -> Ligada? " + smartTv.ligada);
        System.out.println("Novo Status -> Volume atual: " + smartTv.volume);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("\n");

        smartTv.desligar();
        smartTv.diminuirVolume();
        System.out.println("Novo Status -> Ligada? " + smartTv.ligada);
        System.out.println("Novo Status -> Volume atual: " + smartTv.volume);

        Scanner scanner = new Scanner(System.in);


    }
}
