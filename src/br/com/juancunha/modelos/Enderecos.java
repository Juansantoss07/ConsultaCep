package br.com.juancunha.modelos;

public record Enderecos (
        String cep,
        String logradouro,
        String bairro,
        String localidade,
        String uf) {}
