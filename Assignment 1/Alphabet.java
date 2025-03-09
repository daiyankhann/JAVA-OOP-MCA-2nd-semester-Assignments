class A {
    void DA() {
        System.out.println("Alphabets from A to Z :");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
    }
}

class A {
    public static void main(String[] args) {
        Alphabets obj = new Alphabets();
        obj.DA();
    }
}
