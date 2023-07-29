create table clientes(
    idcliente serial not null primary key,
    paterno varchar,
    materno varchar,
    nombres varchar,
    genero varchar,
    fechanacimiento date default now()
);

create table cuentas(
    idcuenta serial not null primary key,
    idcliente integer,
    cuenta varchar,
    foreign key (idcliente) references clientes (idcliente)
);