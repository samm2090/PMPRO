drop database if exists proyectospro;

create database proyectospro;
use proyectospro;

-- Tables
-- Table Area
CREATE TABLE Area (
    codigo int  NOT NULL  AUTO_INCREMENT,
    des varchar(20)  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT Area_pk PRIMARY KEY (codigo)
);

-- Table DatosPersona
CREATE TABLE DatosPersona (
    codigo int  NOT NULL  AUTO_INCREMENT,
    nombre varchar(50)  NOT NULL,
    apellido varchar(50)  NOT NULL,
    correo varchar(100)  NULL,
    direccion varchar(100)  NULL,
    telefono varchar(20)  NULL,
    fechaNac date  NULL,
    dni varchar(20)  NULL,
    CONSTRAINT DatosPersona_pk PRIMARY KEY (codigo)
);

-- Table Estado
CREATE TABLE Estado (
    codigo int  NOT NULL  AUTO_INCREMENT,
    des varchar(20)  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT Estado_pk PRIMARY KEY (codigo)
);

-- Table Fase
CREATE TABLE Fase (
    codigo int  NOT NULL  AUTO_INCREMENT,
    des varchar(20)  NOT NULL,
    orden int  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT Fase_pk PRIMARY KEY (codigo)
);

-- Table Gerente
CREATE TABLE Gerente (
    codigo int  NOT NULL  AUTO_INCREMENT,
    codUsuario int  NOT NULL,
    codDatosPersona int  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT Gerente_pk PRIMARY KEY (codigo)
);

-- Table Incidencia
CREATE TABLE Incidencia (
    codigo int  NOT NULL  AUTO_INCREMENT,
    des varchar(100)  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT Incidencia_pk PRIMARY KEY (codigo)
);

-- Table Interesado
CREATE TABLE Interesado (
    codigo int  NOT NULL  AUTO_INCREMENT,
    empresa varchar(60)  NULL,
    direccionE varchar(100)  NULL,
    telefonoE varchar(20)  NULL,
    paginaWeb varchar(100)  NULL,
    codDatosPersona int  NOT NULL,
    codProyecto int  NOT NULL,
    sponsor bool  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT Interesado_pk PRIMARY KEY (codigo)
);

-- Table PDocumento
CREATE TABLE PDocumento (
    codigo int  NOT NULL  AUTO_INCREMENT,
    codPFase int  NOT NULL,
    codDocumento1 int  NULL,
    fechaSubido date  NOT NULL,
    ruta varchar(200)  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT PDocumento_pk PRIMARY KEY (codigo)
);

-- Table PFase
CREATE TABLE PFase (
    codigo int  NOT NULL  AUTO_INCREMENT,
    codigoFase int  NOT NULL,
    codPProyecto int  NOT NULL,
    codEstado int  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT PFase_pk PRIMARY KEY (codigo)
);

-- Table PIncidencia
CREATE TABLE PIncidencia (
    codigo int  NOT NULL  AUTO_INCREMENT,
    des varchar(100)  NOT NULL,
    codUrgencia int  NOT NULL,
    atendido bool  NOT NULL,
    codFase int  NOT NULL,
    codPTarea int  NULL,
    proyManager bool  NOT NULL,
    fechaCreacion date  NOT NULL,
    fechaAtencion date  NULL,
    activo bool  NOT NULL,
    CONSTRAINT PIncidencia_pk PRIMARY KEY (codigo)
);

-- Table PManager
CREATE TABLE PManager (
    codigo int  NOT NULL  AUTO_INCREMENT,
    codUsuario int  NOT NULL,
    codDatosPersona int  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT PManager_pk PRIMARY KEY (codigo)
);

-- Table PManagerProyecto
CREATE TABLE PManagerProyecto (
    codigo int  NOT NULL  AUTO_INCREMENT,
    codPManager int  NOT NULL,
    codProyecto int  NOT NULL,
    activo bool  NOT NULL,
    fechaIngreso date  NOT NULL,
    fechaDesactivacion date NULL,
    CONSTRAINT PManagerProyecto_pk PRIMARY KEY (codigo)
);

-- Table PRecursoXGrupoT
CREATE TABLE PRecursoXGrupoT (
    codigo int  NOT NULL  AUTO_INCREMENT,
    codRecurso int  NOT NULL,
    codATarea int  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT PRecursoXGrupoT_pk PRIMARY KEY (codigo)
);

