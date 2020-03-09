
drop database if exists fornecedor;
drop table if exists InfoFornecedor;

CREATE DATABASE fornecedor CHARACTER SET utf8 COLLATE utf8_general_ci;

create table InfoFornecedor(
  ID int not null AUTO_INCREMENT,
  NOME varchar(100) not null,
  ESTADO varchar(2) not null,
  ENDERECO varchar(100) not null,
  PRIMARY KEY ( ID )
);

