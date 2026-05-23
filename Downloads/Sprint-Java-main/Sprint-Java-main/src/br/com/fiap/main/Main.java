package br.com.fiap.main;

import br.com.fiap.bean.Inventario;
import br.com.fiap.bean.LootBox;
import br.com.fiap.bean.Usuario;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Usuario usuario = new Usuario();
        Inventario inventario = new Inventario();
        LootBox lootbox = new LootBox();

        String escolha = "";

        try {
            System.out.println("----- BEM-VINDO AO ECOPLAY! -----");
            System.out.println("REALIZE SEU CADASTRO");
            System.out.println("Digite seu nickname de usuário: ");
            usuario.setNickName(scan.nextLine());
            System.out.println("Digite seu email: ");
            usuario.setEmail(scan.nextLine());
            System.out.println("Digite a senha: ");
            usuario.setSenha(scan.nextLine());

            usuario.setDataCadastro(LocalDate.now());

            while(!escolha.equals("5")){
                System.out.println("SEJA BEM-VINDO, " + usuario.getNickName() + "!");
                System.out.println("[1] Registrar ação sustentável \n[2] Comprar lootbox \n[3] Ver seu perfil \n[4] Inventário \n[5] Sair do ECOPlay");
                escolha = scan.nextLine();

                if(escolha.equals("1")){
                    System.out.println("Qual ação sustentável você realizou? \n1 - Descarte correto de lixos eletrônicos (100 PTS)\n2 - Reciclagem de garrafas PET e latinhas (50 PTS)\n3 - Optei por transporte público ou bike hoje (30 PTS)");
                    escolha = scan.nextLine();
                    usuario.realizarAcaoSustentavel(escolha);
                } else if(escolha.equals("2")) {
                    if(lootbox.comprarLootbox(usuario.getSaldoPontos()).equals("Válido")){
                        inventario.guardarLootBox();
                    } else {
                        System.out.println("SALDO INVÁLIDO: Colete 100 pontos para comprar uma Lootbox");
                        System.out.println("---------------------------------");
                    }
                } else if(escolha.equals("3")){
                    usuario.exibirDetalhes();
                } else {
                    System.out.println("----- Opção não registrada -----");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
