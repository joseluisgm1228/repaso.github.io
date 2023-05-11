
# Ejercicio Salarios:
### En su trabajo como desarrollador, lo han elegido para el crear de un programa que necesita un director de recursos humanos de una agencia de viajes, que desea calcular el promedio de salarios de 3 empleados. 
*Se requiere digitar la identificación, cargo y el valor del salario*
## Aclaraciones:
- La aplicación solo requiera calcular el promedio de salarios 
- No se requiere almacenar datos
- No requiere ningun tipo de controles

# Historia de Usuario
![imagen](https://github.com/joseluisgm1228/repaso.github.io/assets/132966812/662c1a5f-36d1-4f22-ac35-ecba7e73cb09)

# Caso de uso
![imagen](https://github.com/joseluisgm1228/repaso.github.io/assets/132966812/83f3ecfd-1e9a-4770-a168-198900403b5c)

# Diagrama de Flujo
![image](https://github.com/joseluisgm1228/repaso.github.io/assets/132966812/d9775464-d680-4281-914e-ee9b0b2901e5)

# SeudoCódigo

    Algoritmo Salarios
	  Escribir "Digite cantidad de empleados"
	  Leer CantidadEmpl
	  acum<-0
    
    Para i<-1 Hasta CantidadEmpl Hacer
        Escribir "Ingrese el Identificación ",i,":"
        Leer Identificacion
        
		Escribir  "Ingrese Cargo",i,":"
		Leer Cargo
		
		Escribir "Ingrese el Salario ",i,":"
        Leer dato
        acum<-acum+dato
		
    FinPara
    
    prom<-acum/CantidadEmpl
	  Imprimir "El promedio de salarios es ",prom
    FinAlgoritmo
