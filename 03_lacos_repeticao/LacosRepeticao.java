//Exercicio 1
package LacosRepeticao;

import java.util.Scanner;

public class Multiplos3e5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1, num2;
        System.out.println("Digite o primeiro número: ");
        num1 = ler.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = ler.nextInt();
        if(num1 < num2){
            for(int i = num1; i <= num2; i++){
                if(((i % 3) == 0) && ((i % 5) == 0)){
                    System.out.println(i + " é múltiplo de 3 e 5.");
                }
            }
        } else{
            System.out.println("Intervalo inválido.");
        }
    }
}



//Exercicio 2
package LacosRepeticao;

        import java.util.Scanner;

public class NumerosParesImpares {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int pares = 0, impares = 0, num;
        for(int i = 1; i <= 10; i++){
            System.out.println("Digite o "+ i + "º número: ");
            num = ler.nextInt();
            if(num % 2 == 0){
                pares += 1;
            }else if(num % 2 != 0){
                impares += 1;
            }
        }
        System.out.println("Total de números pares: "+ pares);
        System.out.println("Total de números impares: "+ impares);
    }
}



//Exercicio 3
package LacosRepeticao;

        import java.util.Scanner;

public class IdadeMenor21Maior50 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int menor21 = 0, maior50 = 0, idade = 0;
        while (idade >= 0){
            System.out.println("Digite a idade: ");
            idade = ler.nextInt();
            if(idade < 21 && idade > 0){
                menor21 += 1;
            }else if(idade > 50){
                maior50 += 1;
            }
        }
        System.out.println("Total de pessoas menores de 21 anos: "+ menor21);
        System.out.println("Total de pessoas maiores de 50 anos: "+ maior50);
    }
}



//Exercicio 4
package LacosRepeticao;

        import java.util.Scanner;

public class ContagemDevs {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade = 0, sexo = 0, categoria = 0, devBackend = 0, mulheresFrontend = 0, homensMobileMaior40 = 0, mulheresFullstackMenor30 = 0;
        String continua = "s", confirmacao = "n";

        while(!continua.equalsIgnoreCase("n")){
            System.out.println("Preencha as informações abaixo: ");
            System.out.println("Idade (em número inteiro): ");
            idade = ler.nextInt();
            if(idade < 10 || idade > 100){
                while(idade < 10 || idade > 100){
                    System.out.println("A idade digitada foi " + idade + ". Gostaria de corrigir? Aperte S para digitar novamente ou N para continuar.");
                    confirmacao = ler.next();
                    if(confirmacao.equalsIgnoreCase("s")){
                        System.out.println("Idade (em número inteiro): ");
                        idade = ler.nextInt();
                    }else{
                        break;
                    }
                }
            }

            System.out.println("Sexo (1 - Masculino | 2 - Feminino | 3 - Outros): ");
            sexo = ler.nextInt();
            if(sexo < 1 || sexo > 3){
                while(sexo < 1 || sexo > 3) {
                    System.out.println("Opção inválida, tente novamente.");
                    System.out.println("Sexo (1 - Masculino | 2 - Feminino | 3 - Outros): ");
                    sexo = ler.nextInt();
                }
            }

            System.out.println("Categoria (1 - Backend | 2 - Frontend | 3 - Mobile | 4 - Fullstack): ");
            categoria = ler.nextInt();
            if(categoria < 1 || categoria > 4){
                while(categoria < 1 || categoria > 4) {
                    System.out.println("Opção inválida, tente novamente.");
                    System.out.println("Categoria (1 - Backend | 2 - Frontend | 3 - Mobile | 4 - Fullstack): ");
                    categoria = ler.nextInt();
                }
            }

            if(categoria == 1){
                devBackend += 1;
            }else if(categoria == 2 && sexo == 2){
                mulheresFrontend += 1;
            }else if(categoria == 3 && sexo == 1 && idade > 40){
                homensMobileMaior40 += 1;
            }else if(categoria == 4 && sexo == 2 && idade < 30){
                mulheresFullstackMenor30 += 1;
            }

            System.out.println("Deseja informar os dados de outro colaborador? (S ou N): ");
            continua = ler.next();
        }

        System.out.println("O número de pessoas desenvolvedoras Backend: " + devBackend);
        System.out.println("O número de mulheres desenvolvedoras Frontend: " + mulheresFrontend);
        System.out.println("O número de homens desenvolvedores Mobile maiores de 40 anos: " + homensMobileMaior40);
        System.out.println("O número de mulheres desenvolvedoras FullStack menores de 30 anos: " + mulheresFullstackMenor30);
    }
}



//Exercicio 5
package LacosRepeticao;

        import java.util.Scanner;

public class SomaNumPositivos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num = 1, somaPositivos = 0;
        do{
            System.out.println("Digite um número inteiro: ");
            num = ler.nextInt();
            if(num > 0){
                somaPositivos += num;
            }
        }while(num != 0);

        System.out.println("A soma dos números positivos é: " + somaPositivos);

    }
}



//Exercicio 6
package LacosRepeticao;

        import java.util.Scanner;

public class MediaMultiplos3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num = 1;
        float somaMultiplos3 = 0, qtdeMultiplos3 = 0;
        do{
            System.out.println("Digite um número inteiro: ");
            num = ler.nextInt();
            if(num != 0 && num % 3 == 0){
                somaMultiplos3 += num;
                qtdeMultiplos3 += 1;
            }
        }while(num != 0);

        System.out.println("A soma dos números positivos é: " + (somaMultiplos3 / qtdeMultiplos3));

    }
}
