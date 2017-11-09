## 1. Pierwsze encje i operacje na nich


## Cel ćwiczenia
Celem jest budowa pierwszej aplikacji wraz z encjami danych, które będą miały funkcjonalność utrwalania w bazie. A następnie utworzenie obiektów, ich zapis, i próbny odczyt.
W zadaniu zostały pominięte kwestie 


## Budowa modułu
### 1.1
1. Utwórz w projekcie nowy moduł, nazwij go np. `zadanie-01`.
1. Utwórz encję `Customer` opisującą klienta. Klasa powinna znajdować się w pakiecie `pl.vavatech.domain` i zawierać następujące pola:
```java
private long id
private String lastName
private String firstName
```
1. Oznacz klasę i pole `id` odpowiednimi adnotacjami i zapewnij implementację interfejsu `Serializable`.
1. Stwórz metody dostępowe dla wszystkich pól encji.
1. Nadpisz metodę `toString` tak, aby zwracała informację o kliencie.
1. Nadpisz metody `equals()` i `hashCode()`. 


### 1.2
1. Utwórz encję `Order` z poniższymi składowymi spełniając także wcześniejsze wymogi dla encji:
```java
private long id
private String number
private String description
``` 
1. Oznacz klasę i pole `id` odpowiednimi adnotacjami i zapewnij implementację interfejsu `Serializable`.
1. Stwórz metody dostępowe dla wszystkich pól encji.
1. Nadpisz metodę `toString` tak, aby zwracała informację o kliencie.
1. Nadpisz metody `equals()` i `hashCode()`. 


### 1.3
1. Utwórz encję `Product` z poniższymi składowymi spełniając także wcześniejsze wymogi dla encji:
```java
private long id
private Double price
private String description
```
1. Oznacz klasę i pole `id` odpowiednimi adnotacjami i zapewnij implementację interfejsu `Serializable`.
1. Stwórz metody dostępowe dla wszystkich pól encji.
1. Nadpisz metodę `toString` tak, aby zwracała informację o kliencie.
1. Nadpisz metody `equals()` i `hashCode()`. 


### 1.4
1. Stwórz plik `persistence.xml` opisujący jednostkę trwałości i umieść go w katalogu `META-INF`.
   Wykorzystaj dowolną bazę danych - np. H2 lub Postgres.
1. Utwórz przykładową klasę uruchamialną - może to być klasa z metodą statyczną `main(String...)` lub test JUnit.
1. Dla każdej z encji utwórz po 2 egzeplarzach, każdemu ustaw wartości w polach, następnie utrwal i sprawdź w JPA czy się to odbyło.
1. Sprawdź czy w bazie danych są utrwalone dane.


### 1.5 Dodatkowe
1. Wykorzystaj obie bazy danych - zarówno H2 jak i Postgres. Wykonaj testy na najpierw na jednej a potem na drugiej.
1. Sprawdź czy baza danych Postgres zachowała dane po zakończeniu testu.