// Implement a program that will count the sum of all digits that make up the original number.
// Output result with console.log operator.
// For example:
// The original number is 32452. Digits are '3', '2', '4', '5', '2'. Sum of digits will be 3+2+4+5+2 = 16

// let number = 1032;
// let res = 0;

// while (number > 0) {
//   res += number % 10;
//   number = parseInt(number / 10);
// }

// console.log(res);



// let number = 3241;

// let left =0;
// let right =0;

//   for (let i=0; i<2; i++) {
//     right += number % 10;
//     number = parseInt(number / 10);
//   }

// // 32 
// for (let i=0; i<2; i++) {
//   left += number % 10;
//   number = parseInt(number / 10);
// }

// console.log(left === right ? "eat" : "not eat");



  let number = 12131212;

  let copynumber =number;
  let count=0;
    while( copynumber>0){
      copynumber=parseInt(copynumber/10); 
      count++;
    }

  // let res1 = 0;
  // let tempRes = 0;

  // while(number > 0) {
  //     for (let i=0; i<count/2; i++) {
  //       tempRes += number % 10;
  //       number = parseInt(number / 10);
  //     }
  //     if(res1 === 0){
  //       res1 = tempRes;
  //       tempRes = 0;
  //     }
  //   }
  let res = 0;

  for (let i = 0; i < count; i++) {
    if(i < count/2) {
      res += number%10;
    } else {
      res -= number%10;
    }
    number = parseInt(number/10);
  }
  console.log(res === 0 ? "eat" : "not eat");