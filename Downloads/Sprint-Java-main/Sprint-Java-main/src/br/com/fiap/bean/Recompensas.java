package br.com.fiap.bean;

public class Recompensas extends  Itens{
    private String descricao;
    private float pontosNecessarios;

    public Recompensas() {
    }

    public Recompensas(String raridade, float valor, float id, String nomeItem, String descricao, float pontosNecessarios) {
        super(raridade, valor, id, nomeItem);
        this.descricao = descricao;
        this.pontosNecessarios = pontosNecessarios;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPontosNecessarios() {
        return pontosNecessarios;
    }

    public void setPontosNecessarios(float pontosNecessarios) {
        this.pontosNecessarios = pontosNecessarios;
    }

    public void definirPremioPorRaridade(String raridadeSorteada) {

        this.setRaridade(raridadeSorteada);

        switch (raridadeSorteada) {
            case "Incomum":
                this.setNomeItem("Cupom de Desconto de Padaria");
                break;

            case "Épico":
                this.setNomeItem("Skin de Espada de Bronze");
                break;

            case "Lendário":
                this.setNomeItem("Gema de Diamante");
                break;

            case "Mítico":
                this.setNomeItem("Pudim Lendário Divino");
                break;
        }
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=================================");
        System.out.println("🎉 PARABÉNS! VOCÊ RESGATOU: 🎉");

        System.out.println("Item: " + getNomeItem());
        System.out.println("Raridade: " + getRaridade());
        System.out.println("=================================");
    }
}


