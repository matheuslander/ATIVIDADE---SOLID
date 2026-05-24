package OCP;

public class PagamentoPix implements FormaPagamento {
    // Pagamento por PIX implementando a interface
    @Override
    public void pagar(double valor) {
        System.out.println("Criando chave PIX para pagamento de R$ " + valor + "...");
        System.out.println("Pagamento via PIX confirmado.");
    }
}
