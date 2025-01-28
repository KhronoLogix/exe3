import java.util.Scanner;
//Dominic Cruz /  1/28/2025 / EXE3
// KILLORAN PLEASEEEE GIVE US ROBLOX ON THE PCS!!!!!!!
public class Main {
    // KILLORAN PLEASEEEE GIVE US ROBLOX ON THE PCS!!!!!!!
    public static void main(String[] args) {
        int quit = 0;
        // KILLORAN PLEASEEEE GIVE US ROBLOX ON THE PCS!!!!!!!
        while (quit == 0) {
            int userTemp = userInput();
            int newTemp = tempCalc(userTemp);
            if (userTemp < -460) {
                // KILLORAN PLEASEEEE GIVE US ROBLOX ON THE PCS!!!!!!!
                quit = 1;
            } else {
                display(userTemp, newTemp);
            }
            // KILLORAN PLEASEEEE GIVE US ROBLOX ON THE PCS!!!!!!!
        }
        System.out.println("YOOOU'RE DONE. Goodbye!");
    }
    // KILLORAN PLEASEEEE GIVE US ROBLOX ON THE PCS!!!!!!!
    static int userInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a temperature in Fahrenheit:");
        System.out.println("Input a number less than -460 to stop the program.");
        return input.nextInt();
    }// KILLORAN PLEASEEEE GIVE US ROBLOX ON THE PCS!!!!!!!

    static int tempCalc(int userTemp) {
        int newTemp =  (userTemp - 32) * 5 / 9;
        return newTemp;
    }
    // KILLORAN PLEASEEEE GIVE US ROBLOX ON THE PCS!!!!!!!
    static void display(int userTemp, int newTemp) {
        System.out.println("The temperature " + userTemp + "°F in Celsius is: " + newTemp + "°C.");
    }// KILLORAN PLEASEEEE GIVE US ROBLOX ON THE PCS!!!!!!!
}
// KILLORAN PLEASEEEE GIVE US ROBLOX ON THE PCS!!!!!!!
// KILLORAN PLEASEEEE GIVE US ROBLOX ON THE PCS!!!!!!!
// KILLORAN PLEASEEEE GIVE US ROBLOX ON THE PCS!!!!!!!
// KILLORAN PLEASEEEE GIVE US ROBLOX ON THE PCS!!!!!!!
// KILLORAN PLEASEEEE GIVE US ROBLOX ON THE PCS!!!!!!!
// KILLORAN PLEASEEEE GIVE US ROBLOX ON THE PCS!!!!!!!
// KILLORAN PLEASEEEE GIVE US ROBLOX ON THE PCS!!!!!!!
// KILLORAN PLEASEEEE GIVE US ROBLOX ON THE PCS!!!!!!!
// KILLORAN PLEASEEEE GIVE US ROBLOX ON THE PCS!!!!!!!
// KILLORAN PLEASEEEE GIVE US ROBLOX ON THE PCS!!!!!!!
// KILLORAN PLEASEEEE GIVE US ROBLOX ON THE PCS!!!!!!!
// KILLORAN PLEASEEEE GIVE US ROBLOX ON THE PCS!!!!!!!