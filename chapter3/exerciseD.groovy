int a
int b
print "Please key in a number: "
a = Integer.parseInt(System.console().readLine())
print "Please key in another number: "
b = Integer.parseInt(System.console().readLine())

if (b == 0) {
  println "Cannot divide by zero"
} else if (a%b == 0) {
  println "Yes"
} else {
  println "No"
}
