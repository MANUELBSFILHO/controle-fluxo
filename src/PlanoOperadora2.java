public class PlanoOperadora2 {
    public static void main(String[] args) {
        String plano = "M"; // M / T

        switch (plano) {
            case "T": {
                System.out.println("5GB Youtube");
            }
            case "M": {
                System.out.println("whatsapp e Instagram gratis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }

}
