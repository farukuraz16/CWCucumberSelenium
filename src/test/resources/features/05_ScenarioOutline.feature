Feature: Google Arama Feature

  #

  Scenario Outline:
    Given Kullanıcı google sayfasındadır
    When kullanıcı "<aranacakKelime>" arattığında
    Then kullanıcı titleda "<dogrulanacakKelime>" görmelidir

    Examples:
    |aranacakKelime|dogrulanacakKelime|
    |samsung       |samsung           |
    |cucumber      |cucumber          |
    |selenium      |selenium          |