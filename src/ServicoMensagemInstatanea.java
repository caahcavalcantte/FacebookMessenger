public class ServicoMensagemInstatanea {
 
    public void enviarMensagem(){
      //primeiro validar se esta conectado a intenet
      validarConectadoInternet();
      System.out.println("Enviando mensagem");
      //depois de enviada, salvar o histórico da mensagem
      salvarHistoricoMensagem();
    }

    public void receberMensagem(){
      System.out.println("Recebendo mensagem");
    }
    // métodos privados, visíveis somente clase
    private void validarConectadoInternet(){
      System.out.println("Validando se está conectado a intenet");
    }
    private void salvarHistoricoMensagem(){
      System.out.println("Salvando o histórico da mensagem");
    }
  
}
