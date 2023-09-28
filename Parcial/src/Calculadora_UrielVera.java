import java.util.Scanner;

public class Calculadora_UrielVera {
    public static void main(String[] args) {
        //Crear Scanner
        Scanner sc = new Scanner(System.in);

        int salir = 1;
        int resultado = 0;

        System.out.println("Bienvenido");
        while (salir != 0){
            System.out.println("¿Qué operación desea realizar?");
            System.out.println(" ");
            System.out.println("1. SUMA");
            System.out.println("2. RESTA");
            System.out.println("3. MULTIPLICACIÓN");
            System.out.println("4. DIVISIÓN");
            System.out.println("5. SALIR");
            System.out.print("> ");
            int opcionUsuario = sc.nextInt();

            //Función Suma
            int salirSuma = 1;
            if (opcionUsuario == 1){
                System.out.println("Ingrese los valores a sumar");
                System.out.print("Primer Valor: ");
                int n1 = sc.nextInt();
                System.out.print("Segundo Valor: ");
                int n2 = sc.nextInt();
                resultado = n1 + n2;
                System.out.println("> " + resultado);
                while (salirSuma != 0){
                        int n3 = sc.nextInt();
                        resultado = resultado + n3;
                        System.out.println("> " + resultado);
                        if (n3 == 0){
                            salirSuma = 0;
                        }
                }
            }


            //Función Resta
            int salirResta = 1;
            if (opcionUsuario == 2){
                System.out.println("Ingrese los valores a restar");
                System.out.print("Primer Valor: ");
                int n1 = sc.nextInt();
                System.out.print("Segundo Valor: ");
                int n2 = sc.nextInt();
                resultado = n1 - n2;
                System.out.println("> " + resultado);
                while (salirResta != 0){
                    int n3 = sc.nextInt();
                    resultado = resultado - n3;
                    System.out.println("> " + resultado);
                    if (n3 == 0){
                        salirResta = 0;
                    }
                }
            }

            //Función Multiplicación
            int salirMul = 1;
            if (opcionUsuario == 3){
                System.out.println("Ingrese los valores a multiplicar");
                System.out.print("Primer Valor: ");
                int n1 = sc.nextInt();
                System.out.print("Segundo Valor: ");
                int n2 = sc.nextInt();
                resultado = n1 * n2;
                System.out.println("> " + resultado);
                while (salirMul != 0){
                    int n3 = sc.nextInt();
                    resultado = resultado * n3;
                    System.out.println("> " + resultado);
                    if (n3 == 0){
                        salirMul = 0;
                    }
                }
            }

            //Función División
            int salirDiv = 1;
            if (opcionUsuario == 4){
                System.out.println("Ingrese los valores a dividir");
                System.out.print("Primer Valor: ");
                int n1 = sc.nextInt();
                System.out.print("Segundo Valor: ");
                int n2 = sc.nextInt();

                if (n2 == 0){
                    System.out.println("No es posible dividir por 0");
                }
                else {
                    resultado = n1 / n2;
                }
                System.out.println("> " + resultado);
                while (salirSuma != 0){
                    int n3 = sc.nextInt();
                    if (n3 == 0){
                        salirDiv = 0;
                    }
                    else {
                        resultado = resultado / n3;
                        System.out.println("> " + resultado);
                    }

                }
            }

            //Salir
            if (opcionUsuario == 5){
                System.out.println("Adios, espero haberte ayudado");
                salir = 0;
            }
        }
    }
}
