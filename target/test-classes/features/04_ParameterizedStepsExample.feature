Feature: Parametreli Step Kullanımı

  Scenario: Cucumber step definition (Cucumber Edition)
    Given İlk sayi 5
    And ikinci sayi 3
    When Bu sayıları + operatörüne sokarsam
    Then sonuç 8 olmalıdır

  Scenario Outline: Cucumber step definition (Cucumber Edition) outline
    Given İlk sayi <sayi1>
    And ikinci sayi <sayi2>
    When Bu sayıları <operator> operatörüne sokarsam
    Then sonuç <sonuc> olmalıdır

    Examples:
      | sayi1 | sayi2 | operator | sonuc |
      | 10    | 15    | +        | 25    |
      | 5     | 2     | -        | 3     |
      | 4     | 7     | *        | 26    |
      | 9     | 2     | /        | 4     |


  Scenario: Cucumber step definition (RegEx Edition)
    Given Ismim "Faruk"
    And Soyismim "Uzgun"
    When Ehliyet aldigimda
    Then Ehliyetimde "Karl Uzgun" yazmalidir
