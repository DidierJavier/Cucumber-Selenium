# language: es
# Tags: optional

Característica: Categoría licor
    Como persona con sed
    quiero calmar la sed
    para que mi cuerpo se sienta bien

  Esquema del escenario: Bebiendo
    Dado que hay <inicio> cervezas
    Cuando me tomo <cantidad> cervezas
    Entonces me deberían quedar <resto> cervezas
    Ejemplos:
      | inicio | cantidad | resto |
      | 10     | 5        | 5     |
      | 10     | 10       | 0     |