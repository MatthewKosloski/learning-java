//********************************************************************
// RestaurantPanel.java
//
// Programming Project 7.14 on page 402.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.ArrayList;

public class RestaurantPanel extends JPanel {

	private JLabel totalLabel;
	private int total = 0;

	public RestaurantPanel() {
		setLayout(new BorderLayout());

		JPanel pizzasPanel = new JPanel();
		JPanel beveragesPanel = new JPanel();
		JPanel specialsPanel = new JPanel();
		pizzasPanel.setLayout(new GridLayout(3, 0));
		beveragesPanel.setLayout(new GridLayout(3, 0));
		specialsPanel.setLayout(new GridLayout(3, 0));

		ArrayList<String> quantities = new ArrayList<String>();
		quantities.add("zero");
		quantities.add("one");
		quantities.add("two");

		ArrayList<String> sizes = new ArrayList<String>();
		sizes.add("small");
		sizes.add("medium");
		sizes.add("large");

		Food[] pizzas = {
			new Food("Cheese", 8.00, quantities, sizes),
			new Food("Pepperoni", 12.00, quantities, sizes),
			new Food("Sausage", 16.00, quantities, sizes),
		};

		Food[] beverages = {
			new Food("Coke", 2.75, quantities, sizes),
			new Food("Beer", 11.00, quantities, sizes),
		};

		Food[] specials = {
			new Food("Spaghetti", 14.00, quantities, sizes)
		};

		for(int i = 0; i < pizzas.length; i++) pizzasPanel.add(new FoodPanel(pizzas[i]));
		for(int i = 0; i < beverages.length; i++) beveragesPanel.add(new FoodPanel(beverages[i]));
		for(int i = 0; i < specials.length; i++) specialsPanel.add(new FoodPanel(specials[i]));

		JPanel totalPanel = new JPanel();
		totalPanel.setLayout(new BoxLayout(totalPanel, BoxLayout.LINE_AXIS));

		totalLabel = new JLabel("Total cost: " + total);

		totalPanel.add(totalLabel);
		totalPanel.add(Box.createHorizontalGlue());

		JTabbedPane tp = new JTabbedPane();
		tp.addTab("Pizza", pizzasPanel);
		tp.addTab("Beverages", beveragesPanel);
		tp.addTab("Specials", specialsPanel);

		add(tp, BorderLayout.CENTER);
		add(totalPanel, BorderLayout.PAGE_END);
		setPreferredSize(new Dimension(400, 525));
	}

	private class FoodPanel extends JPanel {

		private Food food;
		private JComboBox<String> quantityMenu, sizeMenu;
		public int foodTotal = 0, selectedQuantity = 0, selectedSize = 0;

		public FoodPanel(Food food) {

			this.food = food;

			setLayout(new GridLayout(6, 0));

			ComboListener comboListener = new ComboListener();
			NumberFormat fmt = NumberFormat.getCurrencyInstance();
			JLabel title = new JLabel(food.name + " " + "(" + fmt.format(food.price) + ")", SwingConstants.LEFT);
			title.setFont(new Font("Arial", Font.BOLD, 16));

			JPanel quantityMenuPanel = new JPanel();
			quantityMenuPanel.setLayout(new GridLayout(1, 2));

			String[] quantities = food.quantities.toArray(new String[food.quantities.size()]);
			quantityMenu = new JComboBox<String>(quantities);
			quantityMenu.addActionListener(comboListener);

			quantityMenuPanel.add(new JLabel("Quantity:"));
			quantityMenuPanel.add(quantityMenu);

			JPanel sizeMenuPanel = new JPanel();
			sizeMenuPanel.setLayout(new GridLayout(1, 2));

			String[] sizes = food.sizes.toArray(new String[food.sizes.size()]);
			sizeMenu = new JComboBox<String>(sizes);
			sizeMenu.addActionListener(comboListener);

			sizeMenuPanel.add(new JLabel("Size:"));
			sizeMenuPanel.add(sizeMenu);

			add(title);
			add(new JLabel());
			add(quantityMenuPanel);
			add(new JLabel());
			add(sizeMenuPanel);
			add(new JLabel());			
		}

		private class ComboListener implements ActionListener {

			public void actionPerformed(ActionEvent event) {

				Object src = event.getSource();

				if(src == quantityMenu) {
					selectedQuantity = food.quantities.indexOf(quantityMenu.getSelectedItem());
				} else if(src == sizeMenu) {
					selectedSize = food.sizes.indexOf(sizeMenu.getSelectedItem());
				}

				System.out.println("selectedQuantity " + selectedQuantity);
				System.out.println("selectedSize " + selectedSize);

				foodTotal = 0;
				if(selectedQuantity != 0) {
					if(selectedSize == 0) {
						foodTotal += selectedQuantity * food.price;
					} else if(selectedSize == 1) {
						foodTotal += (selectedQuantity * food.price) + food.price * 0.25;
					} else if(selectedSize == 2) {
						foodTotal += (selectedQuantity * food.price) + food.price * 0.50;
					}
				}

				NumberFormat fmt = NumberFormat.getCurrencyInstance();
				totalLabel.setText("Total cost: " + fmt.format(foodTotal));

			}
		}

	}

	private class Food {

		public String name;
		public double price;
		public ArrayList<String> quantities, sizes;

		public Food(String name, double price, ArrayList<String> quantities,  ArrayList<String> sizes) {
			this.name = name;
			this.price = price;
			this.quantities = quantities;
			this.sizes = sizes;
		}

	}

}