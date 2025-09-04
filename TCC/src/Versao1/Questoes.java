package Versao1;

import javax.swing.JOptionPane;

public class Questoes {
    int nrQuestao = 0;
    String enunciado;

    public void setNrQuestao() {
        this.nrQuestao++;
    }

    public void Questao1() {
        setNrQuestao();
        String enunciado1 = "Crie um programa em Java que leia 2 números inteiros e os some.\n" +
                "Digite sua resposta em código:";
        this.enunciado = enunciado1;

        String respostaUsuario = JOptionPane.showInputDialog(null, enunciado1, "Questão " + nrQuestao, JOptionPane.QUESTION_MESSAGE);

        String resolucao = "Resolução:\n\n" +
                "\tScanner sc = new Scanner(System.in);\n" +
                "\tint a = sc.nextInt();\n" +
                "\tint b = sc.nextInt();\n" +
                "\tSystem.out.println(\"Soma: \" + (a + b));\n" +
                "\t...\n\n" +
                "Esse código lê dois números e imprime sua soma";

        JOptionPane.showMessageDialog(null, resolucao, "Resolução da Questão " + nrQuestao, JOptionPane.INFORMATION_MESSAGE);
    }


    public void Questao2() {
        setNrQuestao();
        enunciado = "Crie um programa que leia dois números e exiba o maior.";
        JOptionPane.showInputDialog(null, enunciado, "Questão " + nrQuestao, JOptionPane.QUESTION_MESSAGE);
    }

    public void Questao3() {
        setNrQuestao();
        enunciado = "Crie um programa que leia um número e diga se ele é par ou ímpar.";
        JOptionPane.showInputDialog(null, enunciado, "Questão " + nrQuestao, JOptionPane.QUESTION_MESSAGE);
    }

    public void Questao4() {
        setNrQuestao();
        enunciado = "Crie um programa que leia a idade de uma pessoa e diga se ela é maior de idade.";
        JOptionPane.showInputDialog(null, enunciado, "Questão " + nrQuestao, JOptionPane.QUESTION_MESSAGE);
    }

    public void Questao5() {
        setNrQuestao();
        enunciado = "Crie um programa que leia um número e exiba sua tabuada de 1 a 10.";
        JOptionPane.showInputDialog(null, enunciado, "Questão " + nrQuestao, JOptionPane.QUESTION_MESSAGE);
    }

    public void Questao6() {
        setNrQuestao();
        enunciado = "Crie um programa que leia 5 números e exiba a média.";
        JOptionPane.showInputDialog(null, enunciado, "Questão " + nrQuestao, JOptionPane.QUESTION_MESSAGE);
    }

    public void Questao7() {
        setNrQuestao();
        enunciado = "Crie um programa que leia uma palavra e diga quantas vogais ela possui.";
        JOptionPane.showInputDialog(null, enunciado, "Questão " + nrQuestao, JOptionPane.QUESTION_MESSAGE);
    }

    public void Questao8() {
        setNrQuestao();
        enunciado = "Crie uma classe chamada Pessoa com atributos nome e idade. Instancie um objeto e exiba seus dados.";
        JOptionPane.showInputDialog(null, enunciado, "Questão " + nrQuestao, JOptionPane.QUESTION_MESSAGE);
    }

    public void Questao9() {
        setNrQuestao();
        enunciado = "Crie um programa que leia uma lista de nomes e exiba-os em ordem alfabética.";
        JOptionPane.showInputDialog(null, enunciado, "Questão " + nrQuestao, JOptionPane.QUESTION_MESSAGE);
    }

    public void Questao10() {
        setNrQuestao();
        enunciado = "Crie um programa que leia uma matriz 3x3 e exiba a soma dos elementos da diagonal principal.";
        JOptionPane.showInputDialog(null, enunciado, "Questão " + nrQuestao, JOptionPane.QUESTION_MESSAGE);
    }

    public static void main(String[] args) { // teste
        Questoes q = new Questoes();
        q.Questao1();
        q.Questao2();
        q.Questao3();
        q.Questao4();
        q.Questao5();
        q.Questao6();
        q.Questao7();
        q.Questao8();
        q.Questao9();
        q.Questao10();
    }
}
