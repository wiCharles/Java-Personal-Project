# Project: Sandbox - A console-based RPG.

------------------------------

## Badges
![Status](https://img.shields.io/badge/Status-Planning-orange)
![Java](https://img.shields.io/badge/Java-21-blue?logo=openjdk)
![Maven](https://img.shields.io/badge/Maven-4.0.0-C71A36?logo=apache-maven)
![JUnit](https://img.shields.io/badge/JUnit-5-25A162?logo=junit5)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
![GitHub last commit](https://img.shields.io/github/last-commit/wiCharles/Java-Personal-Project)
[![Java CI with Maven](https://github.com/wiCharles/Java-Personal-Project/actions/workflows/ci.yml/badge.svg)](https://github.com/wiCharles/Java-Personal-Project/actions/workflows/ci.yml)

## Description

This Java project is designed to further my understanding of not only Java
but to also understand GitHub workflow. This project will be taking the form
of a *console-based RPG* (Role Playing Game), focusing on randomized battles
and an in-depth combat system.

This will be a medium-sized, sandbox-type learning experience, with the scope (and my technical knowledge),
evolving as I work on this project.

## Visuals
Visuals In Progress.

## Installation

Make sure that the prerequisites are installed, such as Java and Maven:
```bash
java -version
mvn --version
```

Then, clone my repository:
```bash
git clone https://github.com/wiCharles/Java-Personal-Project.git
cd Java-Personal-Project
```
Finally, compile the project:
```bash
mvn clean compile
```

## Usage
Usage instructions will be added here once the project reaches a runnable state. 
There will be a `Main` class, executable via Maven.

## Testing
To run the unit tests for this project, use the following Maven command:
```bash
mvn test
```

## Roadmap

An ambitious project such as this one benefits greatly with a concise and detailed
roadmap, to avoid scope creep and give a sense a direction:

Planning - The planning stage is split into two parts. The first, is setting up the repo and
making sure that the GitHub workflow is functional. The second, will consist of laying out parts of my game.
Having written (or visual) diagrams of the structure of the project will be imperative.

Early-Stage Development - This will consist of translating the planned out diagrams into actual files. The goal of this stage
would be a working demo of the game. This could include multiple characters to choose from and a series of battles.

Early-Stage Testing - This would be a snapshot release. The goal is referenced in Early Development.
Each testing phase will include acceptance tests and TDD. As well as a balance look over of my demo.

Middle-Stage Development - Expanding the scope of the project, I plan to have my mid-stage include some sort of database
integration (saving and restoring characters), even more characters to choose from and extra functionality, such as a
difficulty system.

Middle-Stage Testing - Same as my Early Testing stage. However, I shall be testing the database integration and the extra
features that I might have added.

Late-stage Development - Split into two parts. The first would be much needed refactoring and a thorough look of my
code, as adding many features is bound to induce either scope creep, or even balance (a battle being unfair, or a
character being deemed too strong.) The second is to have all of my work consolidated into an actual, well-looking game.
This could include having a working game-loop.

Comprehensive Testing/User Feedback - Testing entire runtimes of my game, as well as outsourcing my game to other
students, to have an idea of how easy my game is to install/run. As well has having a second opinion on game balance.

Release - Moving from early to middle stage testing will have small sandbox releases, not to be released as snapshots but as
demos. However, this stage will be the final product. A working RPG in which I am happy with Its state. I will still be
improving/maintaining it.

## Contributing
As this is a personal project, I am not open to contributions. I am however, open to suggestions! This could include ideas for characters, balance suggestions, or readability improvements.
You can make suggestions by opening issues in my [GitHub Issues](https://github.com/wiCharles/Java-Personal-Project/issues)

## Authors and acknowledgment
**William Charles** - *Initial work* - [wiCharles](https://github.com/wiCharles).

**Inspirations** - Various RPG games. (Exact references shall be listed here)

## License
This project is open source and available under the **[MIT License](https://opensource.org/licenses/MIT)**.

## Project status
**Planning** - Currently the project is in the planning phase. The repo will be
updated with various milestones and issues, as well as setting up CI/CD.