-- Table Portafolio
CREATE TABLE Portafolio (
    codigo int  NOT NULL  AUTO_INCREMENT,
    nombre varchar(50)  NOT NULL,
    des varchar(300) NOT NULL,
    codPManager int  NOT NULL,
    codGerente int  NOT NULL,
    fechaCreado date  NOT NULL,
    activo bool  NOT NULL  DEFAULT 1,
    CONSTRAINT Portafolio_pk PRIMARY KEY (codigo)
);

-- Table Proyecto
CREATE TABLE Proyecto (
    codigo int  NOT NULL  AUTO_INCREMENT,
    codPPortafolio int  NOT NULL,
    nombre varchar(50), 
    des varchar(300) NOT NULL,
    desdeCero bool  NOT NULL,
    codEstado int  NOT NULL,
    fechaCreado date  NOT NULL,
    activo bool  NOT NULL,
    visible bool  NOT NULL  DEFAULT 0,
    CONSTRAINT Proyecto_pk PRIMARY KEY (codigo)
);

-- Table Recurso
CREATE TABLE Recurso (
    codigo int  NOT NULL  AUTO_INCREMENT,
    codUsuario int  NOT NULL,
    codDatosPersona int  NOT NULL,
    codArea int  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT Recurso_pk PRIMARY KEY (codigo)
);

-- Table Rol
CREATE TABLE Rol (
    codigo int  NOT NULL  AUTO_INCREMENT,
    noCodigo varchar(10)  NOT NULL,
    des varchar(20)  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT Rol_pk PRIMARY KEY (codigo)
);

-- Table Tarea
CREATE TABLE Tarea (
    codigo int  NOT NULL  AUTO_INCREMENT,
    des varchar(150)  NOT NULL,
    Area_codigo int  NULL,
    activo bool  NOT NULL,
    CONSTRAINT Tarea_pk PRIMARY KEY (codigo)
);

-- Table Urgencia
CREATE TABLE Urgencia (
    codigo int  NOT NULL,
    des varchar(20)  NOT NULL,
    CONSTRAINT Urgencia_pk PRIMARY KEY (codigo)
);

-- Table Usuario
CREATE TABLE Usuario (
    codigo int  NOT NULL  AUTO_INCREMENT,
    user varchar(60)  NOT NULL unique,
    password char(60)  NOT NULL,
    preguntaS varchar(60)  NULL,
    respuestaS varchar(60)  NULL,
    ultimoIngreso date  NULL,
    activo bool  NOT NULL,
    fechaCreacion date  NOT NULL,
    CONSTRAINT Usuario_pk PRIMARY KEY (codigo)
);

-- Table UsuarioRol
CREATE TABLE UsuarioRol (
    codigo int  NOT NULL  AUTO_INCREMENT,
    codUsuario int  NOT NULL,
    codRol int  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT UsuarioRol_pk PRIMARY KEY (codigo)
);

-- Table atarea
CREATE TABLE atarea (
    codigo int  NOT NULL  AUTO_INCREMENT,
    codATareaPadre int NULL,
    codEstado int  NOT NULL,
    codPFase int NULL,
    codArea int  NOT NULL,
    fechaInicioPr date  NOT NULL,
    fechaFinPr date  NOT NULL,
    fechaInicioPu date  NOT NULL,
    fechaFinPu date  NOT NULL,
    fechaInicioRe date  NULL,
    fechaFinRe date NULL,
    des varchar(150)  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT atarea_pk PRIMARY KEY (codigo)
);

-- Table supervisor
CREATE TABLE supervisor (
    codigo int  NOT NULL  AUTO_INCREMENT,
    codArea int  NOT NULL,
    codUsuario int  NOT NULL,
    codDatosPersona int  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT supervisor_pk PRIMARY KEY (codigo)
);

-- foreign keys
-- Reference:  Documento_Documento (table: PDocumento)


ALTER TABLE PDocumento ADD CONSTRAINT Documento_Documento FOREIGN KEY Documento_Documento (codDocumento1)
    REFERENCES PDocumento (codigo);
-- Reference:  Documento_proyectoxfase (table: PDocumento)


ALTER TABLE PDocumento ADD CONSTRAINT Documento_proyectoxfase FOREIGN KEY Documento_proyectoxfase (codPFase)
    REFERENCES PFase (codigo);
