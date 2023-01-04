public class Main {
    public static void main(String[] args) {

        int codigoProduto = 3;

        switch(codigoProduto) {
            case 1:
                System.out.println("Coca-Cola");
                break;
            case 2:
                System.out.println("Fanta Laranja");
                break;
            case 3:
                System.out.println("Agua mineral");
                break;
            default:
                System.out.println("Código de Barras não cadastrado");
                break;
        }
    }
}