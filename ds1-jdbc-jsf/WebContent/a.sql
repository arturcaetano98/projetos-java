create database jdbc;
use jdbc;

create table produto (
id INT PRIMARY KEY IDENTITY (1, 1),
nome VARCHAR(50),
descricao VARCHAR(255),
preco float); 

select * from produto

INSERT INTO produto (nome, descricao, preco)
VALUES ('haha', 'haha', 1.0);

drop database jdbc;