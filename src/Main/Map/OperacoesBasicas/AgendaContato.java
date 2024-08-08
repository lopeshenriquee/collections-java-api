package Main.Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContato() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }



    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.adicionarContato("Henrique", 123456);
        agendaContato.adicionarContato("Henrique Santana", 125555);
        agendaContato.adicionarContato("Camila Santos", 1111111);
        agendaContato.adicionarContato("Gabriel", 656214);
        agendaContato.adicionarContato("Camila", 444444);

        agendaContato.exibirContato();

        agendaContato.removerContato("Gabriel");
        agendaContato.exibirContato();

        System.out.println("O código é: " + agendaContato.pesquisarPorNome("Henrique Santana"));
    }
}
