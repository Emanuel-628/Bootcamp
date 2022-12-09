
package java_e003_generala;

public class Generala {
    String jugada (String dados) {
        if (dados.equals("11111")) {
            return "GENERALA";
        }
        return "NADA";
    }
    public static void main (String [] args) {
        Generala g = new Generala();
        System.out.println(g.jugada("11111"));
        //aiudaaaa
        
    }
}
