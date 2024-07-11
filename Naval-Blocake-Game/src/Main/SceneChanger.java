package Main;

public class SceneChanger {

	GameManager gm;
	
	public SceneChanger(GameManager gm) {
		this.gm = gm;
		
	}
	public void showScreen1() {
		gm.ui.bgPanel.setVisible(true);
		
	}

}
