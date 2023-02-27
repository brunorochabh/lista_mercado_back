# Sistema Lista de Mercado
## Requisitos
- Ser capaz de gerenciar várias listas de mercado (e marcar seu status como concluída ou não)
- Ser capaz de cadastrar produtos e consulta-los
- Ser capaz de incluir produtos nas listas e especificar suas quantidades, bem como marcar se o item já foi comprado ou não
- Ser capas de atribuir valores aos itens comprados para depois ter uma gestão dos custos da lista
- Ser capaz de adicionar quantidades (kg, unidades, litros, etc)

## Casos de Uso - Produto
### Cadastrar Produtos
Informar o nome de um determinado produto e o sistema o armazenar no banco
### Consultar Produtos
Informar palavras chaves para consultar ou mesmo buscar produtos a partir de uma lista
### Alterar Dados de Produtos
Basicamente alterar o nome do produto e termos sua efetivação no banco de dados
## Casos de Uso - Lista
### Criação de Listas
Criar uma nova lista inserindo a data e o local onde foi feita a compra (nome do supermercado, feira, etc)
### Apagar uma Lista
Remover uma lista que foi criada  por engano e remover todos os seus itens que foram criados
### Inserção de Itens da Lista
Criar um item associando a uma lista e a um produto, bem como deixar disponível a possibilidade de modificar quantidade e preço que foi pago
### Alteração de Itens da Lista
Alterar apenas quantidade, preço pago e status
### Remoção de Itens da Lista
Poder remover um item que foi cadastrado na lista
### Fechamento da lista
Concluir a lista como sendo completa e gerar seu custo total a partir dos itens comprados
