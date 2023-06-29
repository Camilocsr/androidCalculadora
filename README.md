# Calculadora básica

Esta es una calculadora básica para dispositivos Android que realiza operaciones de suma, resta, multiplicación y división. Permite al usuario ingresar números y realizar cálculos simples.

### Esta calculadora es realizada por camilo solano rodiguez.
##### Instagram: camilosolanoro
##### Facebook: camilo solano rodriguez
##### Whatsapp: 3136 368 783

## Funcionalidades

La calculadora tiene las siguientes funcionalidades:

- Operaciones básicas: Suma, resta, multiplicación y división.
- Ingreso de números: Los usuarios pueden ingresar números utilizando los botones numéricos.
- Decimal: Se puede ingresar números decimales utilizando el botón de punto (.)
- Cálculo preciso: La calculadora realiza cálculos precisos y muestra el resultado correctamente redondeado.
- Borrar y retroceso: Los usuarios pueden borrar los números ingresados y retroceder para eliminar un dígito a la vez.
- Interfaz de usuario intuitiva: La interfaz es fácil de usar y muestra claramente los números ingresados y el resultado.

## Implementación

La calculadora se implementó utilizando los siguientes archivos:

- **activity_main.xml**: Este archivo define la interfaz de usuario de la calculadora utilizando componentes como EditText, TextView y botones. Los elementos están dispuestos en columnas y diseñados de manera estética para una mejor experiencia visual.

- **MainActivity.java**: Este archivo contiene la lógica de la calculadora. Utiliza los componentes de la interfaz de usuario para obtener los números ingresados y realizar las operaciones matemáticas correspondientes. Los eventos onClick de los botones se utilizan para capturar las acciones del usuario y ejecutar las operaciones apropiadas.

El código en `MainActivity.java` se divide en varias secciones:

### Variables

Se declaran variables para los elementos de la interfaz de usuario, como EditText y TextView, así como variables para almacenar los números y el operador.

### OnCreate()

El método onCreate() se llama cuando se crea la actividad. Aquí se configuran los eventos onClick de los botones y se obtienen las referencias a los elementos de la interfaz de usuario.

### Eventos onClick de los botones

Cada botón numérico tiene un evento onClick asociado que agrega el número correspondiente al EditText. Los botones de operaciones y otros botones tienen eventos onClick que realizan acciones específicas, como almacenar el operador seleccionado o borrar el último dígito.

### Evento onClick del botón de igual

El botón de igual realiza la operación matemática correspondiente utilizando los números ingresados y el operador almacenado. El resultado se muestra en el TextView correspondiente.

### Otros eventos onClick

Los botones de borrar y limpiar tienen eventos onClick asociados que eliminan números ingresados o restablecen la calculadora, respectivamente.

## Requisitos

- Dispositivo Android con una versión compatible.
- Entorno de desarrollo Android (por ejemplo, Android Studio) para compilar y ejecutar la aplicación.

## Ejecución

1. Clona o descarga este repositorio en tu máquina local.
2. Abre el proyecto en tu entorno de desarrollo Android.
3. Compila y ejecuta la aplicación en un dispositivo Android o en un emulador.
4. Interactúa con la calculadora ingresando números y realizando operaciones.

## Mejoras futuras

Esta calculadora básica se puede mejorar y ampliar de varias formas:

- Agregar soporte para más operaciones matemáticas avanzadas, como potencia, raíz cuadrada, trigonometría, etc.
- Mejorar la interfaz de usuario con temas personalizados, animaciones y efectos visuales.
- Implementar la persistencia de datos para mantener un historial de cálculos realizados.
- Añadir opciones de personalización, como la elección de colores de fondo o fuentes de texto.

Siéntete libre de contribuir a este proyecto y agregar tus propias mejoras.

¡Disfruta usando la calculadora!