package LSP;

    // As subclasses podem ser utilizadas no lugar da classe Produto
    // sem causar erros no funcionamento do sistema

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> cardapio = Arrays.asList(
                new Pizza("Pizza quatro queijos", 52.00, "Grande"),
                new Hamburguer("X-Salada", 24.90, true),
                new Bebida("Suco de laranja", 9.50, true)
        );

        for (Produto produto : cardapio) {
            produto.exibirDetalhes();
        }
    }
}
