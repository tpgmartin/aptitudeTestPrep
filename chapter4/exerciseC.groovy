int total = 0
boolean finished = false

while (!finished) {
  print "Please enter a number (end with 0): "
  int num = Integer.parseInt(System.console().readLine())
  if (num != 0) {
    total++
  } else {
    finished = true
  }
}
println "You have entered " + total + " numbers"
