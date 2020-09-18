<h1> Micro-serviço para geração de pedidos. </h1>
API E-commerce

<h1>Ferramentas de apoio</h1>
<ul>
  <li>Postman</li>
  <li>IntelliJ IDEA - Community</li>
  <li>JDK 1.8 ou superior</li>
  <li>Git</li>
  <li>Maven</li>
</ul>

<h3>Dependências do projeto</h3>
<ul>
  <li>Spring-Boot</li>
  <li>spring-cloud</li>
  <li>JPA</li>
</ul>

<h3>Banco de dados</h3>
<ul>
  <li>Postgresql</li>
</ul>

<h1>Request:</h1>
<ul>
<li>Long cliente</li>
<li>List<ProdutoDto> produtoList</li>
<li>FormaPagamento formaPagamento</li>
<li>Entrega entrega</li>
</ul>

<h1>Pré Requisito</h1>
<ul>
  <li>Para emissão do pedido é necessário que o cliente esteja com status 'ativo'.</li> 
  <li>Necessário que tenha a quantidade de produtos em estoque (validação do estoque via Feign para o micro-serviço de produtos).</li> 
</ul>

<h3>Observação</h3>
<ul>
  <li>Micro-serviço para geração dos pedidos da loja E-commerce</li>
   <li>Após a emissão do pedido, é enviado um email para o cliente com os dados da compra (NFe 'ainda não implementado').</li>
   <li>Caso os produtos escolhidos na emissão da nota cheguem em uma quantidade X, automaticamente é enviado uma notificação para o fornecedor(via Feign para o micro-serviço de fornecedores) avisando que precisamos de talz produto e para o fornecedor entrar em contato com a empresa.</li>
</ul>  

<h3>Conclusão</h3>
<ul>
  <li>N/A</li>
</ul> 

