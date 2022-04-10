CREATE DATABASE login_bd;
USE login_bd;


CREATE TABLE usuarios 
( nombre VARCHAR(250) NOT NULL ,
 apellidos VARCHAR(250) NOT NULL , 
correo VARCHAR(250) NOT NULL , 
contraseña VARCHAR(250) NOT NULL 
)