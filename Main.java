class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.name = "George";
        parent.greeting();

        Child child = new Child();
        child.name = "David";
        child.greeting();
    }
}