package seleniumOperations.InterviewQuestions;

public class RuntimePolymorphism {
    /**
     * ✅ Full Explanation:
     * WebDriver driver = new ChromeDriver(); is an example of runtime polymorphism (or dynamic binding) in Java, where:
     *
     * WebDriver is an interface.
     *
     * ChromeDriver is a concrete class that implements the WebDriver interface (through RemoteWebDriver).
     *
     * You're creating an object of the ChromeDriver class but assigning it to a reference of the WebDriver interface type.
     *
     * 🧠 Why Do We Do This?
     * Using WebDriver as the reference type allows us to write flexible, browser-independent test scripts. For example:
     *
     * WebDriver driver;
     *
     * driver = new ChromeDriver();  // For Chrome
     * driver = new FirefoxDriver(); // For Firefox
     * driver = new EdgeDriver();    // For Edge
     *
     * because webdriver is common interface for all the browsers
     */


    /**
     * Here’s a solid one-line summary you can use in an interview:
     *
     * "WebDriver driver = new ChromeDriver(); is an example of runtime polymorphism where a WebDriver interface reference points to a ChromeDriver object,
        allowing browser-independent automation with the methods implemented in RemoteWebDriver."
     */

    /**
     * Great! Let’s break down this line of code:
     * Parent obj = new Child();
     * ✅ new Child()
     * This creates a new object of type Child (i.e., it allocates memory and initializes a Child object).
     *
     * The object is of the Child class, which means it has:
     *
     * All properties/methods from Parent (inherited),
     *
     * Plus any additional properties/methods defined in Child.
     *
     * ✅ Parent obj
     * This declares a reference variable named obj of type Parent.
     *
     * It can refer to any object that is a Parent or a subclass of Parent.
     *
     * Right now, it's referring to a Child object (new Child()), but it only sees the Parent part of that object unless methods are overridden.
     *
     * ✅ Together: Parent obj = new Child();
     * This is an example of upcasting — assigning a child object to a parent class reference.
     *
     * This is allowed because a Child is-a Parent (IS-A relationship).
     *
     * At compile time, obj can only access methods defined in Parent (unless overridden in Child).
     */


    /**  difference between Runtime Polymorphism and Dynamic Method Dispatch
     * | Term                    | Meaning                                                 |
     * | ----------------------- | ------------------------------------------------------- |
     * | Runtime Polymorphism    | Resolving method call at runtime                        |
     * | Dynamic Method Dispatch | The mechanism Java uses to achieve runtime polymorphism |
     *
     * So yes, both are the same concept — just different terms used interchangeably. ✅
     */
}
