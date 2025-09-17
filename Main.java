import java.io.BufferedReader;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        Cliente miCliente = new Cliente("Javier",
                "Mora Sánchez",
                "108094565",
                'm',
                "Costa Rica");

        Subscripcion primeraSubscripcion = new Subscripcion("Premium",
                6.8,
                (short) 2);


        Cliente miSegundoCliente = new Cliente("Megan",
                "Solano Arias",
                "648956262",
                "Argentina"
                );

        Subscripcion segundaSubscripcion = new Subscripcion("Básica",
                2.5,
                (short) 1);

        Cliente miTercerCliente = new Cliente();

        Subscripcion terceraSubscripcion = new Subscripcion("Master",
                12.3,
                (short) 5);

        miCliente.mostrarInformacion();
        miSegundoCliente.mostrarInformacion();
        miTercerCliente.mostrarInformacion();

        miCliente.subscribirse(primeraSubscripcion);
        miSegundoCliente.subscribirse(segundaSubscripcion);
        miTercerCliente.subscribirse(terceraSubscripcion);

    }
}