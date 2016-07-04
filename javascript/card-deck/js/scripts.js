$(document).ready(function() {
  var cardValues = ["Ace",2,3,4,5,6,7,8,9,10,"Jack","Queen","King"];
  var cardSuits = ["Hearts","Diamonds","Clubs","Spades"];

  var cardList = document.getElementById("cardDeck");

  var cards = [];

  cardSuits.forEach(function(suit) {
    cardValues.forEach(function(value) {
      var card = value + " of " + suit;
      cards.push(card);
      newCard = document.createElement("li");
      newTextNode = document.createTextNode(card);
      newCard.appendChild(newTextNode);
      cardList.appendChild(newCard);
    })
  })
})
