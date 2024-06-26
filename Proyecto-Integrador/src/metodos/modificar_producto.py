from database.conexion import conectar_db

# Método general para modificar un producto
def modificar_producto():
    conexion = conectar_db()
    cursor = conexion.cursor()
    print("Modificar Producto".center(30, "="))
    id = input('Ingrese el ID del producto: ')
    campos_a_modificar = obtener_datos_a_modificar()
    actualizar_producto(cursor, conexion, id, campos_a_modificar)

# Método para que el usuario seleccione lo quiere modificar (nombre, cantidad, etc)
def obtener_datos_a_modificar():
    # Se crea el diccionario "campos" para las opciones
    campos = {
        '1': 'nombre',
        '2': 'cantidad',
        '3': 'precio_compra',
        '4': 'precio_venta'
    }
    
    print("Campos disponibles para modificar:")
    print("1. Nombre")
    print("2. Cantidad")
    print("3. Precio de Compra")
    print("4. Precio de Venta")
    print("5. Salir/Cancelar")
    
    # Se crea la lista vacia "campos a modificar"
    campos_a_modificar = []
    while True:
        opcion = input("Ingrese el número del campo que desea modificar (o '5' para finalizar): ")
        if opcion == '5':
            break
        if opcion in campos: # Si la opción esta dentro del diccionario
            nuevo_valor = input(f"Ingrese el nuevo valor para {campos[opcion]}: ")
            campos_a_modificar.append((campos[opcion], nuevo_valor)) # Con el método append se le agrega a la lista la opcion elegida y el nuevo valor dado por el usuario
        else:
            print("Opción inválida. Intente nuevamente.")

    return campos_a_modificar

# Método para mostrar los datos actualizados
def actualizar_producto(cursor, conexion, id, campos_a_modificar):
    if not campos_a_modificar:
        print("No se han seleccionado campos para modificar.")
        return

    sentencia = ', '.join([f"{campo} = %s" for campo, _ in campos_a_modificar])
    sql = f"UPDATE productos SET {sentencia} WHERE id = %s"
    valores = [valor for _, valor in campos_a_modificar] + [id]
    
    try:
        cursor.execute(sql, valores)
        conexion.commit()
        actualizacion = cursor.rowcount
        print(f'Productos actualizados: {actualizacion}')
    except Exception as e:
        print(f"Error al actualizar el producto: {e}")