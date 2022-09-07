import kotlin.math.*
fun main() {
    println("bienvenido a la calculadora")
    println("aqui un ejemplo")

	var numero1 = 2
	var numero2 = 2
  	val variableRaiz = 25.0
	val variablePotencia =6.0
    
    var resultado1 = numero1 + numero2
    println("la suma es:")
	println(resultado1)
    
    var resultado2 = numero1 - numero2
    println("la resta es:")
	println(resultado2)
    
    var resultado3 = numero1 * numero2
	println("la multi es:")
    println(resultado3)
    
    var resultado4 = numero1 / numero2
	println("la divi es:")
    println(resultado4)
    
    val respuestaRaiz =	sqrt(variableRaiz)
    println("la raiz de $variableRaiz es $respuestaRaiz")
    
	val respuestaPotencia = variablePotencia.pow(2)
    println("La potencia de $variablePotencia es $respuestaPotencia")
    
    println("PI=${PI}")
    
    println("E=${E}")
    
}