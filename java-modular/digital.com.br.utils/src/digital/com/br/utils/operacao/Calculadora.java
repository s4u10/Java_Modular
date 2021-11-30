package digital.com.br.utils.operacao;

import digital.com.br.utils.operacao.internal.DivHelper;
import digital.com.br.utils.operacao.internal.MultHeper;
import digital.com.br.utils.operacao.internal.SubHelper;
import digital.com.br.utils.operacao.internal.SumHelper;

public class Calculadora {

    private DivHelper divHelper;
    private MultHeper multHeper;
    private SubHelper subHelper;
    private SumHelper sumHelper;

    public Calculadora(){
        divHelper = new DivHelper();
        multHeper = new MultHeper();
        subHelper = new SubHelper();
        sumHelper = new SumHelper();
    }
    public int sum(int a, int b){
        return sumHelper.execute(a,b);
    }
    public int sub(int a, int b){
        return subHelper.execute(a,b);
    }
    public int mult(int a, int b){
        return multHeper.execute(a,b);
    }
    public int div(int a, int b){
        return divHelper.execute(a,b);
    }
}
