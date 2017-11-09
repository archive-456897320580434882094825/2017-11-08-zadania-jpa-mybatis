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
* Ściągnij szablon projektu mavenowego z repozytorium spod adresu: https://github.com/vavatech/2017-11-08-zadania-jpa-mybatis

Pobierz za pomocą swojego IDE lub też za pomocą innego klienta i następnie zaimportuj do IDE.
```sh
git clone https://github.com/vavatech/2017-11-08-zadania-jpa-mybatis.git
```


### 3.
Potrzebujesz bazy danych Postgres. Masz 3 możliwości:
* posiadasz albo zainstalujesz ją lokalnie. Jeśli chcesz jej używać to dla bezpieczeństwa powinieneś utworzyć odrębną
  bazę danych na potrzeby szkolenia - pkt.3a.
* uruchomisz ją na Dockerze z obrazu oficjalnego wg. instrukcji w pkcie 3b.
* [zalecane] uruchomisz ją na Dockerze z obrazu dedykowanego przygotowanego wg. instrukcji w pkcie 3c.


### 3a.
Ewentualne stworzenie osobnej bazy i użytkownika na potrzeby szkolenia:

(po zalogowaniu jako użytkownik `postgres`)
```sql
CREATE USER "szkolenie" PASSWORD 'szkolenie';
CREATE DATABASE szkolenie;
GRANT ALL PRIVILEGES ON DATABASE szkolenie TO szkolenie;
```


### 3b.
Uruchomienie Postgresa na Dockerze:
```bash
docker run --rm -p 5432:5432 --name postgres -e POSTGRES_PASSWORD=HASLO postgres:latest
```
* user: postgres
* pass: HASLO
Możesz, ale nie musisz, utworzyć odrębny schemat na potrzeby szkolenia - pkt. 3a.


### 3c.
W repo na potrzeby zadania na gałęzi `master` w katalogu `template-postgres` znajduje się obraz, który po zbudowaniu
dostarczy bazy danych. Instrukcje szczegółowe w pliku README.md we wskazanym katalogu.