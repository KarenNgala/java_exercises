class Constructor {
    public int x;
    public int y;

    //constructor
    Constructor(int a, int b) {
        x = a;
        y = b;
    }

    public static void main(String args[]){
        Constructor ob = new Constructor(4, 5);
        System.out.println(ob.x);
    }
  
}
