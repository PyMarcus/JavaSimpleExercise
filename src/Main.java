import javax.swing.JOptionPane;


class Main{
    public static void main(String[] args){
        int value;
        int value1 = 0, value2 = 0, value3 = 0, value4 = 0,value5 = 0, value6 = 0;
        String output = " ";
        for(int counter = 1; counter <= 60; counter++){  // como são aleatórios, 60 vezes, cada n[úmero deve aparecer +- 10 x
            // escolhe número aleatório de 1 a 6
            value = 1 + (int) (Math.random() * 6); // o retorno de random é double + o 1 é para não pegar o zero
            switch(value){
                case 1:
                    value1++;
                    break;
                case 2:
                    value2 ++;
                    break;
                 case 3:
                    value3 ++;
                    break;
                  case 4:
                    value4++;
                    break;
                   case 5:
                    value5++;
                    break;
                    
                    case 6:
                    value6++;
                    break;
            }
            output += value;
            if (counter % 5 == 0){
                output += '\n'; // para pular no intervalo de 6 lances
            }
            
            
        }
        JOptionPane.showMessageDialog(null, output);
        JOptionPane.showMessageDialog(null, "Frequência:\n"+"1: "+value1+"\n"+"2: "+value2+"\n"+"3: "+value3+"\n"+"4: "+value4+"\n"+"5: "+value5+"\n"+"6: "+value6+"\n");
        System.exit(0);
    }
}