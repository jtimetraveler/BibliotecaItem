package company.bosqueoeste.bibliotecadeitemdd.data

/**
 * Created by juancho on 30/01/18.
 */
enum class Rareness(val description : String, val weight :  Float){
    ABUNDANT("Premio consuelo", 1f),
    ORDINARY("Algo que podes encontrar con facilidad (1:5)", 0.25f),
    UNCOMMON("Fuera de lo común (1:10). Ejemplo: una moneda en la calle", 0.1f),
    RARE("Extraño (1:20). Ejemplo: Un billete de 500 en la calle", 0.05f),
    LEGENDARY("Que hace esto acá? (1:100)",0.01f),
    EXOTIC("Nunca vi algo así en mi vida (1:1000)",0.001f)
}