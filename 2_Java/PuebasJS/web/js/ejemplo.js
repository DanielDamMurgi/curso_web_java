var pruebasjava = {
    
};

const MI_PI = 3.1416; // PARA DEFINIR UNA CONSTANTE
function dameDoble(numero){
    return numero * 2;
}

class PruebasJava {
    /**
     * @param args the command line arguments
     */
    main(args) {

        this.contador();

        let letra = "b";
        letra = letra.toUpperCase();

        switch (letra) {
            case "A":
                console.log("Letra: " + letra);
                break;
            case "B":
                console.log("Letra: " + letra);
                break;
            case "C":
                console.log("Letra: " + letra);
                break;
            default:
                console.log("Ni A, ni B, ni C");
        }

        this.losMismosEjemplos();

    }

    calcularIva( precio, iva) {
        var result = precio + iva / 100 * precio;
        return result;
    }

    valorAleatorio() {
        return Math.random();
    }

    losMismosEjemplos() {
        for (var i = 5; i > 0; i--) {
            console.log("El cuadrado de: " + i + " es: " + i * i);
        }

        console.log("IVA 10: " + this.calcularIva(10, 21));
        console.log("IVA 20: " + this.calcularIva(20, 21));
        console.log("IVA 30: " + this.calcularIva(30, 21));

        for (var i = 0; i < 5; i++) {
            console.log("Valor aleatorio " + i + " : " + this.valorAleatorio());
        }
        
        console.log("PI = " + Math.PI);
        console.log("Mi PI = " + MI_PI);
        
        console.log("El doble de 7 es: " + dameDoble(7));
    }
    
    contador(){
        let contador;
        contador = 0;

        while (contador < 10) {
            console.log("Contador vale: " + contador);
            contador = contador + 1;
            //contador += 1;
            //contador++;
        }
        
        if(contador === 10){
            alert("pues son iguales");
        }else{
            alert("son distintos");
        }

        if (contador < 10) {
            console.log("Menor que 10");
        } else if (contador === 10) {
            console.log("Igual que 10");
        } else if (contador < 20) {
            console.log("Menor que 20");
        } else {
            console.log("Mayor que 20");
        }
    }
} // FIN DE LA CLASE

var miPrueba = new PruebasJava();
miPrueba.main();

