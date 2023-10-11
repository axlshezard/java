# Tipos de datos
## Dato

Representación formal de hechos, conceptos o instrucciones adecuada para su comunicación, interpretación y procesamiento por seres humanos o medios atomáticos.
## Tipo de dato
Los tipos de datos hacen referencia a la clase de dato con la que se trabaja, también se puede considerar como el rango de valores que puede tomar una variable durante la ejecución de un programa. Se clasifican en datos simples (primitivos) y compuestos. 

Especificación de un dominio (rango de valores) y de un conjunto valido de operaciones a los que normalmente los traductores (lenguajes de programación) asocian un esquemma de representación interna propia.
### Codificación de los datos en la computadora.
En el interior de la computadora, los datos se representan en binario.  
El sistema binario sólo emplea dos simboles: 0 y 1 
* Un bit nos permite representar 2 simbolos diferentes: 0 y 1
* Dos bits nos permiten codificar 4 simbolos disteintos: 00,01,10 y 11
* Tres bits nos permiten codificar 8 simbolos distintos: 000,001,010,011,100,101,110,111
* En general,con N bits podemos cidificar $2^n$ valores diferentes

## Ejemplos de tipos de datos en java
Los ejemplos los puedes ejecutar en [Programiz](https://www.programiz.com/java-programming/online-compiler/) solo copia el cógdio y colocalo dentro del metodo main():
Ejemplo:
```Java
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        // Aqui coloca tu código
        System.out.println("Hello, World!");
    }
}
```
### Lógico
|Tipo|Memoria|Mínimo|Máximo|
|:-:|:-:|:-:|:-:|
|boolan|1 bit|0|1|
- [Ejemplo en Java](logico.md)
### Caracter
|Tipo|Memoria|Mínimo|Máximo|
|:-:|:-:|:-:|:-:|
|char|2 byte|\u000|\ufff|

|Símbolo| Secuencia de escape|Símbolo|Secuencia de escape|
|:-:|:-:|:-:|:-:|
|\b|Retroceso|\t|Tabulador|
|\n|Salto de línea| \\\\ |Diagonal invertida|
|\r|Retorno de carro| \\\" |Comillas|
- [Ejemplo en Java](caracter.md)
### Númerico
|Tipo|Memoria|Mínimo|Máximo|
|:-:|:-:|:-:|:-:|
|byte|1 byte|-128|127|
|shor|2 byte|-32,768|32,767|
|int|4 byte|-1,247,483,648|1,247,483,647|
|long|8 byte|-9,223,372,036,854,775,808|9,223,372,036,854,775,807|
|float|4 byte|$-1.4e^{-45}$|$3.4028235e^{38}$|
|double|8 byte|$4.9e^{-324}$|$1.7976931348623157e^{308}$|
- [Ejemplo en Java](numerico.md)