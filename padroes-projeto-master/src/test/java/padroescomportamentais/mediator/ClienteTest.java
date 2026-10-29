package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveElogiarLogistica() {
        Cliente cliente = new Cliente();
        assertEquals("A Central SAC agradece seu contato.\nA Logística respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Logística agradece a mensagem: Entrega muito rápida",
                cliente.elogiarLogistica("Entrega muito rápida"));
    }

    @Test
    void deveReclamarLogistica() {
        Cliente cliente = new Cliente();
        assertEquals("A Central SAC agradece seu contato.\nA Logística respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Logística vai procurar melhorar o serviço da reclamação: Pedido chegou atrasado",
                cliente.reclamarLogistica("Pedido chegou atrasado"));
    }

    @Test
    void deveSugerirLogistica() {
        Cliente cliente = new Cliente();
        assertEquals("A Central SAC agradece seu contato.\nA Logística respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Logística vai analisar a sugestão: Oferecer rastreamento em tempo real",
                cliente.sugerirLogistica("Oferecer rastreamento em tempo real"));
    }

}