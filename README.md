# Lluvia-Villanueva-listas-java
Ejercicios prácticos listas en java
# Práctica: Ejercicios de Listas en Java (Unidad II)

* **Nombre:** Lluvia Estefanía Villanueva Lazo
* **Matrícula:** 1225100383
* **Grupo:** GTID244
* **Carrera:** TSU en Desarrollo de Software Multiplataforma
* **Asignatura:** Estructura de Datos
* **Institución:** Universidad Tecnológica del Norte de Guanajuato

---

## Ejercicios Resueltos y Tipo de Lista Utilizada

1. **Ejercicio 1: Formados en la cafetería**
   * **Descripción:** Simulación de una fila de cafetería con prioridad para trabajadores frente a alumnos, manteniendo el orden de llegada dentro de cada categoría
   * **Tipo de Lista:** **Lista Doblemente Enlazada** (permite gestionar nodos al frente y atrás para encolar y desencolar de forma eficiente)

2. **Ejercicio 3: Comprando agua**
   * **Descripción:** Procesamiento de un conjunto de marcas de agua y sus precios para encontrar y mostrar únicamente el menor costo
   * **Tipo de Lista:** **Lista Enlazada Simple** (almacena los precios de manera dinámica para su posterior recorrido y comparación)

3. **Ejercicio 5: Supermercado**
   * **Descripción:** Simulación de un ticket de compra ordenado de mayor a menor precio, mostrando una lista numerada de artículos y el costo total al finaL.
   * **Tipo de Lista:** **Lista Enlazada Simple** (permite agregar productos y reorganizar los nodos según sus precios)

4. **Ejercicio 7: Cuadro de Honor**
   * **Descripción:** Filtrado de alumnos con calificaciones de excelencia ($\ge 9.5$) y ordenamiento alfabético de sus nombres.
   * **Tipo de Lista:** **Lista Enlazada Simple** (almacena los registros de los estudiantes de forma dinámica aplicando las reglas de filtrado y ordenamiento).

---

## Instrucciones de Compilación y Ejecución

Para compilar y ejecutar cualquiera de los programas desde la terminal de comandos (CMD) ubicándote en la raíz del proyecto (`C:\Listas\Lluvia-Villanueva-listas-java`), sigue estos pasos:

### 1. Compilar el ejercicio
Reemplaza `ejercicioX_Carpeta` por el nombre de la carpeta correspondiente (por ejemplo: `ejercicio1_FormadosEnLaCafeteria`, `ejercicio3_ComprandoAgua`, `ejercicio5_Supermercado`, o `ejercicio7_CuadroDeHonor`):

```cmd
javac ejercicioX_Carpeta/*.java
