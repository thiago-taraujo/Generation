#Atividade 1
CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classes(
	ID_Classe INT AUTO_INCREMENT PRIMARY KEY,
    Nome_Classe VARCHAR(48) NOT NULL,
    Funcao VARCHAR(32) NOT NULL
);

DROP TABLE tb_personagens;

CREATE TABLE tb_personagens(
	ID_Personagem INT AUTO_INCREMENT PRIMARY KEY,
    Nome_Personagem VARCHAR(48) NOT NULL,
    HP INT NOT NULL,
    Ataque INT NOT NULL,
    Defesa INT NOT NULL,
    ID_Classe INT NOT NULL,
    FOREIGN KEY (ID_Classe) REFERENCES tb_classes(ID_Classe)
);

INSERT INTO tb_classes(Nome_Classe, Funcao)
	VALUES
    ("Paladino", "Suporte"),
    ("Sacerdote", "Suporte"),
    ("Arqueiro", "Atirador"),
    ("Guerreiro", "Tanker"),
    ("Cavaleiro", "Tanker");
    
INSERT INTO tb_personagens(Nome_Personagem, HP, Ataque, Defesa, ID_Classe)
	VALUES
    ("Thor", 150, 1800, 3000, 4),
    ("Sniper", 100, 2500, 1200, 3),
    ("Adric", 130, 1900, 2400, 1),
    ("Hardalis", 150, 1700, 3000, 5),
    ("Shandra", 110, 1950, 2300, 2),
    ("Bolthorn", 120, 2600, 1000, 3),
    ("Oriseus", 110, 2400, 1300, 3),
    ("Thrael", 150, 1750, 3000, 5);
    
SELECT * FROM tb_personagens WHERE Ataque > 2000;

SELECT * FROM tb_personagens WHERE Defesa BETWEEN 1000 AND 2000;

SELECT * FROM tb_personagens WHERE Nome_Personagem LIKE "%c%";

SELECT * 
FROM tb_personagens p
INNER JOIN tb_classes c
ON p.ID_Classe = c.ID_Classe;

SELECT * 
FROM tb_personagens p
INNER JOIN tb_classes c
ON p.ID_Classe = c.ID_Classe
WHERE c.Nome_Classe = "Arqueiro";



#Atividade 2
CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categorias(
	ID_Categoria INT AUTO_INCREMENT PRIMARY KEY,
    Nome_Categoria VARCHAR(32) NOT NULL,
    Tipo VARCHAR(32) NOT NULL
    );

CREATE TABLE tb_pizzas(
	ID_Pizza INT AUTO_INCREMENT PRIMARY KEY,
    Nome_Pizza VARCHAR(32) NOT NULL,
    Preco FLOAT NOT NULL,
    Ingredientes VARCHAR(128) NOT NULL,
    Numero_Pedacos INT NOT NULL,
    ID_Categoria INT NOT NULL,
    FOREIGN KEY (ID_Categoria) REFERENCES tb_categorias(ID_Categoria)
    );
    
INSERT INTO tb_categorias(Nome_Categoria, Tipo)
	VALUES
    ("Premium", "Salgada"),
    ("Super Premium", "Salgada"),
    ("Doce", "Doce"),
    ("Doce Premium", "Doce"),
    ("Vegana", "Salgada");
    
INSERT INTO tb_pizzas(Nome_Pizza, Preco, Ingredientes, Numero_Pedacos, ID_Categoria)
	VALUES
    ("Calabresa", 39.90, "Calabresa, Cebola, Molho e Mussarela", 8, 1),
    ("Frango com Catupiry", 41.90, "Frango, Catupiry, Molho e Mussarela", 8, 1),
    ("Atum", 59.90, "Atum, Cebola, Molho e Mussarela", 8, 2),
    ("Marguerita", 69.90, "Manjericão, Azeite, Molho e Mussarela", 8, 2),
    ("Morango com Chocolate", 79.90, "Morango e Chocolate", 6, 3),
    ("Uva com Chocolate", 79.90, "Uva e Chocolate", 6, 3),
    ("Morango com Nutella", 99.90, "Morango e Nutella", 6, 4),
    ("Vegana", 159.90, "Alface", 2, 5);
    
SELECT * FROM tb_pizzas WHERE Preco > 45;

SELECT * FROM tb_pizzas WHERE Preco BETWEEN 50 AND 100;

SELECT * FROM tb_pizzas WHERE Nome_Pizza LIKE "%m%";

SELECT * 
FROM tb_pizzas p
INNER JOIN tb_categorias c
ON p.ID_Categoria = c.ID_Categoria;

SELECT * 
FROM tb_pizzas p
INNER JOIN tb_categorias c
ON p.ID_Categoria = c.ID_Categoria
WHERE c.Tipo = "Doce";
