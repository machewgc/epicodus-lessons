//This script finds all prime numbers below a given value
$(document).ready(function() {
  $("form#primeForm").submit(function() {
    var number = parseInt($("#primeInput").val());
    var primes = [];
    var count = 1;

    for (var k = 2; k <= number; k++) {
      primes.push(k);
    }

    var length = primes.length;

    for (var i = 2; i < number; i++) {
      for (j = count; j <= length - 1; j++) {
        if(primes[j] % i === 0) {
          primes.splice(j,1);
          length -= 1;
          j -= 1;
        }
      }
      if (primes[count] <= i + 1) {
        count += 1;
        number = primes[length - 2];
      }
    }

    $("#primes").text(primes);

    event.preventDefault();
  })
})
