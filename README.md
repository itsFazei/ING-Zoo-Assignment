Here's the full README in **Markdown** format:

# Zoo Java Console Application

## Usage

### 1. **Compiling and Running the Project**

#### **From Command Line Interface (CLI)**

To compile and run the project from the command line, follow these steps:

1. **Compiling the Project**  
   Make sure you are in the root directory (where `src/` and `out/` folders are located). Then run the following command:

   ```bash
   mkdir -p out
   find src/com/ing/zoo/ -name "*.java"
   javac -d out @sources.txt
   ```

This will compile all `.java` files in the `src/` directory and place the compiled `.class` files in the `out/` directory.

2. **Running the Project**
   After compiling, you can run the project with the following command:

   ```bash
   java -cp out com.ing.zoo.Zoo
   ```

   This will start the program, and you can interact with the zoo through the console.

---

#### **Using Visual Studio Code (VS Code)**

To run the project in VS Code, follow these steps:

1. **Install Java Extensions**
   Ensure that you have the **Java Extension Pack** installed. This will provide the necessary tools for compiling and running Java programs within VS Code.

2. **Opening the Project**
   Open the root folder of the project (the folder containing `src/` and `out/`).

3. **Compiling the Project**
   VS Code will automatically recognize the project as a Java project and offer to build it when you open it. Alternatively, you can use the command palette (`Ctrl+Shift+P`), type `Java: Compile`, and run it.

4. **Running the Project**
   Once compiled, use the "Run" button in the top right corner of VS Code or use the command palette (`Ctrl+Shift+P`), type `Java: Run`, and select the `Zoo` class to run the project.

   You should now be able to interact with the zoo via the terminal inside VS Code.

---

#### **Using IntelliJ IDEA**

To run the project in IntelliJ IDEA, follow these steps:

1. **Open the Project**
   Open the root folder of the project (where `src/` and `out/` are located) in IntelliJ IDEA.

2. **Build the Project**
   IntelliJ IDEA will automatically detect the project as a Java project. To compile, press `Ctrl+F9` (Windows/Linux) or `Cmd+F9` (Mac), or go to the **Build** menu and select **Build Project**.

3. **Running the Project**
   After building the project, press the green **Run** button in the top-right corner (or use `Shift+F10`) to run the `Zoo` class. IntelliJ will handle the classpath and execution for you.

   You can interact with the zoo from the run console in IntelliJ IDEA.

---

### 2. **Available Commands**

Once the program is running, you can input the following commands:

- **`hello`**: Makes all animals in the zoo greet you.

  Example:
  `hello`

- **`give leaves`**: Feeds all herbivores in the zoo leaves.

  Example:
  `give leaves`

- **`give meat`**: Feeds all carnivores in the zoo meat.

  Example:
  `give meat`

- **`perform trick`**: Makes all animals that can perform tricks show a trick.

  Example:
  `perform trick`

### 3. **Error Handling**

If you enter an invalid command, or if the animal you mention doesn't exist, the program will display an error message:

```
Input: `hello dragon`
Output: `The animal that you have been looking for doesn't exist! Animal: dragon`
```

---

## Git

Voor het maken van deze opdracht wordt er gebruik gemaakt van het versiebeheersysteem Git.

Gebruikte **IDE**: [IntelliJ IDEA](https://www.jetbrains.com/idea/). (**Niet verplicht**)

Gebruikte **SDK**: [JDK 1.8](https://bitbucket.org/kychu/zoo/downloads/java-1.8.0-openjdk-1.8.0.212-3.b04.redhat.windows.x86_64.zip).

Mocht er problemen zijn met het openen van dit project, creëer dan een nieuw project binnen jouw IDE en kopieer de Java bestanden uit `src/com/ing/zoo`

Stappen:

1. Clone deze repository.
2. Maak een nieuwe repository aan, bijvoorbeeld op [Github](https://www.github.com).
3. Push jouw veranderingen naar jouw repository.
4. Maak jouw repository openbaar (public).
5. Als de applicatie af is, push dan de laatste versie naar jouw `master` branch.

---

## Opdracht

- Maak de applicatie af.
- Reorganiseer eventueel de folder structuur.
- Refactor eventueel de code (denk goed na over de class structure).
  - Probeer er voor de zorgen dat je bijvoorbeeld geen EatMeat methode kan aanroepen op een Zebra object.
- Voeg 2 nieuwe dieren toe.

---

## Eisen

Bij elke command laat je het resultaat in de console zien.

- Als je de [hello] command uitvoert zonder dat er een naam is ingevuld zeggen alle dieren hallo.
  - Als er wel een naam is ingevuld [hello henk] zegt alleen dat dier hallo
- Als je de [give leaves] command uitvoert krijgen alle herbivores leaves.
- Als je de [give meat] command uitvoert krijgen alle carnivores meat.
- Als je de [perform trick] command uitvoert doen alle dieren die dat kunnen hun trucje.
