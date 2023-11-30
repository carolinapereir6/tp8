package br.edu.infnet.appEduca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

@SpringBootApplication
public class AppEducaApplication implements ApplicationRunner {

    @Autowired
    private SolicitanteService solicitanteService;

    public static void main(String[] args) {
        SpringApplication.run(AppEducaApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // Não é necessário criar uma instância de SolicitanteRepository manualmente

        // Chama o método executarLogica
        executarLogica();
    }

    public void executarLogica() {
        Produto produto1 = new Produto(LocalDate.of(2023, 1, 1), LocalDate.of(2023, 1, 15), 1, 0, 50);
        Produto produto2 = new Produto(LocalDate.of(2023, 2, 1), LocalDate.of(2023, 2, 28), 0, 8.0, 0);
        Produto produto3 = new Produto(LocalDate.of(2023, 3, 1), LocalDate.of(2023, 3, 31), 1, 0, 60);

        // Criando pedidos associados a esses produtos
        Pedido pedido1 = new Pedido(LocalDate.now(), 1, 100.0);
        pedido1.adicionarProduto(produto1);
        pedido1.adicionarProduto(produto2);

        Pedido pedido2 = new Pedido(LocalDate.now(), 0, 150.0);
        pedido2.adicionarProduto(produto2);
        pedido2.adicionarProduto(produto3);

        // Exemplo de inclusão de solicitante usando o serviço
        Solicitante solicitante = new Solicitante("Nome", "Sobrenome", "email@example.com");
        solicitanteService.incluirSolicitante(solicitante);
    }
}
