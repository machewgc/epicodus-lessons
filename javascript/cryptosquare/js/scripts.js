$(document).ready(function() {
  $("form#messageForm").submit(function() {
    event.preventDefault();
    var message = $("#messageInput").val();
    var encodedMessage = messageEncoder(message);

    $("#result").text(encodedMessage);
  })
})

function messageEncoder(message) {
  var justLetters = message.replace(/[^\w]|_/g, "").split('');
  var length = justLetters.length;
  var square = []; var count = 0; var index = 0;
  var squareSize = Math.ceil(Math.sqrt(length));

  for (var i = 1; i <= squareSize; i++) {
    count = i-1;
    for (var j = 0; count < length; j++) {
      if ((index+1)%5 === 0) {
        square[index] = justLetters[count] + " ";
      } else {
        square[index] = justLetters[count];
      }
      index += 1;
      count += squareSize;
    }
  }

  return square.join('');
}
