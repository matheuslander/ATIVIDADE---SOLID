package ISP;

public class Motoboy implements GerenciadorEntregas {
    // Motoboy usa apenas funções relacionadas à entrega
    @Override
    public void iniciarEntrega() {
        System.out.println("Motoboy: entrega iniciada.");
    }

    @Override
    public void finalizarEntrega() {
        System.out.println("Motoboy: entrega finalizada.");
    }
}
