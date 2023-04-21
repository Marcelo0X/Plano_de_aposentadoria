import java.util.Scanner;

public class FuncionarioTest{

    static Scanner fun = new Scanner(System.in);

    public static void main(String args[]){
	requerimento();
    }
    public static void requerimento(){
	int temp = 0, ida = 0;
	try{
	    System.out.print("Codigo ");
	    int cod = fun.nextInt();
	    System.out.print("Nascimento ");
	    int nasc = fun.nextInt();
	    System.out.print("Admissão ");
	    int adm = fun.nextInt();
	    System.out.print("Ano atual ");
	    int ano = fun.nextInt();
	    Funcionario funcionario = new Funcionario(cod, nasc, adm, ano);
	    System.out.println(funcionario.pedidoAposentadoria(ida, temp));
	}catch(Exception s){
	    System.out.println(s);
	    fun.nextLine();
	}
    }

}
