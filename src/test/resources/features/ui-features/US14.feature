@US14
Feature: TC01 Manager kendine ait olmayan bir ilan için randevu oluşturabilmeli
  Background:
    Given Belirtilen URL'ye gidilir ve Login olunur
    When Login butonu tiklanir
    When Back to Site butonu tiklanir


Scenario: TC14 Positive scenario
Given Properties butonu tiklanir
When Herhangi bir ilana tiklanir
When Tour Date bolumune her hangi bir tarih girilir
When Tour Time bolumune her hangi bir saat girilir
When Submit a tour request butonuna tiklanir
When TourRequest created successfully yazisi ile bir ilan için randevu oluşturuldugu dogrulanir
And Sayfayi kapatir