package br.edu.infnet.appEduca;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Component
public class SolicitanteLoader implements ApplicationRunner {

    private final SolicitanteService solicitanteService;


    public SolicitanteLoader(SolicitanteService solicitanteService) {
        this.solicitanteService = solicitanteService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // Leitura do arquivo texto
        try (BufferedReader leitura = new BufferedReader(new FileReader("files/solicitantes.txt"))) {
            String linha;
            while ((linha = leitura.readLine()) != null) {
                // Processar cada linha do arquivo
                String[] dados = linha.split(";");

                // Verificar se há dados suficientes
                if (dados.length >= 3) {
                    // Preenchimento de um novo Solicitante
                    Solicitante solicitante = new Solicitante(dados[0], dados[1], linha);
                    solicitante.setEmail(dados[2]);

                    // Incluir o solicitante usando o serviço
                    solicitanteService.incluirSolicitante(solicitante);
                } else {
                    System.out.println("Formato inválido na linha: " + linha);
                }
            }

            // Exibir informações dos solicitantes utilizando o serviço
            solicitanteService.obterListaSolicitantes().forEach(solicitante ->
                    System.out.println("CPF: " + solicitante.getCpf() + ", Solicitante: " + solicitante));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
