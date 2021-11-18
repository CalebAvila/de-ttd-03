# Ejercicios Maven

## AreSame
En éste lo primero que hice fue un sort con cada uno de los arreglos que recibe la función, 
después en un ciclo compara que al elevar el elemento del array a al cuadrado sea igual que el del array b
en el momento en el que no son iguales rompe el ciclo y regresa un false.

## ArrayDiff
Para este caso en particular se itera sobre el array b entonces se hace un filter sobre el array a,
los valores que recibe son los que no son iguales a los que que tiene b al comparar dentro del filter.

## FindMissingLetter
Primero se hizo un array con el alfabeto, después se crea un array nuevo con los valores que trae
el array que se recibe como parametro como rango, posteriormente se van comparando los valores
del arreglo nuevo con el arreglo que se recibió y en el momento en el que no coinciden se tiene
la letra que hace falta.

## Persistence
Aquí se utilizó un ciclo while para comprobar que sólo tenga un digito y un contador para saber el
total de veces que se ingreso itero, el número se transforma a string para después dividirloo en un
array por cracteres, después se itera sobre el array multiplicando cada uno de sus valores que
será el nuevo valor del numero.

## Validate PIN
Se utilizó una expresión regular para comprobar que el parametro recibido sólo tenga 4 0 6 digitos
y que sean sólo números.
