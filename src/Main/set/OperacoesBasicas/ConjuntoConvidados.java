package Main.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados.");
        conjuntoConvidados.adicionarConvidado("Convidado 1", 1);
        conjuntoConvidados.adicionarConvidado("Convidado 1", 2);
        conjuntoConvidados.adicionarConvidado("Convidado 1", 3);
        conjuntoConvidados.adicionarConvidado("Convidado 1", 4);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados.");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(2);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados.");

        conjuntoConvidados.exibirConvidados();


    }

}