-- Reference:  Interesados_aproyecto (table: Interesado)


ALTER TABLE Interesado ADD CONSTRAINT Interesados_aproyecto FOREIGN KEY Interesados_aproyecto (codProyecto)
    REFERENCES Proyecto (codigo);
-- Reference:  PFase_Fase (table: PFase)


ALTER TABLE PFase ADD CONSTRAINT PFase_Fase FOREIGN KEY PFase_Fase (codigoFase)
    REFERENCES Fase (codigo);
-- Reference:  PIncidencia_Urgencia (table: PIncidencia)


ALTER TABLE PIncidencia ADD CONSTRAINT PIncidencia_Urgencia FOREIGN KEY PIncidencia_Urgencia (codUrgencia)
    REFERENCES Urgencia (codigo);
-- Reference:  PRecursoXGrupoT_Recurso (table: PRecursoXGrupoT)


ALTER TABLE PRecursoXGrupoT ADD CONSTRAINT PRecursoXGrupoT_Recurso FOREIGN KEY PRecursoXGrupoT_Recurso (codRecurso)
    REFERENCES Recurso (codigo);
-- Reference:  PRecursoXGrupoT_atarea (table: PRecursoXGrupoT)


ALTER TABLE PRecursoXGrupoT ADD CONSTRAINT PRecursoXGrupoT_atarea FOREIGN KEY PRecursoXGrupoT_atarea (codATarea)
    REFERENCES atarea (codigo);
-- Reference:  Recurso_dPersona (table: Recurso)


ALTER TABLE Recurso ADD CONSTRAINT Recurso_dPersona FOREIGN KEY Recurso_dPersona (codDatosPersona)
    REFERENCES DatosPersona (codigo);
-- Reference:  Recurso_tipoRecurso (table: Recurso)


ALTER TABLE Recurso ADD CONSTRAINT Recurso_tipoRecurso FOREIGN KEY Recurso_tipoRecurso (codArea)
    REFERENCES Area (codigo);
-- Reference:  Recurso_usuario (table: Recurso)


ALTER TABLE Recurso ADD CONSTRAINT Recurso_usuario FOREIGN KEY Recurso_usuario (codUsuario)
    REFERENCES Usuario (codigo);
-- Reference:  afase_estado (table: PFase)


ALTER TABLE PFase ADD CONSTRAINT afase_estado FOREIGN KEY afase_estado (codEstado)
    REFERENCES Estado (codigo);
-- Reference:  aincidencias_atarea (table: PIncidencia)


ALTER TABLE PIncidencia ADD CONSTRAINT aincidencias_atarea FOREIGN KEY aincidencias_atarea (codPTarea)
    REFERENCES atarea (codigo);
-- Reference:  aincidencias_proyectoxfase (table: PIncidencia)


ALTER TABLE PIncidencia ADD CONSTRAINT aincidencias_proyectoxfase FOREIGN KEY aincidencias_proyectoxfase (codFase)
    REFERENCES PFase (codigo);
-- Reference:  aportafolio_gerente (table: Portafolio)


ALTER TABLE Portafolio ADD CONSTRAINT aportafolio_gerente FOREIGN KEY aportafolio_gerente (codGerente)
    REFERENCES Gerente (codigo);
-- Reference:  aportafolio_pmanager (table: Portafolio)


ALTER TABLE Portafolio ADD CONSTRAINT aportafolio_pmanager FOREIGN KEY aportafolio_pmanager (codPManager)
    REFERENCES PManager (codigo);
-- Reference:  aproyecto_aportafolio (table: Proyecto)


ALTER TABLE Proyecto ADD CONSTRAINT aproyecto_aportafolio FOREIGN KEY aproyecto_aportafolio (codPPortafolio)
    REFERENCES Portafolio (codigo);
-- Reference:  aproyecto_estado (table: Proyecto)


ALTER TABLE Proyecto ADD CONSTRAINT aproyecto_estado FOREIGN KEY aproyecto_estado (codEstado)
    REFERENCES Estado (codigo);
-- Reference:  atarea_Disciplina (table: atarea)


ALTER TABLE atarea ADD CONSTRAINT atarea_Disciplina FOREIGN KEY atarea_Disciplina (codArea)
    REFERENCES Area (codigo);
-- Reference:  atarea_Historico (table: atarea)


