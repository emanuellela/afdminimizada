package model;


public class Estado {
    private String estado;
    private int nEstado;

    public Estado(String estado) {
        this.estado = estado;
        estado = "q"+ nEstado;
       nEstado++; 
       }
    

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
 public String recebeSimbolo(char simbolo){
    return estado;
   
 }
     
 
    
    
}
