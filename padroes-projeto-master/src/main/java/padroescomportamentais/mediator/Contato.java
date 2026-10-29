package padroescomportamentais.mediator;

public class Contato {

    public String elogiarLogistica(String mensagem) {
        return CentralSac.getInstancia().receberElogioLogistica(mensagem);
    }

    public String reclamarLogistica(String mensagem) {
        return CentralSac.getInstancia().receberReclamacaoLogistica(mensagem);
    }

    public String sugerirLogistica(String mensagem) {
        return CentralSac.getInstancia().receberSugestaoLogistica(mensagem);
    }

}
