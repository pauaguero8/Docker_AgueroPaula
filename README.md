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
cd tu-repositorio