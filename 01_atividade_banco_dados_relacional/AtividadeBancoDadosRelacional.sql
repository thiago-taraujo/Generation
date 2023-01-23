#Atividade 1
CREATE DATABASE db_recursos_humanos;

USE db_recursos_humanos;

CREATE TABLE funcionarios(
	ID_Funcionario INT NOT NULL UNIQUE,
    Primeiro_Nome varchar(32) NOT NULL,
    Sobrenome varchar(48) NOT NULL,
    Cargo varchar(48) NOT NULL,
    Salario double NOT NULL,
    Matricula int NOT NULL UNIQUE
);

INSERT INTO funcionarios (ID_Funcionario, Primeiro_Nome, Sobrenome, Cargo, Salario, Matricula) 
	VALUES 
    (1, "João", "Antônio da Silva", "Auxiliar Administrativo", 3000, 12456),
    (2, "Pedro", "Sousa Santos", "Motorista", 2000, 14523),
    (3, "Maria Tereza", "Carmago Mota", "Supervisora", 4000, 45178),
    (4, "Ana Luísa", "Macedo", "Analista Financeiro", 3500, 78549),
    (5, "Thiago", "Araujo Pereira", "Estagiário", 1000, 98754);
    
SELECT * FROM funcionarios WHERE Salario > 2000;

SELECT * FROM funcionarios WHERE Salario < 2000;

UPDATE funcionarios 
	SET Cargo = "Analista Junior", Salario = 1500
    WHERE Cargo = "Estagiário";
    
    
    
#Atividade 2
CREATE DATABASE db_ecommerce;

CREATE TABLE produtos(
	ID_Produto INT NOT NULL UNIQUE,
    Nome varchar(72) NOT NULL,
    Categoria varchar(72) NOT NULL,
    Preco double NOT NULL,
    Quantidade_Estoque int NOT NULL);
    
INSERT INTO produtos (ID_Produto, Nome, Categoria, Preco, Quantidade_Estoque)
	VAlUES
    (1, "TV", "Eletrodoméstico", 2500, 10),
    (2, "Microondas", "Eletrodoméstico", 500, 7),
    (3, "Notebook", "Informática", 3500, 9),
    (4, "Impressora", "Informática", 700, 6),
    (5, "Mesa", "Móveis", 450, 3),
    (6, "Cadeira", "Móveis", 150, 8),
    (7, "Urso de Pelúcia", "Infantil", 250, 7),
    (8, "Quebra-Cabeças", "Infantil", 150, 11);
    
SELECT * FROM produtos WHERE Preco > 500;

SELECT * FROM produtos WHERE Preco < 500;

UPDATE produtos
	SET Quantidade_Estoque = 10
    WHERE Quantidade_Estoque < 8;
    
    
    
#Atividade 3
CREATE DATABASE db_escola;

USE db_escola;

CREATE TABLE alunos(
	ID_Aluno INT NOT NULL UNIQUE,
    Primeiro_Nome varchar(32) NOT NULL,
    Sobrenome varchar(48) NOT NULL,
    Turma varchar(48) NOT NULL,
    Nota_Media double NOT NULL,
    Matricula int NOT NULL UNIQUE
);

INSERT INTO alunos (ID_Aluno, Primeiro_Nome, Sobrenome, Turma, Nota_Media, Matricula) 
	VALUES 
    (1, "João", "Antônio da Silva", "5º A", 7.5, 12456),
    (2, "Pedro", "Sousa Santos", "6º B", 6.5, 14523),
    (3, "Maria Tereza", "Carmago Mota", "6º C", 8, 45178),
    (4, "Ana Luísa", "Macedo", "6º A", 5.5, 78549),
    (5, "Thiago", "Araujo Pereira", "5º B", 9.2, 98754),
    (6, "Guilherme", "Augusto Siqueira", "5º C", 4.2, 52698),
    (7, "Gabriel", "Tesles Guerra", "5º D", 7.3, 45198),
    (8, "Sarah", "Faleiro", "6º B", 8.4, 74589);
    
SELECT * FROM alunos WHERE Nota_Media > 7.0;

SELECT * FROM alunos WHERE Nota_Media < 7.0;

UPDATE alunos 
	SET Nota_Media = 7.5
    WHERE Nota_Media > 7.0 AND Nota_Media < 7.5;
