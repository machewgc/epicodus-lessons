$(document).ready(function() {
  $("form#palindromeForm").submit(function() {
    var word = $("#palindromeInput").val();
    word.split('');
    var length = word.length;
    var count
    var isPalindrone = true;

    if (length % 2 === 1) {
      count = length - 1;
      count /= 2;
    } else {
      count = length / 2;
    }

    for (var i = 0; i <= count; i++) {
      if (word[i] != word[length - i - 1]) {
        isPalindrone = false;
      }
    }

    alert(isPalindrone);
    
    event.preventDefault();
  })
})
