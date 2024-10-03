package Cliente;

import java.util.Date;

public class cliente {

  public enum TipoDocumento {
    CPF, RG, CNH, PASSAPORTE;
  }

  // Atributos
  private int IdCliente;
  private String NomeCliente;
  private static TipoDocumento old_Tipo_documento;
  private int Cod_Docum;
  private int RgCliente;
  private String Endereco;
  private String Bairro;
  private String Cidade;
  private String Estado;
  private String Cep;
  private int Ddd_Res;
  private String Tel_Res;
  private int Ddd_Com;
  private String Tel_Com;
  private int Ddd_Cel;
  private String Tel_Cel;
  private String Email;
  private int StatusCliente;
  private Date DataCadCliente;

  
  // Constructor
  
  cliente(int IdCliente, String NomeCliente, TipoDocumento old_Tipo_documento, int Cod_Docum, int RgCliente,
		  String Endereco, String Bairro, String Cidade, String Estado, String Cep, int Ddd_Res, String Tel_Res,
		  int Ddd_Com, String Tel_Com,int Ddd_Cel, String Tel_Cel, String Email, int StatusCliente, Date DataCadCliente){
	  this.IdCliente = IdCliente;
      this.NomeCliente = NomeCliente;
      cliente.old_Tipo_documento = old_Tipo_documento;
      this.Cod_Docum = Cod_Docum;
      this.RgCliente = RgCliente;
      this.Endereco = Endereco;
      this.Bairro = Bairro;
      this.Cidade = Cidade;
      this.Estado = Estado;
      this.Cep = Cep;
      this.Ddd_Res =Ddd_Res;
      this.Tel_Res = Tel_Res;
      this.Ddd_Com = Ddd_Com;
      this.Tel_Com = Tel_Com;
      this.Ddd_Cel = Ddd_Cel;
      this.Tel_Cel = Tel_Cel;
      this.Email = Email;
      this.StatusCliente = StatusCliente;
      this.DataCadCliente = DataCadCliente;
  }
      
  public cliente(String string) {
	// TODO Auto-generated constructor stub
}

// getter´s e setter´s

  //  idcliente
  public int getIdCliente() {
    return IdCliente;
  }

  public void setIdCliente(int IdCliente) {
    this.IdCliente = IdCliente;
  }

  // nomecliente
  public String getNomeCliente() {
    return NomeCliente;
  }

  public void setNomeCliente(String NomeCliente) {
    this.NomeCliente = NomeCliente;
  }

  //  old_Tipo_documento
  public TipoDocumento getold_Tipo_documento() {
    return old_Tipo_documento;
  }

  public void setold_Tipo_documento(TipoDocumento old_Tipo_documento) {
    cliente.old_Tipo_documento = old_Tipo_documento;
  }

  //  cod_docum
  public int getCod_Docum() {
    return Cod_Docum;
  }

  public void setCod_Docum(int Cod_Docum) {
    this.Cod_Docum = Cod_Docum;
  }

  //  Rg_cliente
  public int getRgCliente() {
    return RgCliente;
  }

  public void setRgCliente(int RgCliente) {
    this.RgCliente = RgCliente;
  }

  //  Endereço
  public String getEndereco() {
    return Endereco;
  }

  public void setEndereco(String Endereco) {
    this.Endereco = Endereco;
  }

  //  Bairro
  public String getBairro() {
    return Bairro;
  }

  public void setBairro(String Bairro) {
    this.Bairro = Bairro;
  }

  //  Cidade
  public String getCidade() {
    return Cidade;
  }

  public void setCidade(String Cidade) {
    this.Cidade = Cidade;
  }

  //  Estado
  public String getEstado() {
    return Estado;
  }

  public void setEstado(String Estado) {
    this.Estado = Estado;
  }

  //  Cep
  public String getCep() {
    return Cep;
  }

  public void setCep(String Cep) {
    this.Cep = Cep;
  }

