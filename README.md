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
