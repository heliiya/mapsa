package ir.mapsa.exercise.services;

import ir.mapsa.exercise.model.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class RegisterService {

    private ArrayList<User> users;

    public RegisterService() {
        this.users = new ArrayList<>();

        File file = new File("D:/mapsa/Spring1/projects/cis/lab-work/lab-javaee-001/users.txt");
        if(file.exists()){
            try {
                Scanner sc = new Scanner(file);
                while(sc.hasNext()){
                    String line = sc.nextLine();
                    if("#".equals(line))
                        break;
                    String username = line.substring(0, line.indexOf("-"));
                    String password = line.substring(line.indexOf("-")+1);
                    users.add(new User(username, password));
                }
                sc.close();
            } catch (FileNotFoundException e) {
                System.err.println("File not found.");
            }
        }
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void addUser(User newUser) {
        try {
            File file = new File("D:/mapsa/Spring1/projects/cis/lab-work/lab-javaee-001/users.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            StringBuilder sb = new StringBuilder();
            if(users != null && !users.isEmpty()){
                for (User user : users){
                    sb.append(user.getUsername()
                            + "-" + user.getPassword()
                            + System.getProperty("line.separator"));
                }
            }
            sb.append(newUser.getUsername()
                    + "-" + newUser.getPassword()
                    + System.getProperty("line.separator"));
            sb.append("#");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(sb.toString());
            fileWriter.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        } catch (IOException e) {
            System.err.println("File could'nt created.");
        }
    }

    public boolean hasUser(User newUser){
        if(users != null && !users.isEmpty()){
            for(User user : users){
                if(user.getPassword().equals(newUser.getPassword()) &&
                        user.getUsername().equals(newUser.getUsername())){
                    return true;
                }
            }
        }
        return false;
    }
}