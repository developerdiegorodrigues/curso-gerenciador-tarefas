
# Estrutura dos arquivos

|   pom.xml *Arquivo de configuração das dependencias Mavem*
|
\---src
    \---main
        +---java
        |   \---com
        |       \---gerenciador
        |           \---tarefas
        |               |   GerenciadorTarefasApplication.java *Arquivo starter da aplicação*
        |               |
        |               +---controller *Controladores - Rotas*
        |               |       GerenciadorTarefasController.java | Controlador para as rotas de gerencimanto de tarefas
        |               |       TesteApiController.java | Controlador para as rotas de teste
        |               |       UsuarioController.java | Controlador para as rotas de usuário
        |               |
        |               +---service *Serviços*
        |               |       GerenciadorTarefasService.java | Serviço de gerenciamento de tarefas
        |               |       UsuarioAutenticadoService.java | AUTH - Serviço para autenticação do usuário
        |               |       AutenticacaoService.java | AUTH - Serviço de autenticação
        |               |       UsuarioService.java | Serviço pra controlador do usuário
        |               |
        |               +---repository *JPA Repository - Interfaces*
        |               |       GerenciadorTarefasRepository.java | Interface do gerenciamento de tarefas
        |               |       IRoleRepository.java | Interface das regras
        |               |       IUsuarioRepository.java | Interface dos usuários
        |               |
        |               +---entity *Entidades*
        |               |       Role.java | Armazena informações relativas as permissões (Banco de dados)
        |               |       Tarefa.java | Armazena dados relativos as tarefas (Banco de dados)
        |               |       Usuario.java | Armazena dados dos usuários (Banco de dados)
        |               |       UsuarioAutenticado.java | Usuário e senha
        |               |
        |               +---request *DTO - Request*
        |               |       AtualizarTarefaRequest.java
        |               |       CadastrarTarefaRequest.java
        |               |
        |               +---response *DTO - Response*
        |               |       AtualizarTarefaResponse.java
        |               |       CadastrarTarefaResponse.java
        |               |       ErrorResponse.java
        |               |       ObterTarefasPaginadaResponse.java
        |               |       ObterTarefasResponse.java
        |               |
        |               +---config
        |               |       SecurityConfiguration.java | AUTH - Configuração de segurança de acesso as rotas
        |               |
        |               +---filter
        |               |       AutenticacaoFiltro.java | AUTH - Filtro para a autenticação
        |               |       LoginFiltro.java | AUTH - Filtro para o login
        |               |
        |               +---permissoes
        |               |       PermissaoEnum.java | AUTH - Enum - Enumerações de acesso
        |               |
        |               +---status
        |               |       TarefaStatusEnum.java | Enum - Enumerações das tarefas
        |               |
        |               +---excecoes
        |               |       ErrosEnum.java | Enum - Enumerações de erros
        |               |       ExcecoesHandler.java | Manipulador de exceções
        |               |       NaoPermitidoAlterarStatusException.java | Exceção específica
        |               |       NaoPermitirExcluirException.java | Exceção específica
        |               |       TarefaExistenteException.java | Exceção específica
        |               |
        |               \---validation
        |                       ValidacaoCamposHandler.java | Validação de campos
        |
        \---resources
                application.properties *Arquivo de customização das configurações do Spring Boot*
                import.sql *Arquivo SQL executado na inicialização da aplicação*
                messages.properties *Arquivo de mensagens com orientações para validação*

# Anotações gerais

Amazon SNS - Serviço de notificação da Amazon
Verbos HTTP - Get, Post, Put, Delete
Prefixos códigos HTTP
  1xx Informativo
  2xx Confirmação
  3xx Redirecionamento
  4xx Erro do cliente
  5xx Erro do servidor
HTTP Status Codes comuns
  200 Ok
  201 Created
  301 Moved Permanently
  400 Bad Request
  401 Unauthorized
  403 Forbidden
  404 Not Found
  408 TimeOut Error
  500 Internal Server Error
  503 Service Unavailable
