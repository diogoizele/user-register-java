# User Register API

Check out challenge on [Twitter](https://twitter.com/zanfranceschi/status/1559000686913720320)

> "Ei dev, É normal não termos a validação que esperamos dos outros. Mas pelo menos NÓS podemos s̶e̶r̶ fazer a validação de que precisamos, certo?! Claro que sim! Então pega a parte 01/02 desse desafio. 🤭"

> "Essa parte do desafio vai te ajudar a não te xingarem quando estiverem usando as APIs que desenvolveu!
 Tirando a brincadeira, a ideia é super simples e tem muito a ver com a experiência que você quer oferecer para quem consome suas APIs."

> "Vamos lá. Desenvolva uma API para cadastro de propostas de abertura de conta num banco digital hipotético. A API pode ser algo como nessa imagem (é apenas uma sugestão ─ faça do jeito que tiver vontade)."

`# POST /v1/propostas`
```JSON
{
    "nome": "Diogo",
    "sobrenome": "Izele",
    "email": "email@mail.com",
    "nascimento": "23/03/2002",
    "cpf": "123.456.789-10",
    "rg": "123.456.789-1",
    "profissao": "Desenvolvedor",
    "naturalidade": "muito",
    "renda_mensal": "dinheiro que não acaba mais"
}
```

> "Agora vem o desafio em si. Na validação, retorne tudo que estiver errado usando mensagens bem informativas. Algo mais ou menos como nessa imagem."

![imagem](https://pbs.twimg.com/media/FaKu2f3VEAMOA25?format=jpg&name=small)

> "A ideia central aqui é não retornar a resposta na primeira inconsistência. Concatene todos os erros que puder e retorne tudo duma vez. Dessa forma, quem estiver usando a API será capaz de entender de primeira tudo que estiver errado. A experiência será muito melhor ─ te garanto!"

> "Minha sugestão de prática é você fazer essas validações na mão mesmo. Numa API produtiva, possivelmente você irá querer usar alguma lib/framework que faça isso para você ─ existem muitas opções para isso."
