//This creates an array by splitting the user text input by spaces
//Then the array is sorted
//Then the array is condensed to include only unique values
//The number of times a value is repeated is stored in a separate array

$(document).ready(function() {
  $("form#wordForm").submit(function() {
    var words = $("#words").val();

    var wordsSplit = words.split(' ');
    var count = [1];
    var countLength = 1;

    wordsSplit.sort();

    length = wordsSplit.length - 1;

    //remove non unique values in array and count occurrences in separate but equally sized array
    for (i = 1; i < length-1; i++) {
      if (wordsSplit[i] === wordsSplit[i-1]) {
        wordsSplit.splice(i,1);
        count[i-1] += 1;
        i -= 1;
      } else if (i < length) {
        count.push(1);
      }
    }

    //output each word and it's number of occurrences to the console
    wordsSplit.forEach(function(word, index, array) {
      console.log(word + " " + count[index]);
    })


    $("#wordList").text(wordsSplit);
    $("#countList").text(count);
    event.preventDefault();
  })
})
