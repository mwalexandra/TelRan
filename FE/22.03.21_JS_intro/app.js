// Implement a program that will count the sum of all digits that make up the original number.
// Output result with console.log operator.
// For example:
// The original number is 32452. Digits are '3', '2', '4', '5', '2'. Sum of digits will be 3+2+4+5+2 = 16

let number = 1032;
let res = 0;

while (number > 0) {
  res += number % 10;
  console.log(res);
  number = Math.floor(number / 10);
}



