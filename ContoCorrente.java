public class ContoCorrente 
{
    // variabile che memorizza lo stato del conto (non modificabile dall'esterno)
    private double saldo;
    // memorizza il numero del conto
    private int numero;
    
    // costruttore della classe
    // inizializza anche il numero del conto
    public ContoCorrente(double saldoIniziale, int numeroConto) 
    { 
        saldo = saldoIniziale;
        numero = numeroConto;
    }
    
    // metodo per il versamento di somme
    public void versa(double somma) 
    { 
        saldo += somma;
        System.out.println("Versati: " + somma + " euro");
    }
    // metodo per il prelievo di somme
    public boolean preleva(double somma) 
    { 
        if (saldo<somma) return false;
        else
        {
            saldo -= somma;
            System.out.println("Prelevati: " + somma + " euro"); 
            return true;
        }
    } 
    // restituisce il saldo a chi ne ha bisogno
    public double ottieniSaldo() 
    { 
        return saldo;
    }
    // fornisce il numero del conto
    public double ottieniNumero() 
    { 
        return numero; 
    }
} 



