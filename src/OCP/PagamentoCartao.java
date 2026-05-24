package OCP;

public class PagamentoCartao implements FormaPagamento {
    // Pagamento por cartão implementando a interface
    @Override
    public void pagar(double valor) {
        System.out.println("Validando cartão para pagamento de R$ " + valor + "...");
        System.out.println("Pagamento finalizado via cartão.");
    }
}
