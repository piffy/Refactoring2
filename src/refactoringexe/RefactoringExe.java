/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoringexe;

/**
 *
 * @author piffy2
 */
public class RefactoringExe {

    /**
     * @param args the command line arguments
     * PROBLEMI: 

     * Numeri magici. Che sono 1,2,3,4
     * Altri numeri magici. Ce sono 0.1,0.5, 0.7?
     * Ripetizione: vedete codice ripetuto??
     * BUG OSCURO?
     * 
     * RISOLTO (tramite Refactor->Rename:
     * Illeggibile. Richiede tempo.
     * Nomi oscuri. Che sono? A che serve questa classe
     */

  public double applicaSconto(double prezzo, double tipoCliente, double anni)
  {
    double prezzoScontato = 0;
    double sco = (anni > 5) ? (double)5/100 : (double)anni/100; 
    if (tipoCliente == 1)
    {
      prezzoScontato = prezzo;
    }
    else if (tipoCliente == 2)
    {
      prezzoScontato = (prezzo - (0.1 * prezzo)) - sco * (prezzo - (0.1 * prezzo));
    }
    else if (tipoCliente == 3)
    {
      prezzoScontato = (0.7 * prezzo) - sco * (0.7 * prezzo);
    }
    else if (tipoCliente == 4)
    {
      prezzoScontato = (prezzo - (0.5 * prezzo)) - sco * (prezzo - (0.5 * prezzo));
    }
    return prezzoScontato;
  }

    
}
