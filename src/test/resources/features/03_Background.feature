Feature: Google Arama Testi

Background: Kullanıcı her senaryoda google sitesinde olacaktır
  Given Kullanıcı google sayfasındadır

  Scenario: Kullanıcı samsung aradığında samsung görmelidir
    When Kullanıcı samsung kelimesini arar
    Then Kullanıcı samsung kelimesinin geçtğini doğrular

  Scenario: Kullanıcı cucumber aradığında samsung görmelidir
    When Kullanıcı cucumber kelimesini arar
    Then Kullanıcı cucumber kelimesinin geçtğini doğrular

  Scenario: Kullanıcı selenium aradığında samsung görmelidir
    When Kullanıcı selenium kelimesini arar
    Then Kullanıcı selenium kelimesinin geçtğini doğrular

