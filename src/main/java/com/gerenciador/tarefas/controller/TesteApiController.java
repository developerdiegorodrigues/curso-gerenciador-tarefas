package com.gerenciador.tarefas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // Torna a classe um controlador REST
public class TesteApiController {

  @GetMapping("/teste-api")
  public String teste() {
    return "Executado com sucesso!";
  }

  @GetMapping("/teste-api-bem-vindo")
  public String testeBemVindo(@RequestParam(name = "nome") String nome) {
    return "Bem vindo " + nome;
  }
}
