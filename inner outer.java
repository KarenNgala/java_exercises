class OuterClass {
    void view(){
        System.out.println("Outer class");
    }
    static class InnerClass{
        void view(){
            System.out.println("Inner class");
        }
    }

public static void main(String args[]){
    OuterClass ob = new OuterClass();
    ob.view();

    OuterClass.InnerClass obj = new OuterClass.InnerClass();
    obj.view();
}
}