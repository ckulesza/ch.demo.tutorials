package ch.demo.rcp.intro.first.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

public class MyView extends ViewPart {

	@Override
	public void createPartControl(Composite parent) {
		Text text = new Text(parent, SWT.BORDER);
		text.setText("Ein View mit einem SWT Textelement. Die Eingaben hier "
				+ "haben keinerlei Funktion und dienen nur dem Darstellungszweck.");
	}

	@Override
	public void setFocus() {
	}
}