5.1 Note that an interface can implement default methods. A useful phrase here is on the lines of, "a Class is a sort of template from which an Object is instantiated" (*instantiated* being the correct word to use for Object creation).

5.2 The crucial word to use here is 'runtime', i.e. it is the class of the Object at runtime that determines which method implementation is called.

5.3 The key point to note is that this is a clear violation of the Liskov Substitution Principle, as we can no longer say that a sub-class 'is-a' parent.

5.4 Yes.

5.6 d This is actually O(1) when we amortise. To add n items we have have expanded the list log(n) times, each time incurring an amount of work proportional to the then length of the list. This is the sum of 1 + 2 + 4 + ... 2^(log n); which is a geometric series with sum (2n - 1), so is O(n). Divide by n to get O(1).

6.1 Yes. Note the last method only allows you to use half the memory.

6.2 Yes. Immutable Objects tend to multiple as we can never modify. In practise the cost of object creation often outweighs the additional GC cost (which is well optimised for small, young objects).

6.3 Yes. (I would remove 'should')

6.4 Yes. For the last part, the key condition is that the class is `final`, so that it cannot be subclassed (and ideally also only inherits from Object).

6.5 The problem here is that we have not correctly copied anything in SomeOtherClass.

6.7 The problem is the `final`. This means we cannot write 
```java
public Object clone () {
    // bit -by -bit shallow copy
    CloneTest ct = (CloneTest) super.clone();
    // Now the deep bits
    ct.mData = new int[mData.length];  // this will not compile
    for ( int i=0; i<mData.length; i++) {
        ct.mData[i] = mData[i];
    }
}
```

7.1 Yes

7.4 Yes

7.5 Yes

8.1 The key point to make is that type erasure means that the JVM only sees things as Objects (hence why it explicitly casts things at runtime).
The issue with Constructors is not that we don;t know the signature of the constructor (after all - this is in the code), we don't even know what Type we should be creating.

8.2 [James] Yes. You should also explain the detail of the nomenclature here. I.e. what is the different behaviour of:
- List<? extends Number>
- List<? super Number>
- List<?>

8.3 You should be a little more precise, the arguments are of List<T>, not T.


9.2 Yes - i.e. there is business logic to follow if this happens, it is an expected condition.

9.4 Yes and Yes. It is also quite slow. I understand why the lecturer regards this code as an abomination.

9.5 Yes. See Autocloseable for an example.



