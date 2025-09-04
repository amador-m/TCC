package Versao1;

import javax.swing.*;
import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Usuario {
    String nome;
    String nomeUsuario;
    String email; // talvez + pra frente tenhamos que colocar private
    private int senha = 1111;
    private LocalDate dataNascimento;

    public void setSenha(int senha) {
        this.senha++;
    }

    public void setInfoUsuario(LocalDate dataNascimento) {
        // DateTimeFormatter formatDtBr = DateTimeFormatter.ofPattern("dd/MM/yyyy"); Acabei não usando, verificar mlr dps
        LocalDate dtNascimento = null;
        this.nome = JOptionPane.showInputDialog(null, "Digite o seu nome completo");
        this.nomeUsuario = JOptionPane.showInputDialog(null, "Escolha um nome de usuário");
        this.email = JOptionPane.showInputDialog(null, "Digite o seu email");
        JOptionPane.showMessageDialog(null, "A sua senha é: " + this.senha);
        while (dtNascimento == null) {
            try {
                String dtNascimentO = JOptionPane.showInputDialog(null, "Digite a sua data de nascimento (dd/MM/yyyy)");
                if (dtNascimento == null || dtNascimentO.isBlank()) {
                    JOptionPane.showMessageDialog(null, "Erro: Digite uma data válida", "Atenção!", JOptionPane.WARNING_MESSAGE);
                    continue;
                }
            } catch (DateTimeParseException erro) {
                JOptionPane.showMessageDialog(null, "Erro: Formato de data inválido. Use dd/MM/YYYY", "Atenção!", JOptionPane.WARNING_MESSAGE);
            }
        }
        this.dataNascimento = dtNascimento;
    }

    public void imprimirUsuario() {
        // int idade = (LocalDate.now().getYear()) - (this.dataNascimento.getYear());
        String fichaCadastro = "Nome completo: " + this.nome +
                "\nData de nascimento: " + this.dataNascimento +
                "\nNome de usuário: " + this.nomeUsuario +
                "\nE-mail: "  + this.email +
                "\nSenha: " + this.senha;
        JOptionPane.showMessageDialog(null, fichaCadastro,"Ficha de Cadastro", JOptionPane.INFORMATION_MESSAGE);
    }

    public String getNome() {
        return nome;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public int getSenha() {
        return senha;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}