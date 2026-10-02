public class Main{
    public static void main(String[] args) {
        //Criando a ferramenta de triagem
        SistemaTriagem triagem = new SistemaTriagem();

        //Simulação 1: Cliente devolve produto sem defeito
        SolicitacaoTroca troca1 = new SolicitacaoTroca ("CLI-001", "PROD-100", "Perfeito");
        triagem.processarDevolucao(troca1);

        //Simulação 2: Cliente devolve produto com pequeno arranhão (paraa ONG)
        SolicitacaoTroca troca2 = new SolicitacaoTroca ("CLT-002", "PROD-200", "Pequeno arranhado");
        triagem.processarDevolucao(troca2);
    }
        }
}