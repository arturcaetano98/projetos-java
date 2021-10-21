create database escola

use escola

create table aluno (
id INT PRIMARY KEY IDENTITY (1, 1),
nome VARCHAR(255),
telefone VARCHAR(255),
email VARCHAR(255)); 

select * from aluno

drop database escola