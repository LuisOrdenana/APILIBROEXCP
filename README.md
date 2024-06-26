# Proyecto Biblioteca API

Este proyecto presenta una serie de mejoras y modificaciones en la API de la biblioteca. Las actualizaciones se centran en la gestión de excepciones personalizadas y en la mejora de las respuestas del servidor.

## Mejoras Implementadas

### Manejo de Excepciones Personalizadas

Se ha integrado un manejador global de excepciones para gestionar errores personalizados en todo el proyecto. Esto permite una mayor consistencia y control sobre los errores y las respuestas proporcionadas por la API.

<a href='https://postimages.org/' target='_blank'><img src='https://i.postimg.cc/9Q66mn5h/Captura-de-pantalla-2024-06-03-124741.png' border='0' alt='Captura-de-pantalla-2024-06-03-124741'/></a>

### Controlador de Libros

El controlador de libros ha sido mejorado con las siguientes funcionalidades:

#### Excepción LibroException

Ahora, cuando se realiza una petición GET a `/libros/{id_libro}` y el libro solicitado no existe en la base de datos, se lanza una excepción personalizada `LibroException`. Esta excepción permite manejar de manera más eficiente los casos en los que se solicita un libro inexistente.

<a href='https://postimages.org/' target='_blank'><img src='https://i.postimg.cc/NMgPLhdW/Captura-de-pantalla-2024-06-03-124606.png' border='0' alt='Captura-de-pantalla-2024-06-03-124606'/></a>

#### Estado NOT_FOUND

Junto con la excepción `LibroException`, el servidor responde con un estado `NOT_FOUND`. Este estado se acompaña de un mensaje personalizado que proporciona más detalles sobre el error, mejorando así la comprensibilidad del problema para el cliente.

![image](https://github.com/LuisOrdenana/APILIBROEXCP/assets/170282412/02b9036f-e752-4834-9ba6-51e9c8d0987d)

![image](https://github.com/LuisOrdenana/APILIBROEXCP/assets/170282412/6fa41dc5-c44c-458a-98c9-e8af125dc868)

![image](https://github.com/LuisOrdenana/APILIBROEXCP/assets/170282412/b86e2206-9dd4-4ea1-accd-d634cf96f759)

#### Estado CREATE

Cuando se crea un nuevo libro a través de la API, el servidor responde ahora con un estado `CREATE`. Este cambio proporciona una confirmación más explícita de que el libro ha sido creado con éxito.

![image](https://github.com/LuisOrdenana/APILIBROEXCP/assets/170282412/17f7c17b-8324-42cc-a11f-0d0330bcd6b6)
