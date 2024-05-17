package br.com.juancunha.modelos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        try {
            ConsultaCep consulta = new ConsultaCep();
            System.out.println("Digite um cep para buscar informações sobre o endereço:");
            var cep = scanner.nextLine();
            Enderecos novoEndereco = consulta.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
