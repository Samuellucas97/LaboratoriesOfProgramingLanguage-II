
public enum SituacaoDoProduto{
  VENDIDO(0), DISPONIVEL(1);
  
  private int situacao;
  
  SituacaoDoProduto(int situacao){
    this.situacao = situacao;
  }
  
  public int getSituacao()
  {
    return situacao;
  }
  
}