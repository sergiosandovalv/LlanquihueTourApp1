![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# 🧠 Evaluación – Desarrollo Orientado a Objetos I

## 👨‍💻 Autor del proyecto

**Nombre:** Sergio Sandoval Valenzuela

**Carrera:** Analista Programador

**Sede:** Santiago Online

---

# 📖 Introducción

Este repositorio contiene el desarrollo evolutivo del proyecto **Llanquihue Tour**, construido durante las distintas semanas de la asignatura **Desarrollo Orientado a Objetos I**.

Cada nueva entrega incorporó progresivamente conceptos de Programación Orientada a Objetos sobre una misma base de código, permitiendo que la aplicación evolucionara desde un modelo inicial de clases hasta un sistema organizado por capas, con persistencia de datos, validaciones reutilizables y una arquitectura modular.

Este enfoque permitió fortalecer la reutilización del código, mejorar la mantenibilidad del proyecto y aplicar buenas prácticas de desarrollo de software.

---

# 🎯 Propósito del proyecto


Su propósito es consolidar los contenidos aprendidos mediante la construcción progresiva de una aplicación orientada a objetos, incorporando nuevas funcionalidades sobre la base del trabajo realizado en las versiones anteriores.

Durante la Semana 9 el sistema evoluciona incorporando persistencia mediante archivos de texto, validaciones centralizadas y excepciones personalizadas, manteniendo la estructura desarrollada en las etapas previas y fortaleciendo la organización del proyecto.

---

# 📘 Descripción general del sistema

Esta versión representa la continuidad del proyecto desarrollado durante las semanas anteriores, integrando nuevos componentes sin reemplazar la funcionalidad existente.

Sobre la base del sistema construido previamente se incorporan mecanismos de persistencia, validación centralizada, manejo de excepciones y una mejor separación de responsabilidades mediante paquetes, obteniendo una aplicación más cercana a un entorno real de desarrollo.

El proyecto implementa los siguientes conceptos:

- Encapsulamiento.
- Herencia.
- Polimorfismo.
- Interfaces (`Registrable` y `Marcable`).
- Constructores.
- Getters y Setters.
- Sobrescritura de métodos mediante `@Override`.
- Uso de `super()`.
- Uso de `instanceof`.
- Colecciones dinámicas (`ArrayList`).
- Persistencia mediante archivos de texto.
- Lectura y escritura de archivos.
- Excepciones personalizadas.
- Validaciones reutilizables.
- Interfaz gráfica desarrollada con Java Swing.
- Organización modular mediante paquetes.
- Documentación utilizando Javadoc.
- Control de versiones mediante Git.
- Publicación del proyecto en GitHub.

---

# 🖥️ Interfaz de usuario

La aplicación mantiene la interfaz gráfica desarrollada durante la etapa anterior, la cual continúa siendo el principal medio de interacción con el usuario.

En esta versión se amplía su funcionalidad mediante la incorporación de persistencia de datos, validaciones reutilizables y manejo de excepciones, sin modificar la experiencia de uso del sistema.

Principales funcionalidades:

- Registro de Guías turísticos.
- Registro de Vehículos.
- Registro de Colaboradores externos.
- Validación de datos ingresados.
- Ayuda contextual.
- Visualización de registros.
- Limpieza automática del formulario.
- Confirmación antes de salir.
- Persistencia automática de la información.
- Incorporación del logotipo de Llanquihue Tour.

---

# 💾 Persistencia de datos

Uno de los principales avances de esta versión es la incorporación de persistencia mediante archivos de texto.

El sistema permite:

- Leer entidades previamente almacenadas.
- Registrar automáticamente nuevas entidades.
- Mantener la información disponible entre ejecuciones.
- Administrar los servicios turísticos desde archivos externos.

Archivos utilizados:

- `entidades.txt`
- `servicios.txt`

---

# ⚠️ Validaciones y excepciones

El sistema centraliza las validaciones mediante la clase `ValidadorDatos`, reutilizando las mismas reglas en todas las clases del modelo.

Cuando un dato no cumple las condiciones establecidas, se lanza una excepción personalizada:

```java
DatoInvalidoException
```

Esto permite mantener el código organizado y facilita el manejo de errores desde la interfaz gráfica.

---

# 🔄 Polimorfismo aplicado

El sistema utiliza una colección dinámica de entidades registradas.

```java
ArrayList<Registrable> entidades = new ArrayList<>();
```

En ella se almacenan distintos tipos de objetos:

- GuiaTuristico
- Vehiculo
- ColaboradorExterno

Posteriormente la colección es recorrida utilizando un ciclo `for-each`, demostrando el uso del polimorfismo.

```java
for (Registrable entidad : entidades) {
    System.out.println(entidad.mostrarResumen());
}
```

---

# 🔄 Interfaces implementadas

## Registrable

Permite registrar cualquier entidad administrada por el sistema.

Implementada por:

- GuiaTuristico
- Vehiculo
- ColaboradorExterno

## Marcable

Permite registrar entrada y salida de determinadas entidades.

Implementada por:

- GuiaTuristico
- ColaboradorExterno

---

# 🔍 Uso de instanceof

El sistema identifica automáticamente el tipo real de cada objeto mediante `instanceof`, permitiendo administrar correctamente cada recurso registrado.

---

# 🔄 Flujo general del sistema

1. Se inicia la aplicación.
2. Se cargan los datos almacenados.
3. El usuario selecciona el tipo de registro.
4. Se validan los datos ingresados.
5. Se crea el objeto correspondiente.
6. La información se almacena en memoria.
7. Se registra automáticamente en el archivo correspondiente.
8. El usuario puede visualizar los registros almacenados.

---

# 🧱 Estructura general del proyecto

```text
LlanquihueTourApp1/

├── README.md
├── build.xml
├── manifest.mf
├── nbproject/
└── src/
    ├── data/
    │   ├── EscritorEntidades.java
    │   ├── GestorEntidades.java
    │   └── GestorServicios.java
    │
    ├── exceptions/
    │   └── DatoInvalidoException.java
    │
    ├── model/
    │   ├── ServicioTuristico.java
    │   ├── RutaGastronomica.java
    │   ├── PaseoLacustre.java
    │   ├── ExcursionCultural.java
    │   ├── RecursoAgencia.java
    │   ├── GuiaTuristico.java
    │   ├── Vehiculo.java
    │   ├── ColaboradorExterno.java
    │   ├── Registrable.java
    │   └── Marcable.java
    │
    ├── resources/
    │   ├── entidades.txt
    │   ├── servicios.txt
    │   └── logo.png
    │
    ├── ui/
    │   ├── Main.java
    │   └── Test.java
    │
    └── util/
        ├── LectorEntidades.java
        ├── LectorServicios.java
        └── ValidadorDatos.java
```

---

# 🏗️ Estructura de herencia

```text
                   ServicioTuristico
                          │
      ┌───────────────────┼───────────────────┐
      │                   │                   │
RutaGastronomica   PaseoLacustre   ExcursionCultural


                  RecursoAgencia
                         │
        ┌────────────────┼─────────────────┐
        │                │                 │
 GuiaTuristico      Vehiculo     ColaboradorExterno
```

---

# 📁 Descripción de paquetes

## 📁 ui

Contiene las clases responsables de la interacción con el usuario y la ejecución de la aplicación.

## 📁 model

Clases del dominio del problema y jerarquía de herencia.

## 📁 data

Gestión de entidades, servicios y escritura de archivos.

## 📁 util

Clases reutilizables para lectura de archivos y validaciones.

## 📁 exceptions

Excepciones personalizadas utilizadas por el sistema.

## 📁 resources

Archivos de datos y recursos gráficos.

---

# 💻 Tecnologías utilizadas

- Java JDK 26
- Java Swing
- Apache NetBeans IDE
- Git
- GitHub
- Markdown

---

# ⚙️ Requisitos

- Java JDK 26 o superior.
- Apache NetBeans IDE.
- Git (opcional).

---

# 🚀 Instrucciones para ejecutar el proyecto

## Clonar el repositorio

```bash
git clone https://github.com/sergiosandovalv/LlanquihueTourApp1.git
```

## Abrir el proyecto

1. Abrir Apache NetBeans IDE.
2. Seleccionar **File → Open Project**.
3. Abrir **LlanquihueTourApp1**.

## Ejecutar

1. Ejecutar la clase `Main.java`.
2. Registrar entidades mediante la interfaz gráfica.
3. Visualizar los registros.
4. Verificar la persistencia de la información en los archivos de texto.

---

# 📄 Funcionalidades implementadas

- Registro de entidades.
- Validación de datos.
- Persistencia automática.
- Lectura de archivos.
- Escritura de archivos.
- Manejo de excepciones.
- Uso de interfaces.
- Polimorfismo.
- Interfaz gráfica.
- Documentación mediante Javadoc.
- Integración con Git y GitHub.

---

# 🎯 Objetivos de aprendizaje alcanzados

- Aplicar encapsulamiento.
- Implementar herencia y polimorfismo.
- Utilizar interfaces.
- Implementar persistencia mediante archivos.
- Crear excepciones personalizadas.
- Centralizar validaciones.
- Organizar aplicaciones mediante paquetes.
- Documentar código utilizando Javadoc.
- Gestionar versiones con Git.
- Publicar proyectos utilizando GitHub.

---

# ✅ Conclusión

El proyecto **Llanquihue Tour** representa la evolución progresiva de los contenidos desarrollados durante la asignatura **Desarrollo Orientado a Objetos I**.

Cada semana incorporó nuevas funcionalidades sobre una misma base de código, permitiendo construir una aplicación cada vez más completa sin perder la organización del proyecto ni la reutilización del software previamente desarrollado.

En esta versión se consolidan aspectos como la persistencia mediante archivos de texto, las excepciones personalizadas, las validaciones reutilizables y la separación de responsabilidades mediante paquetes, fortaleciendo la mantenibilidad de la aplicación y preparando una base sólida para futuras ampliaciones.

La evolución continua del proyecto permitió aplicar de manera integrada los principales principios de la Programación Orientada a Objetos, reflejando el aprendizaje progresivo alcanzado durante la asignatura.

---

# 🔗 Repositorio

**GitHub**

<https://github.com/sergiosandovalv/LlanquihueTourApp1>

---

**Proyecto desarrollado para la asignatura Desarrollo Orientado a Objetos I – Duoc UC.**
