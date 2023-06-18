public class App
{
    static public void main (String[] argv)
    {
        HomeApp qwerty = new HomeApp();
        System.out.println(qwerty.getString());
        System.out.println("повернене значення: " + qwerty.mom);
    }
}
