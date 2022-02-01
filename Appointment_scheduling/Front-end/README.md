# Taller1 - Patrones de diseño de Software
Aplicación web para simular el agendamiento de citas para el proceso de vacunación.
## Front-end
### Menu
Al acceder a la aplicación se presenta un menú de dos botones donde el usuario puede clickear uno de ellos para ir al **formulario de agendamiento de citas**, o bien puede clickear el otro para ir a la **interfaz de busqueda de citas**.
### Formulario de agendamiento
Para poder enviar el formulario y agendar la cita el usuario debe ingresar los siguentes datos:
* Numero de cédula (Input de tipo *text*)
* Nombres (Input de tipo *text*)
* Apellidos (Input de tipo *text*)
* Edad (Input de tipo *number*)
* Fecha (Input de tipo *date*)
* Hora (Input de tipo *time*)
---
> Al final del formulario se presenta un botón de submit por medio del cual el usuario puede finalmente agendar su cita si ha llenado todos los campos.
### Interfaz de busqueda
Para buscar una cita el usuario escoje una fecha por medio del input de tipo *date* y oprime el botón de buscar. Una vez clickeado el botón se refresca la tabla de datos y se muestran los datos de las citas que coinciden con la fecha ingresada. Los datos que se muestran en la tabla son los siguentes:
* Numero de cédula
* Nombres
* Hora de la cita
