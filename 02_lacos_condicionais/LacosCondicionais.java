//Exercicio 1
package LacosCondicionais;

import java.util.Scanner;

public class SomaMaior {
    public static void main(String[] args) {
        int a, b, c;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o número A (inteiro): ");
        a = ler.nextInt();
        System.out.println("Digite o número B (inteiro): ");
        b = ler.nextInt();
        System.out.println("Digite o número C (inteiro): ");
        c = ler.nextInt();
        if((a + b) > c){
            System.out.println("A soma e A + B é maior do que C ("+ a +" + "+ b +" > "+ c +").");
        }else if((a + b) < c){
            System.out.println("A soma e A + B é menor do que C ("+ a +" + "+ b +" < "+ c +").");
        }else{
            System.out.println("A soma e A + B é igual a C ("+ a +" + "+ b +" = "+ c +").");
        }
    }
}


//Exercicio 2
package LacosCondicionais;

        import java.util.Scanner;

public class ParImparPositivoNegativo {
    public static void main(String[] args) {
        int num;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num = ler.nextInt();
        if((num % 2) == 0){
            if(num >= 0){
                System.out.println("O número "+ num +" é par e positivo.");
            }else{
                System.out.println("O número "+ num +" é par e negativo.");
            }
        }else{
            if(num >= 0){
                System.out.println("O número "+ num +" é ímpar e positivo.");
            }else{
                System.out.println("O número "+ num +" é ímpar e negativo.");
            }
        }
    }
}


//Exercicio 3
package LacosCondicionais;

        import java.util.Scanner;

public class CompraProdutos {
    public static void main(String[] args) {
        int codigoProduto, produto, qtdeComprada;
        float valorTotal;
        Scanner ler = new Scanner(System.in);

        System.out.println("Código do Produto     |     Produto     |     Preço Unitário");
        System.out.println("        1             | Cachorro-Quente |        R$10,00    ");
        System.out.println("        2             |     X-Salada    |        R$15,00    ");
        System.out.println("        3             |     X-Bacon     |        R$18,00    ");
        System.out.println("        4             |      Bauru      |        R$12,00    ");
        System.out.println("        5             |   Refrigerante  |        R$ 8,00    ");
        System.out.println("        6             | Suco de Laranja |        R$13,00    ");
        System.out.println("Digite o código do produto: ");
        codigoProduto = ler.nextInt();
        if(codigoProduto > 0 && codigoProduto <= 6){
            System.out.println("Digite a quantidade comprada: ");
            qtdeComprada = ler.nextInt();
            switch (codigoProduto){
                case 1:
                    System.out.printf("O valor da compra de %d unidade(s) de Cachorro-Quente é de %.2f reais.",qtdeComprada, (10.00 * qtdeComprada));
                    break;
                case 2:
                    System.out.printf("O valor da compra de %d unidade(s) de X-Salada é de %.2f reais.", qtdeComprada, (15.00 * qtdeComprada));
                    break;
                case 3:
                    System.out.printf("O valor da compra de %d unidade(s) de X-Bacon é de %.2f reais.", qtdeComprada, (18.00 * qtdeComprada));
                    break;
                case 4:
                    System.out.printf("O valor da compra de %d unidade(s) de Bauru é de %.2f reais.", qtdeComprada, (12.00 * qtdeComprada));
                    break;
                case 5:
                    System.out.printf("O valor da compra de %d unidade(s) de refrigerante é de %.2f reais.", qtdeComprada, (8.00 * qtdeComprada));
                    break;
                case 6:
                    System.out.printf("O valor da compra de %d unidade(s) de Suco de Laranja é de %.2f reais.", qtdeComprada, 13.00 * qtdeComprada);
                    break;
            }
        } else{
            System.out.println("Código do produto inválido.");
        }
    }
}


//Exercicio 4
package LacosCondicionais;

        import java.util.Scanner;

