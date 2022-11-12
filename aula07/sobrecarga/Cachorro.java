package aula07.sobrecarga;

public class Cachorro  extends Lobo{
    @Override
    public void emitirSom(){
        System.out.println("Au Au Au!");
    }

    //Polimorfismo por sobrecarga
    public void reagir(String frase){
        if(frase.equals("Pega comida") || frase.equals("Ola")){
            System.out.println("abanar e latir");
        } else{
            System.out.println("Rosnar!");
        }
    }


    public void reagir(int hora,int min){
        if(hora < 12){
            System.out.println("Abanar o rabo");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else{
            System.out.println("Abanar e latir");
        }

    }

    public void reagir(boolean dono){
        if(dono){
            System.out.println("Abanar e Latir");
        } else{
            System.out.println("Rosnar");
        }

    }

    public void reagir(int idade, float peso){
        if (idade < 5){
            if (peso < 10){
                System.out.println("Abanar");
            } else{
                System.out.println("latir");
            }
        } else{
            if(peso < 10){
                System.out.println("Rosnar");
            } else{
                System.out.println("ignorar");
            }
        }

    }
}
