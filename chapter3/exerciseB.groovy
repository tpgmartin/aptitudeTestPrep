int husbandSalary
int wifeSalary
int combinedSalary

print "Please key in husband's salary: "
husbandSalary = Integer.parseInt(System.console().readLine())
print "Please key in wife's salary: "
wifeSalary = Integer.parseInt(System.console().readLine())

combinedSalary = husbandSalary + wifeSalary

if (combinedSalary > 40000) {
  println "Higher tax rate"
} else {
  println "Standard tax rate"
}
