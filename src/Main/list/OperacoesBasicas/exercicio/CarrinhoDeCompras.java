package Main.list.OperacoesBasicas.exercicio;


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

    /*
    MAIS EFICIENTE - NAO FOI EU Q FIZ

    public double calcularValorTotal() {
    double valorTotal = 0d;
    if (!itemList.isEmpty()) {
        for (Item item : itemList) {
            double valorItem = item.getPreco() * item.getQuant();
            valorTotal += valorItem;
        }
        return valorTotal;
    } else {
        throw new RuntimeException("A lista está vazia!");
    }
}
     */
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
