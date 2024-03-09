package Controller;

import Model.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class EmployeeManagement {
    public ArrayList<Employee> employees = new ArrayList<>();
//    public void readFile(){
//        String filePath = "C:/Users/PC/Desktop/card.txt";
//        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
//            String line;
//            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//            while ((line = br.readLine()) != null) {
//                String[] tokens = line.split(",");
//                int cardType = Integer.parseInt(tokens[3]);
//                try {
//                    Date dateRelease = dateFormat.parse(tokens[2]);
//                    switch(cardType){
//                        case 1:
//                            Date creditDateValid = dateFormat.parse(tokens[4]);
//                            double amountDue = Double.parseDouble(tokens[5]);
//                            double amountMax = Double.parseDouble(tokens[6]);
//                            CreditCard creditCard = new CreditCard(tokens[0],tokens[1],dateRelease,cardType,creditDateValid,amountDue,amountMax);
//                            cardList.add(creditCard);
//                            break;
//                        case 2:
//                            Date debitDateValid = dateFormat.parse(tokens[4]);
//                            double amountRemain = Double.parseDouble(tokens[5]);
//                            DebitCard debitCard = new DebitCard(tokens[0],tokens[1],dateRelease,cardType,debitDateValid,amountRemain);
//                            cardList.add(debitCard);
//                            break;
//                        case 3:
//                            double amount = Double.parseDouble(tokens[4]);
//                            AtmCard atmCard = new AtmCard(tokens[0],tokens[1],dateRelease,cardType,amount);
//                            cardList.add(atmCard);
//                            break;
//                    }
//                } catch (ParseException e) {
//                    e.printStackTrace();
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
