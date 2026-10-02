public class SolicitacaoTroca{
    // 1. Atributos (as informações que a classe guarda)
    private String clienteId;
    private String produtoId;
    private String estado; //quebrado,rasgado ou não funciona.
    private String destino; //ong,estoque,descarte

    // 2. Construtor (o método especial chamado quando criamos uma nova solicitação)
    public SolicitacaoTroca(String clienteId, String produtoId, String estado){
        this.clienteId = clienteId;
        this.produtoId = produtoId;
        this.estado = estado;
        this.destino = "EM_ANALISE";// Todo produto começa em análise

        // 3. Getters e Setters (métodos para ler e alterar as informações de forma segura)
        public String getEstado{
            return.this.estado;
        }

        public String getDestino{
            return this.destino;
        }

        public void setDestino(String novoDestino) {
            this.destino = novoDestino;
        }

        public String getClienteId(){
            return this.clienteId;
        }

        public String getprodutoId(){
            return this.produtoId;
        }
    }

    public class SistemaTriagem{
    
    // Método que executa a regra de negócio
    public void processarDevolucao(SolicitacaoTroca solicitacao) {
        String estadoAtual = solicitacao.getEstado();

        // Estrutura de decisão (if / else if / else)
        if (estadoAtual.equalsIgnoreCase("Perfeito")){
            solicitacao.setDestino("Estoque");
        } else if (estadoAtual.equalsIgnoreCase("Pequeno_defeito")){
            solicitacao.setDestino("Doacao_ong");
        } else if (estadoAtual.equalsIgnoreCase("Defeito_Critico")){
            solicitacao.setDestino("Reparo");
        }else {
            solicitacao.setDestino("Descarte");
        }

        // Mostra o resultado na tela
        System.out.println("Processando devolução do cliente: ") + solicitacao.getClienteId()
        System.out.println("Produto: " + solicitacao.getProdutoId());
        System.out.println("Estado informado: " + solicitacao.getEstado());
        System.out.println("Destino atribuído: " + solicitacao.getDestino());
        System.out.println("-----------------------------");
    }

}