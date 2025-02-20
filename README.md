# 42 Avaj-Launcher  

**Avaj-Launcher** is a Java project focused on implementing **system design patterns**. It simulates an air traffic control system where different aircraft (balloons, helicopters, and jets) interact with a weather tower.  

## Key Concepts  
- **Observer Pattern** – The weather tower notifies aircraft of changing conditions.  
- **Singleton Pattern** – Ensures a single instance of the weather tower.  
- **Factory Pattern** – Handles aircraft creation dynamically.  

## Features  
- Reads a **scenario file** to initialize and simulate flights.  
- Aircraft react dynamically to **changing weather conditions**.  
- Outputs events to a **log file** for traceability.  

## Installation & Usage  
1. Clone the repository:  
   ```bash
   git clone <repository-url>
   cd avaj-launcher
   bash script.sh
