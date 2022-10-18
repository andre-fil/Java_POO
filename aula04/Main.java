package aula04;
/*
Pilares da P.O.O

--> Encapsulamento
    * ocultar partes independentes da implementação (Fornece apenas a resposta)
    *Mensagem = comunicação externa com a capsula
    --> Interface: Lista de serviços fornecidos por um componente encapsulado, contato com o mundo exterior
                    Só possui métodos.
                    Todos os métodos são públicos
        Capsula > Interface > implementações
--> Herança
--> Polimorfismo

*/





public class Main {
    public static void main(String[] args){
        ControleRemoto c1 = new ControleRemoto();
        c1.maisVolume();
        c1.ligar();
        c1.maisVolume();
        c1.abrirMenu();
        c1.ligarMudo();
        c1.play();
        c1.abrirMenu();
        c1.fecharMenu();




    }
}
