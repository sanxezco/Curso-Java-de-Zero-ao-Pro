package fundamentos;

public class EqualsHashCode
{
    public static void main(String[] args)
    {
        Usuario u1 = new Usuario();
        u1.nome = "Rances";
        u1.email = "rances@email.com";

        Usuario u2 = new Usuario();
        u2.nome = "Rances";
        u2.email = "rances@email.com";

        System.out.println(u1.equals(u2));
        System.out.println(u1 == u2);
        System.out.println(u2.equals(u1));

        
    }
    
}
