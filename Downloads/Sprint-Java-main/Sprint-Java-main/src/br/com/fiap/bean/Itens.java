package br.com.fiap.bean;

public class Itens implements Exibir{
    private String raridade;
    private float valor;
    private float id;
    private String nomeItem;

    public Itens() {
    }


    public Itens(String raridade, float valor, float id, String nomeItem) {
        this.raridade = raridade;
        this.valor = valor;
        this.id = id;
        this.nomeItem = nomeItem;
    }

    public String getRaridade() {
        return raridade;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }
    public void exibirDetalhes() {
        System.out.println("Cupom de :"+getNomeItem());
        System.out.println("Raridade do item: "+ getRaridade());


    }
}