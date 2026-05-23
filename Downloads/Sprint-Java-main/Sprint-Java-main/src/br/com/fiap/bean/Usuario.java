package br.com.fiap.bean;

import java.sql.SQLOutput;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Usuario implements Exibir{
    private String nickName;
    private String email;
    private String senha;
    private LocalDate dataCadastro;
    private int saldoPontos;

    public Usuario() {
    }

    public Usuario(String nickName, String email, String senha, LocalDate dataCadastro) throws Exception {
        setNickName(nickName);
        setEmail(email);
        setSenha(senha);
        setDataCadastro(dataCadastro);
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        if (email.endsWith("@gmail.com")){
            this.email = email;
        } else {
            throw new Exception("Email incorreto - Digite formato válido \n'seuemail@gmail.com'");
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws Exception {
        if (senha.length() > 0){
            this.senha = senha;
        } else {
            throw new Exception("Senha incorreta - Digite pelo menos algum caracter");
        }
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getSaldoPontos() {
        return saldoPontos;
    }

    public void setSaldoPontos(int saldoPontos) {
        this.saldoPontos = saldoPontos;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) throws Exception {
        if (nickName.length() == 0){
            throw new Exception("Nome incorreto - Digite pelo menos um caracter");
        } else {
            this.nickName = nickName;
        }
    }

    public void realizarAcaoSustentavel(String escolha) {
        System.out.println("\n--- REGISTRANDO AÇÃO SUSTENTÁVEL ---");

        switch (escolha) {
            case "1":
                System.out.println("Descarte correto de lixo eletrônico realizado!");
                this.saldoPontos += 100; // Acumula os pontos
                System.out.println("+100 pontos adicionados ao seu saldo.");
                System.out.println("---------------------------------");
                break;

            case "2":
                System.out.println("Reciclagem de garrafas PET e latinhas realizada!");
                this.saldoPontos += 50;
                System.out.println("+50 pontos adicionados ao seu saldo.");
                System.out.println("---------------------------------");
                break;

            case "3":
                System.out.println("Opção por transporte público ou bike hoje!");
                this.saldoPontos += 30;
                System.out.println("+30 pontos adicionados ao seu saldo.");
                System.out.println("---------------------------------");
                break;

            default:
                System.out.println("Opção de ação inválida.");
                System.out.println("---------------------------------");
                break;
        }
        System.out.println("Saldo atual: " + this.saldoPontos + " pontos.");
    }


    @Override
    public void exibirDetalhes() {
        System.out.println("------- BEM VINDO! -------");
        System.out.println("Nickname: " + this.nickName);
        System.out.println("Email: " + this.email);
        System.out.println("Saldo atual: " + this.saldoPontos);
        System.out.println("Data de criação: " + this.dataCadastro);
        System.out.println("--------------------------");
    }
}
