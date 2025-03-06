package entities;

// Classe auxiliar entre a classe Prato e a classe Ingrediente
public class IngredienteQuantidade {

    private Ingrediente ingrediente;
    private double quantidade; // quantidade desse ingrediente para um determinado prato ou para o estoque

    public IngredienteQuantidade(Ingrediente ingrediente, double quantidade) {
        this.ingrediente = ingrediente;
        this.quantidade = quantidade;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public double getQuantidade() {
        return quantidade;
    }

    // incrementar a quantidade de um ingrediente no estoque ou em um prato
    public void atualizarQuantidade(double quantidade) {
        this.quantidade += quantidade;
    }
}
