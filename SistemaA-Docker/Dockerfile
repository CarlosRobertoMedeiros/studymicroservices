# Derivando da imagem oficial do MariaDB
FROM mariadb:latest

# Adicionando os scripts SQL para serem executados na criação do banco
COPY ./db/ /docker-entrypoint-initdb.d/

