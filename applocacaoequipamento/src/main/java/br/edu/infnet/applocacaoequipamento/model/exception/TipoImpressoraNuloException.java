package br.edu.infnet.applocacaoequipamento.model.exception;

public class TipoImpressoraNuloException extends Exception{

    private static final long serialVersionUID = 1L;

    public TipoImpressoraNuloException(String mensagem){
        super(mensagem);
    }
}
