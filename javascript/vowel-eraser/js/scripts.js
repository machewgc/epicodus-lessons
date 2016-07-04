$(document).ready(function() {
  $("form#phraseForm").submit(function() {
    var phrase = $("#phraseInput").val();
    var letters = phrase.split('');

    var hyphenatedLetters = letters.map(function(letter) {
      if (letter === 'a' || letter === 'e' || letter === 'i' || letter === 'o' || letter === 'u') {
        return '-';
      } else {
        return letter;
      }
    })

    puzzle = hyphenatedLetters.join('');

    alert(puzzle);

    event.preventDefault();
  })
})
