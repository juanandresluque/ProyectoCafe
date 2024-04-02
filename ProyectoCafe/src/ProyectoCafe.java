// https://github.com/juanandresluque
import java.util.Scanner;

public class ProyectoCafe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido a la preparación de café!");

        boolean tieneCafeMolido = false;
        boolean tieneTaza = false;
        boolean tieneAgua = false;
        boolean tieneCafetera = false; 
        boolean tieneOlla = false;
         
        // Café molido
        while (!tieneCafeMolido) {
            System.out.println("¿Tiene café molido? (responde 'si' o 'no')");
            String tieneCafeMolidoRespuesta = scanner.nextLine();

            if (tieneCafeMolidoRespuesta.equalsIgnoreCase("si")) {
                tieneCafeMolido = true;
            } else if (tieneCafeMolidoRespuesta.equalsIgnoreCase("no")) {
                System.out.println("Ingrediente o material necesario");
            } else {
                System.out.println("Respuesta no relacionada a la pregunta.");
            }
        }

         // Olla o cafetera
String tipoRecipiente = "";
while (!tieneCafetera && !tieneOlla) {
    System.out.println("¿Va a utilizar una olla o una cafetera? (responde 'olla' o 'cafetera')");
    String tieneCafeteraRespuesta = scanner.nextLine();

    if (tieneCafeteraRespuesta.equalsIgnoreCase("olla")) {
        tieneOlla = true;
        tipoRecipiente = "olla";
    } else if (tieneCafeteraRespuesta.equalsIgnoreCase("cafetera")) {
        tieneCafetera = true;
        tipoRecipiente = "cafetera";
    } else {
        System.out.println("La respuesta no compete a la pregunta.");
    }
}

        
        // Taza o tazas
        while (!tieneTaza) {
            System.out.println("¿Tiene una taza o tazas? (responde 'si' o 'no')");
            String tieneTazaRespuesta = scanner.nextLine();

            if (tieneTazaRespuesta.equalsIgnoreCase("si")) {
                tieneTaza = true;
            } else if (tieneTazaRespuesta.equalsIgnoreCase("no")) {
                System.out.println("Ingrediente o material necesario");
            } else {
                System.out.println("La respuesta no corresponde a la pregunta.");
            }
        }

        // Agua
        while (!tieneAgua) {
            System.out.println("¿Tiene agua? (responde 'si' o 'no')");
            String tieneAguaRespuesta = scanner.nextLine();

            if (tieneAguaRespuesta.equalsIgnoreCase("si")) {
                tieneAgua = true;
            } else if (tieneAguaRespuesta.equalsIgnoreCase("no")) {
                System.out.println("Ingrediente o material necesario");
            } else {
                System.out.println("Respuesta no relacionada a la pregunta.");
            }
        }

        // Verificar si tiene todos los ingredientes
        if (!tieneCafeMolido || !tieneTaza || !tieneAgua) {
            System.out.println("Debe asegurarse de tener todos los materiales e ingredientes.");
            return;
        }

        System.out.println("Excelente! Ahora puedes continuar con el proceso de preparación.");


        // Resto del proceso de preparación del café

        // Medir el agua
        System.out.println("Paso 4: Medir el agua.");
        System.out.println("¿Cuántas tazas de café quieres hacer?");
        int numTazas = 0;
        boolean respuestaValida = false;
        while (!respuestaValida) {
            try {
                numTazas = Integer.parseInt(scanner.nextLine());
                respuestaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Respuesta no válida. Por favor, ingrese un número válido.");
            }
        }

        // Calcular la cantidad de agua necesaria
        double aguaTotalMililitros = numTazas * 250; // Cada taza equivale a 250 mililitros
        int aguaTotalTazas = (int) Math.round(aguaTotalMililitros / 240.0); // 1 taza equivale a 240 mililitros

        // Calcular la cantidad de café necesario
        double cafeTotalGramos = numTazas * 15; // Cada taza equivale a 15 gramos de café



        // Calcular tiempo estimado para alcanzar los 96 grados Celsius
        int tiempoTotalSegundos = numTazas * 3 * 60; // 3 minutos por cada taza
        int minutos = tiempoTotalSegundos / 60;
        int segundos = tiempoTotalSegundos % 60;

        // Mostrar la cantidad total de agua necesaria
        System.out.println("Necesitarás " + aguaTotalTazas + " tazas de agua para hacer " + numTazas + " tazas de café.");

        
        
        // Verificar si tiene la medida de agua indicada
       boolean tieneMedidaAgua = false;
       String recipiente = tieneCafetera ? "cafetera" : "olla";
       while (!tieneMedidaAgua) {
       System.out.println("¿Tiene la medida de agua indicada y ha vertido el agua en la " + recipiente + " ? (responde 'si' o 'no')");
       String tieneMedidaAguaRespuesta = scanner.nextLine();
       if (tieneMedidaAguaRespuesta.equalsIgnoreCase("si")) {
        tieneMedidaAgua = true;
       } else if (tieneMedidaAguaRespuesta.equalsIgnoreCase("no")) {
         System.out.println("Es necesario tener la medida de agua indicada y verter el agua en la " + recipiente + ", para tener un café de calidad.");
       } else {
        System.out.println("Respuesta no válida. Por favor, responde 'si' o 'no'.");
       }
}




        // Mostrar la cantidad de café necesario
        System.out.println("Necesitarás " + cafeTotalGramos + " gramos de café para hacer " + numTazas + " tazas de café.");

        // Verificar si tiene la medida de café indicada
        boolean tieneMedidaCafe = false;
        while (!tieneMedidaCafe) {
        System.out.println("Porfavor vierta la cantidad de café indicada anteriormente en, "+tipoRecipiente+" ¿Ya virtió la cantidad de café indicada anteriormente? (responde 'si' o 'no')");
        String tieneMedidaCafeRespuesta = scanner.nextLine();
        if (tieneMedidaCafeRespuesta.equalsIgnoreCase("si")) {
        tieneMedidaCafe = true;
         } else if (tieneMedidaCafeRespuesta.equalsIgnoreCase("no")) {
        System.out.println("Es necesario tener la medida de café indicada, para tener un café de calidad.");
        } else {
        System.out.println("Respuesta no válida. Por favor, responde 'si' o 'no'.");
       }
}

        // Mostrar tiempo estimado para calentar el agua
         System.out.println("Paso 5: Esperando a que el agua alcance los 96 grados Celsius... Estimación: Aproximadamente " + minutos + " minutos y " + segundos + " segundos."+ "Si usó cafeterá el proceso durará la mitad del tiempo estimado");

          // Contador para esperar a que el agua alcance los 96 grados Celsius
          System.out.println("Esperando...");
         int tiempoEspera;
         if (tieneCafetera) {
          tiempoEspera = 5; // Demora de 5 segundos si se usó cafetera
         } else {
         tiempoEspera = 10; // Demora de 10 segundos si se usó olla
         }
         for (int i = tiempoEspera; i >= 0; i--) {
         System.out.println("Quedan " + i + " segundos.");
         try {
         Thread.sleep(1000); // Espera 1 segundo (1000 milisegundos)
         } catch (InterruptedException e) {
         e.printStackTrace();
       }
}
        // Supongamos que el agua alcanza la temperatura adecuada.

        // Vertir agua
        System.out.println("Ahora devera vertir el agua a 96 grados Celsius sobre la medida del café indicado anteriormente. ¿Ha vertido el agua a 96 grados celsius sobre la medida del café? (responde 'si' o 'no')");
       String respuestaVertidoAgua = scanner.nextLine();

       while (true) {
       if (respuestaVertidoAgua.equalsIgnoreCase("si")) {
        // El usuario ha vertido el agua, procede al siguiente paso
        break;
       } else if (respuestaVertidoAgua.equalsIgnoreCase("no")) {
        // El usuario no ha vertido el agua, mostrar mensaje y volver a preguntar
        System.out.println("Es necesario vertir el agua para tener un café de calidad.");
        System.out.println("¿Has vertido el agua? (responde 'si' o 'no')");
        respuestaVertidoAgua = scanner.nextLine();
        } else {
        // Respuesta no válida, mostrar mensaje y volver a preguntar
        System.out.println("La respuesta no corresponde a la pregunta.");
        System.out.println("¿Has vertido el agua? (responde 'si' o 'no')");
        respuestaVertidoAgua = scanner.nextLine();
      }
}


        // Dejar reposar el café
        System.out.println("Paso 6: Dejar reposar el café durante 5 minutos.");

        // Contador para dejar reposar el café
        System.out.println("Paso 7: Reposando  el café espere 5 minutos, para disfrutar de un café de calidad.");
        int tiempoDescanso;
        if (tieneCafetera) {
            tiempoDescanso = 5; // Demora de 5 segundos si se usó cafetera
        } else {
            tiempoDescanso = 10; // Demora de 10 segundos si se usó olla
        }
        for (int i = tiempoDescanso; i >= 0; i--) {
            System.out.println("Quedan " + i + " segundos para que el café esté listo.");
            try {
                Thread.sleep(1000); // Espera 1 segundo (1000 milisegundos)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        // Supongamos que el café se deja reposar durante 5 minutos.

        // Disfrutar del café
        System.out.println("¡Disfruta de tu café!");

        scanner.close();
    }
}