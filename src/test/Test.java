package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Test {
    
    public static void main(String[] args) {
        
    
    List miLista = new ArrayList();
    
    miLista.add("Lunes");
    miLista.add("Marte");
    miLista.add("Miercoles");
    miLista.add("Jueves");
    miLista.add("Viernes");
   
    
    for (Object elem: miLista){
            System.out.println("elem: " + elem);
}
    
    miLista.forEach(elem -> {
        System.out.println("elem: " + elem);
    });
        System.out.println("");
        
    Map miMap = new HashMap();
    miMap.put("Valor1", "Santiago");
    miMap.put("Valor2", "Javier");
    miMap.put("Valor3", "Lucia");
    
    String nombre  = (String)miMap.get("Valor1");
        System.out.println("Nombre: " + nombre);
   } 
}
