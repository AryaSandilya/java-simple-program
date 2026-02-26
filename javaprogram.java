class javaprogram {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hello, World again!");
        MyObject obj = new MyObject("This is an object message");
        System.out.println(obj);
    }
}

class MyObject {
    private String message;

    public MyObject(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MyObject: " + message;
    }
}