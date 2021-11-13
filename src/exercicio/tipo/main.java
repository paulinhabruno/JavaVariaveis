package exercicio.tipo;

//Exemplos de variáveis tipo de dado e operadores aritméticos

public class main {
    public static void main(String[] args){

        // variáveis inteiros

        byte b1 =10;
        byte b2 = 20;

        short s1 = 20000;
      //  short s2 = 40000;  ultrapassou o tamanho de short

       // int i1 = -10000000000000; ultrapassa o limite inferior que o int suporta
        int i2 = 28500;

        long l1 = 100000000000000000L; // tem capacidade bem maior que os anteriores e colocou o L no final
        long l2 = 20004000500000L;

         // variáveis reais com números fracionários

        // float f1 = 4.5; não colocou o f para identificar como fload. Está como double
        float f2 = 10.68f;

        double d1 = 81.69;
        double d2 = 99.04d;  // coloca d ou D para explicitar que é double

        char c1 = 'W'; // é somente 1 caracter
       // char c2 = 'Tw'; errado por que colocou 2 caracteres
        char c3 = '\u0057'; // o código de terminado caracter. Nesse caso é o W.

        // tipos de dados textuais

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "Aula de variáveis tipos de dado";

        String dt1 = "08/02/1981";

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(b1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);

    }
}
