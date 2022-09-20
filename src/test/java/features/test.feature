# language: es
# Tags: optional

Característica: Categoria comics
  Como usuario
  quiero leer chistes de testers
  para reirme y pasar un buen rato

  @probando
  Escenario: Ingresar a la categoría comics desde la pantalla home
    Dado que el usuario se encuentra en el home de imalittletsrs
    Cuando hace click sobre el boton de little tester comics
    Entonces se debe redirigir a la pantalla comics

  @browser
  Escenario: Ingresar a la categoría comics desde la pantalla home
    Dado que el usuario se encuentra en el home de imalittletsrs
    Cuando hace click sobre el boton de little tester comics
    Entonces se debe redirigir a la pantalla comics