ALTER TABLE atarea ADD CONSTRAINT atarea_Historico FOREIGN KEY atarea_Historico (codATareaPadre)
    REFERENCES atarea (codigo);
-- Reference:  atarea_estado (table: atarea)


ALTER TABLE atarea ADD CONSTRAINT atarea_estado FOREIGN KEY atarea_estado (codEstado)
    REFERENCES Estado (codigo);
-- Reference:  atarea_proyectoxfase (table: atarea)


ALTER TABLE atarea ADD CONSTRAINT atarea_proyectoxfase FOREIGN KEY atarea_proyectoxfase (codPFase)
    REFERENCES PFase (codigo);
-- Reference:  gerente_dPersona (table: Gerente)


ALTER TABLE Gerente ADD CONSTRAINT gerente_dPersona FOREIGN KEY gerente_dPersona (codDatosPersona)
    REFERENCES DatosPersona (codigo);
-- Reference:  gerente_usuario (table: Gerente)


ALTER TABLE Gerente ADD CONSTRAINT gerente_usuario FOREIGN KEY gerente_usuario (codUsuario)
    REFERENCES Usuario (codigo);
-- Reference:  pmanager_dPersona (table: PManager)


ALTER TABLE PManager ADD CONSTRAINT pmanager_dPersona FOREIGN KEY pmanager_dPersona (codDatosPersona)
    REFERENCES DatosPersona (codigo);
-- Reference:  pmanager_usuario (table: PManager)


ALTER TABLE PManager ADD CONSTRAINT pmanager_usuario FOREIGN KEY pmanager_usuario (codUsuario)
    REFERENCES Usuario (codigo);
-- Reference:  pmanagerxproyecto_aproyecto (table: PManagerProyecto)


ALTER TABLE PManagerProyecto ADD CONSTRAINT pmanagerxproyecto_aproyecto FOREIGN KEY pmanagerxproyecto_aproyecto (codProyecto)
    REFERENCES Proyecto (codigo);
-- Reference:  pmanagerxproyecto_pmanager (table: PManagerProyecto)


ALTER TABLE PManagerProyecto ADD CONSTRAINT pmanagerxproyecto_pmanager FOREIGN KEY pmanagerxproyecto_pmanager (codPManager)
    REFERENCES PManager (codigo);
-- Reference:  proyectoxfase_aproyecto (table: PFase)


ALTER TABLE PFase ADD CONSTRAINT proyectoxfase_aproyecto FOREIGN KEY proyectoxfase_aproyecto (codPProyecto)
    REFERENCES Proyecto (codigo);
-- Reference:  sponsor_dPersona (table: Interesado)


ALTER TABLE Interesado ADD CONSTRAINT sponsor_dPersona FOREIGN KEY sponsor_dPersona (codDatosPersona)
    REFERENCES DatosPersona (codigo);
-- Reference:  supervisor_Disciplina (table: supervisor)


ALTER TABLE supervisor ADD CONSTRAINT supervisor_Disciplina FOREIGN KEY supervisor_Disciplina (codArea)
    REFERENCES Area (codigo);
-- Reference:  supervisor_dPersona (table: supervisor)


ALTER TABLE supervisor ADD CONSTRAINT supervisor_dPersona FOREIGN KEY supervisor_dPersona (codDatosPersona)
    REFERENCES DatosPersona (codigo);
-- Reference:  supervisor_usuario (table: supervisor)


ALTER TABLE supervisor ADD CONSTRAINT supervisor_usuario FOREIGN KEY supervisor_usuario (codUsuario)
    REFERENCES Usuario (codigo);
-- Reference:  tarea_Area (table: Tarea)


ALTER TABLE Tarea ADD CONSTRAINT tarea_Area FOREIGN KEY tarea_Area (Area_codigo)
    REFERENCES Area (codigo);
-- Reference:  usuarioxrol_rol (table: UsuarioRol)


ALTER TABLE UsuarioRol ADD CONSTRAINT usuarioxrol_rol FOREIGN KEY usuarioxrol_rol (codRol)
    REFERENCES Rol (codigo);
-- Reference:  usuarioxrol_usuario (table: UsuarioRol)


ALTER TABLE UsuarioRol ADD CONSTRAINT usuarioxrol_usuario FOREIGN KEY usuarioxrol_usuario (codUsuario)
    REFERENCES Usuario (codigo);


