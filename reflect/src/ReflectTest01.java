public class ReflectTest01 {
    public static void main(String[] args) {
        //类路径：src下的都是类路径下
        //src是类的根路径
        // Thread.currentThread() 当前线程对象
        // getContextClassLoader() 是线程对象的方法，可以获取到当前线程的类加载器对象
        // getResoure()这是类加载器对象的方法，当前线程的类加载器默认从类的根路径下加载资源

        //可以获取到绝对路径
        String path  = Thread.currentThread().getContextClassLoader()
                .getResource("com/yiming/java11/classinfo.properties").getPath();

        ///F:/Java--/reflect/out/production/reflect/classinfo.properties
        System.out.println(path);

        String path1  = Thread.currentThread().getContextClassLoader().getResource("classinfo2.properties").getPath();
        System.out.println(path1);

    }

}