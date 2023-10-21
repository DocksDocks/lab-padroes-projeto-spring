# Explorando Padrões de Projetos na Prática com Java

Repositório com as implementações dos padrões de projeto explorados no Lab "Explorando Padrões de Projetos na Prática com Java". Especificamente, este projeto explorou alguns padrões usando o Spring Framework, são eles:
- Singleton
- Strategy/Repository
- Facade


# Exemplos metodos HTTP

## Importar POSTMAN 

Você pode importar o arquivo ```Cliente.postman_collection.json```em seu postman para ter estes exemplos abaixo.

## Post - inserir cliente

**URL** = ```localhost:8080/clientes```

**body**
```json
{
    "nome": "Jorge",
    "endereco": {
        "cep": "01001-000",
        "logradouro": "Praça da Sé",
        "complemento": "lado ímpar",
        "bairro": "Sé",
        "localidade": "São Paulo",
        "uf": "SP",
        "ibge": "3550308",
        "gia": "1004",
        "ddd": "11",
        "siafi": "7107"
    }
}
```

## GET ALL - ver todos clientes existentes

**URL** = ```localhost:8080/clientes```

## GET - ver cliente pelo id

**URL** = ```localhost:8080/clientes/${id}```

## PUT - atualizar cliente pelo id

**URL** = ```localhost:8080/clientes/${id}```

exemplo body:
```json
{
    "nome": "Jorge Dalton"
}
```

## DELETE - deletar um cliente pelo id

**URL** = ```localhost:8080/clientes/${id}```