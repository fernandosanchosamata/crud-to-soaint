-- =================================================================================================
-- Pre Data to show information of products 
-- =================================================================================================

DROP TABLE IF EXISTS PRODUCTOS;

CREATE TABLE PRODUCTOS(ID INT PRIMARY KEY AUTO_INCREMENT,NOMBRE VARCHAR(255),EXISTE VARCHAR(255),FECHACREACION DATE,FECHAACTUALIZACION DATE);

INSERT INTO PRODUCTOS(nombre, existe, fechacreacion, fechaactualizacion) values ('producto 1', 'true', CURRENT_DATE, CURRENT_DATE);

SELECT * FROM PRODUCTOS ORDER BY ID;

UPDATE PRODUCTOS SET NOMBRE='PRODUCTO ACTUALIZADO 1' WHERE ID=1;

DELETE FROM PRODUCTOS WHERE ID=1; 