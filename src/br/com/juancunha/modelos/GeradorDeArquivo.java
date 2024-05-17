package br.com.juancunha.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {

    public void salvaJson(Enderecos enderecos) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escrita = new FileWriter(enderecos.cep() + ".json");
        escrita.write(gson.toJson(enderecos));
        escrita.close();
    }
}
