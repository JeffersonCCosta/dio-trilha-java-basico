package candidatrua;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String candidatos[] = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando =! atendeu;

            if (continuarTentando){
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso.");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu){
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa.");
        } else {
            System.out.println("Nao conseguimos contato com " + candidato + ", nuemro de tentativas " + tentativasRealizadas + " tentativa.");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados(){
        String candidatos[] = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice");

        for (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de numero: " + (indice + 1) + " e " + candidatos[indice]);
        }

        System.out.println("\nFORMA ABREVIADA\n");

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos(){
        String candidatos[] = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","FABRICIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;
        int candidatoAtual =0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou o salario de valor R$" + salarioPretendido);

            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " FOI selecionado para vaga.");
                candidatosSelecionados++;
            } else {
                System.out.println("O candidato " + candidato + " NAO foi selecionado para vaga.");
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para candidato.");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para candidato com contra proposta.");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos.");
        }
    }

}
