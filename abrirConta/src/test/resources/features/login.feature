@abrirConta
Feature: Realizar automação no browser do formulário Abra Sua Conta no site do Original 
(www.original.com.br – Seção Abrir Nova Conta, opção “Para Você”) para testar as validações de campos 
e tirar o print de evidência

  Scenario: Abrir Conta 
      Given que abra o site do Banco Original
      When selecionar Abrir Nova Conta
      And selecionar Para Você
      Then preencher Campos


