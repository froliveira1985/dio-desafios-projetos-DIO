// // *Crie uma função que recebe dois números como parâmetros (PRIMEIRO EXEMPLO)*.

// function comparaNumeros(num1, num2){
//     const saoIguais = num1 === num2;
//     const soma = num1 + num2;

//  // *Confira se os números são iguais*.

//     if(saoIguais){
//         return "São iguais";

// *ou também posso utilizar o if tenário conforme abaixo, sendo o ponto de interrogaçã
// para afirmação verdadeira, ou dois pointos para falsa.*

//     return saoIguais ? "São iguais" : "não são iguais"    

//     }

//     return "Não são iguais";
// }

// ===========================================================================

// Ler o README para entender a sintaxe

function comparaNumeros (num1, num2){
    if (!num1 || !num2) return 'Defina dois números!';
    const primeiraFrase = criaPrimeiraFrase(num1, num2);
    const segundaFrase = criaSegundaFrase(num1, num2);

    return `${primeiraFrase} ${segundaFrase}`
} 

function criaPrimeiraFrase(num1, num2) {
    let saoIguais = '';

    if(num1 !=num2) {
        saoIguais = 'não ';
    }

    return `Os números ${num1} e ${num2} ${saoIguais}são iguais.`
};

function criaSegundaFrase(num1, num2){
    const soma = num1 + num2;

    let resultado10 = 'menor';
    let resultado20 = 'menor';
    const compara10 = soma > 10;
    const compara20 = soma > 20;

    if(compara10){
        resultado10 = 'maior'
    }

    if(compara20){
        resultado20 = 'maior'
    }

    return `Sua soma é ${soma}, que é ${resultado10} que 10 e ${resultado20} que 20.`

}

console.log(comparaNumeros(20,20));