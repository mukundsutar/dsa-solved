function isPalindrome(x) {
	let numWord = x.toString();

	let splitStr = numWord.split("");

	let reverseArr = splitStr.reverse();

	let reversed = reverseArr.join("");

	if (numWord == reversed) {
        console.log(true);
		return true;
	} else {
        console.log(false);
		return false;
	}
}

isPalindrome(345);
