# Proyecto Biblioteca API

Este proyecto presenta una serie de mejoras y modificaciones en la API de la biblioteca. Las actualizaciones se centran en la gestión de excepciones personalizadas y en la mejora de las respuestas del servidor.

## Mejoras Implementadas

### Manejo de Excepciones Personalizadas

Se ha integrado un manejador global de excepciones para gestionar errores personalizados en todo el proyecto. Esto permite una mayor consistencia y control sobre los errores y las respuestas proporcionadas por la API.

https://i.postimg.cc/9Q66mn5h/Captura-de-pantalla-2024-06-03-124741.png

### Controlador de Libros

El controlador de libros ha sido mejorado con las siguientes funcionalidades:

#### Excepción LibroException

Ahora, cuando se realiza una petición GET a `/libros/{id_libro}` y el libro solicitado no existe en la base de datos, se lanza una excepción personalizada `LibroException`. Esta excepción permite manejar de manera más eficiente los casos en los que se solicita un libro inexistente.

#### Estado NOT_FOUND

Junto con la excepción `LibroException`, el servidor responde con un estado `NOT_FOUND`. Este estado se acompaña de un mensaje personalizado que proporciona más detalles sobre el error, mejorando así la comprensibilidad del problema para el cliente.

#### Estado CREATE

Cuando se crea un nuevo libro a través de la API, el servidor responde ahora con un estado `CREATE`. Este cambio proporciona una confirmación más explícita de que el libro ha sido creado con éxito.
