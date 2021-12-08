***
<h1>Documentation</h1>
***

"CV" = "class value"

Decim methods:

show: shows CV\
get_n: returns CV\
set_n: sets and thereafter returns CV\
set: sets value of CV from given value\
add: adds given value to CV\
sub: subtracts given value of CV\
div: divides CV into given value\
mul: multiplies CV by given value\
siz: checks whether CV is smaller or bigger than given value\
sqrt: checks whether CV is a square root or not\
rnd: rounds CV\
prim: checks whether CV is a prime number

Any methods that have the prefix "q" (questionnaire) are the same as their counterpart
except that they request the parameters

qAdd\
qSub\
qMul\
qDiv\
qSiz\
qSet

Any methods that have the prefix "g"(get) are the same as their counterpart
except that they return something

gSqrt\
gPrim\
gSiz

***

Fract methods:

qSet: S.a.\
show: S.a.\
cnt: returns numerator\
den: returns denominator\
dec: returns fraction as a decimal\
sDec: shows fraction as a decimal\
qAddD: adds decimal to fraction\
short: shortens fraction by half, if possible (it's  not very efficient, i know)

To be fixed:

qAddF: adds two fractions

***