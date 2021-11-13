package exercicio.variaveis;

public class main {

    public static void main(String[] args){

        int i;
        // int i; não pode ter duas variáveis com mesmo nome
        int I; // reconhece que a variável (por ser maiúscula) é diferente
        // int 1a; não pode começar com número
        int _1a; //aceita, mas não é boa prática
        int $aq; //aceita, mas não é boa prática

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10; // é uma constante j sempre terá valor 10
        // j = 15;
        int asrn24678md;
        //int asrn246 78md; inválida pq não pode separar
        int asrn2$4678_md = 10; // é aceita, mas não é boa prática colocar % ou _
        //int asrn2S46%78_md; não pode usar caracteres especiais

        asrn24678md = 100;
        asrn2$4678_md = 10;

        int quantidadeProduto = 50;
       // int QuantidadeProduto;  aceita, mas não segue as boas práticas
        final int NUMERO_TENTATIVAS = 5; // é constante final, precisa ser caixa alta separada por _
       //  final int numeroTentativas = 5; não dá erro de compilação, mas não é boa prática
        int QUANTIDADE_OPÇÕES = 25; // não dá erro de compilação, mas não é boa prática
       // int qtdProd; não é expressiva. não dá erro de compilação, mas não é boa prática

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPÇÕES);

    }
}

