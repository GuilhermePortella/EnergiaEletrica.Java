package energiaeletrica;
import javax.swing.JOptionPane;
public class Energia {
public static void main(String[] args) {          
    String numero;
    numero = JOptionPane.showInputDialog(null, "Digite seu consumo em KWH: ","Energia Eletrica", JOptionPane.INFORMATION_MESSAGE);
    int num = Integer.parseInt(numero);
    EnergiaEletrica energia1 = new EnergiaEletrica(num);
    JOptionPane.showMessageDialog(
            null,
            "Energia Eletrica  " + 
            "\nFornecimento: " + energia1.getFornecimento() +
            "\nIcms: " + energia1.getIcms()+
            "\nConfins: "+energia1.getConfins()+
            "\nPispasesp: "+energia1.getIcmspispasesp()+
            "\nFatura: " + energia1.getFatura());
    }
}
