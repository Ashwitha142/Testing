package test.cal.Mockito;

public class Calci {
	    private MathHelp help;

	    public Calci(MathHelp help) {
	        this.help = help;
	    }

	    public int CalculateSum(int x, int y) {
	        return help.add(x, y);
	    }

	    public static void main(String[] args) {

	        MathHelp mathHelp = new MathHelp();  
	        Calci cal = new Calci(mathHelp);      

	        System.out.println(cal.CalculateSum(9, 8));
	    }
}
