
x = input("Nombre del Alumno:")
y = input("Nombre de la Materia:")
cantidad = int(input("¿Cuántas calificaciones vas a ingresar? "))
suma = 0

for i in range(cantidad):
    calificacion = float(input(f"Ingrese la calificación {i + 1}: "))
    suma += calificacion

promedio = suma / cantidad
print( x )
print( y )
print(f"El promedio es: {promedio:.2f}")


