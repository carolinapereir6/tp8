package br.edu.infnet.appEduca;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolicitanteService {

    public SolicitanteService(SolicitanteRepository solicitanteRepository) {
    }

    public Solicitante incluirSolicitante(Solicitante solicitante) {
        // Adicione a lógica para incluir o solicitante no repositório
        // Pode ser necessário validar ou processar dados antes de salvar no repositório
        // Exemplo: solicitanteRepository.save(solicitante);
        return solicitante;
    }

    public List<Solicitante> obterListaSolicitantes() {
        // Adicione a lógica para obter a lista de solicitantes do repositório
        // Exemplo: return solicitanteRepository.findAll();
        return null;
    }
}
