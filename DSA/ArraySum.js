let arr = ["abc1", "23uyp", "t67p", "89","abc","t67p"];

const sumArr = (arr) => {
  const regex = /[^\d]/g;  // match anything that's not a digit
  let sum = 0;
  for (let i = 0; i < arr.length; i++) {
    const numStr = arr[i].replace(regex, '');  // remove unwanted characters
    const num = parseInt(numStr, 10);  // convert string to number
    if (!isNaN(num)) {  // check if it's a valid number
      sum += num;
    }
  }
  return sum;
};

console.log(sumArr(arr))