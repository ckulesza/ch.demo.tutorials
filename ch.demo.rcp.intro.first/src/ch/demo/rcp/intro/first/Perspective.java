package ch.demo.rcp.intro.first;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		// Statt über das Plugin, kann man die View über Code der Perspective
		// zuweisen, wird bevorzugt behandelt, falls beides vorhanden ist
		// layout.addView("ch.demo.rcp.intro.first.myview", IPageLayout.RIGHT,
		// IPageLayout.RATIO_MAX, IPageLayout.ID_EDITOR_AREA);
	}
}
