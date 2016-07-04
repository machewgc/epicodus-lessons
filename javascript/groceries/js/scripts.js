$(document).ready(function() {
  $("form#groceryForm").submit(function() {
    var groceries = $("#groceries").val();
    var groceryList = groceries.split(",");
    var sortedList = document.getElementById("groceryList");

    //Alphabetize grocery list
    groceryList.sort();

    //UPPERCASE all items in grocery list
    groceryList = groceryList.map(function(item) {
      return item.toUpperCase();
    });

    //For each item in grocery list, create a list element with the value of item
    groceryList.forEach(function(item) {
      var newNumberListItem = document.createElement("li");
      var numberListValue = document.createTextNode(item);
      newNumberListItem.appendChild(numberListValue);
      sortedList.appendChild(newNumberListItem);
    });

    //Display ordered grocery list on index.html
    $("#groceryList").show();
    $("form#groceryForm").hide();

    //alert(groceryList);
    event.preventDefault();
  });
});
