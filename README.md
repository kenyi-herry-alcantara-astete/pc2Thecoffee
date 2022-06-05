# pc2Thecoffee

Ejecuta el programa de la carpeta "anterior" y presenta los resultados y explica que sucede.

Se observa que nos da como resultado en consola:
'''Console

Lista de pasajeros de vuelos de negocios:

Cesar

Lista de pasajeros de vuelos economicos:

Jessica
'''
Nota: La aplicación a este nivel se construyó sin seguir el metodo TDD. Solo siguiendo pruebas manuales y aun no se ha implementado pruebas actomáticas.  


1. Pregunta 1 (3 puntos) Si ejecutamos las pruebas con cobertura desde IntelliJ IDEA, ¿cuales son los
resultados que se muestran?, ¿Por qué crees que la cobertura del código no es del 100%? .

>No hay covertura de codigo del 100% , por que no pasa todas la pruebas.
>Se muestra error en el test testBusinessFlightRegularPassenger, se configuro un tipo de vuelo no valido. "Businnes". La prueba pasa cuando se cambian por "Negocios". 

'''Java

        @BeforeEach
        void setUp() {
            businessFlight = new Flight("2", "Negocios");
        }

        @Test
        public void testBusinessFlightRegularPassenger() {
            Passenger jessica = new Passenger("Jessica", false);

            assertEquals(false, businessFlight.addPassenger(jessica));
            assertEquals(0, businessFlight.getPassengersList().size());
            assertEquals(false, businessFlight.removePassenger(jessica));
            assertEquals(0, businessFlight.getPassengersList().size());

        }
'''

2. Pregunta 2 (1 punto) ¿ Por qué John tiene la necesidad de refactorizar la aplicación?.

>Por que todas las pruebas deben pasar. Para ello refactorizamos para corregir el error anterior. Par ello debemos hacer que no sea posible la creacion de vuelos, con un tipo que no existe.  

3. Pregunta 3 (3 puntos) La refactorización y los cambios de la API se propagan a las pruebas.
Reescribe el archivo Airport Test de la carpeta Fase 3. 
>Luego de rescribir y agregarle test.
>Hay un cobertura de codigo del 100% (Pasa todas las pruebas).
>La refactorizacion si ayudo a mejorar el codigo. Dado que implementa polimorfismo en lugar de solo condicionales.
