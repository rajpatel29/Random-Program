package aa;

import java.lang.reflect.Field;

class MainClass2 {
    private final Character m_value = 'a';
    
    public String toString() { return "" + m_value; }

    public static void main(String[] args) {
        try {
            Field f = MainClass2.class.getDeclaredField("m_value");
            f.setAccessible(true);
            MainClass2 a = new MainClass2();
            f.set(a, (char) 'b' );
            System.out.println(a);
        } catch (Exception e) {    
            e.printStackTrace();
        }
    }
}
