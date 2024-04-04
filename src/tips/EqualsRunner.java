package tips;

import java.util.Objects;

class Client{
    private int id;

    public Client(int id){
        super();
        this.id = id;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Client client = (Client) that;
        return id == client.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
public class EqualsRunner {
    public static void main(String[] args) {
        Client c1 = new Client(1);
        Client c2 = new Client(1);
        Client c3 = new Client(2);

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
    }
}
