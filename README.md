![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

## 🧠 Evaluación – Desarrollo Orientado a Objetos I 

👤 Autor del proyecto

Nombre completo: Sergio Sandoval Valenzuela

Carrera: Analista Programador

Sede: Santiago Online

# 📘 Descripción general del sistema

Este proyecto corresponde a la Evaluación de la asignatura Desarrollo Orientado a Objetos I.

El sistema desarrollado en Java permite gestionar información de tours turísticos de la empresa Llanquihue Tour, cargando datos desde un archivo de texto y almacenándolos en una colección dinámica mediante el uso de objetos.

La aplicación implementa conceptos fundamentales de Programación Orientada a Objetos, tales como:

-Encapsulamiento.

-Constructores.

-Getters y Setters.

-Sobrescritura de métodos mediante toString().

-Composición entre clases.

-Manejo de archivos de texto.

-Uso de colecciones ArrayList.

-Estructuras de control if y while.

-Manejo de excepciones mediante try-catch.

-Validaciones básicas.

-Generación de archivo ejecutable .jar mediante Maven.

El sistema permite mostrar el listado completo de tours, filtrar aquellos pertenecientes a la categoría Familiar y realizar una búsqueda simple por nombre de tour.

# 🧱 Estructura general del proyecto

```text

LlanquihueTourApp/
├── pom.xml
├── .gitignore
└── src/
    └── main/
        ├── java/
        │   └── com/
        │       └── LlanquihueTourapp/
        │           ├── app/
        │           │   └── Main.java
        │           ├── data/
        │           │   └── GestorDatos.java
        │           ├── model/
        │           │   ├── Tour.java
        │           │   └── GuiaTuristico.java
        │           └── util/
        │               └── Validador.java
        └── resources/
            └── tours.txt

```


#  Descripción de paquetes:

## 📁 app

Contiene la clase principal Main, encargada de ejecutar la aplicación, cargar los datos, mostrar el listado completo de tours, filtrar por tipo Familiar y realizar una búsqueda simple.

## 📁 model

Contiene las clases principales del dominio:

-Tour: representa cada tour turístico mediante nombre, tipo, precio y guía turístico asociado.

-GuiaTuristico: representa al guía asociado al tour, aplicando composición entre clases.

## 📁 data

Contiene la clase GestorDatos, responsable de leer el archivo tours.txt, cargar los datos y crear los objetos Tour. 

## 📁 resources

Contiene el archivo tours.txt, donde se almacenan los datos utilizados por el sistema.

# ⚙️ Instrucciones para clonar y ejecutar el proyecto

## Clonar el repositorio

git clone https://github.com/sergiosandovalv/LlanquihueTourApp.git


## Abrir el proyecto

1.-Abrir NetBeans IDE.

2.-Seleccionar File → Open Project.

3.-Buscar la carpeta del proyecto clonado.

4.-Abrir el proyecto LlanquihueTourApp.


## Ejecutar en NetBeans

1.-Verificar que el archivo tours.txt se encuentre en src/main/resources.

2.-Ejecutar la clase Main.java, ubicada en el paquete com.LlanquihueTourapp.app.

3-El sistema cargará los tours desde el archivo de texto.

4.-Se mostrará el listado completo de tours.

5.Luego se mostrarán los tours filtrados por tipo Familiar.

6.-Finalmente se mostrará una búsqueda simple del tour Frutillar.


# Compilar y ejecutar el archivo .jar

## Generar el archivo ejecutable

1.-Abrir una terminal desde el sistema operativo

2.- Cambiar al directorio raíz del proyecto, ejecutar:

mvn clean package

## Ejecutar el archivo .jar

java -jar target/LlanquihueTourApp-1.0-SNAPSHOT.jar



# 📄 Resultado esperado

El sistema mostrará por consola:

Todos los tours cargados desde el archivo tours.txt.

Los tours filtrados por categoría Familiar.

El resultado de una búsqueda simple por nombre de tour.



## Ejemplo de búsqueda:

===== BÚSQUEDA DE TOUR =====

===== DATOS DEL TOUR =====

Nombre : Frutillar

Tipo   : Familiar

Precio : $18000

Especialidad : Familiar
