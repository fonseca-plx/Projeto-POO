package entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Prato> pratos;

    public Menu() {
        this.pratos = new ArrayList<>();
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public void adicionarPrato(Prato prato) {
        pratos.add(prato);
        System.out.println("\nPrato adicionado ao menu: " + prato.getNome());
    }

    public void excluirPrato(Prato prato) {
        pratos.remove(prato);
        System.out.printf("%nO prato %s foi removido do Menu.%n", prato.getNome());
    }

    public void atualizarDisponibilidade(Estoque estoque) {
        for (Prato prato : pratos) {
            prato.atualizarStatus(estoque);
        }
    }

    // lista apenas os pratos disponíveis
    public List<Prato> getPratosDisponiveis() {
        List<Prato> pratosDisponiveis = new ArrayList<>();
        for (Prato prato : pratos) {
            if (prato.isDisponivel()) {
                pratosDisponiveis.add(prato);
            }
        }
        return pratosDisponiveis;
    }

    public void consultarMenu() {
        if (pratos.isEmpty()) {
            System.out.println("O menu está vazio.");
        } else {
            System.out.println("Menu do Restaurante:\n");
            for (Prato prato : getPratosDisponiveis()) {
                System.out.println("--------------------------------------------------------------");
                prato.consultar();
            }
            System.out.println("--------------------------------------------------------------");
        }
    }

    // Buscar um prato pelo ID
    public Prato buscarPratoPorId(int id) {
        for (Prato prato : pratos) {
            if (prato.getId() == id && prato.isDisponivel()) {
                return prato;
            }
        }
        return null;
    }
}
