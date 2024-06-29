class Producto{
    static contadorProductos = 0
    constructor(nombre, precio){
        this._idProducto = ++Producto.contadorProductos
        this._nombre = nombre
        this._precio = precio
    }

    get idProducto(){
        return this._idProducto
    }

    get nombre(){
        return this._nombre
    }

    set nombre(nombre){
        return this._nombre
    }

    get precio(){
        return this._precio
    }

    set precio(precio){
        return this._precio
    }

    toString(){ //template literals: nos permite insertar codigo dinamicamente
        return `idProducto : ${this.idProducto}, nombre: ${this._nombre}, precio: $${this._precio}`
    }
//fin de la clase Producto
}

class Orden{
    static contadorOrdenes = 0
    static getMAX_PRODUCTOS(){
        return 5
    }

    constructor(){
        this._idOrden = ++Orden.contadorOrdenes
        this._productos = []
        this._contadorProductosAgregados
    }

    get idOrden(){
        return this._idOrden
    }

    agregarProducto(producto){
        if(this._productos.length < Orden.getMAX_PRODUCTOS()){
            this._productos.push(producto) //tenemos 2 tipos de sintaxis: 1
            //this._productos[this._contadorProductosAgregados++] = producto //segunda sintaxis
        }
        else{
            console.log('no se pueden agega mas productos')
        }
    }//fin del metodo agregarProductos

    calcularTotal(){
        let totalVenta = 0
        for(let producto of this._productos){
            totalVenta += producto.precio
        }//fin ciclo for
        return totalVenta
    }//fin del metodo calcularTotal

    mostrarOrden(){
        let productoOrden = ' '
        for(let producto of this._productos){
            productoOrden += '\n{ '+producto.toString()+' }'
        }//fin del ciclo for
        console.log(`Orden: ${this._idOrden}, total: $${this.calcularTotal()}, productos: ${productoOrden}`)
    } //fin metodo modtrarOrden

// fin de la clase Orden
}

let producto1 = new Producto('pantalon', 200)
let producto2 = new Producto('camisa', 150)
let producto3 = new Producto('cinturon', 50)
let orden1 = new Orden()
let orden2 = new Orden()
orden1.agregarProducto(producto1)
orden1.agregarProducto(producto2)
orden1.agregarProducto(producto3)
orden2.agregarProducto(producto1)
orden2.agregarProducto(producto2)
orden2.agregarProducto(producto3)
orden1.mostrarOrden()
orden2.mostrarOrden()

