# HotelManagerSystem_AO
HotelManagerSystem é um sistema de gestão hoteleira desenvolvido em Java, com persistência de dados num SGBD relacional (MySQL) e arquitetura modularizada. O sistema foi concebido como exercício técnico para consolidar competências em programação orientada a objetos, estrutura de dados, design de software e integração com sistemas de gestão de base de dados (SGBD).

Funcionalidades
Registo, atualização e consulta de hóspedes

Criação e gestão de reservas com verificação de disponibilidade em tempo real

Processos automatizados de check-in e check-out

Administração de quartos e categorias (individual, duplo, suite, etc.)

Cálculo dinâmico de tarifas com base na categoria e duração da estadia

Emissão de relatórios diários e mensais (ocupação, receitas, reservas)

Exportação de folhetos informativos digitais (em PDF ou HTML) com dados comerciais atualizados

Persistência de dados no SGBD MySQL, com acesso via JDBC

Tecnologias
Linguagem: Java 17+

IDE: NetBeans

Base de Dados: MySQL (com JDBC para ligação)

Paradigma: Programação Orientada a Objetos (POO)

Interface atual: Consola (CLI)

Interface futura: JavaFX ou Swing

Arquitetura modular:

model: entidades do domínio (Hóspede, Quarto, Reserva, etc.)

dao: camada de acesso a dados (queries SQL, ligação ao SGBD)

service: lógica de negócio (validações, regras de reserva, tarifário)

util: utilitários diversos (formatação, datas, autenticação)

app: interface com o utilizador e ponto de entrada do programa

Objetivos técnicos
Aplicar boas práticas de engenharia de software (coerência, encapsulamento, baixo acoplamento)

Implementar separação clara de responsabilidades (modelo-serviço-dados-apresentação)

Utilizar MySQL como mecanismo de persistência de dados com integridade relacional

Simular um sistema real de gestão hoteleira com operações completas e seguras

Garantir extensibilidade para futuras integrações (API REST, interface gráfica, relatórios financeiros)

Melhorias previstas
Interface gráfica com JavaFX

Módulo de autenticação com perfis (admin, receção, manutenção)

Geração de relatórios e gráficos analíticos

Exportação automática de relatórios e folhetos informativos em PDF (bibliotecas como iText)

API RESTful para acesso remoto aos dados

Testes unitários com JUnit

Licença
Projeto com fins educativos. Utilização livre para fins de estudo e aperfeiçoamento técnico.

Autora: Ana Sobrinho (ajacs)
#HotelManagerSystem
