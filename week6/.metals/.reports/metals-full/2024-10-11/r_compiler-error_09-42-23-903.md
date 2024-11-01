file:///C:/Users/mabba/OneDrive%20-%20George%20Brown%20College/Fall2024/Java/COMP2130-Java/week6/Step_6.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.3\scala3-library_3-3.3.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
uri: file:///C:/Users/mabba/OneDrive%20-%20George%20Brown%20College/Fall2024/Java/COMP2130-Java/week6/Step_6.java
text:
```scala
class Person {
    String name;
    int age;

    // Constructor for Person class
    public Person(String name, int age) {
        this.name = name; // Initialize name
        this.age = age;   // Initialize age
        System.out.println("Person constructor called: " + name + ", Age: " + age);
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }
}

class Student extends Person {
    String major;

    // Constructor for Student class
    public Student(String name, int age, String major) {
        super(name, age); // Call the superclass constructor to initialize name and age
        this.major = major; // Initialize the major for the student
        System.out.println("Student constructor called: " + name + ", Major: " + major);
    }

    // Add this part to the introduction of a person who is a student
    // I am studying <major> 
    
    //your code here
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I am Studying" + major);
    }
}

//creat a subclass for Teacher with `String subject` attribute
// write a method for teacher to introduce themself
//your code here
class Teacher extends Person {
    String subject;
    Teache
}
public class Step_6 {
    public static void main(String[] args) {
        //create student name: "Alice", age: 20, major: "Computer Science" and call introduce;
        Student student = new Student("Alice", 20, "Computer Science");
        
    }
}

```



#### Error stacktrace:

```
scala.collection.Iterator$$anon$19.next(Iterator.scala:973)
	scala.collection.Iterator$$anon$19.next(Iterator.scala:971)
	scala.collection.mutable.MutationTracker$CheckedIterator.next(MutationTracker.scala:76)
	scala.collection.IterableOps.head(Iterable.scala:222)
	scala.collection.IterableOps.head$(Iterable.scala:222)
	scala.collection.AbstractIterable.head(Iterable.scala:933)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:168)
	scala.meta.internal.pc.MetalsDriver.run(MetalsDriver.scala:45)
	scala.meta.internal.pc.WithCompilationUnit.<init>(WithCompilationUnit.scala:28)
	scala.meta.internal.pc.SimpleCollector.<init>(PcCollector.scala:373)
	scala.meta.internal.pc.PcSemanticTokensProvider$Collector$.<init>(PcSemanticTokensProvider.scala:61)
	scala.meta.internal.pc.PcSemanticTokensProvider.Collector$lzyINIT1(PcSemanticTokensProvider.scala:61)
	scala.meta.internal.pc.PcSemanticTokensProvider.Collector(PcSemanticTokensProvider.scala:61)
	scala.meta.internal.pc.PcSemanticTokensProvider.provide(PcSemanticTokensProvider.scala:90)
	scala.meta.internal.pc.ScalaPresentationCompiler.semanticTokens$$anonfun$1(ScalaPresentationCompiler.scala:117)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator