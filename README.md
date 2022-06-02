# pc2Thecoffee

1. Pregunta 1 (3 puntos) Si ejecutamos las pruebas con cobertura desde IntelliJ IDEA, ¿cuales son los
resultados que se muestran?, ¿Por qué crees que la cobertura del código no es del 100%? .

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

4. 
