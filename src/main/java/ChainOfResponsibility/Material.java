package ChainOfResponsibility;

public enum Material {
    
    CANETA(0, "Caneta", 250),
    LAPIS(1, "Lápis", 350),
    BORRACHA(2, "Borracha", 450);
    
    private int id;
    private String descricao;
    private double preco;

    private Material(int id, String descricao, double preco) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }
}
