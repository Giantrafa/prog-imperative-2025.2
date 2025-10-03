//01
const numb = [11, 5];
if (numb[0] > numb[1]) {
    const aux = numb[0];
    numb[0] = numb[1];
    numb[1] = aux;
}
console.log(numb)


//02
const V = [42, 7, 15];
const tame = V.length;

for (let i = 0; i <= tame - 2; i++) {
    let posMenor = i;

    for (let j = i + 1; j < tame; j++) {
        if (V[j] < V[posMenor]) {
            posMenor = j;
        }
    }

    if (i !== posMenor) {
        const aux = V[i];
        V[i] = V[posMenor];
        V[posMenor] = aux;
    }
}
console.log(V);

//03
const N = [3, 7, 12, 18, 25];
const tam = N.length;

const Q = new Array(tam);

for (let i = 0; i < tam; i++) {
    Q[i] = N[tam - i - 1];
}
console.log(N);
console.log(Q);

//04
const tam1 = parseInt(prompt("Quantos números você deseja inserir?"));
const N1 = [];

for (let i = 0; i < tam1; i++) {
    const valor = parseInt(prompt(`Digite o ${i + 1}º número:`));
    N.push(valor);
}

const Q1 = new Array(tam);
for (let i = 0; i < tam; i++) {
    Q1[i] = N[tam - i - 1];
}

console.log("Array original:", N1);
console.log("Array invertido:", Q1);


//05
const arr = [11, 5, 8, 3, 9];
const length = arr.length;

for (let outer = 0; outer < length - 1; outer++) {
    for (let inner = 0; inner < length - 1 - outer; inner++) {
        if (arr[inner] > arr[inner + 1]) {
            const temp = arr[inner];
            arr[inner] = arr[inner + 1];
            arr[inner + 1] = temp;
        }
    }
}
console.log(arr);


//06
const arr1 = [5, 3, 7, 5, 9, 5];
const x = 5;

const indices = [];

for (let i = 0; i < arr1.length; i++) {
    if (arr1[i] === x) {
        indices.push(i);
    }
}

console.log(`O número ${x} aparece nos índices:`, indices);


//07
// eu nao sei oq e Fibonacci
const n = parseInt(prompt("Digite um inteiro positivo para a quantidade de termos:"));

if (isNaN(n) || n <= 0) {
    console.log("Por favor, insira um número inteiro positivo válido.");
} else {
    const fib = [];

    for (let i = 0; i < n; i++) {
        if (i === 0) {
            fib.push(0);
        } else {            
            let soma = 0;
            for (let j = 0; j < i; j++) {
                soma += fib[j];
            }
            fib.push(soma);
        }
    }

    console.log(`Array gerado: [${fib.join(", ")}]`);
}
 
// ponto de cançasso, tava fazendo a prova de marcio na mao , (a do ano passado)
// 08
const nFat = parseInt(prompt("Digite um inteiro não-negativo para calcular fatoriais até n:"));

if (isNaN(nFat) || nFat < 0) {
    console.log("Por favor, insira um número inteiro não-negativo válido.");
} else {
    const fat = [];
    fat[0] = 1;

    for (let i = 1; i <= nFat; i++) {
        fat[i] = i * fat[i - 1];
    }

    console.log(`Fatoriais de 0 até ${nFat}:`);
    for (let i = 0; i <= nFat; i++) {
        console.log(`${i}! = ${fat[i]}`);
    }
}

// 08
const tabuleiro = [
    ['', '', ''],
    ['', '', ''],
    ['', '', '']
];

let jogador = 'X';

function marcarPosicao(linha, coluna) {
    if (tabuleiro[linha][coluna] === '') {
        tabuleiro[linha][coluna] = jogador;
        console.log(`Jogador ${jogador} marcou posição [${linha}, ${coluna}]`);
        jogador = jogador === 'X' ? 'O' : 'X';
    } else {
        console.log('Posição já marcada! Escolha outra.');
    }
    console.table(tabuleiro);
}

// Exemplos de uso do jogo da velha:
marcarPosicao(0, 0);
marcarPosicao(1, 1);
marcarPosicao(0, 0); // tentativa inválida

// 09
const linhas = parseInt(prompt("Digite a quantidade de linhas:"));
const colunas = parseInt(prompt("Digite a quantidade de colunas:"));

if (isNaN(linhas) || linhas <= 0 || isNaN(colunas) || colunas <= 0) {
    console.log("Por favor, insira números inteiros positivos válidos para linhas e colunas.");
} else {
    const matriz = [];
    let contador = 1;

    for (let i = 0; i < linhas; i++) {
        matriz[i] = [];
        for (let j = 0; j < colunas; j++) {
            matriz[i][j] = contador++;
        }
    }

    console.log("Matriz inicializada:");
    console.table(matriz);
}
