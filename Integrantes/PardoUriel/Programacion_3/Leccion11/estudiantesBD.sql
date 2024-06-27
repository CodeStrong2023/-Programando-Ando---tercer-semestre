USE estudiantes;
-- Comenzamos con CRUD: create(insertar), read(leer), update(actualizar), delete(eliminar)
-- Listar los estudiantes: (read)
SELECT * FROM estudiantes2023;
-- Insertar estudiantes
INSERT INTO estudiantes2023(nombre, apellido, telefono, email) VALUES ("Juan", "Perez", "21212121", "jperez@email.com");
-- Update 
UPDATE estudiantes2023 SET nombre="Juan Carlos", apellido="Morales" WHERE idestudiantes = 1;
-- Delete
DELETE FROM estudiantes2023 WHERE idestudiantes = 1;
-- Para modificar el idestudiantes y comience en 1
-- ALTER TABLE estudiantes2023 AUTO_INCREMENT = 1