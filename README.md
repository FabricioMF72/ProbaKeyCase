# ProbaKeyCase
 algoritmo probabilista que logre la menor cantidad de tanteos para encontrar el secret key

Descripción del programa:

El programa se encarga de encontrar en la menor cantidad de intentos posible parte de una llave utilizada para desencriptar un mensaje secreto utilizando algoritmo probabilista.
Este algoritmo se basa en el aprendizaje, ya que conforme se ejecuta, se da cuenta de cuales son los peores casos, los elimina y aumenta la probabilidad de encontrar la solución.
El algoritmo funciona obteniendo dos muestras de un conjunto conformado por todas las posibles combinaciones de elementos que se desencriptan el cifrado.
En el caso de no encontrar la solución correcta, el algoritmo mejorará mediante la eliminacion de elementos comunes entre las muestras, repitiendo el ciclo hasta encontrar la solución.
