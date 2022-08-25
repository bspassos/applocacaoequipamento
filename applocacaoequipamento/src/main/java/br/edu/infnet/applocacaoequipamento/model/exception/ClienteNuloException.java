package br.edu.infnet.applocacaoequipamento.model.exception;

public class ClienteNuloException extends Exception{

    private static final long serialVersionUID = 1L;

    public ClienteNuloException(String mensagem){
        super(mensagem);
    }
}
