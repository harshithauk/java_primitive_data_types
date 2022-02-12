public class main {
    public static void main(String[] args){
        System.out.println("Primitive data types");
        long l = 5000000000l; // 8bytes
        int i=5; // 4bytes = 32bits
        short s = 5; //2 bytes-> 16 bits -> -32768 to 32767
        byte b = 5; // 1byte -> 8bits -> -128 to 127

        float f = 5.5f;
        double d = 5.5;

        char c = 'A';
        c = 66; //stored as ASCII value
        System.out.println(c);

        double d1= 5; //implicit conversion  from int to double
        int k = (int)5.8;//explicit type conversion
    }
}

