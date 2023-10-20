function reverseString(str) {
  let result = "";
  let word = "";
  let reversedWord = "";

  for (let i = 0; i < str.length; i++) {
    if (str[i] === " " || i === str.length - 1) {
      if (i === str.length - 1) {
        word += str[i];
      }

      for (let j = word.length - 1; j >= 0; j--) {
        reversedWord += word[j];
      }

      result = reversedWord + " " + result;
      word = "";
      reversedWord = "";
    } else {
      word += str[i];
    }
  }

  return result;
}

const str = "This is a Sunny Day";
const reverseStr = reverseString(str);
console.log(reverseStr);
