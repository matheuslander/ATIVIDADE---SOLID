package OCP;

public class PagamentoDinheiro implements FormaPagamento {
    // Pagamento em dinheiro implementando a interface
    @Override
    public void pagar(double valor) {
        System.out.println("Recebendo pagamento em dinheiro no valor de R$ " + valor + "...");
        System.out.println("Pagamento em dinheiro registrado.");
    }
}
