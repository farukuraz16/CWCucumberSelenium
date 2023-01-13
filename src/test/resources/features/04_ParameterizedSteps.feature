Feature: Google Arama Feature

  Background:
    Given Kullanıcı google sayfasındadır


  Scenario: cucumber search
    When kullanıcı "cucumber" arattığında
    Then kullanıcı titleda "cucumber" görmelidir
