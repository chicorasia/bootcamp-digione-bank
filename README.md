# DigiOneBank by chicorasia :bank::euro::dollar:

Projeto desenvolvido ao longo do módulo **Fundamentos de Orientação a Objetos com Kotlin**, instrutor Jether Rodrigues.

Além dos conteúdos do módulo, o projeto explora conceitos de Clean Architecture e Domain Driven Design, entre outras funcionalidades:

- separação entre classes de modelo e de serviço
- funções de autenticação como um service
- armazenamento de senhas como hash (a senha é usada somente no momento da criação do objeto Gerente ou Cliente e não fica armazenada nesses objetos)
- registro do usuário `Logavel` no serviço de autenticação por meio de método `init` no momento de criação do usuário
- cliente possui um token como classe interna, com funções de atualização e validação
- exceptions personalizadas para falha de autenticação, token inválido e saldo insuficiente em conta
- testes automatizados para as classes do domínio (JUnit4 e Hamcrest)


*****

Digital Innovation One
Everis Kotlin Developer Bootcamp :green_heart:
2021

****

:computer: chicorialabs.com.br/blog