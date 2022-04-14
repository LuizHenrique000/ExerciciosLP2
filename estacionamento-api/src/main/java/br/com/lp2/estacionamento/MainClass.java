package br.com.lp2.estacionamento;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        MainClass abc = new MainClass();
        List<String> nomes = new ArrayList<String>();
        nomes.add("Henrique");
        nomes.add("Luiz");
        nomes.add("Henry");

        nomes
                .stream()
                .filter(nome -> StringUtils.containsAnyIgnoreCase(nome,"H"))
                .forEach(abc::imprimir);

    }

    private void imprimir(String termo) {
        System.out.printf(termo);
    }
}
