//Exercicio1 - Classe Cliente
package PooJava.Ativ1;

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


//Exercicio 2 -Classe TestaCliente
package PooJava.Ativ1;

        import java.util.Scanner;

public class TestaCliente {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente("Bruno", "Celular", 3500.00, 4);
        System.out.println("Digite o nome do Cliente 1: ");
        cliente1.setNome(ler.nextLine());
        System.out.printf("Digite o produto comprado pelo Cliente %s: \n", cliente1.getNome());
        cliente1.setProduto((ler.nextLine()));
        System.out.printf("Digite o valor unitário do produto %s: \n", cliente1.getProduto());
        cliente1.setValorUnitario(ler.nextDouble());
        System.out.printf("Quantos %s foram comprados pelo Cliente %s? \n",cliente1.getProduto(), cliente1.getNome());
        cliente1.setUnidades(ler.nextInt());
        cliente1.setValorCompra();
        cliente1.visualizar();
        cliente2.visualizar();
    }
}


//Exercício 2 - Classe Funcionário
package PooJava.Ativ2;

public class Funcionario {
    String nome, cargo, empresa;
    int matricula;
    double salario;

    public void visualizar(){
        System.out.println("Nome do Funcionário: " + this.getNome());
        System.out.println("Cargo de " + this.getNome() + ": " + this.getCargo());
        System.out.println("Nome da empresa: " + this.getEmpresa());
        System.out.printf("Salário de %s: %.2f\n", this.getNome(), this.getSalario());
        System.out.println("Matrícula de " + this.getNome() + ": " +this.getMatricula());
    }


    public Funcionario(String nome, String cargo, String empresa, int matricula, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.empresa = empresa;
        this.matricula = matricula;
        this.salario = salario;
    }

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}


//Exercício 2 - Classe TestaFuncionario
package PooJava.Ativ2;


        import java.util.Scanner;

public class TestaFuncionario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        PooJava.Ativ2.Funcionario funcionario1 = new PooJava.Ativ2.Funcionario();
        PooJava.Ativ2.Funcionario funcionario2 = new PooJava.Ativ2.Funcionario("Bruno", "dev", "Elogroup", 4321, 15000.00);

        System.out.println("Digite o nome do Funcionário: ");
        funcionario1.setNome(ler.nextLine());
        System.out.printf("Digite o cargo do Funcionário %s: \n", funcionario1.getNome());
        funcionario1.setCargo(ler.nextLine());
        System.out.printf("Digite a empresa do Funcionário %s: \n", funcionario1.getNome());
        funcionario1.setEmpresa(ler.nextLine());
        System.out.printf("Digite o salário do Funcionário %s: \n", funcionario1.getNome());
        funcionario1.setSalario(ler.nextDouble());
        System.out.printf("Digite a matrícula do Funcionário %s: \n", funcionario1.getNome());
        funcionario1.setMatricula(ler.nextInt());
        funcionario1.visualizar();
        funcionario2.visualizar();
    }
}


//Exercício 3 - Classe Game
package PooJava.Ativ3;

public class Game {
    String produto, categoria, genero;
    double preco;
    int id;

    public void visualizar(){
        System.out.println("Produto: " + this.getProduto());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Gênero: " + this.getGenero());
        System.out.println("Preço: " + this.getPreco());
        System.out.println("Id: " + this.getId());
    }

    public Game(String produto, String categoria, String genero, double preco, int id) {
        this.produto = produto;
        this.categoria = categoria;
        this.genero = genero;
        this.preco = preco;
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


//Exercício 3 - Classe TestaGame
package PooJava.Ativ3;

public class TestaGame {
    public static void main(String[] args) {
        PooJava.Ativ3.Game game1 = new PooJava.Ativ3.Game("Fifa 2023", "Jogos", "Esportes", 150, 001);
        PooJava.Ativ3.Game game2 = new PooJava.Ativ3.Game("PS%", "Console", "Video-Game", 5000, 002);
        game1.visualizar();
        game2.visualizar();
    }
}

