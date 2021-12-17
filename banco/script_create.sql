CREATE DATABASE db_expo;

USE db_expo;

CREATE TABLE usuario(
	id int PRIMARY KEY auto_increment,
    email VARCHAR(50) NOT NULL UNIQUE,
    nome VARCHAR(50) NOT NULL,
    nascimento DATE NOT NULL
);