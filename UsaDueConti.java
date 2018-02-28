public class UsaDueConti 
{
    public static void main(String[] args) 
    {
        // crea un nuovo conto corrente NUMERO 10001 inizializzato con 1000 euro
        ContoCorrente conto1 = new ContoCorrente(1000,10001);
        // crea un nuovo conto corrente 10002 inizializzato con 200 euro
        ContoCorrente conto2 = new ContoCorrente(200,10002); 
        // preleva 700 euro dal primo conto...
        conto1.preleva(700);
        // ...e li versa nel secondo
        conto2.versa(700);
        // ORA QUI POSSIAMO USARE IL NUMERO
        System.out.println("Conto: " + conto1.ottieniNumero());
        System.out.println("Saldo: " + conto1.ottieniSaldo());
        
        System.out.println("Conto: " + conto2.ottieniNumero());
        System.out.println("Saldo: " + conto2.ottieniSaldo());
    }
}