package org.compi2.codigo3d.parser;

/**
 *
 * @author esvux
 */
public class ControlC3D {
    
    private static int temp = 0;
    private static int numEtiqueta=1;

    public ControlC3D() {
    }
    private static String c3d = ""; 
    
    /**
     * Reinicia las variables estáticas relacionadas con la generación del
     * código de tres direcciones.
     */
    public static void reiniciar(){
        temp = 0;
        numEtiqueta=1;
        c3d = "";
    }
    
    /**
     * Genera el siguiente temporal.
     * @return El siguiente temporal (t$#)
     */
    public static String generaTemp(){
        return "t$"+temp++;
    }
    
    public static String generarLabel(){
        return "L"+numEtiqueta++;
    }
    
    /**
     * Agrega la sentencia que recibe como parámetro a la cadena de código
     * de tres direcciones que se va generando hasta ese momento.
     * @param sentencia Código 3D a agregar
     */
    public static void agregarC3D(String sentencia){
        c3d += sentencia;
    }
    
    /**
     *Agrega la sentencia relacional y
     *sus respectivas etiquetas tanto 
     *verdaderas como falsas
     * @param sentencia
     * @param verdadero
     * @param falso
     */
    public static void agregarLogica(String sentencia,String verdadero,String falso){
        c3d+= sentencia+"\n"+verdadero + ": (True)\n" +falso+": (False)\n";
    }
    
    /**
     * Devuelve el código 3D generao hasta el momento de su invocación.
     * @return Código 3D generado
     */
    public static String getC3D(){
        return c3d;
    }
    
}
