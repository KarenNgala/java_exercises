class Rectangle {
    public int height;
    public int width;
}

class Answer{
    public static void main(String args[]){
        Rectangle ob = new Rectangle();
        ob.height = 10;
        ob.width = 12;

        System.out.println("Area: " + (ob.height*ob.width));
        
        System.out.println("Perimeter: " + (ob.height+ob.width+ob.height+ob.width));
    }
}