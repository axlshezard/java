# Variables
## Locales
Una variable definida dentro de un bloque, método o constructor se denomina variable local.
* Estas varibles se crean cuendo se ingresa al bloque, o se llama la función y se destruye después de salir del bloque o cuando la llamada regresa de la función.
* El alcance de estas variables existe solo dentro del bloque en el que se delcaran las variables, es decir, podemos acceder a estas variables dentro de este bloque. 
* La inicialización de la variable local es obligatoria antes de usarla en el ámbito definido.

## Instancia
Las variables de instancia son variables no estáticas y se declaran en una clase fuera de cualquier método, constructor o bloque.
* Como las variables de instancia se delcaran en una clase, estas variables se crean cuando se crea un objeto de la clase y se destruyen cuando se destruye el objeto.
* A diferencia de las variables locales, podemos usar especificadores de acceso para variables de instancia. Si no especificamos ningún especificador de acceso, se utilizara el especificador de acceso publico.
* La inicialización de una variable de instancia no es obligatoria. Su valor por defecto es 0 o Null.

## Estatica
Las variables estáticas también se conocen como variables de clase.
Estas variables se declaran de manera similar a las variables de instancia. La diferencia es que las variables estáticas se declaran usando la palabra clave static dentro de una clase fuera de cualquier método, constructor o bloque.
* A diferencia de las variables de instancia, solo podemos tener una copia de una variable estática por clase, independientemente de cuántos objetos creemos.
* Las variables estáticas se crean al comienzo de la ejecución del programa y se destruyen automáticament cuando finaliza la ejecución.
* La inicialización de una variable estática no es obligatoria. Su valor por defecto es 0 o Null.
* Si accedemos a una variable estatico como una variables de instancia, el compilador mostrará un mensaje de advertencia, que no dentrendrá el programa. El compilador reemplazara el nombre del objeto on el nombre de la clase automaticamento. 
* Si accedemos a una variable estática sin el nombre de la clase, el compilador agregará automatica mente el nombre de la clase.