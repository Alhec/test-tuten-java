# Obtener Hora en Formato UTC

Autor: Hector Alayon

## Requerimientos

```bash
Java 1.8
Maven
```

## Despliegue

```Ubicarse en la direccion raiz del proyecto

mvn clean
mvn install

#Para iniciar la aplicacion
mvn spring-boot:run

#Para realizar pruebas unitarias
mvn test
```

## Uso
Servicio POST,

### firma 
localhost:8090/getTime

### body
```
{
    "time": "10:30:05",
    "timezone": "-4"
}
```

### Respuesta
```
{
    "response": {
        "time": "14:30:05",
        "timezone": "utc"
    }
}
```

