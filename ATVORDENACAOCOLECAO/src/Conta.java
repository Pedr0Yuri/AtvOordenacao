

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
public class Conta {
    private int numero;
    private String titular;
    private double saldo, limiteCredito;
 
    public Conta(int numero, String titular, double limiteCredito, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteCredito = limiteCredito;
       
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    public double getLimiteCredito() {
        return limiteCredito;
    }
    
}
    
