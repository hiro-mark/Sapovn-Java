public class SRPFix {
    public static void main(String[] args) {
        class User {
            String email;
            void changeEmail(String e) {
                email = e;
            }
        }
        class UserRepository {
            void saveToRepo(User user) {
                System.out.println("Saving user with email: " + user.email + "...");
            }
        }
        class EmailService {
            void sendEmail(User user) {
                System.out.println("Sending email to " + user.email + "...");
            }
        }
    }
}
