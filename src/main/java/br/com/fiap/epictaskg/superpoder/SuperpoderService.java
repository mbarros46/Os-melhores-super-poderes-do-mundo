package br.com.fiap.epictaskg.superpoder;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SuperpoderService {
    private final SuperpoderRepository repository;

    public SuperpoderService(SuperpoderRepository repository) {
        this.repository = repository;
    }

    public List<Superpoder> listarPorInutilidade() {
        return repository.findAllByOrderByNivelInutilidadeDesc();
    }
}