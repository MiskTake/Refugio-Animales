# 🐾 Refugio de Animales

Sistema de gestión para un refugio de animales desarrollado en Java. Permite registrar animales, especies, gestionar adopciones y generar reportes, todo desde la consola.

---

## 📋 Descripción

El sistema fue desarrollado como proyecto integrador para practicar el uso de colecciones en Java. Está pensado para uso diario por voluntarios del refugio, priorizando simplicidad y claridad.

---

## 🧩 Estructuras de datos utilizadas

| Estructura | Variable | Uso |
|---|---|---|
| `List<String>` | `nombreAnimales` | Almacena los nombres de todos los animales registrados |
| `Set<String>` | `especies` | Guarda las especies disponibles, sin duplicados |
| `Map<String, String>` | `estadoAnimal` | Relaciona cada animal con su estado (Disponible / Adoptado) |
| `Map<String, String>` | `especieAnimal` | Relaciona cada animal con su especie |
| `String[]` | `estados` | Array fijo con los estados posibles |

---

## 🧭 Menú principal

```
╔═════════════════════════════════════╗
║     === REFUGIO DE ANIMALES ===     ║
╠═════════════════════════════════════╣
║   1. Registrar animal               ║
║   2. Registrar especie              ║
║   3. Marcar animal como adoptado    ║
║   4. Mostrar animales disponibles   ║
║   5. Mostrar animales adoptados     ║
║   6. Mostrar reporte general        ║
║   7. Salir                          ║
╚═════════════════════════════════════╝
```

---

## ▶️ Cómo ejecutar el programa

### Requisitos
- Java 14 o superior (por el uso de switch con arrow `->`)

### Pasos

**1. Clonar el repositorio**
```bash
git clone [https://github.com/<usuario>/refugio-animales.git](https://github.com/MiskTake/Refugio-Animales)
cd refugio-animales
```

**2. Compilar**
```bash
javac RefugioAnimales.java
```

**3. Ejecutar**
```bash
java RefugioAnimales
```

> ⚠️ Se recomienda ejecutar desde una terminal del sistema (CMD, PowerShell, bash) y no desde la consola integrada de un IDE, ya que los caracteres especiales del menú pueden no renderizarse correctamente.

---

## 📂 Estructura del proyecto

```
refugio-animales/
│
├── RefugioAnimales.java
├── CONTRIBUTING.md
├── README.md
└── .gitignore
```

---

## 👥 Integrantes del equipo

| Nombre | Rol |
|---|---|
| Diego Castillo | Mantenedor de repositorio, debugging, README.md y developer |
| Alexander Canario | Developer — Función 2: Registrar especie |
| Angela Galleguillos | Developer de listas y debugging |
| Constanza Riquelme | Developer — Función 6: Reporte general, CONTRIBUTING.md, consultoría y Scrum Master |
| Pablo Fuentes | Developer — Función 1: Registrar animal |
| Sary Viafara | Developer — Función 3: Marcar animal como adoptado |
| Julio Oyarzun | Developer — Funciones 4 y 5: Mostrar animales disponibles y adoptados |
