package conversao;

public class comRecursividade {
	public static String binario(int numero) {
		if (numero == 0) {
			return "";
		} else {
			int conta = numero % 2;
			return (binario(numero / 2) + "" + conta);
		}

	}

	public static String octal(int numero) {
		if (numero == 0) {
			return "";
		} else {
			int conta = numero % 8;
			return (octal(numero / 8) + "" + conta);
		}

	}

	public static String hexa(int numero) {
		
		if (numero == 0) {
			return "";
		} else {
				int conta = numero % 16;
				return hexa(numero / 16) + "" +  Integer.toHexString(conta);
			}
		}

	public static void main(String[] args) {

		int decimal = 1000;
		int selecao = 16;

		if (selecao == 2) {
			System.out.print(binario(decimal));
		}

		else if (selecao == 8) {
			System.out.print(octal(decimal));
		}

		else if (selecao == 16) {
			System.out.print(hexa(decimal));
		}
	}

}
