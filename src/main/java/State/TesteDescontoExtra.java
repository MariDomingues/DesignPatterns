package State;

import Basico.OrcamentoVO;

public class TesteDescontoExtra {
    
    public static void main(String[] args) {
        OrcamentoVO reforma = new OrcamentoVO(500);
        reforma.aplicaDescontoExtra();
        System.out.println(reforma.getValor());
        
        reforma.aprovsr();
        reforma.aplicaDescontoExtra();
        System.out.println(reforma.getValor());
        
        reforma.finalizar();
        reforma.aplicaDescontoExtra();
        System.out.println(reforma.getValor());
    }
}
