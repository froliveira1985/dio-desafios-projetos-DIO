Leia um valor inteiro **N**. Apresente o quadrado de cada um dos valores pares, de 1 até **N**, inclusive **N**, se for o caso.

## Entrada

A entrada contém um valor inteiro **N** (5 < **N** < 2000).

## Saída

Imprima o quadrado de cada um dos valores pares, de 1 até **N**, conforme o exemplo abaixo.

Tome cuidado! Algumas linguagens tem por padrão apresentarem como saída 1e+006 ao invés de 1000000 o que ocasionará resposta errada. Neste caso, configure a precisão adequadamente para que isso não ocorra.

 

| Exemplo de Entrada | Exemplo de Saída          |
| ------------------ | ------------------------- |
| 6                  | 2^2 = 4 4^2 = 16 6^2 = 36 |


====================================================================================

Resposta...

1/3

// a função gets() é implementada dentro do sistema para ler as entradas(inputs) dos dados e a função print() para imprimir a saída (output) de dados e já pula uma linha ("\n")
// Abaixo segue um exemplo de código que você pode ou não utilizar
let lines = gets().split('\n');
var N = parseInt(lines.shift());

for (let i = 1; i <= N; i++) {

//TODO: Complete os espaços em branco com uma possível solução para o desafio

	if (i % 2 ===  0  )
	
  print(`${i}^2 = ${i * i }`);
}


2/3

// A função gets() é implementada dentro do sistema para ler as entradas(inputs) dos dados e a função print() para imprimir a saída (output) de dados e já pula uma linha ("\n")
// Abaixo segue um exemplo de código que você pode ou não utilizar
let lines = gets().split('\n');

let N = parseInt(lines.shift());
for ( let i = 1; i < 10000; i++) {

//TODO: Complete os espaços em branco com uma possível solução para o desafio

if (i % N==2) print(  i );
}

3/3

// A função gets() é implementada dentro do sistema para ler as entradas(inputs) dos dados e a função print() para imprimir a saída (output) de dados e já pula uma linha ("\n")
// Abaixo segue um exemplo de código que você pode ou não utilizar
let lines = gets().split("\n");

let line = lines.shift().split(' ');
let soma = 0

//TODO: Complete os espaços em branco com uma possível solução para o desafio

for(i=0;i<4  ;i++){

 let transfor = parseInt(line[i]);

 soma = soma + transfor

}

print(soma-3)

