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

---

## Roadmap

Introdução ao JUnit 5 <br>
 - O que é JUnit e por que usá-lo ✅ <br>
 - Configuração do ambiente (Maven) config plugin p/ run tests ✅ <br>
 - Gerar relatórios em HTML → (após executar mvn test, execute mvn surefire-report:report) ✅ <br>
 - Diferença entre os artefacts (API, Engine, Params e Aggregator) ✅ <br>

Anotações Básicas <br>
 - @Test - Definir métodos de teste ✅ <br>
 - @BeforeEach e @AfterEach - Configurações antes e depois de cada teste ✅ <br>
 - @BeforeAll e @AfterAll - Configurações globais ✅ <br>

Asserções <br>
 - assertEquals, assertTrue, assertNull, assertThrows, assertAll etc ✅ <br>

Testando Cenários <br>
 - Testes parametrizados com @ParameterizedTest. <br>
 - Uso de fontes: @ValueSource, @CsvSource, @MethodSource <br>

Organização dos Testes <br>
 - @DisplayName - Descrever testes de forma clara ✅<br>
 - Agrupamento com @Nested <br>
 - Controle de execução com @Tag <br>

Recursos Avançados <br>
 - Condições de execução - @EnabledIf, @DisabledIf, @EnabledOnOs, etc. ✅ <br>
 - Tempo limite - @Timeout <br>

Integração com Outras Ferramentas <br>
 - Mocking (com Mockito) <br>

Boas Práticas <br>
 - Isolamento dos testes ✅ <br>
 - Nomeação clara e organizada ✅ <br>
 - Evitar dependências entre testes <br>

Exploração Extra
 - Extensões do JUnit 5 - Criar e usar @ExtendWith <br>