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
     */

  public double Calcola(double quantità, double tipo, double anni)
  {
    double ris = 0;
    double sco = (anni > 5) ? (double)5/100 : (double)anni/100; 
    if (tipo == 1)
    {
      ris = quantità;
    }
    else if (tipo == 2)
    {
      ris = (quantità - (0.1 * quantità)) - sco * (quantità - (0.1 * quantità));
    }
    else if (tipo == 3)
    {
      ris = (0.7 * quantità) - sco * (0.7 * quantità);
    }
    else if (tipo == 4)
    {
      ris = (quantità - (0.5 * quantità)) - sco * (quantità - (0.5 * quantità));
    }
    return ris;
  }

    
}
