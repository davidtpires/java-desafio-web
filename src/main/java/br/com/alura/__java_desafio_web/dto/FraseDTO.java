package br.com.alura.__java_desafio_web.dto;

public record FraseDTO (
        Long id,
        String frase,
        String personagem,
        String titulo,
        String poster
) {
}
