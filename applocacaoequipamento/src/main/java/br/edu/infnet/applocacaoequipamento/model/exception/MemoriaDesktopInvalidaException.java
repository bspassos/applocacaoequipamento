package br.edu.infnet.applocacaoequipamento.model.exception;

public class MemoriaDesktopInvalidaException extends Exception{

    private static final long serialVersionUID = 1L;

    public MemoriaDesktopInvalidaException(String mensagem){
        super(mensagem);
    }
}
