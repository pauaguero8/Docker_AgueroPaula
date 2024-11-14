# Proyecto Spring Boot con Docker

Este proyecto es una aplicación desarrollada en Java con Spring Boot que se ejecuta dentro de un contenedor Docker. La aplicación expone varios endpoints HTTP que permiten realizar operaciones simples como cálculos matemáticos, conversiones, y manipulaciones de texto.

## Tecnologías Elegidas

### Spring Boot
Elegí Spring Boot porque facilita la creación de aplicaciones independientes en Java sin necesidad de configurar servidores externos. 
Es la tecnología con la que trabajo actualmente como desarrolladora Back-End.
Además, se integra fácilmente con Docker, lo que permite desplegar y escalar la aplicación en contenedores.

### Docker
Docker fue elegido para facilitar el despliegue de la aplicación en diferentes entornos sin problemas de compatibilidad. Esto permite empaquetar la aplicación junto con todas sus dependencias, asegurando que se ejecute de manera consistente en cualquier máquina que soporte Docker.

## Requisitos

- **Java**: versión 17 o superior
- **Maven**: para la gestión de dependencias y construcción del proyecto
- **Docker**: para construir y ejecutar el contenedor

## Configuración del Proyecto

### 1. Clonar el Repositorio

Clona el repositorio a tu máquina local:

```bash
git clone https://github.com/pauaguero8/Docker_AgueroPaula.git
cd Docker_AgueroPaula
```

### 2. Compilar y Empaquetar la Aplicación

Construye el archivo JAR usando Maven:

```bash
mvn clean install
```

### 3. Construir la Imagen Docker

```bash
docker build -t proyecto .
```

### 4. Ejecutar el Contenedor
```bash
docker run -p 9090:8080 --name contendor proyecto
```

# Documentación de Endpoints de la API

Esta API ofrece varios endpoints para responder a diferentes solicitudes HTTP y realizar operaciones simples.

---

### 1. `/inicio`
- **Descripción**: Endpoint de bienvenida que responde con un mensaje básico.
- **Método**: `GET`
- **URL**: `http://localhost:9090/inicio`
- **Respuesta**:
```plaintext
Bienvenidos
```

### 2. `/mi-endpoint`
- **Descripción**: Endpoint que recibe un parámetro y devuelve el resultado procesado por el servicio.
- **Método**: `GET`
- **URL**: `http://localhost:9090/mi-endpoint`
- **Parámetros**:
```plaintext
parametro: ABC
```
- **Respuesta**:
```plaintext
123
```
**Nota**: Si el parámetro es distinto a ABC la respuesta debe ser "Parámetro no válido."

### 3. `/saludo-personalizado`
- **Descripción**: Genera un saludo personalizado basado en el nombre proporcionado.
- **Método**: `GET`
- **URL**: `http://localhost:9090/saludo-personalizado`
- **Parámetros**:
```plaintext
nombre: Juan
```
- **Respuesta**:
```plaintext
¡Hola Juan!
```

### 4. `/suma`
- **Descripción**: Calcula la suma de dos números proporcionados y devuelve el resultado.
- **Método**: `GET`
- **URL**: `http://localhost:9090/suma`
- **Parámetros**:
```plaintext
numero1 = 1
numero2 = 3
```
- **Respuesta**:
```plaintext
4
```