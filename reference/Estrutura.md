
# Estrutura pasta principal

|   GerenciadorTarefasApplication.java            *Class* *SpringBootApplication* _Main_
|
+---config *Configurações de acesso*
|       SecurityConfiguration.java                *Class* *Configuration* _Routes security_
|
+---controller *Controladores*
|       GerenciadorTarefasController.java         *Class* *RestController*
|       TesteApiController.java                   *Class* *RestController*
|       UsuarioController.java                    *Class* *RestController*
|
+---entity *Entidades*
|       Role.java                                 *Class* *Entity* _Table_
|       Tarefa.java                               *Class* *Entity* _Table_
|       Usuario.java                              *Class* *Entity* _Table_
|       UsuarioAutenticado.java                   *Class* *Entity*
|
+---excecoes *Tratativa de exceções*
|       ErrosEnum.java                            *Enum*
|       ExcecoesHandler.java                      *Class* *ControllerAdvice* _Controlador de erros_
|       NaoPermitirExcluirException.java          *Class* 
|       NaoPermitoAlterarStatusException.java     *Class*
|       TarefaExistenteException.java             *Class*
|
+---filter
|       AutenticacaoFiltro.java                   *Class*
|       LoginFiltro.java                          *Class*
|
+---permissoes
|       PermissaoEnum.java                        *Enum*
|
+---repository *Repositório*
|       GerenciadorTarefasRepository.java         *Interface* *Repository*
|       IRoleRepository.java                      *Interface* *Repository*
|       IUsuarioRepository.java                   *Interface* *Repository*
|
+---request *DTO Requisição*
|       AtualizarTarefaRequest.java               *Class* _DTO Request_
|       CadastrarTarefaRequest.java               *Class* _DTO Request_
|
+---response *DTO Resposta*
|       AtualizarTarefaResponse.java              *Class* _DTO Response_
|       CadastrarTarefaResponse.java              *Class* _DTO Response_
|       ErrorResponse.java                        *Class* _DTO Response_
|       ObterTarefasPaginadaResponse.java         *Class* _DTO Response_
|       ObterTarefasResponse.java                 *Class* _DTO Response_
|
+---service *Service*
|       AutenticacaoService.java                  *Class* _Service_
|       GerenciadorTarefasService.java            *Service* _Service_
|       UsuarioAutenticadoService.java            *Service* _Service_
|       UsuarioService.java                       *Service* _Service_
|
+---status
|       TarefaStatusEnum.java                     *Enum*
|
\---validation
        ValidacaoCamposHandler.java               *ControllerAdvice*

# Adicionais

pom.xml *Arquivo de configuração das dependencias Mavem*
application.properties *Arquivo de customização das configurações do Spring Boot*
import.sql *Arquivo SQL executado na inicialização da aplicação*
messages.properties *Arquivo de mensagens com orientações para validação*

