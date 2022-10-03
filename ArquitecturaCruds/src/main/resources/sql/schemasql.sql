create table VMS
(
    id        integer not null,
    nombre    varchar2(30),
    kilometro nvarchar2(20),
    ubicacion nvarchar2(30),
    tipo      nvarchar2(10),
    carretera nvarchar2(40),
    estado    boolean
);

alter table VMS
    add carretera nvarchar2(40);



create table sensores
(
    id        integer not null,
    nombre    varchar2(30),
    kilometro nvarchar2(20),
    ubicacion nvarchar2(30),
    tipo      nvarchar2(10),
    carretera nvarchar2(40),
    estado    boolean
);
