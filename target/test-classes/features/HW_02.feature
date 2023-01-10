Feature: Googleda Kelime Arama
  Scenario: Googleda "Selenium" kelimesi aranır ve titleda aynı kelimenin olduğu doğrulanır
    Given Kullanıcı Google'a  gider
    When Kullanıcı Selenium kelimesini arar
    Then Kullanıcı açılan sayfanın title'ında Selenium kelimesinin geçtğini doğrular