-- End of file.
insert into usuario(user, password,preguntas,respuestas,ultimoIngreso,activo,fechaCreacion) values('macevedo','12345','color favorito','amarillo',curdate(),1,curdate());
insert into usuario(user, password,preguntas,respuestas,ultimoIngreso,activo,fechaCreacion) values('tacosta','12345','color favorito','verde',curdate(),1,curdate());
insert into usuario(user, password,preguntas,respuestas,ultimoIngreso,activo,fechaCreacion) values('cacosta','12345','color favorito','naranja',curdate(),1,curdate());
insert into usuario(user, password,preguntas,respuestas,ultimoIngreso,activo,fechaCreacion) values('iaguilar','12345','color favorito','rojo',curdate(),1,curdate());
insert into usuario(user, password,preguntas,respuestas,ultimoIngreso,activo,fechaCreacion) values('maguilar','12345','color favorito','rosado',curdate(),1,curdate());
insert into usuario(user, password,preguntas,respuestas,ultimoIngreso,activo,fechaCreacion) values('maraguilar','12345','color favorito','negro',curdate(),1,curdate());
insert into usuario(user, password,preguntas,respuestas,ultimoIngreso,activo,fechaCreacion) values('faguilar','12345','color favorito','gris',curdate(),1,curdate());
insert into usuario(user, password,preguntas,respuestas,ultimoIngreso,activo,fechaCreacion) values('salarcon','12345','color favorito','azul',curdate(),1,curdate());
insert into usuario(user, password,preguntas,respuestas,ultimoIngreso,activo,fechaCreacion) values('galarcon','12345','color favorito','celeste',curdate(),1,curdate());
insert into usuario(user, password,preguntas,respuestas,ultimoIngreso,activo,fechaCreacion) values('halatriste','12345','color favorito','turquesa',curdate(),1,curdate());
insert into usuario(user, password,preguntas,respuestas,ultimoIngreso,activo,fechaCreacion) values('jalcantar','12345','color favorito','fuxia',curdate(),1,curdate());
insert into usuario(user, password,preguntas,respuestas,ultimoIngreso,activo,fechaCreacion) values('ralcoverde','12345','color favorito','plateado',curdate(),1,curdate());
insert into usuario(user, password,preguntas,respuestas,ultimoIngreso,activo,fechaCreacion) values('jalderete','12345','color favorito','blanco',curdate(),1,curdate());

-- datos de personas
insert into datospersona(nombre,apellido,correo,direccion,telefono,fechanac,dni)values('maria','acevedo','mariaacevedo@hotmail.com','jr. armendaris 123','2345671','1988-07-15','45432367');
insert into datospersona(nombre,apellido,correo,direccion,telefono,fechanac,dni)values('tomas','acosta','tomasacosta@hotmail.com','jr. placencia 678','7788332','1987-10-25','44457367');
insert into datospersona(nombre,apellido,correo,direccion,telefono,fechanac,dni)values('celina','acosta','celinaacosta@hotmail.com','jr. chucuito 7934','6456767','1986-01-08','42438367');
insert into datospersona(nombre,apellido,correo,direccion,telefono,fechanac,dni)values('irma','aguilar','irmaaguilar@hotmail.com','jr. pedregales 567','7243859','1985-07-15','40452787');
insert into datospersona(nombre,apellido,correo,direccion,telefono,fechanac,dni)values('maria','aguilar','mariaaguilar@hotmail.com','jr. caja tambo 1056','5689368','1984-09-29','41087332');
insert into datospersona(nombre,apellido,correo,direccion,telefono,fechanac,dni)values('marcela','aguilar','marcelaaguilar@hotmail.com','jr. posito 2370','4359681','1983-11-25','44428689');
insert into datospersona(nombre,apellido,correo,direccion,telefono,fechanac,dni)values('fredy','aguilar','fredyaguilar@hotmail.com','jr. amazonas 8765','5364859','1982-02-14','41782717');
insert into datospersona(nombre,apellido,correo,direccion,telefono,fechanac,dni)values('salomon','alarcon','mariaacevedo@hotmail.com','jr. armendaris 123','2345671','1981-05-19','46386397');
insert into datospersona(nombre,apellido,correo,direccion,telefono,fechanac,dni)values('gerardo','alarcon','gerardoalarcon@hotmail.com','jr. miroquezada 1083','7683663','1982-03-11','42764746');
insert into datospersona(nombre,apellido,correo,direccion,telefono,fechanac,dni)values('hipolito','alatriste','hipolitoalatriste@hotmail.com','calle. 5 esquinas 666','2347638','1984-12-24','44874674');
insert into datospersona(nombre,apellido,correo,direccion,telefono,fechanac,dni)values('jose','alcantar','josealcantar@hotmail.com','jr. cerecitas 8763','6543798','1985-04-10','48635370');
insert into datospersona(nombre,apellido,correo,direccion,telefono,fechanac,dni)values('roberto','alcoverde','robertoalcoverde@hotmail.com','jr. jesuita 777','5363589','1986-09-23','47534973');

