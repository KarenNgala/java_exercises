class Add{
    void add(int a , int b){
        System.out.println (a + b);
    }
    void add(int a , int b , int c){
        System.out.println(a + b + c) ;
    }
    void add(double a , double b){
        System.out.println(a + b);
    }
    public static void main( String args[]){
        Add ob = new Add();
        ob.add(15,25);
        ob.add(15,25,35);
        ob.add(11.5 , 22.5);
    }
    }