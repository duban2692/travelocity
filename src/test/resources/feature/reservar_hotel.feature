# language: es

Característica: Reservar hotel por medio del portal travelocity

  Esquema del escenario: Ana desea comprar reservar un hotel por medio del portal travelocity
    Dado ana ingresa al portal web travelocity
    Cuando visualiza el <hotel> procede a realizar el check-in y check-out
    Entonces verifica el hotel que se reservo

    Ejemplos:
      | hotel    |
      | Rionegro |