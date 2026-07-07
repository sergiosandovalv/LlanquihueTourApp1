![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# 🧠 Evaluación – Desarrollo Orientado a Objetos I

## 👨‍💻 Autor del proyecto

**Nombre:** Sergio Sandoval Valenzuela

**Carrera:** Analista Programador

**Sede:** Santiago Online

---

# 📘 Descripción general del sistema

Este proyecto corresponde a la Evaluación de la asignatura **Desarrollo Orientado a Objetos I**, correspondiente a la **Semana 7**.

El sistema fue desarrollado en Java y representa distintos servicios turísticos ofrecidos por la empresa **Llanquihue Tour**.

En esta versión se incorpora el uso de **herencia** y **polimorfismo** mediante una colección `List<ServicioTuristico>`, permitiendo almacenar diferentes tipos de servicios turísticos y recorrerlos utilizando una única referencia de la superclase.

La aplicación implementa los siguientes conceptos de Programación Orientada a Objetos:

- Encapsulamiento.
- Herencia.
- Polimorfismo.
- Constructores.
- Getters y Setters.
- Sobrescritura de métodos mediante `@Override`.
- Uso de `super()` para reutilizar constructores.
- Organización modular mediante paquetes.
- Uso de colecciones dinámicas (`ArrayList`).
- Recorrido de objetos mediante `for-each`.
- Ejecución desde una clase principal.

El sistema crea distintos servicios turísticos y muestra su información por consola utilizando el método `mostrarInformacion()`, el cual hace uso del método `toString()` sobrescrito en cada subclase.

---

# 🔄 Polimorfismo aplicado

El proyecto utiliza una colección de tipo:

```java
List<ServicioTuristico> servicios = new ArrayList<>();
```

En esta colección se almacenan objetos pertenecientes a distintas subclases:

- `RutaGastronomica`
- `PaseoLacustre`
- `ExcursionCultural`

Posteriormente, la colección es recorrida mediante un ciclo `for-each`:

```java
for (ServicioTuristico servicio : servicios) {
    servicio.mostrarInformacion();
}
```

Gracias al polimorfismo, Java ejecuta automáticamente el método `mostrarInformacion()` correspondiente al tipo real de cada objeto, utilizando una única referencia de la superclase.

---

# 🔄 Flujo de ejecución del sistema

El funcionamiento del proyecto sigue el siguiente proceso:

1. La clase **Main** inicia la ejecución del sistema.
2. Se crea una instancia de **GestorServicios**.
3. Se crea una colección `List<ServicioTuristico>`.
4. Se agregan objetos de las clases:
   - `RutaGastronomica`
   - `PaseoLacustre`
   - `ExcursionCultural`
5. La colección se recorre mediante un ciclo `for-each`.
6. Cada objeto ejecuta su propio método `mostrarInformacion()`, demostrando el uso del polimorfismo.

---

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

---

# 🏗️ Estructura de Herencia del proyecto

```text
                ServicioTuristico
                       │
      ┌────────────────┼────────────────┐
      │                │                │
RutaGastronomica  PaseoLacustre  ExcursionCultural
```

---

# 📁 Descripción de paquetes

## 📁 ui

Contiene la clase **Main**, encargada de iniciar la ejecución del sistema creando una instancia de `GestorServicios` y ejecutando la demostración del polimorfismo.

---

## 📁 model

Contiene las clases principales del dominio del problema.

- **ServicioTuristico:** clase base (superclase) que representa un servicio turístico.
- **RutaGastronomica:** hereda de `ServicioTuristico` e incorpora la cantidad de restaurantes.
- **PaseoLacustre:** hereda de `ServicioTuristico` e incorpora el tipo de embarcación.
- **ExcursionCultural:** hereda de `ServicioTuristico` e incorpora el lugar histórico visitado.

---

## 📁 data

Contiene la clase **GestorServicios**, responsable de crear la colección de servicios turísticos y demostrar el uso del polimorfismo mediante una lista de objetos.

---

# 🧩 Conceptos de Programación Orientada a Objetos aplicados

- Herencia mediante `extends`.
- Reutilización de constructores con `super()`.
- Sobrescritura de métodos utilizando `@Override`.
- Implementación de polimorfismo mediante `mostrarInformacion()`.
- Uso de una colección `List<ServicioTuristico>`.
- Recorrido de objetos mediante un ciclo `for-each`.
- Encapsulamiento mediante atributos privados.
- Acceso a los atributos mediante Getters y Setters.
- Organización modular utilizando paquetes.
- Reutilización del método `toString()` mediante `super.toString()`.

---

# 💻 Tecnologías utilizadas

- Java JDK 26
- Apache NetBeans IDE
- Git
- GitHub

---

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

## Ejecutar el proyecto

1. Abrir la clase **Main.java** ubicada en el paquete **ui**.
2. Ejecutar el proyecto.
3. El sistema creará una colección de servicios turísticos.
4. La colección será recorrida mediante polimorfismo.
5. Se mostrará la información de rutas gastronómicas, paseos lacustres y excursiones culturales.

---

# 📄 Resultado esperado

Al ejecutar el sistema se mostrará una salida similar a la siguiente:

```text
===== SERVICIOS TURISTICOS LLANQUIHUE TOUR =====

===== SERVICIO TURÍSTICO =====
Nombre: Ruta Sabores del Sur
Duración: 4 horas
Cantidad de restaurantes: 5

===== SERVICIO TURÍSTICO =====
Nombre: Ruta Gastronomica Llanquihue
Duración: 3 horas
Cantidad de restaurantes: 4

===== SERVICIO TURÍSTICO =====
Nombre: Paseo por el Lago Llanquihue
Duración: 2 horas
Tipo de embarcación: Lancha turistica

===== SERVICIO TURÍSTICO =====
Nombre: Navegacion a Puerto Varas
Duración: 3 horas
Tipo de embarcación: Catamaran

===== SERVICIO TURÍSTICO =====
Nombre: Excursion Patrimonial Frutillar
Duración: 4 horas
Lugar histórico: Teatro del Lago

===== SERVICIO TURÍSTICO =====
Nombre: Recorrido Historico Puerto Octay
Duración: 3 horas
Lugar histórico: Casa Niklitschek
```

---

## ▶️ Ejemplo de ejecución

El siguiente fragmento muestra cómo el sistema utiliza el polimorfismo para recorrer la colección de servicios turísticos:

```java
for (ServicioTuristico servicio : servicios) {
    servicio.mostrarInformacion();
}
```

Cada objeto ejecuta automáticamente la versión de `mostrarInformacion()` correspondiente a su clase, demostrando el comportamiento polimórfico del sistema.

---

# 🎯 Objetivos de aprendizaje alcanzados

- Aplicar el concepto de herencia en Java.
- Implementar polimorfismo mediante sobrescritura de métodos.
- Utilizar una colección `List<ServicioTuristico>` para almacenar diferentes tipos de objetos.
- Recorrer una colección utilizando un ciclo `for-each`.
- Organizar un proyecto utilizando paquetes.
- Reutilizar código mediante el uso de `super()`.
- Modelar un problema utilizando Programación Orientada a Objetos.

---

# ✅ Conclusión

Este proyecto permitió aplicar los principales conceptos de la Programación Orientada a Objetos en Java mediante una estructura basada en herencia y polimorfismo. El uso de una colección `List<ServicioTuristico>` permitió almacenar diferentes tipos de servicios turísticos y recorrerlos utilizando una única referencia de la superclase, demostrando la reutilización de código, la organización modular y el comportamiento polimórfico de los objetos durante la ejecución del sistema.

---

# 🔗 Repositorio

**GitHub:**  
<https://github.com/sergiosandovalv/LlanquihueTourApp1>

---

**Proyecto desarrollado para la asignatura Desarrollo Orientado a Objetos I – Duoc UC.**
