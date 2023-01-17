//Exercício 1 - Classe Cliente
package PooJava2.Ativ1;

import java.util.Scanner;

public class Cliente {
    String nome, produto;
    double valorUnitario, valorCompra;
    int unidades;

    public void visualizar(){
        System.out.println("Nome do Cliente: " + this.getNome());
        System.out.printf("A compra foi de %d unidades de %s, a %.2f reais cada. O valor total é de %.2f reais.\n",this.getUnidades(), this.getProduto(), this.getValorUnitario(), this.getValorCompra());
    }

    public Cliente(String nome, String produto, double valorUnitario, int unidades) {
        this.nome = nome;
        this.produto = produto;
        this.valorUnitario = valorUnitario;
        this.unidades = unidades;
        this.valorCompra = this.valorUnitario * this.unidades;
    }

    public Cliente() {
        this.valorCompra = this.valorUnitario * this.unidades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra() {
        this.valorCompra = this.valorUnitario * this.unidades;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }


}


//Exercício 1 - Classe PessoaFisica
package PooJava2.Ativ1;

public class PessoaFisica extends Cliente {
    String cpf;

    @Override
    public void visualizar(){
        super.visualizar();
        System.out.println("CPF do Cliente: " + this.getCpf() +"\n");
    }

    public PessoaFisica(String nome, String produto, double valorUnitario, int unidades, String cpf) {
        super(nome, produto, valorUnitario, unidades);
        this.cpf = cpf;
        this.valorCompra = this.valorUnitario * this.unidades;
    }

    public PessoaFisica(){
        this.valorCompra = this.valorUnitario * this.unidades;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}


//Exercício 1 - Classe PessoaJuridica
package PooJava2.Ativ1;

public class PessoaJuridica extends Cliente{
    String cnpj;

    @Override
    public void visualizar(){
        super.visualizar();
        System.out.println("CNPJ do Cliente: " + this.getCnpj() +"\n");
    }

    public PessoaJuridica(String nome, String produto, double valorUnitario, int unidades, String cnpj) {
        super(nome, produto, valorUnitario, unidades);
        this.cnpj = cnpj;
        this.valorCompra = this.valorUnitario * this.unidades;
    }

    public PessoaJuridica(){
        this.valorCompra = this.valorUnitario * this.unidades;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}


//Exercício 1 - Classe TestaCliente
package PooJava2.Ativ1;

        import java.util.Scanner;

public class TestaCliente {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao;
        PessoaFisica pessoaFisica1 = new PessoaFisica();
        PessoaFisica pessoaFisica2 = new PessoaFisica("Bruno", "Celular", 3500.00, 4, "123.321.456-89");
        PessoaJuridica pessoaJuridica1 = new PessoaJuridica();
        PessoaJuridica pessoaJuridica2 = new PessoaJuridica("Generation", "Notebook", 4500.00, 5, "12.345.678/0001-90");
        System.out.println("Escolha uma opcão: ");
        System.out.println("Digite 1 para pessoa física");
        System.out.println("Digite 2 para pessoa jurídica.");
        System.out.println("Digite 9 para encerrar.");
        opcao = ler.nextInt();

        while(opcao != 9) {
            if (opcao == 1) {
                System.out.println("Digite o nome do Cliente 1: ");
                pessoaFisica1.setNome(ler.next());
                System.out.printf("Digite o produto comprado pelo Cliente %s: \n", pessoaFisica1.getNome());
                pessoaFisica1.setProduto(ler.next());
                System.out.printf("Digite o valor unitário do produto %s: \n", pessoaFisica1.getProduto());
                pessoaFisica1.setValorUnitario(ler.nextDouble());
                System.out.printf("Quantos %s foram comprados pelo Cliente %s? \n", pessoaFisica1.getProduto(), pessoaFisica1.getNome());
                pessoaFisica1.setUnidades(ler.nextInt());
                System.out.printf("Digite o CPF do Cliente %s: \n", pessoaFisica1.getNome());
                pessoaFisica1.setCpf(ler.next());
                pessoaFisica1.setValorCompra();
                pessoaFisica1.visualizar();
                pessoaFisica2.visualizar();
                System.out.println("\n Deseja escolher outra opção?");
                System.out.println("Digite qualquer número para sim ou 9 para sair.");
                opcao = ler.nextInt();
            } else if (opcao == 2) {
                System.out.println("Digite o nome do Cliente 1: ");
                pessoaJuridica1.setNome(ler.next());
                System.out.printf("Digite o produto comprado pelo Cliente %s: \n", pessoaJuridica1.getNome());
                pessoaJuridica1.setProduto(ler.next());
                System.out.printf("Digite o valor unitário do produto %s: \n", pessoaJuridica1.getProduto());
                pessoaJuridica1.setValorUnitario(ler.nextDouble());
                System.out.printf("Quantos %s foram comprados pelo Cliente %s? \n", pessoaJuridica1.getProduto(), pessoaJuridica1.getNome());
                pessoaJuridica1.setUnidades(ler.nextInt());
                System.out.printf("Digite o CNPJ do Cliente %s: \n", pessoaJuridica1.getNome());
                pessoaJuridica1.setCnpj(ler.next());
                pessoaJuridica1.setValorCompra();
                System.out.println("\n");
                pessoaJuridica1.visualizar();
                pessoaJuridica2.visualizar();
                System.out.println("\n Deseja escolher outra opção?");
                System.out.println("Digite qualquer número para sim ou 9 para sair.");
                opcao = ler.nextInt();
            } else {
                System.out.println("Digite 1 para pessoa física, 2 para pessoa jurídica ou 9 para encerrar: ");
                opcao = ler.nextInt();
            }
        }

    }
}
