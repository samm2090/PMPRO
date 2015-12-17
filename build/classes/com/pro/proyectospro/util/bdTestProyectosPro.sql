-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2015-11-14 00:02:49.513




-- tables
-- Table Area
CREATE TABLE Area (
    codigo int  NOT NULL  ,
    proyecto bool  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT Area_pk PRIMARY KEY (codigo)
);

-- Table DatosPersona
CREATE TABLE DatosPersona (
    codigo int  NOT NULL  ,
    nombres varchar(200)  NOT NULL,
    apellidos varchar(200)  NOT NULL,
    correo varchar(200)  NULL,
    direccion varchar(200)  NULL,
    telefono varchar(200)  NULL,
    fechaNac datetime  NULL,
    dni varchar(60)  NULL,
    sueldo decimal(14,2)  NULL,
    CONSTRAINT DatosPersona_pk PRIMARY KEY (codigo)
);

-- Table Estado
CREATE TABLE Estado (
    codigo int  NOT NULL  ,
    des varchar(60)  NOT NULL,
    tipo int  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT Estado_pk PRIMARY KEY (codigo)
);

-- Table Fase
CREATE TABLE Fase (
    codigo int  NOT NULL  ,
    des varchar(100)  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT Fase_pk PRIMARY KEY (codigo)
);

-- Table Gerente
CREATE TABLE Gerente (
    codigo int  NOT NULL  ,
    codUsuario int  NOT NULL,
    codDatosPersona int  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT Gerente_pk PRIMARY KEY (codigo)
);

-- Table GrupoTrabajo
CREATE TABLE GrupoTrabajo (
    codigo int  NOT NULL  ,
    des varchar(100)  NOT NULL,
    CONSTRAINT GrupoTrabajo_pk PRIMARY KEY (codigo)
);

-- Table Incidencia
CREATE TABLE Incidencia (
    codigo int  NOT NULL  ,
    des varchar(100)  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT Incidencia_pk PRIMARY KEY (codigo)
);

-- Table Interesado
CREATE TABLE Interesado (
    codigo int  NOT NULL  ,
    empresa varchar(60)  NULL,
    direccionE varchar(60)  NULL,
    telefonoE varchar(60)  NULL,
    paginaWeb varchar(60)  NULL,
    codDatosPersona int  NOT NULL,
    codProyecto int  NOT NULL,
    sponsor bool  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT Interesado_pk PRIMARY KEY (codigo)
);

-- Table PDocumento
CREATE TABLE PDocumento (
    codigo int  NOT NULL  ,
    codPFase int  NOT NULL,
    codDocumento1 int  NULL,
    fechaSubido datetime  NOT NULL,
    ruta varchar(200)  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT PDocumento_pk PRIMARY KEY (codigo)
);

-- Table PFase
CREATE TABLE PFase (
    codigo int  NOT NULL  ,
    codPProyecto int  NOT NULL,
    des varchar(100)  NOT NULL,
    codPFase int  NULL,
    codEstado int  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT PFase_pk PRIMARY KEY (codigo)
);

-- Table PGasto
CREATE TABLE PGasto (
    codigo int  NOT NULL  ,
    codProyecto int  NOT NULL,
    monto decimal(14,4)  NOT NULL,
    descripcion varchar(60)  NOT NULL,
    fechaRegistrado date  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT PGasto_pk PRIMARY KEY (codigo)
);

-- Table PIncidencia
CREATE TABLE PIncidencia (
    codigo int  NOT NULL  ,
    codFase int  NOT NULL,
    codUrgencia int  NOT NULL,
    atendido bool  NOT NULL,
    codPTarea int  NULL,
    proyManager bool  NOT NULL,
    fechaCreacion datetime  NOT NULL,
    fechaAtencion datetime  NULL,
    des varchar(100)  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT PIncidencia_pk PRIMARY KEY (codigo)
);

-- Table PManager
CREATE TABLE PManager (
    codigo int  NOT NULL  ,
    codUsuario int  NOT NULL,
    codDatosPersona int  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT PManager_pk PRIMARY KEY (codigo)
);

-- Table PManagerProyecto
CREATE TABLE PManagerProyecto (
    codigo int  NOT NULL  ,
    codPManager int  NOT NULL,
    codProyecto int  NOT NULL,
    activo bool  NOT NULL,
    fechaIngreso datetime  NOT NULL,
    fechaDesactivacion datetime  NOT NULL,
    CONSTRAINT PManagerProyecto_pk PRIMARY KEY (codigo)
);

-- Table PRecursoXGrupoT
CREATE TABLE PRecursoXGrupoT (
    codRecurso int  NOT NULL  ,
    activo bool  NOT NULL,
    atarea_codigo int  NOT NULL,
    CONSTRAINT PRecursoXGrupoT_pk PRIMARY KEY (codRecurso)
);

-- Table Portafolio
CREATE TABLE Portafolio (
    codigo int  NOT NULL  ,
    codPManager int  NOT NULL,
    codGerente int  NOT NULL,
    fechaCreado date  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT Portafolio_pk PRIMARY KEY (codigo)
);

-- Table Proyecto
CREATE TABLE Proyecto (
    codigo int  NOT NULL  ,
    codPPortafolio int  NOT NULL,
    des varchar(99)  NOT NULL,
    desdeCero bool  NOT NULL,
    codEstado int  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT Proyecto_pk PRIMARY KEY (codigo)
);

-- Table Recurso
CREATE TABLE Recurso (
    codigo int  NOT NULL  ,
    codArea int  NOT NULL,
    codUsuario int  NOT NULL,
    codDatosPersona int  NOT NULL,
    costoHora decimal(14,4)  NULL,
    activo bool  NOT NULL,
    CONSTRAINT Recurso_pk PRIMARY KEY (codigo)
);

