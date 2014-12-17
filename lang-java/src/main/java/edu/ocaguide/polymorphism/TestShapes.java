package edu.ocaguide.polymorphism;

public class TestShapes {
	public static void main(String[] args) {
		final PlayerPiece player = new PlayerPiece();
		TitlePiece title = new TitlePiece();
		Object o = player;
		final GameShape shape = new GameShape();
		
		Animatable mover = player;
		doShapes(player);
		doShapes(title);
	}

	private static void doShapes(GameShape shape) {
		shape.displayShape();
		
	}
}
