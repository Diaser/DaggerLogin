# Configurando Dagger

## ApplicationModule
Dagger la traquea para llevar un control de todas las dependencias del código, esto se hace con @Module


provides se usa cuando se plantea retornar algo
Singleton, se creará una sola instancia de la clase


Componentes para ir inyectando la dependencias, lo que inyectamos se llama componente
Esta componente servira para asignar referencia en actividades, servicios fragmentos y más


*puede haber un modulo para cada funcionalidad*

## Interface AplicationComponent
referencias entre actividades y fragmentos y dependerá de ApplicationModule
En este caso inyecamos MainActivity

crearemos otro objeto aplicación donde viva Dagger en el ciclo de vida de nuestra Aplicación

## App
Aquí haremos la lógica de la clase, extenderemos a la clase Application 
declaramos Application aquella que le dimos a ApplicationModule y la nombramos component
definimos nuestro onCreate
y exponemos componente
Así mismo iniciamos el componente con Dagger y le creamos un ApplicationModule, recordando que recibe una Application.


## Configuración de manifest
Agregamos android:name=".App" en el manifest para saber que tiene que pasar antes a ese fichero de configuración


## Configuración de MainActivity
En el MainActivity después del serContentView casteamos a App nuestra actividad
ya casteada obtenemos el component y le inyectamos la actividad.


