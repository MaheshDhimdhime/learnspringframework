//package codingpractice;
//
////interface Sayable {
//  //  void say();
////}
//
//public class StaticMethodReference {
//
//    // static method
//    public static void saySomething() {
//        System.out.println("i am saying something...!");
//    }
//
//    // instance method
//    public void listenSomething() {
//        System.out.println("i am listening something...!");
//    }
//
//    // constructor
//    public StaticMethodReference() {
//        System.out.println("i am talking something...!");
//    }
//
//    public static void main(String[] args) {
//        Sayable says = StaticMethodReference::saySomething;
//        says.say();
//
//        StaticMethodReference listen = new StaticMethodReference();
//        Sayable says2 = listen::listenSomething;
//        says2.say();
//
//        // The `new` keyword cannot be used in a method reference.
//        // Sayable talk = StaticMethodReference::new;
//        // talk.say();
//    }
//}
