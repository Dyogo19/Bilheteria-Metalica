package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Usuario {

    private String nome;
    private LocalDate dataNascimento;

    private boolean isEstudante;

    private boolean isIdoso;
    public Usuario(String nome, LocalDate dataNascimento, boolean isEstudante) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.isEstudante = isEstudante;
        this.isIdoso = isIdoso;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean isEstudante() {
        return isEstudante;
    }

    public void setEstudante(boolean estudante) {
        isEstudante = estudante;
    }

    public boolean isIdoso() {

        return isIdoso;
    }

    @Override
    public String toString() {
        return "{" +
                "'" + nome + '\'' +
                '}';
    }
}
