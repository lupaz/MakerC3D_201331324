package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    private  String sentencia="";
    private  String verdadero="";
    private  String falso="";
    
    
    public NodoC3D(String cad) {
        this.cad = cad;
    }
    
    // sobrecarga de constructor para las operaciones logicas y rel (Corto Circuito)
    public NodoC3D(){ 
    }
    
    public String getCad(){
        return cad;
    }
    
    
    public void addLabelTrue(String label){
        verdadero+=","+label;
    }
    
    public void addLabelFalso(String label){
        falso+=","+label;
    }
    
    public void setSentencia(String Cuerpo){
       sentencia=Cuerpo;
    }
    
    public void setTrue(String lTrue){
        verdadero=lTrue;
    }
    
    public void setFalso(String lFalso){
        falso=lFalso;
    }
    
    public String getSentencia(){
        return sentencia;
    }
    
    public String getFalso(){
        return falso;
    }
    
    public String getTrue(){
        return verdadero;
    }
    
    
}
