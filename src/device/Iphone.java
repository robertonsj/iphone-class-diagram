/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package device;
import features.AparelhoTelefonico;
import features.NavegadorDeInternet;
import features.ReprodutorMusical;
/**
 *
 * @author logistica
 */
public class Iphone implements AparelhoTelefonico, NavegadorDeInternet, 
        ReprodutorMusical{

    @Override
    public void realizarChamada() {
        System.out.println("Realizar chamada via iPhone.");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atender chamada via iPhone.");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciar correio de voz via iPhone.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibir página web no iPhone.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar aba no navegador do iPhone.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar página web no navegador do iPhone.");
    }

    @Override
    public void reproduzirMusica() {
        System.out.println("Reproduzir música no iPhone.");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausar música no iPhone.");
    }

    @Override
    public void selecionarFaixa() {
        System.out.println("Selecionar faixa musical no iPhone.");
    }
    
}
