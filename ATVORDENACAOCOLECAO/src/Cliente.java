
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<Conta>();
       

           Conta conta1 = new Conta (221004,"Pedro Yuri",9850.0, 600 );
           Conta conta2 = new Conta (110606,"Pietra Yanne",5500.0, 220 );
           Conta conta3 = new Conta (290175,"Shirleide",15000.0, 900 );
            contas.add(conta1);
            contas.add(conta2);
            contas.add(conta3);
            
        Collections.sort(contas, Comparator.comparingInt(Conta::getNumero));
        System.out.println("Seguintes contas ordenadas por número:");
        for (Conta conta : contas) {
            System.out.println("Número: " + conta.getNumero() + ", Titular: " + conta.getTitular());
        }
        
        Collections.sort(contas, Comparator.comparing(Conta::getTitular));
        System.out.println("Seguintes contas ordenadas por nome do titular:");
        for (Conta conta : contas) {
            System.out.println("Titular: "+ conta.getTitular() + " Número: " + conta.getNumero());
        }
         
    }
}