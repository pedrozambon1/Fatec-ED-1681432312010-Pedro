package conversao;

public class comIteratividade {

	public static void main(String[] args) {

		int decimal = 126;
		int selecao = 16;

		if (selecao == 2) {
			int x = 0;
			int[] binario = new int[10];

			while (decimal >= 1) {

				binario[x] = decimal % 2;

				decimal = decimal / 2;
				x++;
			}
			
			for (int i = binario.length - 1; i >= 0; i--) {
				System.out.print(binario[i]);
			}
			
		} else if (selecao == 8) {
			int x = 0;
			int[] octal = new int[10];

			while (decimal >= 1) {
				octal[x] = decimal % 8;

				decimal = decimal / 8;
				x++;
			}
			
			for (int i = octal.length - 1; i >= 0; i--) {
				System.out.print(octal[i]);
			}
			
			
		} else if (selecao == 16) {
			int x = 0;
			String[] hexa = new String[10];

			while (decimal >= 1) {
				
				int resultado = decimal % 16;
				
				switch (resultado) {
				default:
					hexa[x] = Integer.toString(resultado);
					break;
				case 10:
					hexa[x] = "A";
					break;
				case 11:
					hexa[x] = "B";
					break;
				case 12:
					hexa[x] = "C";
					break;
				case 13:
					hexa[x] = "D";
					break;
				case 14:
					hexa[x] = "E";
					break;
				case 15:
					hexa[x] = "F";
					break;
				}

				decimal = decimal / 16;

				x++;

			}
			for (int i = hexa.length - 1; i >= 0; i--) {
				if (hexa[i] != null) {
					System.out.print(hexa[i]);
				}
			}
		}
	}
}
