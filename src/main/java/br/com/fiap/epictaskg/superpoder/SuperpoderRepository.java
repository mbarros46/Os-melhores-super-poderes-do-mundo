package br.com.fiap.epictaskg.superpoder;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SuperpoderRepository extends JpaRepository<Superpoder, Long> {
    List<Superpoder> findAllByOrderByNivelInutilidadeDesc();
}