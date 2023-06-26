<h1>API Controle de Vendas de Veículos</h1>
<p align="center">
  <img src="https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white" />
  <img src="https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white" />
  <img src="https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white" />
  <img src="https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white" />
</p>
<p>API para controle de vendas de um sistema de loja de carros, desenvolvida para ser consumida por uma aplicação flutter. Existem endpoints para controle de Veículos, Vendedores, Clientes, Marcas, Modelos, Promoções, Vendas e Agendas.</p>
<h2>Dependências</h2>
<ul>
  <li>Java 20+</li>
  <li>Gradle</li>
  <li>PostgreSQL</li>
</ul>
<h2>Uso</h2>
<p>A aplicação depende da existência de um banco de dados PostgreSQL definido no arquivo de properties (nome "flutter" por padrão), o arquivo "database.sql" contém a estrutura esperada para o banco.</p>
<p>Para inicialização local da aplicão o comando <code>gradle bootRun</code> deve ser utilizado na pasta root dela. Chamadas serão recebidas na porta 8080 da máquina local.</p>
