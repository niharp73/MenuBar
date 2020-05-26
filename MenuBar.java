import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MenuBar  extends Frame {

	public MenuBar() {
		
		setVisible(true);
		setSize(500,500);
		setLayout(null);
		
		MenuBar a = new MenuBar();
		setMenuBar(a);
		
		Menu b = new Menu("File");
		a.add(b);
		Menu c = new Menu("New");
		b.add(c);
		b.addSeparator();
		MenuItem i = new MenuItem("Save");
		c.add(i);
		MenuItem j = new MenuItem("Exit");
		b.add(j);
		
		Menu e = new Menu("Edit");
		a.add(e);
		MenuItem f = new MenuItem("Undo");
		b.add(f);
		MenuItem k = new MenuItem("Paste");
		e.add(k);
		MenuItem l = new MenuItem("Copy");
		e.add(l);
		
		Menu g = new Menu("View");
		a.add(g);
		MenuItem h = new MenuItem("Editors");
		g.add(h);
		MenuItem m = new MenuItem("Split");
		g.add(m);
		MenuItem n = new MenuItem("Toolbars");
		g.add(n);
		
		addWindowListener(new Window Adapter){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		MenuBar ob = new MenuBar();
	}
}
