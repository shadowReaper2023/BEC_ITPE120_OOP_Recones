public class StaticDemo {
    private static int instanceCount = 0;

    public StaticDemo() {
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();

        System.out.println("Instance count: " + StaticDemo.getInstanceCount());
    }
}