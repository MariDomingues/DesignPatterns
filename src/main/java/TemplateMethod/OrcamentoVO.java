package TemplateMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrcamentoVO {

    private final double valor;
    private final List<Item> vItem;

    public OrcamentoVO(double i_valor) {
        this.valor = i_valor;
        vItem = new ArrayList<>();;
    }

    public double getValor() {
        return valor;
    }

    public List<Item> getvItem() {
        //este item não será modificado pelos outros metodos
        return Collections.unmodifiableList(vItem);
    }
    
    public void adicionarItem(Item i_oItem) {
        vItem.add(i_oItem);
    }
}
