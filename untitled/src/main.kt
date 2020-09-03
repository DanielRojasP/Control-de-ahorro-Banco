

fun main(args: Array<String>) {
          val c1 = Clientes("207730237","Daniel", "Rojas Porras",
        "50164500", "2-332-232",45000.23)
         val c2 = Clientes("207720237","Oscar", "Rojas Salazar",
        "80464500", "2-332-232",459000.23)

        println(c1.toString())
        c1.ced = "20323232"
        c1.nombre = "Antonio"
        println(c1.toString())
        println(c2.toString())
        println(c2.numCuenta)
        println(c2.saldo)

}
