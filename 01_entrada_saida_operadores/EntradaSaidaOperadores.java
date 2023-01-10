//Atividade 01 - Cálculo salário + abono
package EntradaSaidaOperadores;
import java.util.*;

public class CalculoAbono {
    public static void main(String[] args) {
        float salario, abono;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o salário: ");
        salario = ler.nextFloat();
        System.out.println("Digite o abono: ");
        abono = ler.nextFloat();
        System.out.printf("O novo salário é: R$ %.2f", (salario + abono));
    }
}


//Atividade 02 - Cálculo média 4 notas
package EntradaSaidaOperadores;
import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        float nota1, nota2, nota3, nota4;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a 1ª nota: ");
        nota1 = ler.nextFloat();
        System.out.println("Digite a 2ª nota: ");
        nota2 = ler.nextFloat();
        System.out.println("Digite a 3ª nota: ");
        nota3 = ler.nextFloat();
        System.out.println("Digite a 4ª nota: ");
        nota4 = ler.nextFloat();
        System.out.printf("A média do aluno é: %.1f", ((nota1 + nota2 + nota3 + nota4) / 4));
    }
}


//Atividade 03 - Cálculo salário líquido
package EntradaSaidaOperadores;
import java.util.Scanner;

public class CalculoSalarioLiquido {
    public static void main(String[] args) {
        float salarioBruto, adicionalNoturno, horasExtras, descontos;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o salário bruto: ");
        salarioBruto = ler.nextFloat();
        System.out.println("Digite o valor do adicional noturno: ");
        adicionalNoturno = ler.nextFloat();
        System.out.println("Digite o valor das horas extras: ");
        horasExtras = ler.nextFloat();
        System.out.println("Digite o valor dos descontos: ");
        descontos = ler.nextFloat();
        System.out.printf("O salário líquido é: R$ %.2f", (salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos));
    }
}


//Atividade 04 - Diferença entre produtos
package EntradaSaidaOperadores;
import java.util.Scanner;

public class DiferencaProdutos {
    public static void main(String[] args) {
        float num1, num2, num3, num4;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o 1º valor: ");
        num1 = ler.nextFloat();
        System.out.println("Digite o 2º valor: ");
        num2 = ler.nextFloat();
        System.out.println("Digite o 3º valor: ");
        num3 = ler.nextFloat();
        System.out.println("Digite o 4º valor: ");
        num4 = ler.nextFloat();
        System.out.printf("A diferença do produto entre o 1º e o 2º valores pelo produto entre o 3º e o 4º valores é: %f", ((num1 * num2) - (num3 * num4)));
    }
}
