# Docker - PRO

## BDD - pas besoin au final

docker create -v /var/lib/postgresql/data --name PostgresData alpine

docker run -p 5432:5432 --name test -e POSTGRES_PASSWORD=123456789 -d --volumes-from PostgresData postgres

## Application

1. Modification des fichiers (à définir)

    Il faut modifier l'URL du fichier app\controllers\BDDpackage\BDD.java par ```jdbc:postgresql://0.0.0.0:5432/BD_Budget``` au lieu de ```jdbc:postgresql://127.0.0.1:5432/BD_Budget``` 

    Il faut aussi modifier l'URL du fichier conf/application.conf ```db.default.url="jdbc:postgresql://0.0.0.0/BD_Budget"```

2. Taper dist dans la console SBT sur Intellij

    Ceci permet de créer un ```SNAPSHOT.zip``` dans ```target/universal/```

3. Préparation pour le déployement

    Ces commandes doivent être taper dans le dossier Source_projet. Supprimer tous les fichiers qui se trouvent dans docker/app/files

    ```
    unzip -d docker/app/files target/universal/*-1.0-SNAPSHOT.zip
    mv docker/app/files/*/* docker/app/files
    rm docker/app/files/bin/*.bat
    mv docker/app/files/bin/* docker/app/files/bin/start
    ```
    
    Elles permettent de préparer les fichiers du site pour docker

4. Lancement de l'application

    Ouvrir docker dans le répertoire ```docker/app/``` et taper la commande ```docker-compose up```. Cette commande va appeler le fichier docker-compose.yml ainsi que Dockerfile.

## Sources

* https://elanderson.net/2018/02/setup-postgresql-on-windows-with-docker/

* https://medium.com/@shatil/play-framework-https-hello-world-with-docker-62963cf26daf

* https://stackoverflow.com/questions/53257416/dockerizing-play-framework