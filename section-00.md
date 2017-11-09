## Przygotowanie środowiska


### 1.
* Zainstaluj oprogramowanie w systemie operacyjnym:
    * Java 8
    * Maven
    * IDE wg. własnego wyboru, preferowany IntellJ Idea
    * Docker
    * Git
    * Klienta bazy Postgres, np. pgAdmin


### 2.
Uruchomienie Postgresa na Dockerze:
```bash
docker run --rm -p 5432:5432 --name postgres -e POSTGRES_PASSWORD=HASLO postgres:latest
```
* user: postgres
* pass: HASLO


### 3.
Ewentualne stworzenie osobnej bazy i użytkownika na potrzeby szkolenia:

(po zalogowaniu jako użytkownik `postgres`)
```sql
CREATE USER "szkolenie" PASSWORD 'szkolenie';
CREATE DATABASE szkolenie;
GRANT ALL PRIVILEGES ON DATABASE szkolenie TO szkolenie;
```