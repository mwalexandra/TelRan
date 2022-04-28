const countDigit = num => {
  let count=0;
    while( num>0){
      num=parseInt(num/10); 
      count++;
    }
    return count;
}

const isEven = num => num%2 === 0;

const isLucky = num => {
  const count = countDigit(num);
  
  if (!isEven(count)) {
    return "Unknown num";
  } 

  let res = 0;
  for (let i = 0; i < count; i++) {
    if(i < count/2) {
      res += num%10;
    } else {
      res -= num%10;
    }
    num = parseInt(num/10);
  }
  return (!res ? "lucky" : "not lucky");
}

console.log(isLucky(1203));