package br.com.fiap.epictaskg.superpoder;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Superpoder {
    @Id
    private Long id;
    private String nome;
    private String descricao;
    private int nivelInutilidade;
}