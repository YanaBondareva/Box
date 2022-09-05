public class Main {
    public static void main(String[] args) throws RuntimeException {
        MagicBox box1 = new MagicBox<Integer>(5);
        System.out.println(box1.add(2));
        box1.add(2);
        box1.add(3);
        System.out.println(box1.add(5));
        box1.add(7);
        box1.add(2);
        System.out.println(box1.add(4));
        System.out.println(box1.pick());
        MagicBox box2 = new MagicBox<String>(5);
        System.out.println(box2.add("r"));
        box2.add("ji");
        box2.add("jo");
        System.out.println(box2.add("oi"));
        box2.add("ghjf");
        box2.add("lkm");
        System.out.println(box2.add("la"));
        System.out.println(box2.pick());

    }

}
