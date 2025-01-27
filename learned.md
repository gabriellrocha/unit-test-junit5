## Assertions
- São métodos usados para verificar se o comportamento esperado de um código é de fato o que ocorre
durante a execução do teste. Comparam o valor real(resultado obtido) com o valor esperado.

Asserção = Afirmação

```
@Test
void testAdd() {
    int expected = 5;
    int resul = 2 + 3;
    
    assertEquals(expected, result);
}
```

### Observações

## Loading Lazy
Ao usar a sobrecarga que recebe um Supplier<String> (como lambda) em vez de uma mensagem fixa, 
o carregamento da mensagem é Lazy. Isso significa que a mensagem só será construida e avaliada
se o teste falhar, economizando recursos com a asserção passe.

## Diferença entre assertThrows e assertThrowsExactly API 5.10+

`assertThrows` - Considera a hierarquia de herança
- Passa no teste se a exceção lançada for do tipo especificado ou uma subclasse desse tipo  

`assertThrowsExactly` - Não considera a hierarquia de herança
- Passa no teste apenas se a exceção lançada for exatamente do tipo específicado


‘Roadmap’
Introdução ao JUnit 5
  O que é JUnit e por que usá-lo ✅
  Configuração do ambiente (Maven) config plugin p/ run tests ✅
  Gerar relatórios em HTML → (após executar mvn test, execute mvn surefire-report:report) ✅
  Diferença entre os artefacts (API, Engine, Params e Aggregator) ✅ 

Anotações Básicas
  @Test - Definir métodos de teste ✅
  @BeforeEach e @AfterEach - Configurações antes e depois de cada teste ✅
  @BeforeAll e @AfterAll - Configurações globais ✅

Asserções
    assertEquals, assertTrue, assertNull, assertThrows, assertAll etc ✅

Testando Cenários
  Testes parametrizados com @ParameterizedTest.
  Uso de fontes: @ValueSource, @CsvSource, @MethodSource

Organização dos Testes
  @DisplayName - Descrever testes de forma clara ✅
  Agrupamento com @Nested.
  Controle de execução com @Tag

Recursos Avançados
  Condições de execução - @EnabledIf, @DisabledIf, @EnabledOnOs, etc. ✅
  Tempo limite - @Timeout

Integração com Outras Ferramentas
  Mocking (com Mockito)

Boas Práticas
  Isolamento dos testes ✅
  Nomeação clara e organizada ✅
  Evitar dependências entre testes 

Exploração Extra
  Extensões do JUnit 5 - Criar e usar @ExtendWith