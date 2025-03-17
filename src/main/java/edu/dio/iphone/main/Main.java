package edu.dio.iphone.main;

import edu.dio.iphone.application.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.selecionarMusica("Como tudo deve ser - Charlie Brow Jr");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("99 99999-9999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://www.google.com.br");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}