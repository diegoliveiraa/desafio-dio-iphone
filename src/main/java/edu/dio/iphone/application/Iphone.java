package edu.dio.iphone.application;

import edu.dio.iphone.domain.AparelhoTelefonico;
import edu.dio.iphone.domain.NavegadorInternet;
import edu.dio.iphone.domain.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero "+ numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Carregando a pagina "+ url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo a musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica "+ musica);
    }
}
