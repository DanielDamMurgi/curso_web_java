create table "ADMINISTRADOR".USUARIO(
	id int not null GENERATED ALWAYS AS IDENTITY(START WITH 1, INCREMENT BY 1),
	nombre varchar(50) not null,
	edad integer not null,
	email varchar(200) unique not null,
	password varchar(50) not null,
	constraint pk primary key (id)
);