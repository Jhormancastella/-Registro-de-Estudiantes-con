# Taller de Java:  
## 🚀 Ejercicio #1 Gestión de Estudiantes con List
## 📌 Propósito
Este proyecto desarrolla un programa en Java para gestionar estudiantes utilizando una estructura de datos `List`, permitiendo almacenar nombres, mostrar la lista completa de estudiantes, ordenarla alfabéticamente y verificar si un estudiante específico está registrado.  
El proyecto utiliza conceptos básicos de programación en Java, como colecciones (`List`), entrada/salida por consola y manipulación de datos.

## 🚀 Instalación y Configuración
### Requisitos Previos
- Java Development Kit (JDK) 17 o superior  
- Git instalado en tu sistema  

### Clonar Repositorio
```bash
git clone https://github.com/Jhormancastella/gestion-de-estudiantes.git
```

### Compilar y Ejecutar
1. Abre una terminal en la carpeta del proyecto.  
2. Compila el archivo Java:
   ```bash
   javac GestionEstudiantes.java
   ```
3. Ejecuta el programa:
   ```bash
   java GestionEstudiantes
   ```

## 🛠️ Uso
1. **Registro de Estudiantes**:
   - El programa solicitará al usuario cuántos estudiantes desea registrar.  
   - A continuación, pedirá los nombres de los estudiantes y los almacenará en una `List<String>`.  

2. **Mostrar Lista de Estudiantes**:
   - Una vez registrados, se mostrará la lista completa de estudiantes.  

3. **Ordenar Alfabéticamente**:
   - La lista de estudiantes se ordenará alfabéticamente y se mostrará nuevamente.  

4. **Verificar Existencia**:
   - El usuario podrá buscar si un estudiante específico está registrado en la lista.  

### Ejemplo de Ejecución
```bash
¿Cuántos estudiantes desea registrar? 3
Ingrese el nombre del estudiante #1: Ana
Ingrese el nombre del estudiante #2: Carlos
Ingrese el nombre del estudiante #3: Beatriz
--- Lista de Estudiantes Registrados ---
Ana
Carlos
Beatriz
--- Lista de Estudiantes Ordenada Alfabéticamente ---
Ana
Beatriz
Carlos
¿Desea buscar un estudiante? (si/no): si
Ingrese el nombre del estudiante que desea buscar: Carlos
✅ El estudiante 'Carlos' está en la lista.
```

## 📋 Características
- Registro de estudiantes utilizando `List<String>` para almacenar nombres.  
- Mostrar la lista completa de estudiantes registrados.  
- Ordenar la lista de estudiantes alfabéticamente utilizando `Collections.sort()`.  
- Verificar la existencia de un estudiante específico en la lista utilizando el método `contains()`.  

## 🚨 Estado del Ejercicio
- Culminado.  

## 👤 Autor
Jhorman Jesús Castellanos Morales