  //  ddd_res
  public int getDdd_Res() {
    return Ddd_Res;
  }

  public void setDdd_res(int Ddd_Res) {
    this.Ddd_Res = Ddd_Res;
  }

  //  tel_res
  public String geTel_Res() {
    return Tel_Res;
  }

  public void setTel_Res(String Tel_Res) {
    this.Tel_Res = Tel_Res;
  }

  // ddd_com
  public int getDdd_Com() {
    return Ddd_Com;
  }

  public void setDdd_Com(int Ddd_Com) {
    this.Ddd_Com = Ddd_Com;
  }

  // tel_com
  public String getTel_Com() {
    return Tel_Com;
  }

  public void setTel_Com(String Tel_Com) {
    this.Tel_Com = Tel_Com;
  }

  // ddd_cel
  public int getDdd_Cel() {
    return Ddd_Cel;
  }

  public void setDdd_Cel(int Ddd_Cel) {
    this.Ddd_Cel = Ddd_Cel;
  }

  // tel_cel
  public String getTel_Cel() {
    return Tel_Cel;
  }

  public void setTel_Cel(String Tel_Cel) {
    this.Tel_Cel = Tel_Cel;
  }

  // email
  public String getEmail() {
    return Email;
  }

  public void setEmail(String Email) {
    this.Email = Email;
  }

  // statusCliente
  public int getStatusCliente() {
    return StatusCliente;
  }

  public void setStatusCliente(int StatusCliente) {
    this.StatusCliente = StatusCliente;
  }

  // DataCadCliente
  public Date getDataCadCliente() {
    return DataCadCliente;
  }

  public void setDataCadCliente(Date DataCadCliente) {
    this.DataCadCliente = DataCadCliente;
  }

  // Métodos

  // Efetuar pedido
  public void efetuaPedido() {
    System.out.println(NomeCliente + " efetuou um pedido.");
  }

  // Efetuar pagamento
  public void efetuaPagamento() {
    System.out.println(NomeCliente + " efetuou o pagamento.");
  }

  // Cadastrar cliente
  public void cadastraCliente() {
    System.out.println(NomeCliente + " foi cadastrado(a) com sucesso.");
  }

  // Excluir cliente
  public void excluiCliente() {
    System.out.println("O cadastro de " + NomeCliente + " foi excluído com sucesso.");
  }

  // Alteração de dados
  public void alteraDados() {
    System.out.println("Os dados de cadastro de " + NomeCliente + " foram alterados com sucesso.");
  }

  // Consulta de dados
  public void consultaDados() {
    System.out.println("Os dados de " + NomeCliente + " são: RG nº " + RgCliente + " / " +
        " Endereço: " + Endereco + " - " + Bairro + ", " + Cidade +
        " - " + Estado + " / " + "CEP: " + Cep + " / " +
        "Tel. Cel: " + Tel_Cel);
  }
  public static void main(String[] args) {
    // Corrigido o nome da classe Cliente
    cliente Paulo = new cliente ("Paulo");

    // Correção nos métodos setters
    Paulo.setNomeCliente("Paulo Saturnino");
    Paulo.setIdCliente(1);
    Paulo.setRgCliente(346600619);
    Paulo.setEndereco("Rua  Joaquim de Castro, 58");
    Paulo.setBairro("Jardim Macedo");
    Paulo.setCidade("São Paulo");
    Paulo.setEstado("SP");
    Paulo.setCep("07140-080");
    Paulo.setDdd_Cel(11);
    Paulo.setTel_Cel("988240540");

    // Exibindo a inclusão do cliente
    System.out.println("Inclui o cliente: " + Paulo.getNomeCliente() + ". ");

    // Chamadas de métodos corrigidos
    Paulo.cadastraCliente();
    Paulo.efetuaPedido();
    Paulo.efetuaPagamento();
    Paulo.alteraDados();
    Paulo.consultaDados();
    Paulo.excluiCliente();

    System.out.println("================");
  }
}