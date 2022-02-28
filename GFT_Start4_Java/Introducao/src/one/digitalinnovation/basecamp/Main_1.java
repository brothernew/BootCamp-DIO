package one.digitalinnovation.basecamp;
public class Main_1 {

    public static void main(String[] args) {

        int i;
        //int i;
        int I;
       // int 1a;
        int _1a; //não acusa erro, porém dever ser evitado.
        int $aq; //não acusa erro, porém dever ser evitado.


        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10;
        //j = 15;
        int asrn24678md;
        //int asrn246 78md; //não é válido
        int asrn2$4678_md = 10; //não acusa erro, porém dever ser evitado.
        //int asrn2$46%78_md = 10; //não é válido

        asrn24678md = 100;
        asrn2$4678_md = 10;

        int quantidadeProduto = 50;
        //int QuantidadeProduto; - não acusa erro, porém dever ser evitado.
        final int NUMERO_TENTATIVAS = 5;
        //final int numeroTentativas = 5; - não acusa erro, porém dever ser evitado.
        int QUNTIDADE_OPCOES = 25; //não acusa erro, porém dever ser evitado.
        //int qtdProd;

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);
        
        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);
        
        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUNTIDADE_OPCOES);        
    }
    
}
