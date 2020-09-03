

class Clientes constructor(ced: String, nombre: String, apellidos: String, tel: String, numCuenta: String, saldo:Double){

    var ced: String =   ced
    //   get()   = field
    //  set(value){field = value}
    var nombre: String = nombre
        get()   = field
        set(value){field = value}

    var apellidos: String = apellidos
        get()   = field
        set(value){field = value}

    var tel: String = tel
        get()   = field
        set(value){field = value}

    var numCuenta: String = numCuenta
        get()   = field
        set(value){field = value}
    var saldo: Double = saldo
        get()   = field
        set(value){field = value}



    /* constructor(ced: String, nombre: String, apellidos: String, tel: String, numCuenta: String, saldo: Double) {
         this.ced = ced
         this.nombre = nombre
         this.apellidos = apellidos
         this.tel = tel
         this.numCuenta = numCuenta
         this.saldo = saldo
     }*/


    override fun toString(): String {
        return "Clientes(ced='$ced', nombre='$nombre', apellidos='$apellidos', tel='$tel', numCuenta='$numCuenta', saldo=$saldo)"
    }

}