package br.edu.infnet.appEduca;

import jakarta.persistence.Entity;

@Entity
public class Solicitante {
    private String nome;
    private String cpf;
    private String email;

    @Override
    public String toString() {
        return String.format("nome (%s) - cpf (%s) - email (%s)", nome, cpf, email);
    }

    

    // Construtor da classe
    public Solicitante(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    // Getter para o atributo 'nome'
    public String getNome() {
        return nome;
    }

    // Setter para o atributo 'nome'
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o atributo 'cpf'
    public String getCpf() {
        return cpf;
    }

    // Setter para o atributo 'cpf'
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Getter para o atributo 'email'
    public String getEmail() {
        return email;
    }

    // Setter para o atributo 'email'
    public void setEmail(String email) {
        this.email = email;
    }
}
