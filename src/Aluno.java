/**
 *
 * @author Gustavo
 */
public class Aluno {
    //Atributos da classe aluno
    //Apesar da modelagem estar com iniciais maiusculas, na programação precisa estar em minusculo
    private int RA; //Registro academico do aluno
    private double NtPrv1; //Nota prova 1
    private double NtPrv2;//Nota prova 2
    private double NtTrab1; //nota do primeiro trabalho
    private double NtTrab2; //Nota segundo trabalho
    
    //Metodos da classe Aluno
    public void setRA(int ra){
        RA = ra;
    }
    
    public void setNtPrv1(double Prv1){
        NtPrv1 = Prv1;
    }
    
    public void setNtPrv2(double Prv2){
        NtPrv2 = Prv2;
    }
    
    public void setNtTrab1(double Trab1){
        NtTrab1 = Trab1;
    }
    
    public void setNtTrab2(double Trab2){
        NtTrab2 = Trab2;
    }
    
    public double getNtPrv1(){
        return(NtPrv1);
    }
    
    public double getNtPrv2(){
        return(NtPrv2);
    }
    
    public double getNtTrab1(){
        return(NtTrab1);
    }
    
    public double getNtTrab2(){
        return(NtTrab2);
    }
    
    public double calcMediaProva(){
        return(0.75*(NtPrv1 + 2 * NtPrv2)/3);
    }
    
    public double calcMediaTrab(){
        return(0.25*(NtPrv1 + 2*NtPrv2)/3);
    }
    
    public double calcMediaFinal(){
        return(calcMediaProva() + calcMediaTrab());
    }
}
