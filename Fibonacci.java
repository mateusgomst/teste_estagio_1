public class Fibonacci {

    public boolean VerificarNumEmFibonacci(int n){
        
        int primeiroTerm = 0; 
        int segundoTerm = 1; 
        
        if (n == primeiroTerm || n == segundoTerm) return true;
        if (n < 0) return false;
        
        while (segundoTerm < n) {
            int aux = segundoTerm;
            segundoTerm = primeiroTerm + segundoTerm; 
            primeiroTerm = aux;
        }
        
        return segundoTerm == n;
    }
}
