//document.write("<h1>Título</h1>");
//document.write("<input type='button' id='boton' value='Soy un bot&oacute;n'/>");

var h1 = document.createElement("h1");
var texto = document.createTextNode("Título DOM");
var body = document.getElementsByTagName("body")[0];
body.appendChild(h1);
h1.appendChild(texto);

jQuery("body").append("<h1>Título jQuery</h1>");
//jQuery.createElement("h1").append("My H1 Text").appendTo("body");

document.getElementById("marco").innerHTML = "Otro texto desde JS";
$("#marco").html(
        $("#marco").html() + "<br/>Otro texto desde jQuery");


var arrayLIs = document.getElementsByClassName("unaClase");
for (var i = 0; i < arrayLIs.length; i++) {
    arrayLIs[i].innerHTML += " - " + i + "!!";
}
$(".unaClase").html("Cambiar valor");

//SUMAR LISTA
var i = 0;
$(".botonSumar").click(function(){
    $(".unaClase").each(function(){
        $(this).text("Núm: " + i);
        i = i + 1;
    });
});

//DOBLAR LISTA
$(".botonDoblar").click(function(){
    $(".unaClase").each(function(){
        $(this).text("Núm: " + i);
        i = i * 2;
    });
});

//REINICIAR LISTA A CERO
$(".botonReiniciar").click(function(){
    $(".unaClase").each(function(){
        i = 0;
        $(this).text("Núm: " + i);
    });
});

//AÑADIR ELEMENTOS
jQuery(".botonAnadir").click(function(){  
    i = i + 1;
    jQuery("ol").append("<li>Núm: "+ i +"</i>").addClass("unaClase");    
});

//CALLS FUNCTIONS -----------------------------------------
jQuery(document).ready(colorLista);
jQuery(document).ready(pulsarBoton);
jQuery(document).ready(ocultarTabla);
jQuery(document).ready(mostrarTabla);

//FUNCTIONS -----------------------------------------------
function colorLista() {
    $(".lista").mouseover(function(){
        $(".lista").css("color","#FFFFFF");
        $(".lista").css("background-color","#000000");
    });
    
    $(".lista").mouseout(function(){
        $(".lista").css("color","#000000");
        $(".lista").css("background-color","#FFFFFF");
    });
};

function pulsarBoton() {
    //BOTON SUMAR
    $(".botonSumar").mouseover(function(){
        $(".botonSumar").attr("value","Pulsar");
    });
    $(".botonSumar").mouseout(function(){
        $(".botonSumar").attr("value","Sumar lista");
    });
    //BOTON DOBLAR 
    $(".botonDoblar").mouseover(function(){
        $(".botonDoblar").attr("value","Pulsar");
    });
    $(".botonDoblar").mouseout(function(){
        $(".botonDoblar").attr("value","Doblar lista");
    });
    //BOTON AÑADIR
    $(".botonAnadir").mouseover(function(){
        $(".botonAnadir").attr("value","Pulsar");
    });
    $(".botonAnadir").mouseout(function(){
        $(".botonAnadir").attr("value","Añadir elemento");
    });
    //BOTON LIMPIAR
    $(".botonReiniciar").mouseover(function(){
        $(".botonReiniciar").attr("value","Pulsar");
    });
    $(".botonReiniciar").mouseout(function(){
        $(".botonReiniciar").attr("value","Limpiar lista");
    });
};

function ocultarTabla() {
    $(".botonOcultar").click(function(){
       $(".tabla").hide("slow"); 
    });
};

function mostrarTabla(){
    $(".botonMostrar").click(function(){
        $(".tabla").show("slow");
    });
};

