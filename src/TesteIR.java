public class TesteIR {

	public static void main(String[] args) {
		
		
		double salario = 2000;
		double imposto;
		double deducao;
		
		if(1900.0 < salario && salario <= 2800.0) {
			imposto = salario*0.075;
			deducao = 142.0;
			System.out.println("Imposto = " + imposto + "\n" + "Deducção = " + deducao);
		}
		else if (2800.01 < salario && salario <= 3751.0 ) {
			imposto = salario*0.15;
			deducao = 350.0;
			System.out.println("Imposto = " + imposto + "\n" + "Deducção = " + deducao);
		}
		else{
			imposto = salario*0.225;
			deducao = 636;
			System.out.println("Imposto = " + imposto + "\n" + "Deducção = " + deducao);
		}
		
	}

}
