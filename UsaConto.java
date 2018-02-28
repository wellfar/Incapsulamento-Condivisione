public class UsaConto 
{
    public static void main(String[] args) 
    {
       // crea un nuovo conto corrente inizializzato con 1000 euro
       ContoCorrente cc = new ContoCorrente(1000,10001); 
       
       // versa 700 euro
       cc.versa(700);
       
       // fa un po’ di prelievi, controllando prima il saldo
       //if (cc.saldo>200) cc.preleva(200); if (cc.saldo>900) cc.preleva(900);
       // saldo non è accessibile perchè private,quindi lascio i controlli sulla 
       // positività del saldo al metodo preleva della classe ContoCorrente
       
       cc.preleva(200); 
       cc.preleva(900);
       //saldo non è accessibile da cc.saldo perchè private, quindi utilizzo il metodo 
       //ottieniSaldo() che in sola lettura stampa il saldo finale
       //System.out.println("Saldo finale: " + cc.saldo);
       System.out.println("Saldo finale: " + cc.ottieniSaldo());
       /*Il metodo che abbiamo aggiunto ottieniSaldo() consente di accedere 
        * al saldo solo “in lettura”. In questo modo il valore del saldo è sempre 
        * sotto controllo dei metodi Highlight: la proprietà per cui i dati
        * che rappresentano lo stato interno di un oggetto possono essere 
        * accessibili solo tramite i metodi dell’oggetto stesso è detta 
        * INCAPSULAMENTO. Esso consente di gestire un oggetto 
        * come una “scatola nera” (black box). 
        * Dall’esterno si sa cosa fa un oggetto, ma non come lo fa...
       */
    }
}
