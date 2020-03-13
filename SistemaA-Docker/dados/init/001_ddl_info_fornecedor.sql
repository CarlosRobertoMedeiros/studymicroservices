/*Use o schema Criado */
create schema "fornecedor"

CREATE SEQUENCE fornecedor.InfoFornecedor_seq;

CREATE TABLE fornecedor.InfoFornecedor(
  ID int not null default nextval('fornecedor.InfoFornecedor_seq'),
  NOME varchar(255) not null,
  ESTADO varchar(2) not null,
  ENDERECO varchar(255) not null,
  PRIMARY KEY ( ID )
);