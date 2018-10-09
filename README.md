# Exemple de test avec la base HSQLDB

## Description

Je jeu de test utilise une base [HSQLDB](hsqldb.org). La base est créée et initialisée
en mémoire avant chaque test (`@Before`). Le code SQL d'initialisation est dans les
ressources de test (`src/test/resources`) sous la forme de fichiers SQL.

## Dépendances

Le fichier pom.xml contient les dépendances vers le driver JDBC de HSQLDB, et vers
l'outil sqltool qui permet d'exécuter les instructions SQL d'initialisation

```xml
        <!-- Le driver JDBC utilisé seulement pour le test -->        
        <dependency>
            <groupId>org.hsqldb</groupId>
            <artifactId>hsqldb</artifactId>
            <version>2.0.0</version>
            <scope>test</scope>
        </dependency>
        <!-- sqltool utilisé seulement pour le test pour initialiser la base -->                
        <dependency>
            <groupId>org.hsqldb</groupId>
            <artifactId>sqltool</artifactId>
            <version>2.0.0</version>
            <scope>test</scope>
        </dependency>
```

