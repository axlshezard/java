# Caracter
Es un único carácter Unicode de 16 bits. Tiene un valor mínimo de '\u0000' y un valor máximo de '\uffff'.

### Java
```Java
// soló un caracter, los caracteres en java están basados en el sistema
// de caracteres unicode https://unicode-table.com/es/

// unicoe
char caracter = '\u0040'; // @
System.out.println("caracter =  " + caracter);

// en su forma decimal
char decimal = 64;
System.out.println("decimal =  " + decimal);

// como sinbolo
char simbolo = '@';
System.out.println("simbolo =  " + simbolo);

// son iguales
System.out.println("decimal == caracter == simbolo :" + ((decimal == caracter) & simbolo == caracter));

//propiedades de char
System.out.println("****** propiedades de char ******");
System.out.println("Character corresponde en byte a = " + Character.BYTES); System.out.println("Character corresponde en bites a = " + Character.SIZE);
System.out.println("Máximo valor para Character = " + Character.MAX_VALUE);
System.out.println("Minimo valor para Character = " + Character.MIN_VALUE);      

// Caracteres especiales
System.out.println("****** Caracteres especiales ******");
char espacio = ' '; // también se puede concatenar
char espacioUnicode = '\u0020';
System.out.println("Hola"+espacio+"Mundo");
System.out.println("Hola"+espacioUnicode+"Mundo");

System.out.println("****** retroceso ******");
char retroceso = '\b';
System.out.println("Hola *"+retroceso+"Mundo");
System.out.println("Hola *"+retroceso+retroceso+retroceso+"Mundo");

System.out.println("****** tabulador ******");
char tabulador = '\t';
System.out.println("\tHola"+tabulador+"Mundo");

System.out.println("****** saltodeLinea ******");
char saltodeLinea = '\n';
System.out.println("Hola"+saltodeLinea+"Mundo");
        
System.out.println("****** retornoCarro ******");
char retornoCarro = '\r';
System.out.println("Hola Mundo" + retornoCarro + ":)");

```