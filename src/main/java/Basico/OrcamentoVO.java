package Basico;

import State.EmAprovacao;
import State.EstadoOrcamento;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrcamentoVO {

    private double valor;
    private final List<Item> vItem;

    protected EstadoOrcamento status;
    
    public OrcamentoVO(double i_valor) {
        this.valor = i_valor;
        vItem = new ArrayList<>();
        status = new EmAprovacao();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<Item> getvItem() {
        //este item não será modificado pelos outros metodos
        return Collections.unmodifiableList(vItem);
    }
    
    public void adicionarItem(Item i_oItem) {
        vItem.add(i_oItem);
    }

    public void aplicaDescontoExtra() {
        status.aplicaDescontoExtra(this);
    }

    public EstadoOrcamento getStatus() {
        return status;
    }

    public void setStatus(EstadoOrcamento status) {
        this.status = status;
    }
    
    public void aprovsr() {
        status.aprovsr(this);
    }

    public void reprovsr() {
        status.reprovsr(this);
    }

    public void finalizar() {
        status.finalizar(this);
     }
}
