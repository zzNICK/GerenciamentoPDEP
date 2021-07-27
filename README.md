## Planejamento e Distribuição de Produto 

Esse projeto é uma tentativa de construir uma aplicação Java capaz de gerenciar pedidos de clientes, definindo o volume da demanda e produção necessária para o atendimento. 

## Tecnologias utilizadas

Java + banco de dados relacional MySql, junto com entidades e repositórios, Hibernate/JPA + APIs com controllers Spring

## Entidades/Classes 

**Cliente**

A entidade Clinte terá os seguintes atributos:  
CNPJ: Sendo ele um id único não incrementado, já que será digitalizado pelo próprio cliente.    
Nome do cliente: Serve para dar nome aos clientes que pretendem fazer seus pedidos.      
Número de prioridade: Serve para mostrar o grau de importância do atendimento ao cliente, se ele é mais crítico ou se ele é mais simples de ser solucionado.

**Pedido**

A entidade Pedido terá os seguintes atributos:    
numPedido: Será utilizado como indentificador e como um id auto-incrementado    
ProdutoX: Esse atributo deve servir como o tipo de produto escolhido pelo cliente.  
ProdutoY: Mesma função do atributo ProdutoX, sendo uma escolha diferente para o cliente escolher.  
Quantidade: O atributo deve mostrar a quantidade pedida.

**Armazen**

A entidade Armazen terá os seguintes atributos:     
FabricaF1: Onde esse atributo deve ser verdadeiro, já que vai indicar que o produto está sendo fabricado conforme as solicitações pelos pedidos.    
ArmazenA1: Mostrar em que armazen foi direcionado o produto.    
ArmazenA2: Mostrar em que armazen foi direcionado o produto.   

**Linha de Produção**

A entidade Linha de Produção terá os seguintes atributos:  
LPX: Primeira Linha de Produção, servindo e direcionando apenas os produtos X.    
LPY: Segunda Linha de Produção, servindo e direcionando apenas os produtos Y.   

**Ordens de Produção**

A entidade Ordens de produção, será o resultado do programa, dando informações como:  
O produto específico escolhido, sua quantidade que deve ser produzida e em que linha de produção.

Exemplo: Produção de 15000 unidades do produtoX na linha LPX.
