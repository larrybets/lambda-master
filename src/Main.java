import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by larryandre on 12/12/2016.
 */
public class Main {

    public static void main(String[] args) {
        ITallaString y1 = (str) -> {
            return str.charAt(1) + "" + str.charAt(2) + "" + str.charAt(3);
        };
        System.out.println(y1.tallaString("Prueba"));
        IsumaNumero y2 = (n1, n2) -> {
            return n1 + n2;
        };
        System.out.println(y2.sumaNumero(1, 2));

        IreadNumero y3 =
                () -> {
                    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
                    int numero = 0;
                    boolean fallo = false;
                    do {
                        try {
                            System.out.println("num");
                            numero = Integer.parseInt(buffer.readLine());
                            fallo = false;
                        } catch (IOException e) {
                            fallo = true;
                        } catch (NumberFormatException ne) {
                            System.out.println("e");
                            fallo = true;
                        }
                    } while (fallo);
                    return numero;
                };

        System.out.println(y3.readNumero());
    }
}


