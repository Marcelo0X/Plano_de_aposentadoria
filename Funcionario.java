public class Funcionario{

    private int codigo;
    private int nascimento;
    private int admissao;
    private int anoAtual;

    public Funcionario(int codigo, int nascimento, int admissao, int anoAtual){
	setCodigo(codigo);
	setNascimento(nascimento);
	setAdmissao(admissao);
	setAnoAtual(anoAtual);
    }
    public void setCodigo(int codigo){
	this.codigo = codigo;
    }
    public int getCodigo(){
	return codigo;
    }
    public void setNascimento(int nascimento){
	this.nascimento = nascimento;
    }
    public int getNascimento(){
	return nascimento;
    }
    public void setAdmissao(int admissao){
	this.admissao = admissao;
    }
    public int getAdmissao(){
	return admissao;
    }
    public void setAnoAtual(int anoAtual){
	this.anoAtual = anoAtual;
    }
    public int getAnoAtual(){
	return anoAtual;
    }
    public String pedidoAposentadoria(int idade, int tempo){
	if(anoAtual >= nascimento && nascimento < admissao){
	    idade = anoAtual - nascimento;
	    System.out.println("Idade "+idade);
	    tempo = anoAtual - admissao;
	    System.out.println("Tempo de serviço "+tempo+" anos");
	}
	if(idade >= 65 || tempo >= 30 || (idade >= 60 && tempo >= 25)){
	    return "Requerer aposentadoria";
	}else{
	    return "Não requerer";
	}
    }

}
