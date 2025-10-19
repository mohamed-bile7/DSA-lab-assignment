public class Main {
    public static void main(String[] args) {
        BATMAN<Integer> b1 = new BATMAN<>();
        b1.push(1);
        b1.push(2);
        b1.push(3);
        b1.push(4);
        b1.push(5);
        b1.showStack();
        System.out.println("isEmpty method: "+ b1.isEmpty());
        int removedStack = b1.pop();
        System.out.println("Removed element: "+removedStack);
        System.out.println("peek method: "+ b1.peek());
        System.out.println("size method: "+ b1.size());
        System.out.println();
        System.out.println("---Final Display---");
        b1.showStack();
    }
}
