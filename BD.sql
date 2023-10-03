--html a netbins(java)
CREATE DATABASE FoodFinder;

CREATE TABLE restaurantes (
    Id_rest VARCHAR(10) PRIMARY KEY NOT NULL,
    Nombre VARCHAR(100),
    Direccion VARCHAR(200),
    Telefono INT(15),
    Horario VARCHAR(20)
);

CREATE TABLE categorias (
    Id_cat INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    Nombre VARCHAR(50)
);

CREATE TABLE menus (
    Id_prod VARCHAR(100) PRIMARY KEY NOT NULL,
    Nombre VARCHAR(100),
    Precio FLOAT(5.2),
    Descripcion VARCHAR(500),
    Categoria INT,
    FOREIGN KEY (Categoria) REFERENCES categorias(Id_cat),
    Restaurante VARCHAR(10),
    FOREIGN KEY (Restaurante) REFERENCES restaurantes(Id_rest)
);

CREATE TABLE usuarios (
    Id INT(5) AUTO_INCREMENT NOT NULL, 
    Correo VARCHAR(150) PRIMARY KEY NOT NULL,
    Nombre VARCHAR(50) UNIQUE NOT NULL,
    Contraseña VARCHAR(100) NOT NULL,
    Confirmacion VARCHAR(100) NOT NULL
);

CREATE TABLE comentarios (
    Usuario VARCHAR(50),
    FOREIGN KEY (Usuario) REFERENCES usuarios(Correo),
    Comentario VARCHAR(5000),
    Calificacion FLOAT(5),
    Restaurante VARCHAR(10),
    FOREIGN KEY (Restaurante) REFERENCES restaurantes(Id_rest)
);