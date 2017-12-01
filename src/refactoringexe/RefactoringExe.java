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

     * Altri numeri magici. Ce sono 0.1,0.5, 0.7?
     * 
     * BUG OSCURO?
     * 
     * RISOLTO (tramite Riscrittura)
     * Illeggibile. Richiede tempo.
     * Nomi oscuri. Che sono? A che serve questa classe
     * Numeri magici. Che sono 1,2,3,4
     * Ripetizione: vedete codice ripetuto??
     */

  private static double prezzoFinale(double prezzo,double sconto,double scoCli){
        prezzo = (prezzo - (scoCli * prezzo));
        prezzo = prezzo - (sconto*prezzo); 
      return prezzo;
  }
    
  public double applicaSconto(double prezzo, double tipoCliente, double anni)
  {
        /** assolutamente migliorabile, vedremo come **/
        final int NONREGISTRATO = 1;
        final int STANDARD = 2;
        final int BRONZO = 3;
        final int ARGENTO = 4;
      
           
    double prezzoScontato = 0;
    double sco = (anni > 5) ? (double)5/100 : (double)anni/100; 
    if (tipoCliente == NONREGISTRATO)
    {
      prezzoScontato = prezzo;
    }
    else if (tipoCliente == STANDARD)
    {
      prezzoScontato = prezzoFinale(prezzo,sco,0.1);
    }
    else if (tipoCliente == BRONZO)
    {
      prezzoScontato = prezzoFinale(prezzo,sco,0.3);
    }
    else if (tipoCliente == ARGENTO)
    {
      prezzoScontato = prezzoFinale(prezzo,sco,0.5);;
    }
    return prezzoScontato;
  }

    
}
