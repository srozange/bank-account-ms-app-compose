(Forked from https://github.com/mohamedYoussfi/bank-account-ms-app)

Compilation et lancement de l'appli : 

```bash
mvn clean package -DskipTests && docker compose up --build
```

Lancer l'appli sans recompilation :

```bash
docker compose up
```

Les url :
- endpoint accounts : http://localhost:8083/api/accounts
- endpoint customers : http://localhost:8084/customers
- jaeger (visualisation des traces) : http://localhost:16686/