public class AptosVotar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade;
        System.out.println("Digite a idade: ");
        idade = ler.nextInt();
        if(idade >= 0 && idade < 16){
            System.out.println("A pessoa não está apta a votar.");
        }else if((idade >= 16 && idade < 18) || (idade >= 65)){
            System.out.println("A pessoa está apta a votar e o voto é facultativo.");
        }else if(idade >= 18 && idade < 65){
            System.out.println("A pessoa está apta a votar e o voto é obrigatório.");
        }else{
            System.out.println("Idade inválida");
        }
    }
}


//Exercicio 5
package LacosCondicionais;

        import java.util.Scanner;

public class CalculoImposto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float salario;
        System.out.println("Digite o salário: ");
        salario = ler.nextFloat();
        if(salario >= 0 && salario <= 2000){
            System.out.println("Salário isento de imposto de renda.");
        }else if(salario > 2000 && salario <= 3000){
            System.out.printf("O imposto de renda será de %.2f", (salario * 0.08));
        }else if(salario > 3000 && salario <= 4500){
            System.out.printf("O imposto de renda será de %.2f", (salario * 0.18));
        }else if(salario > 4500){
            System.out.printf("O imposto de renda será de %.2f", (salario * 0.28));
        }else{
            System.out.println("Salário inválido.");
        }
    }
}


//Exercicio 6
package LacosCondicionais;

import java.util.Scanner;

public class EscolhaAnimal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String vertebra, classe, alimentacao;
        System.out.println("Escolha entre vertebrado e invertebrado: ");
        vertebra = ler.nextLine();
        if(vertebra.equalsIgnoreCase("vertebrado")){
            System.out.println("Escolha entre ave e mamifero: ");
            classe = ler.next();
            if(classe.equalsIgnoreCase("ave")) {
                System.out.println("Escolha entre carnivoro e onivoro");
                alimentacao = ler.next();
                if (alimentacao.equalsIgnoreCase("carnivoro")) {
                    System.out.println("O animal escolhido foi águia.");
                } else if (alimentacao.equalsIgnoreCase("onivoro")) {
                    System.out.println(("O animal escolhido foi pomba."));
                } else {
                    System.out.println("Alimentação inválida");
                }
            }else if(classe.equalsIgnoreCase("mamifero")){
                System.out.println("Escolha entre onivoro e herbivoro");
                alimentacao = ler.next();
                if (alimentacao.equalsIgnoreCase("herbivoro")) {
                    System.out.println("O animal escolhido foi vaca.");
                } else if (alimentacao.equalsIgnoreCase("onivoro")) {
                    System.out.println(("O animal escolhido foi homem."));
                } else {
                    System.out.println("Alimentação inválida");
                }
            }else{
                System.out.println("Classe inválida.");
            }
        }else if(vertebra.equalsIgnoreCase("invertebrado")){
            System.out.println("Escolha entre inseto e anelideo: ");
            classe = ler.next();
            if(classe.equalsIgnoreCase("inseto")) {
                System.out.println("Escolha entre hematofogo e herbivoro");
                alimentacao = ler.next();
                if (alimentacao.equalsIgnoreCase("hematofogo")) {
                    System.out.println("O animal escolhido foi pulga.");
                } else if (alimentacao.equalsIgnoreCase("herbivoro")) {
                    System.out.println(("O animal escolhido foi lagarta."));
                } else {
                    System.out.println("Alimentação inválida");
                }
            }else if(classe.equalsIgnoreCase("anelideo")){
                System.out.println("Escolha entre hematofogo e onivoro");
                alimentacao = ler.next();
                if (alimentacao.equalsIgnoreCase("hematofogo")) {
                    System.out.println("O animal escolhido foi sanguessuga.");
                } else if (alimentacao.equalsIgnoreCase("onivoro")) {
                    System.out.println(("O animal escolhido foi minhoca."));
                } else {
                    System.out.println("Alimentação inválida");
                }
            }else{
                System.out.println("Classe inválida.");
            }
        }else{
            System.out.println("Opção inválida");
        }
    }
}
