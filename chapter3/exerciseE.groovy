int time
print "Please key in a time: "
time = Integer.parseInt(System.console().readLine())

if (time > 0 && time < 1200) {
  println "Good morning!"
} else if (time > 0 && time < 1800) {
  println "Good afternoon!"
} else if (time > 0 && time < 2100) {
  println "Good evening!"
} else if (time > 0 && time < 2400) {
  println "Good night!"
} else {
  println "?"
}
