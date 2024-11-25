# Scoreboard

# Top 10 Players Scoreboard

This project is a Spring Boot application that tracks the top 10 players' scores in a game.
(from highest to lowest)

## How to Run the Project

### Prerequisites
- Java 11 or higher
- Maven

### Steps to Run
1. Clone the repository:
   ```bash
   git clone <https://github.com/TheOne619Neo/Scoreboard>
   cd src/main/java/com/theOne/test
### Build the project:

1. mvn clean install

### Run the application:

Run "TopPlayersApplication.java" that is the main.
If you using intelliJ just click the run button, after project build 
enter http://localhost:8080/addPlayer to view or change endpoint.

Alternatively you can also use
1. mvn spring-boot:run

### Exposed Endpoints

Add Player: POST /addPlayer
Request Body:
{
  "name": "PlayerName",
  "score": 100
}


Get Top Players: GET /topPlayers
Response Body:
[
  {
    "name": "PlayerName",
    "score": 100
  },
  ...
]


### Notes
The application uses an in-memory list to store player scores.
The list is sorted in descending order based on scores.
Only the top 10 players are kept in the list.
Versions
Java: 11
Spring Boot: 2.5.4

This implementation includes the necessary classes and methods to manage the top 10 players' scores, as well as a README file with instructions on how to run the project and details about the exposed endpoints.
