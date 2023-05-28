import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        // Declarando variável na mesma linha
        String nome = "Andressa";
        System.out.println("Olá, " + nome);


        // Declarando variável em linha diferente
        String nome2;
        nome2 = "Nome2";
        System.out.println(nome2);


        // Tipos numéricos

        int a;
        int b = 2;
        a = 3;

        int soma = a + b;
        int subtracao = a - b;
        float multiplicacao = a * b;
        float divisao = (float) a / b; //No java a divisão de números inteiros é considerado como inteiro, por isso "forçamos" para float com (float)

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);


        // Boolean

        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;


        // Atalho para System.out.println() = sout

        System.out.println("Validação de dois valores true ao mesmo tempo" + vamosAPraia);

        // Operadores:
        // && = (and)
        // || = (or)


        // Operador ternário

        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";

        // (?) Se for fim de semana.. (:) se não...

        System.out.println(mensagem);



        // Condicionais

        int nota = 70;
        String resultado;

        // nota maior ou igual a 70 = aluno aprovado

        if (nota >= 70) {
            System.out.println("Aluno aprovado!");
            resultado = "A";
        } else if (nota < 70 && nota > 30) {
            System.out.println("Aluno em recuperação");
            resultado = "B";
        } else {
            System.out.println("Aluno reprovado");
            resultado = "C";
        }

        // Switch

        switch (resultado) {
            case "A":
                System.out.println("Aluno aprovado");
                break;
            case "B":
                System.out.println("Aluno em recuperação");
                break;
            default:
                System.out.println("Aluno reprovado");
                break;
        }



        // Manipulação de strings

        nome.toLowerCase();
        nome.toUpperCase();
        nome.length();


        nome = "Teste";
        String nomeOutro = "TESTE";

        System.out.println(nome.equals(nomeOutro)); // Verificar se os nomes são iguais, incluindo o lower case.

        System.out.println(nome.equalsIgnoreCase(nomeOutro)); // Verificar se os nomes são iguais, ignorando o lower case.




        // Laços

        for (int i = 1; i <= 10; i ++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(j * i);
                // Tabuada
            }
        }



        // Arrays

        // Em java não se pode misturar números e textos no mesmo array.

        int[] numeros = new int[5]; // Tem sempre um número máximo
        // [0] [1] [2] [3] [4]

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }



        String[] letras = {"a", "b", "c"};
        System.out.println(Arrays.toString(letras));


        //Funções
        saudacao(nome);
        int resultadoFuncao = soma(2, 3);
        System.out.println(resultadoFuncao);
       
    }

    public static void saudacao(String nomeFuncao) {
        System.out.println("Hello, " + nomeFuncao);
    }

    public static int soma(int a, int b) {
        return a + b;
    }
}
