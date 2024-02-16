/**
 * Programa principal de prueba
 */
import es.uah.matcomp.ed.lineales.lista.simple.*;

public class main {
    public static void main(String[] s){
        ListaSimple l = new ListaSimple();

        l.add("Primer elemento", 1);
        l.add("Segundo elemento", 1);
        ElementoLS elemento = l.getElemento(1);
        System.out.println(elemento.getData());
        System.out.println("Datos detallados");
        System.out.println(elemento);
        l.add("entre el primero y el segundo",1);

    }
}
