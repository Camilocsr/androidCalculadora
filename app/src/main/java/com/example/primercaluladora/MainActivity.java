package com.example.primercaluladora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Variables para los elementos de la interfaz de usuario
    private EditText editTextNumber;
    private TextView textViewResult;

    // Variables para almacenar los números y operador
    private double number1 = 0;
    private double number2 = 0;
    private String operator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtener referencias a los elementos de la interfaz de usuario
        editTextNumber = findViewById(R.id.editTextNumber);
        textViewResult = findViewById(R.id.textViewResult);

        Button button0 = findViewById(R.id.button0);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button buttonDot = findViewById(R.id.buttonDot);
        Button buttonAdd = findViewById(R.id.buttonAdd);
        Button buttonSubtract = findViewById(R.id.buttonSubtract);
        Button buttonMultiply = findViewById(R.id.buttonMultiply);
        Button buttonDivide = findViewById(R.id.buttonDivide);
        Button buttonEquals = findViewById(R.id.buttonEquals);
        Button buttonClear = findViewById(R.id.buttonClear);
        Button buttonBackspace = findViewById(R.id.buttonBackspace);

        // Configurar el evento onClick para cada botón numérico
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumber.append("0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumber.append("1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumber.append("2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumber.append("3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumber.append("4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumber.append("5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumber.append("6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumber.append("7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumber.append("8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumber.append("9");
            }
        });

        // Configurar el evento onClick para el botón decimal (punto)
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = editTextNumber.getText().toString();
                // Agregar un punto decimal solo si no existe ya en el número actual
                if (!currentText.contains(".")) {
                    editTextNumber.append(".");
                }
            }
        });

        // Configurar el evento onClick para el botón de suma
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "+";
                number1 = Double.parseDouble(editTextNumber.getText().toString());
                editTextNumber.setText("");
            }
        });

        // Configurar el evento onClick para el botón de resta.
        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "-";
                number1 = Double.parseDouble(editTextNumber.getText().toString());
                editTextNumber.setText("");
            }
        });
        // Configurar el evento onClick para el botón de multiplicar.
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "*";
                number1 = Double.parseDouble(editTextNumber.getText().toString());
                editTextNumber.setText("");
            }
        });

        // Configurar el evento onClick para el botón de dividir
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operator = "/";
                number1 = Double.parseDouble(editTextNumber.getText().toString());
                editTextNumber.setText("");
            }
        });

        // Configurar el evento onClick para el botón de igual
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener el segundo número ingresado
                number2 = Double.parseDouble(editTextNumber.getText().toString());
                double result = 0;

                // Realizar la operación según el operador seleccionado
                switch (operator) {
                    case "+":
                        result = number1 + number2;
                        break;
                    case "-":
                        result = number1 - number2;
                        break;
                    case "*":
                        result = number1 * number2;
                        break;
                    case "/":
                        result = number1 / number2;
                        break;
                }

                // Mostrar el resultado en el TextView correspondiente
                textViewResult.setText("Resultado: " + result);

                // Limpiar el EditText y restablecer las variables
                editTextNumber.setText("");
                number1 = 0;
                number2 = 0;
                operator = "";
            }
        });

        // Configurar el evento onClick para el botón de limpiar (borrar)
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Limpiar el EditText y el TextView de resultado, y restablecer las variables
                editTextNumber.setText("");
                textViewResult.setText("Resultado:");
                number1 = 0;
                number2 = 0;
                operator = "";
            }
        });

        // Configurar el evento onClick para el botón de retroceso (eliminar un dígito)
        buttonBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = editTextNumber.getText().toString();
                if (currentText.length() > 0) {
                    editTextNumber.setText(currentText.substring(0, currentText.length() - 1));
                }
            }
        });
    }
}