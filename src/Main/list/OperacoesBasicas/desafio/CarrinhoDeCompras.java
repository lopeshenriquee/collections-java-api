package Main.list.OperacoesBasicas.desafio;


import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();

        for (Item i : carrinho) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }
        carrinho.removeAll(itensParaRemover);
    }

    public void valorTotal() {
        if (!carrinho.isEmpty()) {
            List<Double> valores = new ArrayList<>();
            double soma = 0;

            for (Item i : carrinho) {
                if (i.getQuantidade() > 0 && i.getPreco() > 0) {
                    double valor = i.getQuantidade() * i.getPreco();
                    valores.add(valor);
                }
            }

            for (Double d : valores) {
                soma += d;
            }
            System.out.println("Subtotal do Carrinho: R$" + soma);
        } else{
            System.out.println("Não há itens no carrinho");
        }
    }


    public void exibirItens() {
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Tenis", 200, 2);
        carrinho.adicionarItem("Blusa", 350, 1);
        carrinho.exibirItens();
        carrinho.valorTotal();
    }
}
