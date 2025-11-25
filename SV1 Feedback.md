1.2 You should also mention the distinctions between:
- varaiables vs values
- abstract versus direct memory access
- recursion vs explicit iteration preference
- local vs global scopes (detail of side-effects)


1.3 
Objects are the things the references point to (as discussed in SV)

1.5 Yes

1.9 Yes

2.1 Yes-ish. You need to clearly state that it enables data to be hidden, and for controls to be added for access 
and changgin it (for example we could add audit logging in the set() method, and also add error checking for silly 
values).

2.2 The issue is not really boilerplate code. There are ways to reduce this (as Kotlin and Scala do more effectively 
than Java). The advantages boil down to greater control (reduced flexibility of the user). The disadvantages boil 
down to less control (greater flexibility).

2.3 b) Yes - although setting them to be final is not absolutely required, but is an additional safety check. As long 
as no internal state can be changed after creation, we're good.

c) As discussed in SV.

d) Yes. 

2.4 b) Good.

2.5/2.6 As discussed in SV.

3.1 They provide safety. They *type* the memory so that we can only use the reference to retrieve the whole object. 
And they stop the horror of C-style pointer arithmetic.

3.2 As discussed in SV. The key point is that p -> null is not really correct. p *is* null, and does not point to 
(refer to) anything.

3.3 Yes

3.4 As per comment in code, you also need to provide code that when run tells you if tail-recursion is optimised in 
Java (it isn't).

3.5 Yes on memory increase. Yes to extra layer of indirection introducing complexity and being a potential 
performance hit.

4.1 Yes. However a 2D Vector *is* a 3D Vector, so the other way round would be fine.

4.2 No - the default is 'package-private', which means it is fully available within the package, but not outside it 
(even in subclasses). This was hidden because all your code is in the same package. (Have a look at 4.5 after the SV 
discussion.)

4.4 Yes (as far as I can read them anyway).
