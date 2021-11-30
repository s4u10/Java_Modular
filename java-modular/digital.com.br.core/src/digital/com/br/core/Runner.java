package digital.com.br.core;

import digital.com.br.utils.operacao.Calculadora;


public class Runner {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.div(15,3));
    }
}
