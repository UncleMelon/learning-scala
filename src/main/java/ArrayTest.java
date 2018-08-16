public class ArrayTest {
    public static void main(String[] args) {
        Integer[] a =  new Integer[2];
        Integer[] b = new Integer[3];
        System.out.println(a.getClass() == b.getClass());

        Integer[][] c = new Integer[2][2];
        Class cClass = c.getClass();
        System.out.println(a.getClass());
        System.out.println(cClass);
        System.out.println(a.getClass() == cClass);
        System.out.println( c[1].getClass());
        System.out.println(a.getClass() == c[1].getClass());

        Integer[][][] d = new Integer[1][2][3];
        System.out.println(d.getClass());
    }
}
