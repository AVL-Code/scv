# SCV (Sistema de Confirmação de Viagens)

[![CI](https://github.com/AVL-Code/scv/actions/workflows/ci.yml/badge.svg)](https://github.com/AVL-Code/scv/actions/workflows/ci.yml)


## Objetivo do App
O SCV é um aplicativo Android desenvolvido para motoristas de transporte escolar, fretamento e pequenas empresas de transporte. O objetivo principal é **automatizar o envio diário de mensagens e enquetes de confirmação de presença em grupos do WhatsApp**. 

Atualmente, esse processo é manual e repetitivo. O SCV resolve isso permitindo que o usuário cadastre seus grupos, crie modelos de mensagens e dispare as confirmações automaticamente para múltiplos grupos de uma só vez. A automação ocorre de forma totalmente local no dispositivo do motorista (sem depender de servidores externos ou APIs oficiais do WhatsApp), utilizando os recursos de **AccessibilityService** do Android. O app é projetado para operar com o WhatsApp Messenger padrão (pessoal).

## Funcionalidades Principais
* **Gerenciamento de Grupos:** Cadastro, edição e exclusão de grupos de passageiros.
* **Modelos de Mensagem:** Criação de templates de mensagens/enquetes reutilizáveis.
* **Disparo Automatizado:** Seleção de múltiplos grupos e envio automático em sequência usando a interface de acessibilidade do Android.
* **Tratamento de Falhas:** Interrupção manual do envio, detecção de falhas de envio e opção de retentativa para grupos que falharam.
* **Histórico:** Registro completo de todos os envios realizados (data, hora, grupos e status).
* **Autenticação:** Acesso controlado via token de uso único (vinculado ao dispositivo).

## Visão Geral da Arquitetura e Tecnologias
O projeto é construído em **Kotlin** e utiliza **Jetpack Compose** para a interface de usuário (Frontend). 
A arquitetura segue uma separação simples em camadas, focada em organização e manutenibilidade:
- **`data`**: Armazenamento seguro de token, banco de dados local (Room) para grupos, modelos e histórico, além dos repositórios.
- **`domain`**: Regras de negócio, casos de uso para controle de fila de envios e validações de cadastro.
- **`ui`**: Telas desenvolvidas em Jetpack Compose e ViewModels para gerenciar o estado da interface.
- **`service`**: Implementação crítica do `AccessibilityService` que orquestra a automação na interface do WhatsApp.

## Como abrir o projeto no Android Studio
1. Abra o Android Studio.
2. Selecione **"Open an existing Android Studio project"** (ou **File > Open**).
3. Navegue até o diretório onde este repositório foi clonado e selecione a pasta raiz (`scv`).
4. Aguarde o Gradle sincronizar todas as dependências do projeto.

## Como rodar
1. Conecte um dispositivo Android físico via USB (com Depuração USB ativada) ou inicie um Emulador pelo AVD Manager. *(Recomendamos usar um dispositivo real com o WhatsApp instalado para testar a automação)*.
2. Clique no botão **Run 'app'** (ícone de play verde) na barra de ferramentas superior do Android Studio.
3. Nas configurações do Android, conceda as permissões de Acessibilidade para o aplicativo SCV quando solicitado, para que a automação possa interagir com o WhatsApp.