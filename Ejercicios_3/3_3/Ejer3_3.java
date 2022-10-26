public class Ejer3_3 {
    
    // PREGUNTA
    /* Explique los cambios que habría que introducir en el programa del fragmento de código 3.8
       para que pudiera realizar el cifrado César para los mensajes que están escritos
       en un idioma basado en el alfabeto que no sea el inglés, 
       como el griego, el ruso o el hebreo.
     */
    
    // RESPUESTA
    /* Los alfabetos de la mayoría de los idiomas basados en el alfabeto
       están incluidos en el estándar de codificación de caracteres Unicode. */

    /*
       El array alfa y los diversos usos del valor 26
       tendrían que cambiarse al nuevo alfabeto y su tamaño.
       Además, todos los lugares que utilizan el literal A
       para referirse a la primera letra tendrían que cambiarse 
       ahora a la primera letra del nuevo alfabeto.
       En este caso, sería mejor definir un int estático final FIRSTLETTER,
       establecerlo en la primera letra, y utilizarlo en lugar de A.
       Esto supone que los mensajes siguen estando en mayúsculas, por supuesto.
     */
}