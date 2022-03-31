package aula2;

import java.util.Scanner;

public class TesteEstacionamento {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("----BEM VINDO AO PAREBEM----");
        System.out.println("Digite o seu veiculo estacionado: ");
        System.out.println("1 - Carro, 2 - Moto, 3 - Bicicleta");
        int opcao = in.nextInt();
        int horaAdicional = 0;
        int totalHorasAdicionais = 0;

        if (opcao == 1) {
            Carro carro = new Carro("", "", 0);
            System.out.println("Digite a marca do seu carro: ");
            carro.setMarca(in.next());
            System.out.println("Digite a cor do seu veiculo: ");
            carro.setCor(in.next());
            System.out.println("Digite em minutos o tempo em que seu veículo ficou no estacionamento: ");
            carro.setTempoDeEstacionamento(in.nextDouble());
            System.out.println("Digite se tem horas adicionais: ");
            System.out.println(" 1 - Sim, 2 - Não");
            horaAdicional = in.nextInt();
            if (horaAdicional == 1) {
                System.out.println("Digite o total de horas adicionais: ");
                totalHorasAdicionais = in.nextInt();
            }
            carro.calcularTaxa();
            System.out.println(carro);

        } else if (opcao == 2) {
            Moto moto = new Moto("", "", 0);
            System.out.println("Digite a marca da sua moto: ");
            moto.setMarca(in.next());
            System.out.println("Digite a cor da sua moto: ");
            moto.setCor(in.next());
            System.out.println("Digite em minutos o tempo em que sua moto ficou no estacionamento: ");
            moto.setTempoDeEstacionamento(in.nextDouble());
            System.out.println("Digite se tem horas adicionais: ");
            System.out.println(" 1 - Sim, 2 - Não");
            horaAdicional = in.nextInt();
            moto.calcularTaxa();
            System.out.println(moto);

        } else if (opcao == 3) {
            Bicicleta bicicleta = new Bicicleta("", "", 0);
            System.out.println("Digite a marca da sua bicicleta: ");
            bicicleta.setMarca(in.next());
            System.out.println("Digite a cor da sua bicicleta: ");
            bicicleta.setCor(in.next());
            System.out.println("Digite em minutos o tempo em que sua bicicleta ficou no estacionamento: ");
            bicicleta.setTempoDeEstacionamento(in.nextDouble());
            System.out.println("Digite se tem horas adicionais: ");
            System.out.println(" 1 - Sim, 2 - Não");
            horaAdicional = in.nextInt();
            bicicleta.calcularTaxa();
            System.out.println(bicicleta);
        }
        in.close();
    }

}
