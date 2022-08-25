package br.edu.infnet.applocacaoequipamento.model.exception;

public class LocacaoSemEquipamentoException extends Exception{

    private static final long serialVersionUID = 1L;

    public LocacaoSemEquipamentoException(String mensagem){
        super(mensagem);
    }
}
