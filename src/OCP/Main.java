package OCP;

    // Para adicionar outra forma de pagamento, basta criar outra classe implementando FormaPagamento.

public class Main {
    public static void main(String[] args) {
        FormaPagamento cartao = new PagamentoCartao();
        FormaPagamento pix = new PagamentoPix();
        FormaPagamento dinheiro = new PagamentoDinheiro();

        cartao.pagar(120.00);
        System.out.println();
        pix.pagar(64.90);
        System.out.println();
        dinheiro.pagar(35.50);
    }
}
