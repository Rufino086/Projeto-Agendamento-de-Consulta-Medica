package FichaPaciente;

import java.util.Date;

public class FichaPaciente {
    protected String nomeComp;
    protected Date dataNascimento; 
    protected char sexo;
    protected String endereco;
    protected String numTelefone;
    protected String email;
    protected String rg;
    protected String cpf; 
    
    protected String nomeContatoEmergencia;
    protected String numContatoEmergencia;
    protected String parentescoContatoEmergencia;
    protected String motivo;


    public FichaPaciente(String nomeComp, Date dataNascimento, char sexo, String endereco,
                         String numTelefone, String email, String rg, String cpf,
                         String nomeContatoEmergencia, String numContatoEmergencia,
                         String parentescoContatoEmergencia, String motivo) {
        this.nomeComp = nomeComp;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.endereco = endereco;
        this.numTelefone = numTelefone;
        this.email = email;
        this.rg = rg;
        this.cpf = cpf;
        this.nomeContatoEmergencia = nomeContatoEmergencia;
        this.numContatoEmergencia = numContatoEmergencia;
        this.parentescoContatoEmergencia = parentescoContatoEmergencia;
        this.motivo = motivo;
    }

    
    public void exibirInformacoes() {
    	System.out.println("\n\n======== Informa��es do Paciente ========\n");
        System.out.println("| Nome: " + nomeComp);
        System.out.println("| Data de Nascimento: " + dataNascimento);
        System.out.println("| Sexo: " + sexo);
        System.out.println("| Endere�o: " + endereco);
        System.out.println("| Telefone: " + numTelefone);
        System.out.println("| Email: " + email);
        System.out.println("| RG: " + rg);
        System.out.println("| CPF: " + cpf);
        System.out.println("| Contato de Emerg�ncia: " + nomeContatoEmergencia);
        System.out.println("| Telefone do Contato: " + numContatoEmergencia);
        System.out.println("| Parentesco: " + parentescoContatoEmergencia);
        System.out.println("| Motivo da Consulta: " + motivo);
        System.out.println("\n=============================================");
    }
}