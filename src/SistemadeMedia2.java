public class SistemadeMedia2 {
    public static void main(String[] args) {
        String sigla = "M";
        switch (sigla) {
            case "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MEDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            case "B": {
                System.out.println("MANUEL BORGES");
                break;
            }
            default:
                System.out.println("INDEFINIDO");

        }
    }
}
