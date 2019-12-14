# Monopoly  
required to design and implement a variant of the Monopoly game. Will be implementing standard US version of the game. More details available in this [link](https://monopoly.fandom.com/wiki/Monopoly)

## Team Details  
- team id: _18_  
- team members: _Hamza Afridi, Anh Le Ho Bao_ 

### Language  
Java

### Project structure  
Project has the following structure:
- app (package): contains main class in run.java file
- board (package): contains all board related classes
- players (package): contains all player related classes
- test (package): contains test for each of the classes seperately
- utils (package): contains common functionality classes such as input control

### How to run the project
To run this run the jar file in APP folder (not the app package in src folder).
- You will be prompted to input number of users
- Then you will be prompted to players names and select token
- from there on the game will start
  
### Objective  
Objective of the game is to own as much land (property) and to be the richest person.  

### Components
Following componnents are to be implemented:  
- [X] gameboard: includes 40 spaces
- [X] 6 tokens: differ by color; red, green, blue, yellow, while, black
- [X] 16 chance cards: description of the cards can be found in the [link](https://monopoly.fandom.com/wiki/Chance#Cards)
- [X] 16 community chest cards: description of the cards can be found in the [link(https://monopoly.fandom.com/wiki/Community_Chest#Cards)
- [X] 32 houses
- [X] 12 hotels
- [X] 28 title deed cards: description of these deeds cards can be found in the [link](https://www.ranker.com/list/all-monopoly-properties/steve-wright)
- [X] money
- [X] two dices: 6 sides with numbers 1,2,3,4,5,6

### Game Flow  

#### Preperation
1. prompt for number of players (max 6)
2. prompt each user to provide name and choose a token (one user should select one and the other user should not be able to select already selected tokens)
3. shuffle chance and community chest cards
4. set the token starting points at go (start of the board)

### Contributions  
All classes were equally distributed. Each class has it's author mentioned on the file. Hamza worked on Player class, game flow, Utils and some parts of flow. Brian did major work in creating the board, cards and all the functionality. Test were simultaneously created for all cases individually.

### Evaluation Checklist  
- [X] seperate classes for different game components
- [X] No big classes, long methods
- [X] well structured
- [X] accurate implementation of interfaces
- [X] are design patterns used
- [X] all functionality is correctly implemented and tested and retested
- [X] approprite work distribtuion
- [X] frequent commits by both team members
- [X] several and meaningful tests cases implemeted to test main functionality

### Final Checklist  
- [X] TeamID in README
- [X] Structure of repo in README
- [X] How to run checklist in README
- [X] Team organization in README
- [X] Complete Folder of ECLIPSE PROJECT including external libraries
- [X] Unit Tests 50% coverage atleast
- [X] 1 use case diagram: UML diagram folder
- [X]  1 sequence diagram: UML diagram folder
- [X] 1 class diagram: UML diaram folder
