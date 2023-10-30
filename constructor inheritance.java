// Class 1
// Super class
class Base {
  
    Base()
    {
        System.out.println(
            "Base Class Constructor Called ");
    }
}
  
class Derived extends Base {
  
    // Constructor of sub class
    Derived()
    {
        System.out.println(
            "Derived Class Constructor Called ");
    }
}
  
class GFG {
    public static void main(String[] args)
    {
        Derived d = new Derived();
  
        // Note: Here first super class constructor will be
        // called there after derived(sub class) constructor
        // will be called
    }
}