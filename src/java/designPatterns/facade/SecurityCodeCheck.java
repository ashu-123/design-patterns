package facade;

public class SecurityCodeCheck {

    private int securityCheckCode = 1234;

    public int getSecurityCheckCode() {
        return securityCheckCode;
    }

    public boolean isSecurityCheckCodeCorrect(int codeToCheck) { return this.securityCheckCode==codeToCheck;}
}
