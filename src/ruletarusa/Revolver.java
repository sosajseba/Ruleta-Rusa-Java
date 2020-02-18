package ruletarusa;

/**
 *
 * @author sosaj
 */
public class Revolver {

    private int posicionActual;
    private int posicionBala;

    public boolean disparar(){
        
        return posicionActual == posicionBala;
        
    }
    
    public int siguienteBala() {
        
        if (posicionActual == 6) {
            
            setPosicionActual(1);
            
            return posicionActual;
            
        }
        
        return posicionActual += 1;
        
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionBala() {
        return posicionBala;
    }

    public void setPosicionBala(int posicionBala) {
        this.posicionBala = posicionBala;
    }

    public Revolver() {
        
        this.posicionActual = 1;
        
    }
    
    public void girarTambor(){
        
        this.posicionBala = (int)(Math.random()*(6-1+1)+1);
        
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionBala=" + posicionBala + '}';
    }

}
