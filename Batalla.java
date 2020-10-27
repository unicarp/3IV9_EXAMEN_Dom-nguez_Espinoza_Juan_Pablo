import java.util.Scanner;

class Batalla{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int id, fuerza, vida, defensa;
        float at1, at2;
        int efuerza, evida, edefensa;
        float at1e, at2e;
        double cont, impacto, eimpacto;

        System.out.println("=====================================");
        System.out.println("               BATALLA               ");
        System.out.println("=====================================");
        do{
            System.out.println("Elija el pokemon que usara");
            System.out.println("1. Charmander");
            System.out.println("2. Bulbasaor");
            System.out.println("3. Squartle");
            id = entrada.nextInt();
            if(id > 0 && id < 4){
                if(id = 1){
                    vida = 100;
                    fuerza = 6;
                    defensa = 9;
                    at1 = 5;
                    at2 = 7;
                }else if(id = 2){
                    vida = 80;
                    fuerza = 4;
                    defensa = 3;
                    at1 = 4;
                    at2 = 5;
                }else{
                    vida = 90;
                    fuerza = 5;
                    defensa = 6;
                    at1 = 5;
                    at2 = 6;
                }
                impacto = fuerza * defensa / 3;
                System.out.println("Vida: "+vida);
                System.out.println("Fuerza: "+fuerza);
                System.out.println("Defensa: "+defensa);
                cont = Math.random()*3 + 1;
                if(cont >= 1 && cont < 2){
                    evida = 100;
                    efuerza = 6;
                    edefensa = 9;
                    at1e = 5;
                    at2e = 7;
                }else if(cont >= 2 && cont <3){
                    evida = 80;
                    efuerza = 4;
                    edefensa = 3;
                    at1e = 4;
                    at2e = 5;
                }else{
                    evida = 90;
                    efuerza = 5;
                    edefensa = 6;
                    at1e = 5;
                    at2e = 6;
                }
                if(vida <= 0){
                    System.out.println("Pokemon cansado");
                }else if(evida <= 0){
                    System.out.println("Haz derrotado al Pokemon");
                }
                System.out.println("Presiona s para salir, cualquier otra tecla para repetir");
                regresar = entrada.next().charAt(0);
            }else{
                System.out.println("Escoja una opcion valida");
            }
        }while(regresar != 's');
    }
}