<p align="center">
  <a href="" rel="noopener">
 <img width=200px height=200px src="https://github.com/CodeStrong2023/-Programando-Ando---tercer-semestre/assets/131505719/3381f17b-006c-4e8f-8e80-06cd5e06369a" alt="Project logo"></a>
</p>

<h3 align="center">🐍 Proyecto Integrador Python - Tercer Semestre 🐍</h3>

<div align="center">

  [![Python](https://img.shields.io/badge/Python-3776AB?logo=python&logoColor=fff)](#)
  [![Postgres](https://img.shields.io/badge/Postgres-%23316192.svg?logo=postgresql&logoColor=white)](#)
  [![Git](https://img.shields.io/badge/Git-F05032?logo=git&logoColor=fff)](#)
  [![Visual Studio Code](https://img.shields.io/badge/Visual%20Studio%20Code-0078d7.svg?logo=visual-studio-code&logoColor=white)](#)
  [![PyCharm](https://img.shields.io/badge/PyCharm-143?logo=pycharm&logoColor=black&color=black&labelColor=green)](#)

</div>


## 📝 Tabla de Contenidos
- [Sobre el Proyecto](#-sobre-el-proyecto)
  - [Árbol del Proyecto](#-árbol-del-proyecto)
- [Requisitos Previos](#-requisitos-previos)
- [Instalación](#-instalación)
- [Integrantes](#-integrantes)


## 🧐 Sobre el Proyecto
Este proyecto es un programa de gestión de stock desarrollado en Python y PostgreSQL, diseñado para ejecutarse en la terminal. Su propósito principal es facilitar la administración de inventarios, permitiendo a los usuarios llevar un control detallado de los productos disponibles.

Las funcionalidades principales del programa incluyen:

- **Registrar un producto**
- **Listar los productos registrados**
- **Buscar un producto**
- **Eliminar un producto**
- **Modificar un producto**

Para mejorar la experiencia del usuario, el programa utiliza la librería `tabulate` para imprimir los productos en la consola de una manera clara y organizada.

## 🌲 Árbol del Proyecto

```
📦 Proyecto-Integrador
├─ assets
│  └─ python-logo.png
├─ sql
│  └─ db_productos.sql
├─ src
│  ├─ database
│  │  ├─ conexion.py
│  │  └─ iniciar_tablas.py
│  ├─ menu
│  │  └─ menu.py
│  ├─ metodos
│  │  ├─ buscar_producto.py
│  │  ├─ eliminar_producto.py
│  │  ├─ listar_producto.py
│  │  └─ modificar_producto.py
│  └─ main.py
├─ test
│  └─ test.py
├─ .gitignore
├─ README.md
└─ requirements.txt
```

## 🤔 Requisitos Previos
- Instalar [Python](https://www.python.org/downloads/)
- Instalar [PostgreSQL](https://www.postgresql.org/download/)
- Crear una base datos en pgAdmin4 (PostgreSQL) con el nombre de `db_productos`
- Configuración del Servidor de la Base de Datos:
  - **Host:** 127.0.0.1
  - **Puerto:** 5432
  - **Usuario:** postgres
  - **Contraseña:** admin

Con estas instrucciones, se facilitará la ejecución del script que crea las tablas automáticamente, asegurando que todos los parámetros de conexión estén claramente definidos.

## 💻 Instalación
1. Clona el repositorio:
```
git clone https://github.com/CodeStrong2023/-Programando-Ando---tercer-semestre
```
2. Dirígete al directorio del proyecto:
```
cd -Programando-Ando---tercer-semestre/Proyecto-Integrador
```
3. Crea un entorno virtual:
```
python -m venv venv
```
4. Activa el entorno virtual:
- En Linux/macOS:
  ```
  source venv/bin/activate
  ```
- En Windows
  ```
  venv\Scripts\activate
  ```
5. Instala las dependencias:
```
pip install -r requirements.txt
```
6. Ejecución:
- Para ejecutar el programa se debe hacer desde el archivo `main.py` ya sea desde un IDE o directamente en la terminal.
```
python3 /src/main.py
```

## 👥 Integrantes
<table>
  <tr>
    <th>Alumno</th>
    <th>Nº Legajo</th>
    <th>GitHub</th>
  </tr>
  <tr>
    <td>Uriel Pardo</td>
    <td>10.462</td>
    <td><a href="https://github.com/UrielPardo" target="_blank">GitHub de Uriel</a></td>
  </tr>
  <tr>
    <td>Alexis Perez</td>
    <td>8.707</td>
    <td><a href="https://github.com/Alitoo27" target="_blank">GitHub de Alexis</a></td>
  </tr>
  <tr>
    <td>Ezequiel Lorenz</td>
    <td>10.426</td>
    <td><a href="https://github.com/ezelorenz" target="_blank">GitHub de Ezequiel</a></td>
  </tr>
  <tr>
    <td>Mauro Mesas</td>
    <td>10.442</td>
    <td><a href="https://github.com/mauromesas" target="_blank">GitHub de Mauro</a></td>
  </tr>
  <tr>
    <td>Tahiel Inostroza</td>
    <td>10.412</td>
    <td><a href="https://github.com/tahiel-14" target="_blank">GitHub de Tahiel</a></td>
  </tr>
</table>
