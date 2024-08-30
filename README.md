# Atividade Final Java 

## Sistema de Controle de Pedidos

A classe Product tem como objetivo cadastrar os produtos individualmente.
Instanciamos dois atributos 'name' e 'price', sendo uma String e um double, respectivamente. Após isso, criamos um método construtor onde os atributos serão inicializados.



A partir da classe Product é criada a classe Order, responsável pelo ID e a listagem desses produtos.
Instaciamos um atributo chamado id (String) e uma collection "List<Product> listProducts". É criado um método construtor para inicializarmos os mesmos.



A classe Store será reponsável por gerenciar ambas as classes (Product e Order), listando os pedidos cadastrados e somando o preço deles.
Ela terá dois atributos baseados nas classes Product e Order. Atributos esses: listProducts e listOrders, ambos sendo uma collection List<>.
Feito o construtor dessa classe, os métodos addProduct e addOrder são criados.



- addProduct: responsável por armazenzar os produtos em listProducts.
- addOrder: reponsável por armazenar os id's em listOrders.



O método calcOrder terá como função buscar o id do pedido e, a partir desse id, listar os pedidos somando o preço total de cada um deles. Por fim, retornamos o id juntamente com a soma final desses pedidos.



## Sistema de Gerenciamento de Cursos

A classe Course por sua vez também é responsável por cadastrar cursos.
Seus atriutos são 'name' e 'description' que tratam de sua construção enquanto 'alunos' armazena os membros daquele curso.



Na classe Plataform são encontrados os principais métodos de controle da aplicação. Ele possui apenas um atributo 'courses' para armazenar os cursos.

- addCourse: Adiciona um curso a plataforma.
- addStudent: Adiciona um aluno em um curso que exista dentro da Plataforma.
- listStudent: Lista todos os alunos presentes em um curso específico.
- listCoutses: Lista todos os cursos adicionados a Plataforma.



---
*Desenvolvido por [Dalton Alex](https://github.com/dalton4lex), [Paulo Gabriel](https://github.com/WSgabri3l) e [Ryan Medeiros](https://github.com/Ryanmedeirosp)*
