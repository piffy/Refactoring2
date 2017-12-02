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


     * 
     * BUG OSCURO?
     * 
     * RISOLTO (tramite Search/Replace)
     * Illeggibile. Richiede tempo.
     * Nomi oscuri. Che sono? A che serve questa classe
     * Numeri magici. Che sono 1,2,3,4
     * Ripetizione: vedete codice ripetuto??
     * Altri numeri magici. Ce sono 0.1,0.5, 0.7?
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
      
        final int MASSIMO_SCONTO_LEALTA = 5;
        final double SCONTO_STANDARD = 0.1;
        final double SCONTO_BRONZO = 0.3;
        final double SCONTO_ARGENTO = 0.5;
           
    double prezzoScontato = 0;
    double sco = (anni > MASSIMO_SCONTO_LEALTA) ? (double)MASSIMO_SCONTO_LEALTA/100 : (double)anni/100; 
    if (tipoCliente == NONREGISTRATO)
    {
      prezzoScontato = prezzo;
    }
    else if (tipoCliente == STANDARD)
    {
      prezzoScontato = prezzoFinale(prezzo,sco,SCONTO_STANDARD);
    }
    else if (tipoCliente == BRONZO)
    {
      prezzoScontato = prezzoFinale(prezzo,sco,SCONTO_BRONZO);
    }
    else if (tipoCliente == ARGENTO)
    {
      prezzoScontato = prezzoFinale(prezzo,sco,SCONTO_ARGENTO);
    }
    return prezzoScontato;
  }

    
}
