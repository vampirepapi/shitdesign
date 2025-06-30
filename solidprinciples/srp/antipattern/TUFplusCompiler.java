//AntiPattern: One class doing multiple things
package antipattern;

class TUFplusCompiler {

    public void addDriverCode() {
        System.out.println("Driver code added");
    }

    public void checkSyntax() {
        System.out.println("Syntax checked");
    }

    public void runTestCases() {
        System.out.println("Test cases run");
    }

    public void saveOutputToDatabase() {
        System.out.println("Output saved to database");
    }

    public void returnOutputToUser() {
        System.out.println("Output returned to user");
    }
}
