import java.util.Scanner;

class Pokedex{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int opcion, id, fuerza, vida, defensa, ataque, poke;
        float at1, at2, cont;
        char regresar;

        System.out.println("Grupo: 3IV9");
        System.out.println("Alumno: Domínguez Espinoza Juan Pablo");
        System.out.println();
        System.out.println("=====================================");
        System.out.println("               POKEDEX               ");
        System.out.println("=====================================");

        do{
            System.out.println("Bienvenido a la Pokedex");
            System.out.println("Puedes escoger entre revisar tus pokemones o empezar una batalla pokemon:");
            System.out.println("1. Charmander");
            System.out.println("2. Bulbasaor");
            System.out.println("3. Squartle");
            System.out.println("4. Batalla Pokemon");
            System.out.println("5. Salir");
            opcion = entrada.nextInt();

            if(opcion > 0 && opcion < 6){
                switch(opcion){
                    case 1:
                    System.out.println("======================================");
                    System.out.println("              CHARMANDER              ");
                    System.out.println("======================================");
                    System.out.println("Id: #1");
                    System.out.println("Vida: 100");
                    System.out.println("Fuerza: 6");
                    System.out.println("Defensa: 9");
                    System.out.println("Ataque principal: Latigazo....5 ATK");
                    System.out.println("Ataque secundario: Aliento de fuego....7 ATK");
                    do{
                        System.out.println("Presioone s para salir");
                        regresar = entrada.next().charAt(0);
                    }while(regresar != 's');
                    break;

                    case 2:
                    System.out.println("=====================================");
                    System.out.println("              BULBASAOR              ");
                    System.out.println("=====================================");
                    System.out.println("Id: #2");
                    System.out.println("Vida: 80");
                    System.out.println("Fuerza: 4");
                    System.out.println("Defensa: 3");
                    System.out.println("Ataque principal: Cabezazo....4 ATK");
                    System.out.println("Ataque secundario: Golpe de raiz....5 ATK");
                    do{
                        System.out.println("Presioone s para salir");
                        regresar = entrada.next().charAt(0);
                    }while(regresar != 's');
                    break;

                    case 3:
                    System.out.println("======================================");
                    System.out.println("               SQUARTLE               ");
                    System.out.println("======================================");
                    System.out.println("Id: #3");
                    System.out.println("Vida: 90");
                    System.out.println("Fuerza: 5");
                    System.out.println("Defensa: 6");
                    System.out.println("Ataque principal: Chorro....5 ATK");
                    System.out.println("Ataque secundario: Golpe....6 ATK");
                    do{
                        System.out.println("Presioone s para salir");
                        regresar = entrada.next().charAt(0);
                    }while(regresar != 's');
                    break;

                    case 4:
                    System.out.println("=====================================");
                    System.out.println("               BATALLA               ");
                    System.out.println("=====================================");
                    do{
                        System.out.println("Presiona s para salir, cualquier otra tecla para repetir");
                        regresar = entrada.next().charAt(0);
                    }while(regresar != 's');
                    break;

                    default:
                    System.out.println("Gracias vuelva pronto nwn/");
                    break;
                }
            }else{
                System.out.println("Escoja una opción válida");
            }
        }while(opcion != 4);
    }
}