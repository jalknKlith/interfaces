CREATE database javadbmvcnoche;
USE javadbmvcnoche;

CREATE TABLE productos(
idProducto INT PRIMARY KEY AUTO_INCREMENT,
nombre varchar(100) UNIQUE NOT NULL,
descripcion varchar(255) NOT NULL,
precio float NOT NULL,
cantidad INT
);

ALTER TABLE productos ADD categoriaID INT;

ALTER TABLE productos
ADD FOREIGN KEY (categoriaID)
REFERENCES categorias(idCategoria);

CREATE TABLE categorias(
idCategoria INT PRIMARY KEY AUTO_INCREMENT,
estado INT NOT NULL,
nombre varchar(100) NOT NULL
);

INSERT INTO categorias (idCategoria, nombre, estado)
VALUES (NULL, 'Ropa', '1'), (NULL, 'Ferreteria', '1'), (NULL, 'Calzado', '1'), (NULL, 'Accesorios', '1'), (NULL, 'Electrodomesticos', '1');

INSERT INTO productos (idProducto, nombre, description, precio, cantidad, categoriaID)
VALUES (NULL, 'Camisa negra', 'Polo xl', '67500', '20', '1');

ALTER TABLE categorias MODIFY COLUMN estado varchar(100) NOT NULL;
