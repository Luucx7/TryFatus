/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.time.LocalDate;
import java.util.Date;
import static util.Format.decimal;

/**
 *
 * @author lukin
 */
public class JurosCalc {
    
    public static double Juros(double valor, double taxa, Date dataVencimento) {
        
        if (DateConvert.diferencaDias(DateConvert.LocalToUtil(LocalDate.now()), dataVencimento)<=15) { // Verifica se passou os dias para iniciar a cobrança
                                                                                                       // Converte a LocalDate para um formato utilizável antes de utilizar
                                                                                                       // Por fim, utiliza outro método para saber a diferença de dias
            return 0; // caso não, retorna 0
        } else {
            
            double juros = valor*(taxa/100)/30*DateConvert.diferencaDias(DateConvert.LocalToUtil(LocalDate.now()), dataVencimento);
            // Utiliza a fórmula J=C*I*T para calcular o juro
            // Valor, Taxa e dataVencimento são definido ao utilizar o método
            // juro é igual ao valor, vezes a taxa sobre 100 (para obter a porcentagem) sobre 30 (para a porcentagem ser cobrada de forma diária)
            // vezes a diferença de dias entre hoje e a data de vencimento
            
            return decimal(juros); // utiliza a classe format para retornar apenas dois decimais
        }
    }
}
