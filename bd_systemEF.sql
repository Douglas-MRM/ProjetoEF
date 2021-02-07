create database bd_systemEF;

use bd_systemEF;

create table usuario(
	id_user int not null primary key auto_increment,
    nome_user varchar(100) not null,
    senha_user varchar(600) not null,
    email_user varchar(100),
    cpf_user varchar(14) not null,
    tipo_user varchar(100) not null
);
#select * from usuario;
insert into usuario values (null, 'Douglas Jerônimo da Silva', '123', 'douglaswwaff@gmail.com', '048.807.192-50', 'Administrador');