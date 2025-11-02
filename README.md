# Santander-dev-week-2023
JSON RESTful API criada para a Santander Dev Week.

## Diagrama de classes

```mermaid
classDiagram
    class User {
        -string name
        -Account account
        -Feature[] features
        -Card card
        -News[] news
    }

    class Account {
        -string number
        -string agency
        -float balance
        -float limit
    }

    class Feature {
        -string icon
        -string name
        -string description
    }

    class Card {
        -string number
        -float limit
    }

    class News {
        -string icon
        -string description
    }

    User "1" *-- "1" Account
    User "1" *-- "N" Feature
    User "1" *-- "1" Card
    User "1" *-- "N" News
