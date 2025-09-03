package Versao1;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Usuario {
    String nome;
    String nomeUsuario;
    String email; // talvez + pra frente tenhamos que colocar private
    private int senha = 1111;
    private LocalDate dataNascimento;

    public void setSenha(int senha) {
        this.senha = senha;
        senha = this.senha;
    }

    public void setInfoUsuario() {
        DateTimeFormatter formatDtBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dtNascimento = null;

        this.nome = JOptionPane.showInputDialog(null, "Digite o seu nome completo");
        this.nomeUsuario = JOptionPane.showInputDialog(null, "Escolha um nome de usuário");
        this.email = JOptionPane.showInputDialog(null, "Digite o seu email");
        JOptionPane.showMessageDialog(null, "A sua senha é: " + this.senha);

        while (dtNascimento == null) {
            String dtNascimentO = JOptionPane.showInputDialog(null, "Digite a sua data de nascimento (dd/MM/yyyy");
            if (dtNascimento == null || dtNascimentO.isBlank()) {
                JOptionPane.showInputDialog(null, "Erro: Digite uma data válida", "Atenção!", JOptionPane.WARNING_MESSAGE);
                continue;
            }
            try {
                dataNascimento = LocalDate.parse(dtNascimentO.trim(), formatDtBr);
            } catch (DateTimeParseException erro) {
                JOptionPane.showMessageDialog(null, "Erro: Formato de data inválido. Use dd/MM/YYYY", "Atenção!", JOptionPane.WARNING_MESSAGE);
            }
        }
        this.dataNascimento = dataNascimento;

        public void imprimirUsuario() {
            int idade = LocalDate.now().getYear() - this.dataNascimento.getYear();
            String fichaCadastro = "Nome completo: " + this.nome +
                                   "\nData de nascimento: " + this.dataNascimento +
                                   "\nNome de usuário: " + this.nomeUsuario +
                                   "\nE-mail: "  + this.email +
                                   "\nSenha: " + this.senha;
            JOptionPane.showMessageDialog(null, fichaCadastro,"Ficha de Cadastro", JOptionPane.INFORMATION_MESSAGE);
            }
                    
        }

    }
}


