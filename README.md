# WerkStudent
All Projects and little Exercices that i have done during my 2 semester in Java.

One of the 2 main project are Bomberman and GameOfLife. 

# 💣 JavaFX Bomberman

A modular Bomberman game developed in Java as part of a Programmation course.  
The project was built incrementally across multiple assignments and demonstrates object-oriented design, event-driven programming, and configurable game architecture.

---

##  Features

- Keyboard-controlled player movement
- Bomb placement with timed explosions
- Adjustable explosion range
- Destructible and indestructible walls
- Power-ups:
  - 🔥 Increased bomb strength
  - 💣 Additional simultaneous bombs
  - ⭐ Extra points
- Score tracking system
- High-score and multi-player ranking system
- Configurable game behavior via `switchModus.properties`
- JavaFX-based graphical user interface

---

## 🏗 Architecture & Design

- `FlattenedBoard` – Game board management
- `Bomb` & `Blast` – Explosion lifecycle handling
- `HandOperatedBomberman` – Player control logic
- Power-up classes – Gameplay extensions
- Ranking & scoring system
- `FxUI` – JavaFX-based user interface
- Properties-based configuration for dynamic mode switching

Key concepts demonstrated:

- Separation of concerns
- Encapsulation and abstraction
- Game state management
- Configurable system design
- Unit testing

---

## Technologies Used

- Java
- JavaFX
- Object-Oriented Programming (OOP)
- JUnit (if you implemented tests)
- Properties configuration files

---

# Conway's Game of Life – Java Implementation

A Java implementation of Conway's Game of Life developed as part of a university programming project.  
The project focuses on object-oriented design, grid-based state management, and rule-based simulation logic.

---

##  About the Game

Conway's Game of Life is a zero-player simulation where the evolution of cells is determined by simple mathematical rules.

Each cell on a 2D grid can be either **alive** or **dead**.  
The next generation is calculated based on the number of living neighbors.

### Rules

For each cell:

1. Any live cell with fewer than 2 live neighbors dies (underpopulation)
2. Any live cell with 2 or 3 live neighbors survives
3. Any live cell with more than 3 live neighbors dies (overpopulation)
4. Any dead cell with exactly 3 live neighbors becomes alive (reproduction)

---

##  Architecture

The project is structured using object-oriented principles:

- `Board` / `Grid` – Manages the 2D cell structure
- `Cell` – Represents the state (alive/dead)
- Simulation logic – Computes next generation
- (Optional) JavaFX UI – Visual representation of the grid

Key implementation aspects:

- Clear separation between simulation logic and UI
- Safe generation updates (no direct state overwriting)
- Neighbor counting algorithm
- Configurable grid size (if implemented)

---

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- (Optional) JavaFX
- JUnit (if tests were written)