-- datos de rol
insert into rol (nocodigo,des,activo) values('ger','Gerente',1);
insert into rol (nocodigo,des,activo) values('pm','Project Manager',1);
insert into rol (nocodigo,des,activo) values('adm','Administrador',1);
insert into rol (nocodigo,des,activo) values('sup','Supervisor',1);
insert into rol (nocodigo,des,activo) values('rec','Recurso',1);
select u.user,r.nocodigo from usuario as u join usuariorol as ur on u.codigo=ur.codUsuario join
rol as r on r.codigo=ur.codUsuario;

select * from recurso;
select * from PRecursoXGrupoT;
select * from atarea;
insert into PRecursoXGrupoT(codRecurso,codAtarea,activo) values(1,1,1);

-- datos usuarioRol
insert into usuarioRol(codUsuario,codRol,activo) values(1,1,1);
insert into usuarioRol(codUsuario,codRol,activo) values(2,2,1);
insert into usuarioRol(codUsuario,codRol,activo) values(3,3,1);
insert into usuarioRol(codUsuario,codRol,activo) values(4,4,1);
insert into usuarioRol(codUsuario,codRol,activo) values(5,5,1);


-- datos fase
insert into fase(des,activo,orden) values('Analisis',1,1);
insert into fase(des,activo,orden) values('Diseño',1,2);
insert into fase(des,activo,orden) values('Desarrollo',1,3);
insert into fase(des,activo,orden) values('Certificaciones',1,4);

-- datos area
select * from area;
insert into area(des,activo)values('Analisis',1);
insert into area(des,activo)values('Desarrollo',1);
insert into area(des,activo)values('Certificacion',1);

-- datos supervisor
insert into supervisor(codarea,codusuario,coddatospersona,activo)values(1,4,4,1);


-- datos gerente
insert into gerente(codusuario,coddatospersona,activo) values(1,1,1);

-- datos pmanager
insert into pmanager(codusuario,coddatospersona,activo)values(2,2,1);

-- datos estado
insert into estado(des,activo)values('abierto',1);
insert into estado(des,activo)values('iniciado',1);
insert into estado(des,activo)values('pausado',1);
insert into estado(des,activo)values('finalizado',1);

-- datos portafolio
select * from portafolio;
insert into portafolio(nombre,des,codpmanager,codgerente,fechacreado,activo) values('Portafolio1','Esta es la primera prueba de portafolio',1,1,'2015-11-03',true);
insert into portafolio(nombre,des,codpmanager,codgerente,fechacreado,activo) values('Portafolio2','Esta es la segunda prueba de portafolio',1,1,'2015-11-03',true);

-- datos proyecto
insert into proyecto(codpportafolio,nombre,des,desdecero,codestado,fechaCreado,activo)values(1,'Proyecto1','Prueba de proyecto 1',1,1,'2015-11-03',1);
insert into proyecto(codpportafolio,nombre,des,desdecero,codestado,fechaCreado,activo)values(1,'Proyecto2','Prueba de proyecto 1',1,1,'2015-11-03',1);
insert into proyecto(codpportafolio,nombre,des,desdecero,codestado,fechaCreado,activo)values(2,'BCP','Prueba de proyecto para el BCP',1,1,'2015-11-03',1);

-- datos interesado
insert into interesado(empresa,direccione,telefonoe,paginaweb,coddatospersona,codproyecto,sponsor,activo) values('BCP','av. proceres 2456','7635843','BCP@BCP.com',6,1,1,1);

-- datod recurso
insert into recurso(codUsuario,codDatosPersona,codArea,activo) values(5,5,1,1);

use proyectospro;
select * from pfase;
select * from proyecto;
select * from atarea;
select * from usuario u join usuariorol ur on u.codigo=ur.codUsuario;
