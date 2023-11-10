# Spring Boot Cliente App 🌱

Esta es una aplicación de ejemplo construida con Spring Boot que gestiona información de clientes.

## Clases Principales 🧑‍💻

### Cliente Entity 📁
La clase `Cliente` representa la entidad de cliente y está mapeada a la tabla "clientes" en la base de datos. Contiene campos como nombre, apellido y correo electrónico.

### ClienteService Interface y ClienteServiceImpl 🔄
`IClienteService` define operaciones CRUD para la entidad `Cliente`. `ClienteServiceImpl` implementa esta interfaz y maneja la lógica de negocio para interactuar con la capa de acceso a datos (`IClienteDao`).

### ClienteDao Interface 🗃️
`IClienteDao` extiende `CrudRepository` de Spring Data JPA, proporcionando métodos CRUD para la entidad `Cliente` sin necesidad de implementación adicional.

## Controlador ClienteController 🎮
`ClienteController` gestiona las solicitudes web relacionadas con los clientes:

- **Listar (`/listar`):** Muestra la lista de clientes.
- **Crear (`/form`):** Muestra el formulario para crear un nuevo cliente.
- **Editar (`/form/{id}`):** Muestra el formulario para editar un cliente existente.
- **Guardar (`/form` - POST):** Guarda un nuevo cliente o actualiza uno existente.
- **Eliminar (`/eliminar/{id}`):** Elimina un cliente por su identificación.

## Cómo Ejecutar la Aplicación 🚀
1. Clona este repositorio.
2. Abre el proyecto en tu IDE preferido.
3. Ejecuta la aplicación como una aplicación Spring Boot.

¡Y eso es todo! Ahora estás listo para gestionar clientes con esta aplicación Spring Boot. 🎉
