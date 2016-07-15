Summary
This is a rock, paper, scissors game created to gain experience with running tests using JUnit and Selenium.

How you use it
Select rock, paper, or scissors on each of the two dropdowns and press "submit".

What it does
The website will return the winner (player 1 or player 2) or report a tie in the case that both dropdown selections are equal when submitted.

JUnit Tests for Player 1 Victory  
First player wins with rock  
  Input: rock, scissors  
  Output: true  

First player loses with rock  
  Input: rock, paper  
  Output: false  

First player ties  
  Input: rock, rock  
  Output: null  

First player loses with scissors  
  Input: scissors, rock  
  Output: false  

First player loses with paper  
  Input: paper, scissors  
  Output: false  


Selenium Tests
Player 1 wins
  Input: rock, scissors
  Output: "Player 1 wins with rock"

Player Two Wins
  Input: rock, paper
  Output: "Player 2 wins with paper"

Nobody Wins
  Input: paper, paper
  Output: "Nobody wins. Both chose paper"
