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
$(".botonAnadir").click(function(){
    $(".unaClase").each(function(){
        i = i +1;
        $("<li>").append("<li class='unaClase'>"+ i +"</i>");
              
    });
});
