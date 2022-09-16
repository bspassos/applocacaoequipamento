package br.edu.infnet.applocacaoequipamento.model.service;

import br.edu.infnet.applocacaoequipamento.model.domain.Equipamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EquipamentoService {

    @Autowired
    private DesktopService desktopService;
    @Autowired
    private MonitorService monitorService;
    @Autowired
    private ImpressoraService impressoraService;

    public List<Equipamento> obterLista(){

        List<Equipamento> equipamentos = new ArrayList<Equipamento>();

        equipamentos.addAll(desktopService.obterLista());
        equipamentos.addAll(monitorService.obterLista());
        equipamentos.addAll(impressoraService.obterLista());

        return equipamentos;
    }

}