-- Table RecursoXGrupoT
CREATE TABLE RecursoXGrupoT (
    codRecurso int  NOT NULL  ,
    codGrupoTrabajo int  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT RecursoXGrupoT_pk PRIMARY KEY (codRecurso,codGrupoTrabajo)
);

-- Table Rol
CREATE TABLE Rol (
    codigo int  NOT NULL  ,
    noCodigo varchar(20)  NOT NULL,
    des varchar(100)  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT Rol_pk PRIMARY KEY (codigo)
);

-- Table Tarea
CREATE TABLE Tarea (
    codigo int  NOT NULL  ,
    des varchar(200)  NOT NULL,
    Area_codigo int  NULL,
    activo bool  NOT NULL,
    CONSTRAINT Tarea_pk PRIMARY KEY (codigo)
);

-- Table Urgencia
CREATE TABLE Urgencia (
    codigo int  NOT NULL,
    des varchar(100)  NOT NULL,
    CONSTRAINT Urgencia_pk PRIMARY KEY (codigo)
);

-- Table Usuario
CREATE TABLE Usuario (
    codigo int  NOT NULL  ,
    user varchar(60)  NOT NULL,
    password char(60)  NOT NULL,
    preguntaS varchar(60)  NULL,
    respuestaS varchar(60)  NULL,
    ultimoIngreso datetime  NULL,
    activo bool  NOT NULL,
    fechaCreacion datetime  NOT NULL,
    CONSTRAINT Usuario_pk PRIMARY KEY (codigo)
);

-- Table UsuarioRol
CREATE TABLE UsuarioRol (
    codigo int  NOT NULL  ,
    codUsuario int  NOT NULL,
    codRol int  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT UsuarioRol_pk PRIMARY KEY (codigo)
);

-- Table atarea
CREATE TABLE atarea (
    codigo int  NOT NULL  ,
    codATareaPadre int  NOT NULL,
    codEstado int  NOT NULL,
    codPFase int  NOT NULL,
    codArea int  NOT NULL,
    fechaInicioPr datetime  NOT NULL,
    fechaFinPr datetime  NOT NULL,
    fechaInicioPu datetime  NOT NULL,
    fechaFinPu datetime  NOT NULL,
    fechaInicioRe datetime  NULL,
    fechaFinRe datetime  NULL,
    des varchar(100)  NOT NULL,
    activo bool  NOT NULL,
    CONSTRAINT atarea_pk PRIMARY KEY (codigo)
);

-- Table supervisor
CREATE TABLE supervisor (
    codigo int  NOT NULL  ,
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
-- Reference:  Gasto_aproyecto (table: PGasto)


ALTER TABLE PGasto ADD CONSTRAINT Gasto_aproyecto FOREIGN KEY Gasto_aproyecto (codProyecto)
    REFERENCES Proyecto (codigo);
-- Reference:  Interesados_aproyecto (table: Interesado)


ALTER TABLE Interesado ADD CONSTRAINT Interesados_aproyecto FOREIGN KEY Interesados_aproyecto (codProyecto)
    REFERENCES Proyecto (codigo);
-- Reference:  PIncidencia_Urgencia (table: PIncidencia)


ALTER TABLE PIncidencia ADD CONSTRAINT PIncidencia_Urgencia FOREIGN KEY PIncidencia_Urgencia (codUrgencia)
    REFERENCES Urgencia (codigo);
-- Reference:  PRecursoXGrupoT_Recurso (table: PRecursoXGrupoT)


ALTER TABLE PRecursoXGrupoT ADD CONSTRAINT PRecursoXGrupoT_Recurso FOREIGN KEY PRecursoXGrupoT_Recurso (codRecurso)
    REFERENCES Recurso (codigo);
-- Reference:  PRecursoXGrupoT_atarea (table: PRecursoXGrupoT)


ALTER TABLE PRecursoXGrupoT ADD CONSTRAINT PRecursoXGrupoT_atarea FOREIGN KEY PRecursoXGrupoT_atarea (atarea_codigo)
    REFERENCES atarea (codigo);
-- Reference:  RecursoXGrupoT_GrupoTrabajo (table: RecursoXGrupoT)


ALTER TABLE RecursoXGrupoT ADD CONSTRAINT RecursoXGrupoT_GrupoTrabajo FOREIGN KEY RecursoXGrupoT_GrupoTrabajo (codGrupoTrabajo)
    REFERENCES GrupoTrabajo (codigo);
-- Reference:  RecursoXGrupoT_Recurso (table: RecursoXGrupoT)


ALTER TABLE RecursoXGrupoT ADD CONSTRAINT RecursoXGrupoT_Recurso FOREIGN KEY RecursoXGrupoT_Recurso (codRecurso)
    REFERENCES Recurso (codigo);
-- Reference:  Recurso_dPersona (table: Recurso)


ALTER TABLE Recurso ADD CONSTRAINT Recurso_dPersona FOREIGN KEY Recurso_dPersona (codDatosPersona)
    REFERENCES DatosPersona (codigo);
-- Reference:  Recurso_tipoRecurso (table: Recurso)


ALTER TABLE Recurso ADD CONSTRAINT Recurso_tipoRecurso FOREIGN KEY Recurso_tipoRecurso (codArea)
    REFERENCES Area (codigo);
-- Reference:  Recurso_usuario (table: Recurso)


ALTER TABLE Recurso ADD CONSTRAINT Recurso_usuario FOREIGN KEY Recurso_usuario (codUsuario)
    REFERENCES Usuario (codigo);
-- Reference:  afase_afase (table: PFase)


ALTER TABLE PFase ADD CONSTRAINT afase_afase FOREIGN KEY afase_afase (codPFase)
    REFERENCES PFase (codigo);
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

