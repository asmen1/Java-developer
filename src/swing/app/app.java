package swing.app;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class app extends JFrame implements ActionListener {

     private  JButton  bkonwertuj , bWysc;
     private JLabel  LCen , Lfahr ;
     private JTextField lcent , lfahrt;
     private  double tempC , tempF ;

      JMenuBar menuBar ;
      JMenu menuPlik, menuNarzedzia , menuPomoc , menuOpcje;
      JMenuItem mOdworz , mzapisz , mwyjscie , mNarz1 , mNarz2 , mOprogramie, mOpcje1 , mOpcje2 ;


    public  app (){



        setSize(800,700);
        setTitle("Moja aplikacja pierwsza tutorial");
        setLayout(null);


        LCen = new JLabel("cetr:");
        LCen.setBounds(20,20,150,20);
        add(LCen);


        lcent = new JTextField("");
        lcent.setBounds(170,20,150,50);
        add(lcent);


        Lfahr = new JLabel("fahr:");
        Lfahr.setBounds(20,70,150,20);
        add(Lfahr);


        lfahrt = new JTextField("");
        lfahrt.setBounds(175,70,150,50);
        add(lfahrt);


        bkonwertuj = new JButton("konwertuj");
        bkonwertuj.setBounds(150,150,150,50);
        add(bkonwertuj);
        bkonwertuj.addActionListener(this);

        bWysc = new JButton("wyjscie");
        bWysc.setBounds(300,150,150,50);
        add(bWysc);
        bWysc.addActionListener(this);


        menuBar =  new JMenuBar();
        menuPlik =  new JMenu("PLik");
        menuNarzedzia = new JMenu("Narzedzia");
        menuPlik.addSeparator();
        menuPomoc = new  JMenu("Pomoc");

        setJMenuBar(menuBar);
        menuBar.add(menuPlik);
        //menuBar.add(menuNarzedzia);
        //menuBar.add(menuPomoc);

        mOdworz = new JMenuItem("odworz");
        mzapisz = new JMenuItem("zapisz");
        mwyjscie = new JMenuItem("wyjscie");



        menuPlik.add("odworz");
        menuPlik.add("zapisz");
        menuPlik.add("wyjscie");

        mwyjscie.addActionListener(this);
        mwyjscie.setAccelerator(KeyStroke.getKeyStroke( "ctrl X"));


        menuNarzedzia = new JMenu("Narzędzia");
        mNarz1 = new JMenuItem("Narz1");
        mNarz2 = new JMenuItem("Narz2");
        menuBar.add(menuNarzedzia);

        menuNarzedzia.add(mNarz1);
        menuNarzedzia.add(mNarz2);

        menuPomoc = new JMenu("Pomoc");
        mOprogramie = new JMenuItem("o programie");
        menuPomoc.add(mOprogramie);
        mOprogramie.addActionListener(this);

        menuBar.add(menuPomoc);
            menuOpcje = new JMenu("menu opcje");
            mOpcje1  = new JMenuItem("opcja1");
            mOpcje2 = new JMenuItem("opcja2");
            menuOpcje.add(mOpcje1);
            menuOpcje.add(mOpcje2);
            menuNarzedzia.add(menuOpcje);




















    }

    public static void main(String[] args) {


        app appMenu = new app();
        appMenu.setVisible(true);
        appMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }







    @Override
    public void actionPerformed(ActionEvent e) {

        Object z = e.getSource();
        if (z == bWysc){

            int odp = JOptionPane.showConfirmDialog(null,"czy na pewno chcesz wyjsc z programu","pytanie" ,JOptionPane.YES_NO_OPTION);
            if (odp == JOptionPane.YES_OPTION)
            {
                dispose();
            }

            else if (odp == JOptionPane.NO_OPTION)
            {

            }

        }

        if (z == mOprogramie){

            JOptionPane.showMessageDialog(this ,"program testowy","tytuł", JOptionPane.INFORMATION_MESSAGE);
        }


            tempC = Double.parseDouble(lcent.getText ());
            tempF = 35.0 + (9.0 / 5.0) * tempC;
            lfahrt.setText(String.valueOf(tempF));

    }
}
