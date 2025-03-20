package _8_java8_features;

public class Demo6 {
    public static void main(String[] args) {
        interface UserService{
            void login();

            default void logout(){
                System.out.println("You are logged out. default implementation for all subclass");
            }
        }

        class Authentication implements UserService{
            public void login() {
                System.out.println("Login using username password");
            }
        }

        class OtpService implements UserService{
            public void login() {
                System.out.println("Login using otp");
            }
        }

        class TokenService implements UserService{
            public void login() {
                System.out.println("Login using token");
            }

            @Override
            public void logout() {
                System.out.println("logout using token");
            }
        }


        UserService authentication = new Authentication();
        UserService otpService = new OtpService();
        UserService tokenService = new TokenService();

        authentication.login();
        otpService.login();
        tokenService.login();

        authentication.logout();
        otpService.logout();
        tokenService.logout();
    }
}
