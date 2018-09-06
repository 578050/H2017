package no.hvl.dat100;



import easygraphics.*;

public class Husrekke extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}

	public void run() {
		makeWindow("Husrekke");

		tegnHusrekke(5, 20, 200, 60, 40, 10);
	}

	private void tegnHusrekke(int antallHus, int startX, int startY, int bredde, int h�yde, int avstand) {
		for (int husNr = 1; husNr <= antallHus; husNr++) {
			tegnHus(startX, startY, bredde, h�yde);
			startX = startX + bredde + avstand;
		}
	}

	private void tegnHus(int x, int y, int bredde, int h�yde) {
		int veggTopp = y - h�yde / 2;
		drawRectangle(x, veggTopp, bredde, h�yde / 2);
		tegnTrekant(x, veggTopp, bredde, h�yde / 2);
	}

	private void tegnTrekant(int x, int y, int bredde, int h�yde) {
		drawLine(x, y, x + bredde, y);
		drawLine(x + bredde, y, x + bredde / 2, y - h�yde);
		drawLine(x + bredde / 2, y - h�yde, x, y);
	}

}
