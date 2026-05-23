package br.com.fiap.bean;

public class Inventario {
    private int idinvent;
    private int idUsuario;
    private int idItem;
    private String quantidade;
    private Usuario usuario;

    public Inventario() {
    }

    public Inventario(int idinvent, int idUsuario, int idItem, String qualidade) {
        this.idinvent = idinvent;
        this.idUsuario = idUsuario;
        this.idItem = idItem;
        this.quantidade = qualidade;
    }

    public int getIdinvent() {
        return idinvent;
    }

    public void setIdinvent(int idinvent) {
        this.idinvent = idinvent;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getQualidade() {
        return quantidade;
    }

    public void setQualidade(String qualidade) {
        this.quantidade = qualidade;
    }

        private int qtdLootBox = 0; // Começa com 0 caixas fechadas
        private Recompensas itemGanhado; // Guarda o prêmio DEPOIS que ele abrir


        public Inventario(Usuario usuario) {
            this.usuario = usuario;
        }

        public void guardarLootBox() {
            this.qtdLootBox++; // Aumenta o estoque de caixas
            System.out.println("📦 LootBox guardada com sucesso no seu inventário!");
            System.out.println("---------------------------------");
        }


        public void abrirCaixaDoInventario(LootBox caixaDoJogo) {
            if (this.qtdLootBox > 0) {
                this.qtdLootBox--; // Gasta uma caixa do estoque

                // Roda o sorteio usando a lógica que você já criou!
                String raridadeSorteada = caixaDoJogo.abrirLootBox();

                this.itemGanhado = new Recompensas();
                this.itemGanhado.definirPremioPorRaridade(raridadeSorteada);

                System.out.println("\n Você abriu uma caixa do seu inventário!");
                this.itemGanhado.exibirDetalhes(); // Roda o seu @Override estiloso!
            } else {
                System.out.println(" Você não tem nenhuma LootBox no inventário para abrir.");
            }
        }
    }

