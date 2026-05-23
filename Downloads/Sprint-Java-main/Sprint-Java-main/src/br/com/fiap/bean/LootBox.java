package br.com.fiap.bean;

import java.util.Random;
import java.util.Scanner;

public class LootBox extends Itens {
    private int preco;
    Recompensas recompensa;

    public LootBox() {
    }

    public LootBox(String raridade, float valor, float id, String nomeItem, int preco) {
        super(raridade, valor, id, nomeItem);
        this.preco = preco;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String comprarLootbox(int saldo) {
        if (saldo >= 100){
            return "Válido";
        } else {
            return "Inválido";
        }
    }

    public String abrirLootBox() {
        Random aleatorio = new Random();
        int resultado = aleatorio.nextInt(100);

        if (resultado < 51) {
            return "Incomum";

        } else if (resultado < 80) {
            return "Épico";

        } else if (resultado < 98) {
            return "Lendário";

        } else {
            return "Mítico";
        }
    }
}


