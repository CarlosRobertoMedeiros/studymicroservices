/*Exclui o Banco de Dados Caso Exista*/
DROP DATABASE IF EXISTS fornecedor;

/*Use o schema Criado */
CREATE DATABASE fornecedor CHARACTER SET = 'utf8' COLLATE = 'utf8_general_ci';

/* Cria a tabela InfoFornecedor */
CREATE TABLE InfoFornecedor(
  ID int not null AUTO_INCREMENT,
  NOME varchar(255) not null,
  ESTADO varchar(2) not null,
  ENDERECO varchar(255) not null,
  PRIMARY KEY ( ID )
);


/*Por enquanto Setar as opções assim*/
/*TODO: Corrigir o Script para o Charset e o Collate vir direto*/
/*
SET character_set_client = utf8;
SET character_set_connection = utf8;
SET character_set_results = utf8;
SET collation_connection = utf8_general_ci;
*/

/* Popula a Tabela com Informações*/
INSERT INTO InfoFornecedor(NOME,ESTADO,ENDERECO) VALUES ("Carlos Roberto","GO","Casa do Carlos");
INSERT INTO InfoFornecedor(NOME,ESTADO,ENDERECO) VALUES ("Antônio Ribeiro","DF","Casa do Antônio ");


