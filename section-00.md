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
Potrzebujesz bazy danych Postgres. Masz 3 możliwości:
* posiadasz albo zainstalujesz ją lokalnie. Jeśli chcesz jej używać to dla bezpieczeństwa powinieneś utworzyć odrębną
  bazę danych na potrzeby szkolenia - pkt.2a.
* uruchomisz ją na Dockerze z obrazu oficjalnego wg. instrukcji w pkcie 2b.
* [zalecane] uruchomisz ją na Dockerze z obrazu dedykowanego przygotowanego wg. instrukcji w pkcie 2c.


### 2a.
Ewentualne stworzenie osobnej bazy i użytkownika na potrzeby szkolenia:

(po zalogowaniu jako użytkownik `postgres`)
```sql
CREATE USER "szkolenie" PASSWORD 'szkolenie';
CREATE DATABASE szkolenie;
GRANT ALL PRIVILEGES ON DATABASE szkolenie TO szkolenie;
```


### 2b.
Uruchomienie Postgresa na Dockerze:
```bash
docker run --rm -p 5432:5432 --name postgres -e POSTGRES_PASSWORD=HASLO postgres:latest
```
* user: postgres
* pass: HASLO
Możesz, ale nie musisz, utworzyć odrębny schemat na potrzeby szkolenia - pkt. 2a.


### 2c.
W repo na potrzeby zadania na gałęzi `master` w katalogu `template-postgres` znajduje się obraz, który po zbudowaniu
dostarczy bazy danych. Instrukcje szczegółowe w pliku README.md we wskazanym katalogu.