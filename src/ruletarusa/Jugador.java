package ruletarusa;

/**
 *
 * @author sosaj
 */
public class Jugador {

    private final int id;
    private final String nombre;
    private boolean vivo;

    public Jugador(int id) {
        
        this.id = id;
        this.nombre = "Jugador " + id;
        this.vivo = true;
        
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    
    public void disparar(Revolver r){
        
        boolean disparo = r.disparar();
        
        if(disparo){
            
            System.out.println(r);
            setVivo(false);
            
        }else{
            
            System.out.println(r);
            r.siguienteBala();
            
        }
       
    }

    public String getNombre() {
        return nombre;
    }
    
}
