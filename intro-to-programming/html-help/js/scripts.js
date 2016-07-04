jQuery(document).ready(function() {

  var elements = ["h1","p","img"];

  elements.forEach(function(element) {
    jQuery(element).click(function() {
        alert("This is a(n) " + element);
    });
  });
});
