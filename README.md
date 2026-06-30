![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

## 🧠 Evaluación – Desarrollo Orientado a Objetos I 

👨‍💻  Autor del proyecto

Nombre: Sergio Sandoval Valenzuela

Carrera: Analista Programador

Sede: Santiago Online

# 📘 Descripción general del sistema

Este proyecto corresponde a la Evaluación de la asignatura Desarrollo Orientado a Objetos I, correspondiente a la Semana 6.

El sistema fue desarrollado en Java y representa distintos servicios turísticos ofrecidos por la empresa **Llanquihue Tour**, aplicando los principales conceptos de Programación Orientada a Objetos mediante una jerarquía de clases.


La aplicación implementa los siguientes conceptos de Programación Orientada a Objetos:

- Encapsulamiento.
  
- Herencia.
  
- Polimorfismo.
  
- Constructores.
  
- Getters y Setters.
  
- Sobrescritura de métodos mediante `@Override`.
  
- Uso de `super()` para reutilizar constructores.
  
- Organización modular mediante paquetes.
  
- Ejecución desde una clase principal.

El sistema crea distintos servicios turísticos, mostrando su información por consola utilizando el método `toString()` sobrescrito en cada subclase.


# 🧱 Estructura general del proyecto

```text
LlanquihueTourApp1/

├── build.xml
├── manifest.mf
├── nbproject/
└── src/
    ├── data/
    │   └── GestorServicios.java
    │
    ├── model/
    │   ├── ServicioTuristico.java
    │   ├── RutaGastronomica.java
    │   ├── PaseoLacustre.java
    │   └── ExcursionCultural.java
    │
    └── ui/
        └── Main.java


```
## Estructura de Herencia del proyecto

```text

               ServicioTuristico
                       │
        │──────────────┬──────────────────│
        │              │                  │
RutaGastronomica  PaseoLacustre  ExcursionCultural

```

#  Descripción de paquetes:

## 📁 ui

Contiene la clase **Main**, encargada de iniciar la ejecución del sistema creando una instancia de `GestorServicios` y mostrando la información de los servicios turísticos.

## 📁 model

Contiene las clases principales del dominio del problema.

- **ServicioTuristico:** clase base (padre) que representa un servicio turístico.
  
- **RutaGastronomica:** hereda de `ServicioTuristico` e incorpora la cantidad de restaurantes.
  
- **PaseoLacustre:** hereda de `ServicioTuristico` e incorpora el tipo de embarcación.
  
- **ExcursionCultural:** hereda de `ServicioTuristico` e incorpora el lugar histórico visitado.


## 📁 data

Contiene la clase **GestorServicios**, responsable de crear los objetos de prueba y mostrar la información de cada servicio turístico.



# 🧩 Conceptos de Programación Orientada a Objetos aplicados

- Herencia mediante `extends`.
  
- Reutilización de constructores con `super()`.
  
- Sobrescritura de métodos utilizando `@Override`.
  
- Encapsulamiento mediante atributos privados.
  
- Acceso a los atributos mediante Getters y Setters.
  
- Organización modular utilizando paquetes.
  
- Reutilización del método `toString()` mediante `super.toString()`.

# 💻 Tecnologías utilizadas

- Java JDK 26
  
- Apache NetBeans IDE
  
- Git
  
- GitHub


# ⚙️ Instrucciones para clonar y ejecutar el proyecto

## Clonar el repositorio

```bash
git clone https://github.com/sergiosandovalv/LlanquihueTourApp1.git
```

## Abrir el proyecto

1. Abrir Apache NetBeans IDE.

2. Seleccionar **File → Open Project**.
 
3. Buscar la carpeta del proyecto clonado.
 
4. Abrir **LlanquihueTourApp1**.


## Ejecutar en proyecto

1. Abrir la clase **Main.java** ubicada en el paquete **ui**.
   
2. Ejecutar el proyecto.
   
3. El sistema mostrará la información de los servicios turísticos creados.
   
4. Se visualizarán las rutas gastronómicas, paseos lacustres y excursiones culturales


# 📄 Resultado esperado

Al ejecutar el sistema se mostrará una salida similar a la siguiente:

```text
===== RUTAS GASTRONÓMICAS =====

===== SERVICIO TURÍSTICO =====
Nombre: Ruta Sabores del Sur
Duración: 4 horas
Cantidad de restaurantes: 5

===== SERVICIO TURÍSTICO =====
Nombre: Ruta Gastronómica Llanquihue
Duración: 3 horas
Cantidad de restaurantes: 4

===== PASEOS LACUSTRES =====

===== SERVICIO TURÍSTICO =====
Nombre: Paseo por el Lago Llanquihue
Duración: 2 horas
Tipo de embarcación: Lancha turística

===== SERVICIO TURÍSTICO =====
Nombre: Navegación a Puerto Varas
Duración: 3 horas
Tipo de embarcación: Catamarán

===== EXCURSIONES CULTURALES =====

===== SERVICIO TURÍSTICO =====
Nombre: Excursión Patrimonial Frutillar
Duración: 4 horas
Lugar histórico: Teatro del Lago

===== SERVICIO TURÍSTICO =====
Nombre: Recorrido Histórico Puerto Octay
Duración: 3 horas
Lugar histórico: Casa Niklitschek
```


# 🎯 Objetivos de aprendizaje alcanzados

- Aplicar el concepto de herencia en Java.
  
- Implementar polimorfismo mediante sobrescritura de métodos.
  
- Organizar un proyecto utilizando paquetes.
  
- Reutilizar código mediante el uso de `super()`.
  
- Modelar un problema utilizando Programación Orientada a Objetos.


# 🔗 Repositorio

https://github.com/sergiosandovalv/LlanquihueTourApp1

---
Proyecto desarrollado para la asignatura **Desarrollo Orientado a Objetos I** - Duoc UC.

---
