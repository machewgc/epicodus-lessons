$(document).ready(function() {
  $("form#sentenceForm").submit(function() {
    var sentence = $("#sentence").val()
    var sentenceWords = sentence.split(" ");
    var index = sentenceWords.length - 1;

    //remove items from array less than 4 characters in length  using splice method (works)
/*    while (index >= 0) {
      if (sentenceWords[index].length <= 3) {
        sentenceWords.splice(index,1);
      }
      index -= 1;
    } */

    //remove items from array less than 4 characters in length  using filter method (works)
    function isBigEnough(value) {
      if (value.length > 3) {
        return value;
      }
    }

    var filtered = sentenceWords.filter(isBigEnough);
    var newSentenceArray = filtered.reverse();
    var newSentence = newSentenceArray.join(' ');

    $("#sentenceOutput").text(newSentence);

    event.preventDefault();
  });
});
