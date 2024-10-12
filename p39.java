import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class p39 extends Applet {
    private MenuBar menuBar;
    private Menu fileMenu, editMenu, helpMenu;
    private MenuItem newMenuItem, openMenuItem, saveMenuItem, exitMenuItem;
    private MenuItem cutMenuItem, copyMenuItem, pasteMenuItem;
    private MenuItem findMenuItem;
    private Menu searchMenu;
    private MenuItem searchByNameMenuItem, searchByExtensionMenuItem;
    private PopupMenu popupMenu;

    public void init() {
        // Create menu bar and menus
        menuBar = new MenuBar();
        fileMenu = new Menu("File");
        editMenu = new Menu("Edit");
        helpMenu = new Menu("Help");

        // Create menu items
        newMenuItem = new MenuItem("New");
        openMenuItem = new MenuItem("Open");
        saveMenuItem = new MenuItem("Save");
        exitMenuItem = new MenuItem("Exit");
        cutMenuItem = new MenuItem("Cut");
        copyMenuItem = new MenuItem("Copy");
        pasteMenuItem = new MenuItem("Paste");
        findMenuItem = new MenuItem("Find");
        searchMenu = new Menu("Search");
        searchByNameMenuItem = new MenuItem("Search by Name");
        searchByExtensionMenuItem = new MenuItem("Search by Extension");

        // Add menu items to menus
        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);
        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);
        helpMenu.add(findMenuItem);
        findMenuItem.add(searchMenu);
        searchMenu.add(searchByNameMenuItem);
        searchMenu.add(searchByExtensionMenuItem);

        // Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Set menu bar for the applet
        setMenuBar(menuBar);

        // Create popup menu
        popupMenu = new PopupMenu();
        popupMenu.add(openMenuItem);
        popupMenu.add(saveMenuItem);

        // Add mouse listener to handle popup menu
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(p39.this, e.getX(), e.getY());
                }
            }
        });
    }
}