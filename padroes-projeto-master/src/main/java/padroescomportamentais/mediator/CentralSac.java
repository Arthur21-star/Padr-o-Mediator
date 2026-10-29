package padroescomportamentais.mediator;

public class CentralSac {

    private static CentralSac instancia = new CentralSac();

    private CentralSac() {}

    public static CentralSac getInstancia() {
        return instancia;
    }

    public String receberElogioLogistica(String mensagem) {
        return "A Central SAC agradece seu contato.\n" +
                "A Logística respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Logistica.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoLogistica(String mensagem) {
        return "A Central SAC agradece seu contato.\n" +
                "A Logística respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Logistica.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoLogistica(String mensagem) {
        return "A Central SAC agradece seu contato.\n" +
                "A Logística respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Logistica.getInstancia().receberSugestao(mensagem);
    }

}