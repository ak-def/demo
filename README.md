# Demo

A small Spring Boot application demonstrating a simple greeting endpoint and a task REST API backed by an in-memory H2 database.

## Requirements

- Java 17+
- No Maven installation is required; the project includes the Maven Wrapper.

## Run the application

On macOS/Linux:

```bash
./mvnw spring-boot:run
```

On Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

The application starts on `http://localhost:8080`.

## API

### Greeting

- `GET /Hello` — returns `Hello, Spring Boot!`
- `GET /Hello/Poorty` — returns the modified greeting

### Tasks

- `GET /tasks` — lists all tasks
- `POST /tasks` — creates a task

Example request:

```bash
curl -X POST http://localhost:8080/tasks \
  -H "Content-Type: application/json" \
  -d '{"title":"Write documentation","done":false}'
```

Example response:

```json
{
  "id": 1,
  "title": "Write documentation",
  "done": false
}
```

## H2 database console

The H2 console is enabled at [http://localhost:8080/h2-console](http://localhost:8080/h2-console).

Use these connection settings:

- **JDBC URL:** `jdbc:h2:mem:testdb`
- **User Name:** `sa`
- **Password:** *(blank)*

The database is in memory and is reset when the application stops.

## Tests

Run the test suite with:

```bash
./mvnw test
```

On Windows:

```powershell
.\mvnw.cmd test
```
