Feature: Amazon Search Page

  Scenario Outline: Kullanici aratacagi kelimeyi sonuclarda gorebilmelidir
    Given Kullanici amazon sitesine gider
    When Kullanici amazonda "<kelime>" aratir
    Then Kullanici arama socunlarinda "<kelime>" gormelidir
    And Kullanici ekran goruntusu alir
    And Kullanici browser i kapatir

    Examples:
      | kelime  |
      | mac     |
      | windows |
      | linux   |