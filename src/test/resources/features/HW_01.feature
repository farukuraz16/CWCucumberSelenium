Feature: Googleda Kelime Arama
  Scenario: Googleda "Cucumber" kelimesi aranır ve titleda aynı kelimenin olduğu doğrulanır
    Given Kullanıcı google sayfasına gider
    When Kullanıcı Cucumber kelimesini arar
    Then Kullanıcı açılan sayfanın title'ında Cucumber kelimesinin geçtğini doğrular
