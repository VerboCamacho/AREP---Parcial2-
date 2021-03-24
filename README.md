# AREP---Parcial2-
##Verbo Julian Camacho Villamarin
# bitacora
## Primera parte crear la aplicación web
1) Cree un proyecto java usando maven.
2) Cree la clase principal
   ![image](img/img.png)
   ![image](img/img_1.png)
## Segunda Parte: crear imagen para docker y subirla

#### Conectamos a la consola de aws
![image](img/img_2.png)

#### Nos aseguramos que este funcionando en localhost 4567

![image](img/img_4.png)

#### realizamos el montaje de la imagen en docker
![image](img/img_3.png)

#### Utilizamos el siguiente comando docker build --tag dockersparkprimer .
![image](img/img_5.png)

#### Verificamos que docker tenga las images creadas correctamente
![image](img/img_6.png)
#### Realizamos el push
![image](img/img_7.png)

#### Realizamos el pull en la maquina aws

![image](img/img_8.png)
#### Modificamos el grupo de seguridad para poder ingresar mediante el puerto 42000
![image](img/img_9.png)

### Probamos el funcionamiento de la funcion sin
![image](img/img_10.png)
#### Probamos el funcionamiento de la funcion ln
![image](img/img_11.png)
### En las siguientes imagenes se visualiza correctamente la estructura del link que se solicito en el parcial

![image](img/img_12.png)

![image](img/img_13.png)


## Link video
[Video](https://drive.google.com/file/d/1w9_mzioELnVRqEUA_q6mxk9sMqrofOAf/view?usp=sharing)
# Autor
Verbo Julian Camacho Villamarin

# Licencia

Este proyecto está licenciado bajo la licencia General Public License v3.0, revise el archivo [LICENSE](LICENSE.txt) para más información.