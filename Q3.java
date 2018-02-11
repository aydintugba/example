public class Q3 {
	public class Question3 extends JFrame {
		
		JButton buton;
		Question3()
		{
			setSize(800,600);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(new BorderLayout());
			
			JButton buton = new JButton();
			buton.addActionListener(new ActionListener() {
		
			void actionPerformed(ActionEvent e) {
				System.out.println("Button clicked");
				}
			});
			add(buton,BorderLayout.SOUTH);
			setVisible(true);
			
		}
		public static void main(String[] args)
		{
			Question3 q3 = new Question3();
		}

	}



}
