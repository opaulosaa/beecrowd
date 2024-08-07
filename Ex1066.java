import java.util.Scanner;

public class Ex1066 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numPares = 0;
        int numImpares = 0;
        int numPos = 0;
        int numNeg = 0;

        for (int i = 0; i < 5; i++){
            int num = input.nextInt();
            if (num % 2 == 0){
                numPares++;
            } else {
                numImpares++;
            }
            if (num > 0){
                numPos++;
            } else {
                numNeg++;
            }
        }
        System.out.println(numPares + " valor(es) par(es)");
        System.out.println(numImpares + " valor(es) impar(es)");
        System.out.println(numPos + " valor(es) positivo(s)");
        System.out.println(numNeg + " valor(es) negativo(s)");
    }
}

/*
let numPares = 0;
let numImpares = 0;
let numPos = 0;
let numNeg = 0;

for(i = 0; i < 5; i++){
    let num = Number(prompt("Digite um numero"))
    if(num %2 == 0){
        numPares++
    } else {
        numImpares++
    }
    if(num > 0){
        numPos++
    }
    if(num < 0) {
        numNeg++
    }
}
console.log(`${numPares} valor(es) par(es)`)
console.log(`${numImpares} valor(es) impar(es)`)
console.log(`${numPos} valor(es) positivo(s)`)
console.log(`${numNeg} valor(es) negativo(s)`)
 */