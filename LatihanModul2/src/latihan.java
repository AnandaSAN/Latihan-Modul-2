import java.util.LinkedList;

public class latihan
{
    public static void main(String[] args) {

        LinkedList<String> hewan = new LinkedList<>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");

        System.out.println("Hewan: "+hewan);

        LinkedList<String> Delete = new LinkedList<>();
        Delete.add("Kelinci");
        Delete.add("Kambing");
        Delete.add("Unta");

        System.out.println("Hewan yang dihapus : \n"+Delete);

        hewan.removeAll(Delete);

        System.out.println("Output Hewan : \n"+hewan);
    }
}