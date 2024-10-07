public class Rectangle {

    int length, width;

    void insert(int i, int w){
        length = i;
        width = w;
    }

    void calculateArea()
    {
        System.out.println(length*width);
    }

}