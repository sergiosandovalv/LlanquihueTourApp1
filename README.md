![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# 🧠 Evaluación – Desarrollo Orientado a Objetos I

## 👨‍💻 Autor del proyecto

**Nombre:** Sergio Sandoval Valenzuela

**Carrera:** Analista Programador

**Sede:** Santiago Online

---

# 📘 Descripción general del sistema

Este proyecto corresponde a la Evaluación de la asignatura **Desarrollo Orientado a Objetos I**, correspondiente a la **Semana 8**.

El sistema fue desarrollado en Java y representa un sistema de gestión para la empresa turística **Llanquihue Tour**, permitiendo registrar distintos tipos de entidades mediante una interfaz gráfica desarrollada con Java Swing.

Durante esta etapa se incorporan nuevos conceptos de Programación Orientada a Objetos, incluyendo interfaces, colecciones dinámicas, validaciones, documentación mediante Javadoc e integración con Git y GitHub.

La aplicación implementa los siguientes conceptos:

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
- Validaciones mediante `JOptionPane`.
- Interfaz gráfica desarrollada con Java Swing.
- Organización modular mediante paquetes.
- Documentación utilizando Javadoc.
- Control de versiones mediante Git.
- Publicación del proyecto en GitHub.

El sistema permite registrar Guías turísticos, Vehículos y Colaboradores externos, almacenándolos dinámicamente y mostrando posteriormente toda la información registrada desde la interfaz gráfica.

---

# 🖥️ Interfaz gráfica

La aplicación incorpora una interfaz gráfica desarrollada con Java Swing que permite administrar las entidades registradas de manera sencilla e intuitiva.

Entre sus principales funcionalidades destacan:

- Registro de Guías turísticos.
- Registro de Vehículos.
- Registro de Colaboradores externos.
- Validación de campos obligatorios.
- Ayuda contextual según el tipo de registro.
- Visualización de registros.
- Limpieza automática del formulario.
- Confirmación antes de salir del sistema.
- Incorporación del logotipo de Llanquihue Tour.

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

Posteriormente la colección es recorrida mediante un ciclo `for-each`, demostrando el uso del polimorfismo.

```java
for (Registrable entidad : entidades) {
    System.out.println(entidad.mostrarResumen());
}
```

Gracias al polimorfismo, Java ejecuta automáticamente el método correspondiente al tipo real de cada objeto.

---

# 🔄 Interfaces implementadas

Durante esta etapa se incorporaron interfaces para reforzar el uso del polimorfismo.

## Registrable

Permite registrar cualquier entidad que pueda ser almacenada por el sistema.

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

El sistema identifica automáticamente el tipo real de cada entidad registrada mediante el operador `instanceof`.

Esto permite reconocer:

- GuiaTuristico
- Vehiculo
- ColaboradorExterno
- RutaGastronomica
- PaseoLacustre
- ExcursionCultural

Además, cuando una entidad implementa la interfaz `Marcable`, el sistema registra automáticamente su entrada y salida.

---

# 🔄 Flujo de ejecución del sistema

El funcionamiento general del proyecto es el siguiente:

1. Se inicia la aplicación desde la clase principal.
2. Se carga la interfaz gráfica.
3. El usuario selecciona el tipo de registro.
4. Se validan los datos ingresados.
5. Se crea el objeto correspondiente.
6. La entidad se almacena en un `ArrayList`.
7. El usuario puede visualizar todos los registros almacenados.
8. El sistema identifica automáticamente el tipo de cada entidad.

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
    │   ├── GestorServicios.java
    │   └── GestorEntidades.java
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
    │   └── logo.png
    │
    └── ui/
        ├── Main.java
        ├── Test.java
        └── Test.form
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

Contiene la interfaz gráfica del sistema desarrollada mediante Java Swing.

- Main
- Test

---

## 📁 model

Contiene todas las clases del dominio del problema.

- ServicioTuristico
- RutaGastronomica
- PaseoLacustre
- ExcursionCultural
- RecursoAgencia
- GuiaTuristico
- Vehiculo
- ColaboradorExterno
- Registrable
- Marcable

---

## 📁 data

Contiene las clases encargadas de administrar la información del sistema.

- GestorServicios
- GestorEntidades

---

## 📁 resources

Contiene los recursos gráficos utilizados por la aplicación.

- logo.png

---

# 🧩 Conceptos de Programación Orientada a Objetos aplicados

- Encapsulamiento.
- Herencia.
- Polimorfismo.
- Interfaces.
- Uso de `instanceof`.
- Uso de `ArrayList`.
- Reutilización mediante `super()`.
- Sobrescritura mediante `@Override`.
- Validaciones de datos.
- Interfaz gráfica con Swing.
- Documentación mediante Javadoc.

---

# 💻 Tecnologías utilizadas

- Java JDK 26
- Java Swing
- Apache NetBeans IDE
- Git
- GitHub
- Markdown

---

# ⚙️ Instrucciones para ejecutar el proyecto

## Clonar el repositorio

```bash
git clone https://github.com/sergiosandovalv/LlanquihueTourApp1.git
```

## Abrir el proyecto

1. Abrir Apache NetBeans IDE.
2. File → Open Project.
3. Seleccionar LlanquihueTourApp1.
4. Abrir el proyecto.

## Ejecutar

1. Ejecutar la clase Main.java.
2. Se abrirá la interfaz gráfica.
3. Registrar entidades.
4. Mostrar registros.
5. Utilizar las ayudas contextuales.

---

# 📄 Funcionalidades implementadas

- Registro de Guías turísticos.
- Registro de Vehículos.
- Registro de Colaboradores externos.
- Validación de campos.
- Ayuda contextual.
- Mostrar registros.
- Limpiar formulario.
- Confirmación al salir.
- Carga del logotipo institucional.
- Identificación automática mediante `instanceof`.
- Uso de interfaces.
- Uso de polimorfismo.

---

# 🎯 Objetivos de aprendizaje alcanzados

- Aplicar herencia.
- Aplicar polimorfismo.
- Implementar interfaces.
- Utilizar colecciones dinámicas.
- Aplicar `instanceof`.
- Desarrollar una interfaz gráfica con Swing.
- Validar datos ingresados.
- Documentar código mediante Javadoc.
- Gestionar versiones mediante Git.
- Publicar proyectos utilizando GitHub.

---

# ✅ Conclusión

Durante esta etapa del proyecto se amplió significativamente la aplicación desarrollada en la semana anterior, incorporando una interfaz gráfica completamente funcional, validaciones de datos, documentación mediante Javadoc, integración con Git y GitHub e implementación de interfaces para reforzar los principios de la Programación Orientada a Objetos.

La solución desarrollada demuestra el uso de herencia, polimorfismo, encapsulamiento, interfaces, colecciones dinámicas y validaciones, permitiendo registrar y administrar diferentes entidades de la empresa Llanquihue Tour mediante una interfaz intuitiva y fácil de utilizar.

---

# 🔗 Repositorio

**GitHub:**

<https://github.com/sergiosandovalv/LlanquihueTourApp1>

---

**Proyecto desarrollado para la asignatura Desarrollo Orientado a Objetos I – Duoc UC.**
