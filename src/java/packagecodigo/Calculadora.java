/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagecodigo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "calculadora")
@RequestScoped
/**
 *
 * @author Calza
 */
public class Calculadora {

    String valor1, valor2, resultado;

    public String somar() {
        Double valor = (Double.parseDouble(valor1)) + (Double.parseDouble(valor2));
        resultado = Double.toString(valor);
        this.setResultado(resultado);
        return resultado;
    }

    public String subtrair() {
        Double valor = (Double.parseDouble(valor1)) - (Double.parseDouble(valor2));
        resultado = Double.toString(valor);
        this.setResultado(resultado);
        return resultado;
    }

    public String dividir() {
        Double valor = (Double.parseDouble(valor1)) / (Double.parseDouble(valor2));
        resultado = Double.toString(valor);
        this.setResultado(resultado);
        return resultado;
    }

    public void limpar() {
        this.setResultado("");
        this.setValor1("");
        this.setValor2("");

    }

    public String getValor1() {
        return valor1;
    }

    public void setValor1(String valor1) {
        this.valor1 = valor1;
    }

    public String getValor2() {
        return valor2;
    }

    public void setValor2(String valor2) {
        this.valor2 = valor2;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

}
