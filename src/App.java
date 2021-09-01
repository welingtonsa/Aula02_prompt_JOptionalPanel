/*
IFTM 01/09/2021
Analise e Desenvolvimento de Sistemas
Professor: Andre Luiz
Aluno: Welington da Silva Araujo

Faça uma programa que receba via teclado os dados de um produto,
os dados que representam o produto estão listados abaixo:

Nome(String);
Modelo(String);
tamanho(sendo float);
preço (sendo double);
Quantidade(int).

O programa deve a implementar a entrada de dados via
console (Através do Scanner) e via interface utilizando 
janelas(JOptionPane.showInputDialog);

O programa deve imprimir os valores armazenados em
cada variável acima via console e utilizando janelas 
(JOptionPane.showMessageDialog).
*/

/* Classes pre definadas/pacotes**************************/
import java.util.Scanner;
import javax.swing.JOptionPane;

/* Classe do programa Principal******************************/
public class App {
    public static void main(String[] args) throws Exception {
        
        /*Variaveis do sistema*******************************/
        Scanner scanIn = new Scanner(System.in);
        String  nomeProduto;
        String  nomeModelo;
        float   volumeProduto; 
        double  precoProduto;
        int     qtdProduto;

        /*Recebendo dados do usuario atravez do prompt*******
        **Os dados podem ser inseridos com (,)***************/
        System.out.println("Inserção de dados via prompt(cmd/terminal).");
        System.out.println("Insira nome do Produto:");
        nomeProduto = scanIn.next();
        System.out.println("Insira nome do Modelo");
        nomeModelo = scanIn.next();
        System.out.println("Insira Volume:");
        volumeProduto = scanIn.nextFloat();
        System.out.println("Insira Preço:");
        precoProduto = scanIn.nextDouble();
        System.out.println("Insira Quantidade do Produto:");
        qtdProduto = scanIn.nextInt();

        
        /*Imprimindo no prompt dados do produto*************/
        System.out.println("Lista de Produtos:");
        System.out.println("Produto:.........." + nomeProduto);
        System.out.println("Modelo:..........." + nomeModelo);
        System.out.println("Volume:..........." + volumeProduto);
        System.out.println("Preço:............" + precoProduto);
        System.out.println("Quantidade:......." + qtdProduto);

        /*Recebendo dados do usuario atravez da interface*****
        **Float, Double, e Integer precisar ser convertidos*** 
        **pois showInputDialog recebe uma String. ************/
        JOptionPane.showMessageDialog(null,"Inserção de dados via Interface Grafica.");
        nomeProduto      = JOptionPane.showInputDialog("Insira nome do Produto:");
        nomeModelo       = JOptionPane.showInputDialog("Insira nome do Modelo:");
        volumeProduto    = Float.parseFloat(JOptionPane.showInputDialog("Insira Volume:"));
        precoProduto     = Double.parseDouble(JOptionPane.showInputDialog("Insira Valor:"));
        qtdProduto       = Integer.parseInt(JOptionPane.showInputDialog("Insira Quantidade:"));
        
        /*Imprimindo dados dos usuario atravez da interface grafica*/
        JOptionPane.showMessageDialog(null, "Produto : ......... " + nomeProduto + 
                                           "\nModelo : ........... " + nomeModelo +
                                           "\nVolume : .......... " +  volumeProduto  + " Kg/L" +
                                           "\nPreço  : ............ " + precoProduto  + " R$" +
                                           "\nQuantidade : ..." + qtdProduto,"Lista de Produtos:",JOptionPane.INFORMATION_MESSAGE);
    }
}
