![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# 🧠 Evaluación – Desarrollo Orientado a Objetos I

## 👨‍💻 Autor del proyecto

**Nombre:** Sergio Sandoval Valenzuela

**Carrera:** Analista Programador

**Sede:** Santiago Online

---

# 🎯 Propósito del proyecto

Este proyecto corresponde a la Evaluación de la asignatura **Desarrollo Orientado a Objetos I**, correspondiente a la **Semana 9**.

El propósito de esta aplicación es desarrollar un sistema orientado a objetos para la empresa turística **Llanquihue Tour**, aplicando progresivamente los conceptos estudiados durante la asignatura.

En esta versión el sistema incorpora persistencia mediante archivos de texto, validaciones centralizadas, excepciones personalizadas e interfaz gráfica desarrollada con Java Swing, permitiendo registrar y administrar recursos de la agencia y servicios turísticos de forma organizada y reutilizable.

---

# 📘 Descripción general del sistema

El sistema fue desarrollado en Java utilizando Programación Orientada a Objetos.

La aplicación permite registrar distintos recursos de la agencia, administrar servicios turísticos y almacenar la información en archivos de texto para mantener la persistencia de los datos.

Durante esta etapa se incorporan nuevos conceptos de programación, reforzando la reutilización del código, la validación de información y la separación de responsabilidades mediante paquetes.

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

# 🖥️ Interfaz gráfica

La aplicación incorpora una interfaz gráfica desarrollada con Java Swing que permite administrar las entidades registradas de forma sencilla.

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

Interfaz gráfica del sistema desarrollada con Java Swing.

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

Durante la Semana 9 el proyecto evolucionó desde una aplicación basada únicamente en una interfaz gráfica hacia un sistema más completo y organizado, incorporando persistencia de datos mediante archivos de texto, validaciones reutilizables, excepciones personalizadas y una mejor separación de responsabilidades entre las distintas capas de la aplicación.

La solución desarrollada integra los principales conceptos de Programación Orientada a Objetos estudiados durante la asignatura, permitiendo administrar recursos de la empresa Llanquihue Tour mediante una aplicación mantenible, reutilizable y preparada para futuras ampliaciones.

---

# 🔗 Repositorio

**GitHub**

<https://github.com/sergiosandovalv/LlanquihueTourApp1>

---

**Proyecto desarrollado para la asignatura Desarrollo Orientado a Objetos I – Duoc UC.**
