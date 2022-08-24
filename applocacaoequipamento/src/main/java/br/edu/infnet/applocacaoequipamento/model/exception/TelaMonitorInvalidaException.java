package br.edu.infnet.applocacaoequipamento.model.exception;

public class TelaMonitorInvalidaException extends Exception{

    private static final long serialVersionUID = 1L;

    public TelaMonitorInvalidaException(String mensagem){
        super(mensagem);
    }
}
