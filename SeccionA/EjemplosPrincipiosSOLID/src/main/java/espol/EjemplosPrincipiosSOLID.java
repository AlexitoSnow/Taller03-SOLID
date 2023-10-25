package espol;

public class EjemplosPrincipiosSOLID {

    public static void main(String[] args) {
        //Principio de responsabilidad única
        class Auto {
            String marca;

            Auto(String marca){ this.marca = marca; }

            String getMarcaAuto(){ return marca; }
        }

        class AutoBD{
            void guardarAutoBD(Auto auto){ ... }
            void eliminarAutoBD(Auto auto){ ... }
        }
        //Los metodos guardarAutoBD y eliminarAutoBD está en otra clase para eliminar responsabilidades a la clase Auto.

        //Principio de abierto/cerrado
        abstract class Auto {
            // ...
            abstract int precioMedioAuto();
        }

        class Renault extends Auto {
            @Override
            int precioMedioAuto() {
                return 18000;
            }
        }

        class Audi extends Auto {
            @Override
            int precioMedioAuto() {
                return 25000;
            }
        }

        class Mercedes extends Auto {
            @Override
            int precioMedioAuto() {
                return 27000;
            }
        }
        Auto[] arrayAutos = {
                new Renault(),
                new Audi(),
                new Mercedes()
        };

        public static void imprimirPrecioMedioAuto(Auto[] arrayAutos){
            for (Auto auto : arrayAutos) {
                System.out.println(auto.precioMedioAuto());
            }
        }
        //Cada auto extiende la clase abstracta Auto e implementa el método abstracto precioMedioAuto().

        //Principio de sustitución de Liskov
        class Renault extends Auto {
            @Override
            int numAsientos() {
                return 5;
            }
        }
        
        public static void imprimirNumAsientos(Auto[] arrayAutos){
            for (Auto auto : arrayAuto) {
                System.out.println(auto.numAsientos());
            }
        }

        imprimirNumAsientos(arrayCoches);

        //Principio de segregación de la interfaz

        //Principio de inversión de dependencia
    }
}
