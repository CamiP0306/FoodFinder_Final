CREATE DATABASE FoodFinder;

CREATE TABLE restaurantes (
    Id_rest INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    Duenio VARCHAR(150) UNIQUE NOT NULL,
    NombreRestaurante VARCHAR(100) NOT NULL,
    Direccion VARCHAR(200) NOT NULL,
    Telefono INT(15),
    Horario VARCHAR(20),
    DescripcionRestaurante VARCHAR(1000)
);

CREATE TABLE categorias (
    Id_cat INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    Nombre VARCHAR(50)
);

CREATE TABLE menus (
    Id_prod VARCHAR(100) PRIMARY KEY NOT NULL,
    Categoria INT,
    FOREIGN KEY (Categoria) REFERENCES categorias(Id_cat),
    NombreProducto VARCHAR(100),
    Descripcion VARCHAR(500),
    Precio FLOAT(5.2),
    Restaurante VARCHAR(10),
    FOREIGN KEY (Restaurante) REFERENCES restaurantes(Id_rest)
);

CREATE TABLE usuarios (
    Id INT(5) AUTO_INCREMENT PRIMARY KEY NOT NULL, 
    Correo VARCHAR(150) UNIQUE NOT NULL,
    Nombre VARCHAR(50) UNIQUE NOT NULL,
    Contrasenia VARCHAR(100) NOT NULL
);

CREATE TABLE comentarios (
    Usuario VARCHAR(50),
    FOREIGN KEY (Usuario) REFERENCES usuarios(Correo), --ver nombre y correo
    Comentario VARCHAR(5000),
    Calificacion FLOAT(5),
    Restaurante VARCHAR(10),
    FOREIGN KEY (Restaurante) REFERENCES restaurantes(Id_rest)
);