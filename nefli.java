

/*
Interpretación:

Entiendo que Reproductor tiene 3 listas de listeners (como un observer con multi listas)

A mi interpretación, los listener mediante el idVideo pueden modificar el minutoActual o ultimo minuto donde
la película estaba siendo visualizada, dicho minuto es tambien un atributo de la película (clase que añado), 
el StopListener podría buscar la película mediante su ID y decirle: "Tu ultimo minuto antes de pausarte fue este" 
y setearlo en la película para que luego la reproducción (con PlayListener) use dicho minuto, en la inicialización 
el minutoActual = 0;

tambien queda pendiente el : ¿Como el usuario obtiene la película? -> Pienso que cada usuario podria tener una lista de películas y que mediante UI se
seleccióne una, o mismamente desde un repositorio de películasDisponibles que tenga la App, esto solo lo comento porque el enunciado no me aclara

*/

Class Usuario {

    Reproductor miReproductor;

    void continuarViendoPelicula(Pelicula unaPelicula){
        miReproductor.play(unaPelicula.idVideo,unaPelicula.minutoActual);
    }
}

Class Pelicula {
    ...
    int idVideo;
    int minutoActual = 0;
}

/*
    Otra opción: Me parece que el método continuarViendoPelicula en usuario es mas un pasamano y que la película
    cuenta con todo lo necesario para que se encarge de avisarle al reproductor que se la continue reproduciendo
    aunque particularmente me gustaría añadir el método en Reproductor y pasarle como parametro la película en sí
    no voy a modificar la interfaz porque entiendo que el enunciado solo quiere que la use.

*/

Class Pelicula{

    int idVideo;
    int minutoActual = 0;
    Reproductor miReproductor;

    void continuarViendoPelicula(Pelicula unaPelicula){
        miReproductor.play(idVideo,minutiActual);
    }

}

