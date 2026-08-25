# Guia de Contribuição

Obrigado por contribuir com o nosso projeto! Para manter o repositório organizado, siga as convenções abaixo para padronização de código, commits e criação de branches.

## Padrão de Código e Idioma
- **Código fonte:** Todo o código (nomes de variáveis, funções, propriedades, etc) deve ser escrito em **inglês** e utilizando **camelCase** (exceções aplicam-se a classes e construtores que usam PascalCase conforme convenção do Kotlin).
- **Comentários:** Todos os comentários explicativos inseridos no código devem ser escritos em **português**.

## Convenção de Commits

Utilizamos um padrão de commits semânticos incluindo o ID da tarefa. A mensagem do commit **não deve conter acentos** e deve ser toda em **minúsculo**.

**Formato:**
`<type>(<task-id>): <description>`

**Tipos permitidos:**
- `feat`: Adição de nova funcionalidade
- `fix`: Correção de bug
- `refactor`: Refatoração de código
- `docs`: Atualização ou adição de documentação
- `chore`: Tarefas de build, configuração, dependências, etc.

**Exemplo de Commit:**
`feat(SCV-10): implementa crud de grupos`

## Nomenclatura de Branches

O nome da branch deve identificar facilmente de qual tarefa do Jira ela se originou.

**Formato:**
`<TASK-ID>-<TAG>-<description>`

**Exemplo de Branch:**
`SCV-10-B-CRUD-Grupo`

## Processo de Pull Request
1. Crie sua branch a partir da `main` seguindo a nomenclatura exigida.
2. Faça seus commits seguindo as convenções de tipo e sem acentuação.
3. Abra o Pull Request preenchendo o template que aparecerá automaticamente.
4. Aguarde a revisão de código. O merge para a `main` só ocorre após a aprovação.
