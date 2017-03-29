package in.jaikish.playingcard;
public enum Shape {
	CLUB(Color.BLACK), SPADE(Color.RED), DIAMOND(Color.RED), HEART(Color.RED);
	private final Color color;
	private Shape(Color color){
		this.color = color;
	}
	public Color getColor() {
		return color;
	} 

}