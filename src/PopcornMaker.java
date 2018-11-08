import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("What flavor of popcorn do you want?");
		Popcorn popcorn = new Popcorn(flavor);
		
		String Minutes = JOptionPane.showInputDialog("Now, how many minutes should it be cooked for?");
		int cookTimeInMinutes = Integer.parseInt(Minutes);
		Microwave microwave = new Microwave();
		microwave.setTime(cookTimeInMinutes);
		microwave.putInMicrowave(popcorn);
		microwave.startMicrowave();
	}
}
