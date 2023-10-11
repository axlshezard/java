# Numerico - Enteros
## byte
Es un entero de complemento a dos con signo de 8 bits. Puede ser útil para ahorrar memoria en arreglos grandes , donde el ahorro de memoria realmente importa. También se pueden usar en lugar de intque sus límites ayuden a aclarar su código.
### Java
```Java
// Los byte equivale a 1 byte = 8 bits
byte numeroByte = 127;
System.out.println("numeroByte = " + numeroByte);
// la clase nos muestra a cuantos byte equivale
System.out.println("tipo byte corresponde en byte = " + Byte.BYTES);
System.out.println("tipo byte corresponde en bites = " + Byte.SIZE);
System.out.println("valor máximo de un byte = " + Byte.MAX_VALUE);
System.out.println("valor minimo de un byte = " + Byte.MIN_VALUE);
```
## short
Es un entero de complemento a dos con signo de 16 bits. Al igual que con byte, se aplican las mismas pautas: se puede usar  para ahorrar memoria en arreglos grandes, en situaciones en las que el ahorro de memoria realmente importa.
### Java
```Java
// los short tienen 2 bytes
short numeroShort = 32767;
System.out.println("numeroShort = " + numeroShort);
System.out.println("tipo short corresponde en byte = " + Short.BYTES);
System.out.println("tipo short corresponde en bites = " + Short.SIZE);
System.out.println("valor máximo de un short = " + Short.MAX_VALUE);
System.out.println("valor minimo de un short = " + Short.MIN_VALUE);
```
## int
Es un entero de complemento a dos con signo de 32 bits. En Java SE 8 y versiones posteriores, puede utilizar el inttipo de datos para representar un entero de 32 bits sin signo, que tiene un valor mínimo de 0 y un valor máximo de $2^{32 -1}$. (Uso de la clase Integer)
### Java
```Java
// los enteros tienen 4 bytes
int numeroInt = 2147483647;
System.out.println("numeroInt = " + numeroInt);
System.out.println("tipo int corresponde en byte = " + Integer.BYTES);
System.out.println("tipo int corresponde en bites = " + Integer.SIZE);
System.out.println("valor máximo de un int = " + Integer.MAX_VALUE);
System.out.println("valor minimo de un int = " + Integer.MIN_VALUE);
```
## long
Es un entero de complemento a dos de 64 bits. En Java SE 8 y versiones posteriores, igual que con int se puede representar un entero de 64 bits sin signo (Uso de la clase Long).
### Java
```Java
// el long es se le conoce como un super entero
// Hay que colocar la literal L al final del número
long numeroLong = 9223372036854775807L;
System.out.println("numeroLong = " + numeroLong);
System.out.println("tipo long corresponde en byte = " + Long.BYTES);
System.out.println("tipo long corresponde en bites = " + Long.SIZE);
System.out.println("valor máximo de un long = " + Long.MAX_VALUE);
System.out.println("valor minimo de un long = " + Long.MIN_VALUE);
```
# Numerico - Real
## float
Es un punto flotante 32 bits de precisión simple. Al igual que con las recomendaciones para byte y short, use a float(en lugar de double) si necesita ahorrar memoria en grandes matrices de números de coma flotante. Este tipo de datos nunca debe usarse para valores precisos.
### Java
```Java
// sistema de número flotante simple, trabajo con puntos decimales,número real
// si le colocamos el punto de forma implicita, cambia el tipo de la litera
// para indicar que corresponde a un tipo flotante se coloca una f
// la letra "e" corresponde a exponente 3 recorriedo el punto a la derecha
float realFloat = 1.5e4f;//2.12e3f;//2120f;
System.out.println("realFloat = " + realFloat);
// recorriendo el punto a la izquierda
float realFloat1= 1.5e-4F;//
System.out.println("realFloat1 =  " + realFloat1);
// El valor lo mostrara de manera compacta, el número real ya contiene más
// información osea es mas exacto
/* en un número decimal 1.21 la parte enterea es 1 y 0.21 es la parte decimal */ 
float realFloat2= 0.00000000015f;// 1.5e-10f
System.out.println("realFloat2 =  " + realFloat2);

// La clalse Float
System.out.println("Float corresponde en byte a = " + Float.BYTES);
System.out.println("Float corresponde en bites a = " + Float.SIZE);
System.out.println("Máximo valor para Float = " + Float.MAX_VALUE);
System.out.println("Minimo valor para Float = " + Float.MIN_VALUE);
```
## double
Es un punto flotante de 64 bits de doble precisión. Para valores decimales, este tipo de datos suele ser la opción predeterminada. Como se mencionó anteriormente, este tipo de datos nunca debe usarse para valores precisos.

### Java
```Java
// números de doble precisión
/* no es necesario poner la literal, ya qué con el punto lo toma como 15.0d
    en float si es necesario*/
double realDoble = 3.656135e13;
System.out.println("realDoble =  " + realDoble);
// La clase Double
System.out.println("Double corresponde en byte a = " + Double.BYTES);
System.out.println("Double corresponde en bites a = " + Double.SIZE);
System.out.println("Máximo valor para Double = " + Double.MAX_VALUE);
System.out.println("Minimo valor para Double = " + Double.MIN_VALUE);
```